package paginaweb;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de PaginaWeb
        PaginaWeb pagina = new PaginaWeb("Algo Sobre LoL =)", "index.html", "styles.css");
        
        // Agregar componentes a la página
        pagina.agregarComponente(new Titulo("Bienvenidos a League of Legends", 1));
        pagina.agregarComponente(new Titulo("Campeones",1));

        // Agregar campeones
        String[] nombres = {"Sett","Yorick","Miss Fortune","Kindred","Aatrox", "Ahri", "Akali", "Alistar", "Amumu", "Anivia", "Annie", "Ashe", "Azir", "Bardo", "Blitzcrank", "Brand", "Braum", "Caitlyn", "Camille", "Cassiopeia"};
        String[] descripciones = {
            "Sett, conocido como el \"Lider de la Arena\", es un campeon que combina fuerza y resistencia. Con su habilidad para causar un gran dano y aguantar mucho castigo, es una figura temida en las arenas de pelea. Su historia se entrelaza con su ascenso en el inframundo criminal, donde utiliza su formidable fuerza para hacerse un nombre.",

            "Yorick es el ultimo superviviente de una orden de guardianes de la muerte. Su vida ha estado marcada por la tragedia y el aislamiento. Capaz de invocar y controlar los muertos, su objetivo es liberar a su hogar de la maldicion de la Perdicion, luchando contra criaturas de la oscuridad que acechan en su camino.",

            "Miss Fortune, Sarah Fortune, conocida como Miss Fortune, es una famosa pirata y cazadora de recompensas. Su historia esta marcada por la tragedia personal, ya que vio a su familia asesinada por el rey Gangplank. Su busqueda de venganza la ha convertido en una figura poderosa en el mundo del crimen y temida entre sus enemigos. Es conocida por su excepcional habilidad con las armas.",

            "Kindred representan las dos caras de la muerte: el Lobo y la Cordera. Mientras el Lobo persigue a los que intentan escapar de su destino, la Cordera ofrece consuelo a aquellos que lo aceptan. Juntos, simbolizan el ciclo de la vida y la muerte en Runaterra, mostrando como la muerte es una parte inevitable de la existencia.",

            "Aatrox, la Espada de los Oscuros, es un antiguo guerrero que se ha convertido en un ser oscuro y torturado. Su objetivo es acabar con la existencia misma, y su sed de sangre lo convierte en un formidable adversario en el campo de batalla. Aatrox tiene el poder de recuperar su salud a traves del dano infligido, lo que lo convierte en un luchador resistente.",

            "Ahri es una encantadora Zorra de Nueve Colas con la habilidad de manipular magia arcana. Su historia se centra en su busqueda de su propia humanidad, utilizando su poder para absorber las almas de otros. Ahri es conocida por su agilidad en el combate y su capacidad para desorientar a sus enemigos con habilidades magicas.",

            "Akali es una maestra de la sombra y una feroz guerrera. Como miembro de la Orden Kinkou, se enfrenta a quienes amenazan la paz de su hogar. Su habilidad para moverse entre las sombras la convierte en un enemigo temible. Akali busca la verdad detras de su orden y lucha por la justicia a su manera.",

            "Alistar, el Minotauro, es un campeon que ha enfrentado un pasado de sufrimiento y opresion. Con su inmensa fuerza y habilidades defensivas, se erige como protector de sus aliados. Su objetivo es buscar la paz en su hogar y usar su poder para ayudar a los demas.",

            "Amumu es una momia triste atrapada en un mundo que no comprende. Su historia es tragica, ya que fue abandonado y condenado a la soledad. A pesar de su apariencia temible, busca compañia y amistad, utilizando su poder para ayudar a los demas mientras lidia con su dolor.",

            "Anivia, la Criofenix, es una entidad mistica que protege el Freljord de las fuerzas oscuras. Su habilidad para controlar el hielo y el frio la convierte en un formidable oponente. Anivia se enfrenta a la amenaza de los antiguos enemigos que buscan destruir su hogar.",

            "Annie es una nina con un talento inusual para la magia de fuego. A pesar de su corta edad, su poder es inmenso, y su amado companero, Tibbers, la acompana en sus aventuras. Annie busca respuestas sobre su familia y enfrenta a quienes amenazan su hogar.",

            "Ashe, la Arquera de Hielo, es la lider de la tribu de los Freljord y una guerrera experta en el combate a distancia. Con su habilidad para disparar flechas de hielo, busca unir a las tribus de su tierra y enfrentar a los enemigos que amenazan su hogar.",

            "Azir es un antiguo emperador de Shurima que ha resucitado para recuperar su imperio. Con el poder de controlar las arenas, su objetivo es restaurar la grandeza de su reino y enfrentar a quienes buscan aprovecharse de su legado.",

            "Bardo, el Guardian Errante, es una figura mistica que viaja por el cosmos. Su proposito es mantener el equilibrio y ayudar a quienes se encuentran en peligro. A pesar de su naturaleza enigmatica, utiliza su poder para proteger a los inocentes.",

            "Blitzcrank, el Gran Golem de Vapor, es un robot disenado para ayudar a los habitantes de Zaun. Sin embargo, su naturaleza le ha llevado a convertirse en un heroe inesperado. Con sus poderosos ganchos y habilidades, protege a los inocentes y lucha contra el mal.",

            "Brand, conocido como la Venganza Ardiente, es un campeon que utiliza el fuego como su principal herramienta. Su historia esta marcada por la traicion y la venganza, y busca destruir a aquellos que lo han hecho sufrir.",

            "Braum, el Corazon de Freljord, es un campeon robusto y carismatico que protege a los debiles. Su fuerza y su capacidad para absorber dano lo convierten en un protector formidable. Braum es conocido por su gran corazon y su deseo de ayudar a los demas.",

            "Caitlyn, la Sheriff de Piltover, es una cazadora de criminales. Con una mente astuta y un ojo agudo, utiliza su habilidad con el rifle para eliminar a los villanos de su ciudad. Su historia se centra en su lucha por la justicia y su determinacion para proteger a los inocentes.",

            "Camille, la Sombra de Acero, es una asesina y una guerrera leal a la familia. Su destreza en el combate y su estilo elegante la convierten en una figura temida entre sus enemigos. Camille lucha por mantener el honor y la justicia en su hogar.",

            "Cassiopeia, la Serpiente de Noxus, es una poderosa maga que utiliza la magia del veneno para devastar a sus enemigos. Su historia se entrelaza con la busqueda de poder y venganza, y su capacidad para convertir a sus oponentes en piedra la convierte en una adversaria formidable."
        };
        String[] imagenes = {
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Sett_38.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Yorick_3.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/MissFortune_7.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Kindred_12.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Aatrox_0.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ahri_0.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Akali_0.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Alistar_0.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Amumu_0.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Anivia_0.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Annie_0.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Ashe_0.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Azir_0.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Bard_0.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Blitzcrank_0.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Brand_0.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Braum_0.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Caitlyn_0.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Camille_0.jpg",
            "https://ddragon.leagueoflegends.com/cdn/img/champion/splash/Cassiopeia_0.jpg"
        };

        for (int i = 0; i < nombres.length; i++) {
            pagina.agregarComponente(new Titulo(nombres[i], 2));
            pagina.agregarComponente(new Parrafo(descripciones[i]));
            pagina.agregarComponente(new Imagen(imagenes[i], nombres[i]));
        }

        String[] encabezados = {"Nombre", "Descripcion", "Imagen"};
        Tabla tabla = new Tabla(encabezados);
        for (int i = 0; i < nombres.length; i++) {
            String[] fila = {nombres[i], descripciones[i], "<img src=\"" + imagenes[i] + "\" alt=\"" + nombres[i] + "\" width=\"100\">"};
            tabla.agregarFila(fila);
        }
        pagina.agregarComponente(tabla);

        
        try {
            pagina.generarHTML();
            pagina.generarCSS();
            System.out.println("Archivos generados correctamente.");

            String filePath = "pagina.ser";
            SerializadorPagina.serializarPagina(pagina, filePath);
            System.out.println("Página serializada en: " + new File(filePath).getAbsolutePath());

        } catch (IOException e) {
            System.out.println("Hubo un error al generar los archivos: " + e.getMessage());
        }


        try {
            // Deserializar la página
            PaginaWeb paginaDeserializada = SerializadorPagina.deserializarPagina("pagina.ser");
            System.out.println("Página deserializada correctamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al deserializar la página: " + e.getMessage());
        }

        
    }
    

}

