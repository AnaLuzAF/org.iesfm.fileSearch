package org.iesfm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;
    public class BufferReaderExample {

            private final static Logger log = LoggerFactory.getLogger(BufferReaderExample.class);
            // Crear un buffered reader de un archivo
            // Nos va a permitir leer el archivo linea a linea
            //Este programa lee linea a linea el texto del quijote
//    public static void main(String[] args) throws FileNotFoundException {
//
//        try (BufferedReader reader =
//                     new BufferedReader(
//                             new FileReader(
//                                     "src/main/resources/el_quijote.txt"
//                             )
//                     )
//        ) {
//            String line = reader.readLine();
//            while(line != null) {
//                log.info(line);
//                line = reader.readLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
            public static void main(String[] args) {
                String word = "";
                Scanner scan = new Scanner(System.in);
                log.info("Introduce la palabra que quieras buscar");
                word = scan.nextLine();
                while (!word.equalsIgnoreCase("exit")) {
                    //crear un hilo para esa tarea
                    //iniciar el hilo
                    TaskBuscador busqueda = new TaskBuscador(word);
                    Thread busquedaThread = new Thread(busqueda);
                    busquedaThread.start();
                    log.info("Introduce la palabra que quieras buscar");
                    word = scan.nextLine();

                }}}








