/*
Controlador, encargada de realizar la lógica y de comunicar la vista con el modelo (la base de datos y el Usuario)
*/
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;
import Vistas.*; 
public class Controller implements ActionListener {
    private Inicio l;
    private Database fb;
    private Menu m; 
    private User u;
 
    public void login() {//ventana de inicio de sesióon
        this.l = new Inicio();
        this.l.setResizable(false);
        this.l.Register().addActionListener(this);
        this.l.Login().addActionListener(this);//obtener la clase de boton a verificar que se está presionando
        this.l.getSend().addActionListener(this); 
        this.l.setVisible(true);//hacer visible la pestaña
       ;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Capacitacion  editing = null;
        if (e.getSource().equals(l.Login())) {//si se detecta el uso de boton de inicio de sesión, obtener los cambpos y mandarlos a la base de datos
            String[] data = l.LoginData().split(":");
            try{
                User current = fb.Login(data[0], data[1]);
                if( current != null){//la base verifica si existe o no ese usuario
                    //si el usuario si está registrado
                    l.Warning("exito al inicio de sesión");
                    l.setVisible(false);
                    u = current;
                    initMenu(); //iniciar la otra pestaña
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
                User newone = new User(data);
                fb.addUser(newone);//registrar en la base el usuario
                
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
    
        //apartado de acciones del menu
        else if (e.getSource().equals(m.Obtener)) {//solicitar datos de una capacitación
            if(m.Selection.getSelectedItem() != null){
            Capacitacion x = fb.capacitacion(m.Selection.getSelectedItem().toString());//obtener la capacitation seleccionada
            if(x != null){//ver si logra obtenerlo
                m.SetOutput(x.open());
            }else{
                m.SetOutput("ERROR");
            }
            }
        }
        else if(e.getSource().equals(this.m.getLoad())){//enviar una nueva capacitación
            String[] data = this.m.getNew();
            if (checkData(data)) {//VER que este completa la informacion
                switch(data[2]){//crear la capacitación segun el tipo
                    case "web" ->{
                        Capacitacion web = new WEB (data[0],u.getName(),data[1]);
                        fb.addCapacitacione(web);
                    }
                    case "txt" ->{
                        Capacitacion txt = new TEXT (data[0],u.getName(),data[1]);
                        fb.addCapacitacione(txt);
                    }
                }
                 this.m.setOptions(fb.getCapacitacionesNames());
            } else {
                this.m.Warner.setText("NO DEJE CAMPOS VACIOS");
            }
        }
        else if(e.getSource().equals(this.m.Refresh)){//refrescar el listado de capacitaciones
            this.m.Selection.removeAllItems(); //eliminar opciones
            this.m.setOptions(fb.getCapacitacionesNames()); //colocar las opciones
            this.m.Output.setText("");//borrar texto del output
            
        }
        else if(e.getSource().equals(this.m.Delete)){//borrar una capacitación
            if(u.getType()){//si es administrador puede eliminar 
                fb.deleteprogram(this.m.deleteB.getSelectedItem().toString());
                this.m.setOptions(fb.getCapacitacionesNames());
                this.m.DELETEWARNER.setText("Eliminado Exitosamente, cambios aplicados cuando reinicie la app");
            }else{
                this.m.DELETEWARNER.setText("NO CUENTA CON LA AUTORIDAD");
            }
        }
        else if(e.getSource().equals(this.m.SESION)){//cerrar sesión
            this.m.setVisible(false);
            
            this.l.setVisible(true);
        }
        
    
    }
    private void initMenu(){//iniciar el menu
        this.m = new Menu();
        this.m.setVisible(true);
        this.m.setResizable(false);
        this.m.getLoad().addActionListener(this);//registrar acciones de botones
        this.m.Obtener.addActionListener(this);
        this.m.Refresh.addActionListener(this);
        this.m.Delete.addActionListener(this);
        this.m.SESION.addActionListener(this);
        this.m.setOptions(fb.getCapacitacionesNames());//enviar las capacitaciones disponibles
        
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
