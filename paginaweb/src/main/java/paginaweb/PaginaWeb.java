

package paginaweb;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PaginaWeb implements Serializable {

    private String titulo;
    private String htmlNombre;
    private String cssNombre;
    private List<ComponenteWeb> componentes;
    private Estilo estilos;

    public PaginaWeb(String titulo, String htmlNombre, String cssNombre) {
        this.titulo = titulo;
        this.htmlNombre = htmlNombre;
        this.cssNombre = cssNombre;
        this.componentes = new ArrayList<>();
        this.estilos = new Estilo();
    }
    public void agregarComponente(ComponenteWeb componente) {
        componentes.add(componente);
    }

    public void generarHTML() throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(htmlNombre))) {
            writer.println("<!DOCTYPE html>");
            writer.println("<html lang=\"es\">");
            writer.println("<head>");
            writer.println("<meta charset=\"UTF-8\">");
            writer.printf("<title>%s</title>%n", titulo);
            writer.printf("<link rel=\"stylesheet\" type=\"text/css\" href=\"%s\">%n", cssNombre);
            writer.println("</head>");
            writer.println("<body>");
            for (ComponenteWeb componente : componentes) {
                writer.println(componente.generarCodigoHTML());
            }
            writer.println("</body>");
            writer.println("</html>");
        }
    }

    public void generarCSS() throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(cssNombre))) {
            writer.println(estilos.generarCSS());
        }
    }

}
