package org.csvmanager;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.*;

public class csvWriter {
    public static void main(String[] args) {

        String[] entries = {"ESTO ES LO QUE SE METE AL CSV"};

        try {
            CSVWriter writer = new CSVWriter(new FileWriter("./pruebaEscritura.csv"));

            writer.writeNext(entries);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
