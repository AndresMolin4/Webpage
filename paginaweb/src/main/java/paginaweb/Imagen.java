package paginaweb;

public class Imagen extends ComponenteWeb  {
    private String ruta;
    private String textoAlt;

    public Imagen(String ruta, String textoAlt) {
        this.ruta = ruta;
        this.textoAlt = textoAlt;
        this.tipo = "Imagen";
    }

    @Override
    public String generarCodigoHTML() {
        return String.format("<img src=\"%s\" alt=\"%s\">", ruta, textoAlt);
    }

}
