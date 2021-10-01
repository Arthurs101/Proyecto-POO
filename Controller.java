
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import Vistas.*;

public class Controller implements ActionListener {
    private Inicio l;
    private Database fb;
    private Menu m; 
    public void login() {//ventana de inicio de sesióon
        this.l = new Inicio();
        this.l.Register().addActionListener(this);
        this.l.Login().addActionListener(this);//obtener la clase de boton a verificar que se está presionando
        this.l.getSend().addActionListener(this); 
        this.l.setVisible(true);//hacer visible la pestaña
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource().equals(l.Login())) {//si se detecta el uso de boton de inicio de sesión, obtener los cambpos y mandarlos a la base de datos
            String data = l.LoginData();
            try{
            if(fb.loginchecker(data)){//la base verifica si existe o no ese usuario
                //si el usuario si está registrado
                l.Warning("exito al inicio de sesión");
                
                //acá deberá de abrir la otra pestaña
                //la cual muestra sus acciones correspondientes
            }
            else{
                //si el usuario no existe
                l.Warning("datos erroneos");
            }
            }
            catch(NullPointerException ne){//si no ha enviado el directorio
                    l.Warning("ENVIE EL DIRECTORIO EN LA PESTAÑA 'DIRECTORIO'");
            }
            
        }
        else if(e.getSource().equals(l.Register())){//si registra sesión
            try {
                String[] data = l.NewUser();//obtener el array con la informacion
            if(checkData(data)){//revisar array
                l.RWarning("Registro exitoso");
                fb.saveUserData(data);//registrar en la base el usuario
            }else{
                l.RWarning("DATOS INCOMPLETOS");//advertir de que faltan datos
                }
            } catch (NullPointerException ne) {
                l.RWarning("ENVIE EL DIRECTORIO \n EN LA PESTAÑA 'DIRECTORIO'");
            }
        }
        else if(e.getSource().equals(l.getSend())){
            if (l.getPath().equals("")) {//si está vació 
                l.setMessenger("NO PUEDE DEJARLO EN BLANCO");
            } else {
                 fb = new Database(l.getPath());
                 l.setMessenger("ENVIADO EXITOSAMENTE");
            }
           
            
        }
    
    }
    
    private boolean checkData(String[] a){//revisar que esté completa la información del registro
        boolean c = true; //inidica que está completa
        for(String b: a){
            if(b == null){//si es null, es porque faltan campos
                c = false; //cambiar a falso por que está incompleta la información
                break; 
            }else if(b.equals("")){//si está en blanco
                c = false; //cambiar a falso por que está incompleta la información
                break; 
            }
        }
        return c; 
    }
  
  
}
