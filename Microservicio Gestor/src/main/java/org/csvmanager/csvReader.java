package org.csvmanager;

import java.io.FileReader;
/*import java.nio.file.Path;
import java.nio.file.Paths;*/

import com.opencsv.*;

public class csvReader {
    private static String CSV_FILE_PATH = "./pruebaLectura.csv";

    public static void main(String[] args) {
        readDataLineByLine(CSV_FILE_PATH);
    }

    public static void readDataLineByLine(String file) {
        try {
            FileReader filereader = new FileReader(file);
            CSVReader CsvReader = new CSVReader(filereader);
            String[] nextRecord;

            while ((nextRecord = CsvReader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
