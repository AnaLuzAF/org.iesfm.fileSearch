package org.iesfm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class TaskBuscador implements Runnable{
    private final static Logger log = LoggerFactory.getLogger(BufferReaderExample.class);
    private String word;
    public TaskBuscador(String word) {
        this.word = word;
    }
    @Override
    public void run() {
        log.info("La palabra " + word + " aparece " + Buscador.buscar(word) + " veces");
    }
}
