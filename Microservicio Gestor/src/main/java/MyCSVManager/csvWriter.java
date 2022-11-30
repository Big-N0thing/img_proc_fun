package MyCSVManager;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.*;

public class csvWriter {
    public static void main(String[] args) {

        String[][] entries = {{"Nombre", "Appellido", "Telefono"},
                            {"Noé", "Fuente", "666666666"},
                            {"Paco", "Porrazos", "999999999"}};

        try {
            CSVWriter writer = new CSVWriter(new FileWriter("./pruebaEscritura.csv"));

            for (String[] entry : entries) {
                writer.writeNext(entry);
            }

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
