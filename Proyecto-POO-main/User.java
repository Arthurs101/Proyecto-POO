/******************************************************************
User.java
Autor: Arturo Argueta, Bryan España, Adrian Fulladolsa, Diego Valdez
Última modificación: 2021-10-01
Clase referente al Usuario, almacena sus datos
******************************************************************/

public class User {
    
    private String name;//nombre

    private String ID;//id personal ("Contraseña")

    private boolean type;//su tipo (usuario o administrador) false = usuario , true = administrador

    public User(String[] args) {//constructor 
        name = args[0]; 
        ID = args[1];
        type = Boolean.valueOf(args[2]);
    }

    public String getID() {
        return ID; 
    }

    public String getName() {
        return name; 
    }


    public boolean getType() {
        return type; 
    }
}
