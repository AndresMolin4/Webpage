package paginaweb;

import java.io.Serializable;

public class Estilo implements Serializable {

    private String color;
    private String fuente;
    private String tamano;
    private String colorTitulos;

    public Estilo() {
        // Valores por defecto
        this.color = "#FFFFFF";
        this.fuente = "Arial";
        this.tamano = "45px";
        this.colorTitulos = "#000000";
    }

    public String generarCSS() {
        return String.format(
            """
            body {
                background-size: contain;
                background-position: top center;
                background-color: #333333;
                background-repeat: no-repeat;
                margin: 5px;
                padding: 0;
            }

            h1, h2, h3, h4, h5, h6 {
                font-size: %s;
                text-align: center;
                color: white;
                margin: 20px;
            }

            p {
                font-size: 30px;
                line-height: 1.6;
                font-weight: bold;
                color: white;
                background-color: #333333;
            }

            table, th, td {
                border: 1px solid white;
            }

            th {
                background-color: %s;
                font-weight: bold;
                color: white;
                padding: 10px;
                text-align: center;
            }

            td {
                color: white;
                padding: 10px;
                text-align: center;
                background-color: #000000;
            }
            img {
                width: 1000px; 
                height: auto;
                margin: 100px 100px auto;
                

            }
            td img, th img {
                width: 100px; /* Establece un tamaño más pequeño para las imágenes en la tabla */
                height: auto; /* Mantiene la proporción */
                margin: 10px 10px auto;
            }
            """, 
            tamano, colorTitulos, color, colorTitulos
        );
    }
}
