package paginaweb;

import java.io.Serializable;

public abstract class ComponenteWeb implements Serializable{

    protected String tipo;

    public abstract String generarCodigoHTML();


}
