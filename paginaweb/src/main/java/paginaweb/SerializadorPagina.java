package paginaweb;
import java.io.*;

public class SerializadorPagina {
    public static void serializarPagina(PaginaWeb pagina, String filePath) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(pagina);
        }
    }

    public static PaginaWeb deserializarPagina(String filePath) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            return (PaginaWeb) ois.readObject();
        }
        
    }

}
