package paginaweb;

public class Parrafo extends ComponenteWeb{

    private String texto;

    public Parrafo(String texto){
        this.texto=texto;
    }

    @Override
    public String generarCodigoHTML() {
        return String.format("<p>%s</p>", texto);
    }
}
