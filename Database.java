
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Database {

    private ArrayList<String> Capacitaciones = new ArrayList<>();

    private ArrayList<String> Users = new ArrayList<>() ;//este archivo posee todos los usuarios
    private String Path; //dirección donde se buscan los archivos
  
    
    public void UserRefresh(){//refrescar la kuista de Usuarios.
        try {//obtener los Usuarios
            BufferedReader bf = new BufferedReader(new FileReader (Path + "Login.txt"));
            String line;  
            while((line = bf.readLine()) != null){
              String[] user = line.split(":");
              String validate = String.join(":", user[0], user[1]);
              Users.add(validate); 
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
    
    
    public Database(String p){//requiere del directorio donde está el LoginData y el Paths
        this.Path = p; 
        try{
        BufferedReader bx = new BufferedReader(new FileReader (this.Path + "PATHS.txt"));
        String line;
            while ((line = bx.readLine()) != null){//obtener el nombre de los materiales disponibles
                String[] linex = line.split("@");//separar el nombre y la dirección
                Capacitaciones.add(linex[0]); 
            }
        } catch(FileNotFoundException x){//crear el Archivo en blanco
            try{
            FileWriter fr = new FileWriter(Path + "PATHS.txt");
            fr.close();
            }catch(IOException io){
                
            }
        }catch(IOException I){
            
        }
        
        try {//obtener los Usuarios
            BufferedReader bf = new BufferedReader(new FileReader (Path + "Login.txt"));
            String line;  
            while((line = bf.readLine()) != null){
              String[] user = line.split(":");
              String validate = String.join(":", user[0], user[1]);
              Users.add(validate); 
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
    
    
    public FileReader getCapacitacion(String name) {//obtiene el archivo de la capacitacion
            FileReader read = null;     
            //archivo contiene Nombre@Directorio
        try {
            BufferedReader bx = new BufferedReader(new FileReader (this.Path + "PATHS.txt"));
            String line;
            while ((line = bx.readLine()) != null){
                String[] linex = line.split("@");//separar el nombre y la dirección
                if(name.equals(linex[0])){
                    read = new FileReader(linex[1] + linex[0]);
                    break; 
                }
            }
            
            
        } catch (Exception e) {//en dado caso no encuentre el archivo
            
        }
        return read; 
    }

    public boolean saveCapacitacion(String[] a) {//guardar el directorio del material tipo TXT a agregar
        boolean saved = false; 
        try {
            File record = new File(Path + "PATHS.txt");
            FileWriter rw = new FileWriter(record,true);
            BufferedWriter br = new BufferedWriter(rw);
            br.write(a[0]+ "@" + a[1] +"\n");  //Nombre@Directorio 
            br.close();
            saved = true; 
        } catch (Exception e) {
            
        }
        return saved;
    }

    public boolean loginchecker(String d) {
        //el string recibido es Nombre:ID, entonces que revise en el acrvhivo si está o no ese ID y nombre
        //Nombre:ID:tipo con todos los usuarios los tipos usuario y administrador
        boolean exists = false;
        if (Users.contains(d)) {
            exists = true; 
        }
        return exists; 
        
    }

    public String[] getUserData(String a) {//obtener la información del usuario
        String[] data = null;
        try {
        //obtener información del usuario
        BufferedReader bf = new BufferedReader(new FileReader (Path + "Login.txt"));
        String line;
         while((line = bf.readLine()) != null){
              String[] user = line.split(":");
              String validate = String.join(":", user[0], user[1]);
              if(a.equals(validate)){
                  data = user;
                  break;
              }
        
        }
    } catch (FileNotFoundException ex) {
           data = null;
        }
    catch(IOException x){
            data = null;
        }
       return data; 
    }
    

    public boolean saveUserData(String[] data ){//guardar nuevo usuario
        boolean saved = true;
        try {
            File record = new File(Path + "Login.txt");
            FileWriter rw = new FileWriter(record,true);
            BufferedWriter br = new BufferedWriter(rw);
            br.write(String.join(":", data[0] , data[1] , String.valueOf(data[2])) +"\n"); 
            br.close();
        } catch (Exception e) {
            saved = false;
        }
        return saved; 
    }
    
    public ArrayList<String> getCapacitaciones(){
        return Capacitaciones;
    }
    
    
}
