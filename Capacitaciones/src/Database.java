
import java.io.File;
import java.util.ArrayList;

public class Database {

    private ArrayList<File> Capacitaciones;

    private File Logindata;//este archivo posee todos los usuarios

    private File Paths;//este archivo guarda los directorios de los archivos, hay que crearlo
    
    String[] admin = {"Bryan:A"};
    String[] user = {"A:x"};
    
    /*
    public Database(String p){//requiere del directorio donde está el LoginData y el Paths
        Logindata = new File(p+"loginData.txt");
        Paths = new File(p+"Paths.txt");
        
    }
    */
    
    public File getCapacitacion() {//obtiene el archivo de la capacitacion
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void saveCapacitacion(File c) {
    }

    public boolean loginchecker(String d) {
        //el string recibido es Nombre:ID, entonces que revise en el acrvhivo si está o no ese ID y nombre
        //recomiendo que en el archivo se tenga tipo_Nombre:ID con todos los usuarios los tipos usuario y administrador
        boolean exists = false;
        for (String a: admin) {
            if(a.equals(d)){
                exists = true; 
                break; 
            }
        }
        
        for (String u: user) {
            if(u.equals(d)){
                exists = true; 
                break; 
            }
        }
        
        return exists; 
        
    }

    public String[] getUserData(String a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void saveUserData(String[] data ){
        
    }
    
    public boolean Filecheck(File a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
