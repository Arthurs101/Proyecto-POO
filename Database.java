
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Database {

    private ArrayList<String> Capacitaciones;

    private ArrayList<String> Users;//este archivo posee todos los usuarios
    private String Path; 
    private File Paths;//este archivo guarda los directorios de los archivos, hay que crearlo
    
    
    
    
    public Database(String p){//requiere del directorio donde está el LoginData y el Paths
        
        Paths = new File(p+"Paths.txt");
        Path = p; 
        
    }
    
    
    public File getCapacitacion(String name) {//obtiene el archivo de la capacitacion
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void saveCapacitacion(File c) {
    }

    public boolean loginchecker(String d) {
        //el string recibido es Nombre:ID, entonces que revise en el acrvhivo si está o no ese ID y nombre
        //Nombre:ID:tipo con todos los usuarios los tipos usuario y administrador
        boolean exists = false;
        try {
            BufferedReader bf = new BufferedReader(new FileReader (Path + "Login.txt"));
            String line;  
            while((line = bf.readLine()) != null){
              String[] user = line.split(":");
              String validate = String.join(":", user[0], user[1]);
              System.out.println(validate);
              if(d.equals(validate)){
                  exists = true;
                  break;
              }
            }
        } catch (FileNotFoundException e) {
            try{
            FileWriter fr = new FileWriter(Path + "Login.txt");
            fr.close();
            }catch(IOException io){
                
            }
        }catch(IOException a){
            
        }
        
        return exists; 
        
    }

    public String[] getUserData(String a) {
        throw new UnsupportedOperationException("Not supported yet.");
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
    
    
    
}
