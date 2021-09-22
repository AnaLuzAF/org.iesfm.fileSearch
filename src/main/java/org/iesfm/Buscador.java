package org.iesfm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buscador {
    private final static Logger log = LoggerFactory.getLogger(BufferReaderExample.class);
    public static int buscar(String word) {
        int contador = 0;
        try (BufferedReader reader =
                     new BufferedReader(
                             new FileReader(
                                     "C:\\Users\\LENOVO\\IdeaProjects\\org.iesfm.fileSearch\\src\\main\\resources\\el_quijote.txt"
                             )
                     )
        ) {
            String line = reader.readLine();
            while (line != null) {
                if (line.contains(word)) {
                    contador++;
                }
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contador;
    }
}

