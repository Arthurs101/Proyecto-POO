/*
Es el Usuario común, solo puede consultar
*/

public class User {
    
    private String name;//nombre

    private String ID;//id personal ("Contraseña")

    private boolean type;//su tipo (usuario o administrador) false = usuario , true = administrador

    public User(String[] args) {//constructor 
        name = args[0]; 
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
