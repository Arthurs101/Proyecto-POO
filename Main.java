/*
Clase main
*/
import Vistas.*;
public class Main {
    public static void main(String[] args) {
        Controller d = new Controller();//inicializar el programa , creando a la clase del controlador
        d.login();//iniciar el probrama 
        Menu m = new Menu();
        m.setVisible(true);
    }

   
}
