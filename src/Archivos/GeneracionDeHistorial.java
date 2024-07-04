package Archivos;

import Modelos.Moneda;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeneracionDeHistorial {
    public boolean registroDeHistorial(List<String> data){

        String path = "historialDeConversion.json";
        File file = new File(path);
        try {
            FileWriter escribir = new FileWriter(file);
            escribir.write(data + System.lineSeparator());
            escribir.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return true;
    }
}
