
import java.text.SimpleDateFormat;
import java.util.Date;


public class Capacitacion implements open{
    protected String name;//nombre de la capacitación
    protected String author; //autor
    protected String fecha; //fecha
    protected String content; //contenido

    public Capacitacion(String name, String author, String content) {
        this.name = name;
        this.author = author;
        this.content = content;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = sdf.format(new Date());
        this.fecha = fecha;
    }

    public Capacitacion(String name, String author, String fecha, String content) {
        this.name = name;
        this.author = author;
        this.fecha = fecha;
        this.content = content;
    }
    
    
    public String getContent() {//obeter para edición
        return content;
    }

    public void setContent(String content) {//al editar el contenico colocar el nuevo
        this.content = content;
    }

    public String getName() {//obtener el nombre de la capacitacion
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getFecha() {
        return fecha;
    }
    
    
    
    @Override
    public String open() {
        return ""; 
    }
}
