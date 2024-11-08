package paginaweb;

import java.util.ArrayList;
import java.util.List;

public class Tabla extends ComponenteWeb {
    private List<String[]> filas;
    private String[] encabezados;

    public Tabla(String[] encabezados) {
        this.encabezados = encabezados;
        this.filas = new ArrayList<>();
    }

    public void agregarFila(String[] fila) {
        filas.add(fila);
    }

    @Override
    public String generarCodigoHTML() {
        StringBuilder html = new StringBuilder();
        html.append("<table>\n");
        // Generar encabezado
        html.append("<tr>");
        for (String encabezado : encabezados) {
            html.append("<th>").append(encabezado).append("</th>");
        }
        html.append("</tr>\n");

        // Generar filas
        for (String[] fila : filas) {
            html.append("<tr>");
            for (String celda : fila) {
                html.append("<td>").append(celda).append("</td>");
            }
            html.append("</tr>\n");
        }
        html.append("</table>\n");
        return html.toString();
    }
}
