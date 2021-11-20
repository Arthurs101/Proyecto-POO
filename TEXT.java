
public class TEXT extends Capacitacion implements open{

    public TEXT(String name, String author, String content) {
        super(name, author, content);
    }

    public TEXT(String name, String author, String fecha, String content) {
        super(name, author, fecha, content);
    }
    
    @Override
    public String open() {
        String data= "contenido web subido por: " + this.author + " fecha: " + this.fecha +"\n" + this.content;
        return data;
    }
    
}
