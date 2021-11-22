
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;



public class WEB extends Capacitacion implements open{

    public WEB(String name, String author, String content) {
        super(name, author, content);
    }

    public WEB(String name, String author, String fecha, String content) {
        super(name, author, fecha, content);
    }
    
    @Override
    public String open() {
        String message = "Abreindo contenido";
        try {
            URI uri;
            uri = new URI(content);
            java.awt.Desktop.getDesktop().browse(uri);
        } catch (IOException ex) {
            message = "error al abrir el contenido web" +"\n"+ "la accion fue interrumpida";
        }catch (URISyntaxException ex) {
            message = "el directorio no existe";
        }catch(Exception e){
            message = "error inesperado";
        }
        String data= "contenido web subido por: " + this.author + " fecha: " + this.fecha +"\n" + message;
        return data;
    }
    
}
