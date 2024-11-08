package paginaweb;

public class Titulo extends ComponenteWeb  {
    private String texto;
    private int nivel;

    public Titulo(String texto, int nivel) {
        this.texto = texto;
        this.nivel = nivel;
        this.tipo = "Titulo";
    }

    @Override
    public String generarCodigoHTML() {
        return String.format("<h%d>%s</h%d>", nivel, texto, nivel);
    }

}
