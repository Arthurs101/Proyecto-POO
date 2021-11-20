
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Database {

    private ArrayList<Capacitacion> Capacitaciones = new ArrayList<>();
    private ArrayList<User> Users = new ArrayList<>() ;//este archivo posee todos los usuarios
    private String Path; //dirección donde se buscan los archivos

    public Database(String Path) {
        this.Path = Path;
        this.Capacitaciones = read();
        users();
    }
    private ArrayList<Capacitacion> read(){
        ArrayList<Capacitacion> programs = new ArrayList<>();
        try{
                JSONParser Stored = new JSONParser();//lector del arvhivo JSON
                JSONArray json = (JSONArray) Stored.parse(new FileReader(Path + "CORE.json"));//contenido del archivo JSON
            for(Object c: json ){
                JSONObject program = (JSONObject) c;
                switch((String) program.get("type")){//crear la capcacitación según el tipo
                    case "web" ->{
                        Capacitacion web = new WEB((String) program.get("name"), (String) program.get("author"),  (String) program.get("fecha"), (String) program.get("content"));
                        programs.add(web);
                    }
                    case "text" ->{
                        Capacitacion txt = new TEXT((String) program.get("name"), (String) program.get("author"), (String) program.get("fecha"),(String) program.get("content"));
                        programs.add(txt);
                    }
                }
            }
        } 
        catch (FileNotFoundException e) {
            try{
                FileWriter fr = new FileWriter(Path + "CORE.json");
                fr.write("[");
                fr.write("]");
                fr.close();
                programs = null;
            } catch (IOException ex) {
                
            }
            
        }
        catch (IOException e){
            
        } catch (ParseException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }catch (Exception e){
            
        }
        return programs; 
    }
    
    private void users(){//leer usaurios y si no hay archivo de usuarios crearlo
        
         try {//obtener los Usuarios
            BufferedReader bf = new BufferedReader(new FileReader (Path + "Login.txt"));
            String line;  
            while((line = bf.readLine()) != null){
              String[] user = line.split(":");
              User u = new User(user);
              this.Users.add(u); 
            }
        } catch (FileNotFoundException e) {
            try{
            FileWriter fr = new FileWriter(Path + "Login.txt");
            fr.close();
            }catch(IOException io){
                
            }
        }catch(IOException a){
            
        }
    }

    public ArrayList<Capacitacion> getCapacitaciones() {
        return Capacitaciones;
    }
  
    public User Login(String name, String ID){
        User user = null;
        for(User c: this.Users){
            if(c.getName().equals(name) && c.getID().equals(ID)){
                user = c;
            }
        }
        return user;
    }
    
    public void addCapacitacione(Capacitacion c){
        Capacitaciones.add(c);
        Save(); 
    }
    public Capacitacion capacitacion(String name){
        Capacitacion search = null;
        for(Capacitacion c: Capacitaciones){
            if(c.getName().equals(name)){
                search = c;
            }
        }
        return search;
    }
    
    public void addUser(User u){
        Users.add(u);
        SaveUser();
    }
    
    public void deleteprogram(String name){//eliminar alguna capacitacion
        for (int i = 0; i < Capacitaciones.size() -1 ; i++) {
            System.out.println(Capacitaciones.get(i).getName());
            if(Capacitaciones.get(i).getName().equals(name)){
                Capacitaciones.remove(i);
                i--;
            }
        }
        Save();
        this.Capacitaciones = read();
    }
    private void SaveUser(){//guardar el archivo
        
        try {
            FileWriter fr = new FileWriter(Path + "Login.txt");
            for(User u: Users){
                String data = String.join(":", u.getName(), u.getID(), String.valueOf(u.getType()) );
                fr.write(data);
            
            }
            fr.close();
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void Save(){//guardar en el archivo las capacitaciones
        JSONArray save = new JSONArray();
        for(Capacitacion c: Capacitaciones){
            JSONObject program = new JSONObject();
            program.put("name", c.getName());
            program.put("fecha", c.getFecha());
            program.put("author", c.getAuthor());
            program.put("content", c.getContent());
            if(c.getClass().equals(WEB.class)){
                program.put("type", "web");
            }else{
                program.put("type", "text");
            }
            save.add(program);
            try{FileWriter JSON = new FileWriter(Path+ "CORE.json");
            JSON.write("[");
            for(Object d: save){
                JSONObject program_save = (JSONObject) d;
                JSON.write(program_save.toString() + "\n");
            }
            JSON.write("]");
            JSON.flush();
            
            } catch (IOException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
  public ArrayList<String> getCapacitacionesNames(){
      ArrayList<String> names = new ArrayList<>();
      if(!Capacitaciones.isEmpty()){
            for(Capacitacion c: Capacitaciones){
                names.add(c.getName());
            }
      }
      return names;
  }
    

    
}
