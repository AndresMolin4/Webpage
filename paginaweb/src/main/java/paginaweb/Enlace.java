package paginaweb;

public class Enlace extends ComponenteWeb  {

    private String texto;
    private String url;
    private String target;

    public Enlace(String texto, String url, String target) {
        this.texto = texto;
        this.url = url;
        this.target = target;
        this.tipo = "Enlace";
    }

    @Override
    public String generarCodigoHTML() {
        return String.format("<a href=\"%s\" target=\"%s\">%s</a>", url, target, texto);
    }
}
