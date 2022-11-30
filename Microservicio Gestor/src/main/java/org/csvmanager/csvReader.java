package org.csvmanager;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.*;

public class csvReader {
    private static String CSV_FILE_PATH = "./pruebaEscritura.csv";

    public static void main(String[] args) {
    	System.out.println("READ DATA LINE BY LINE\n");
    	readDataLineByLine(CSV_FILE_PATH);
    	System.out.println("_______________________________________________");
    	System.out.println("READ ALL DATA\n");
        readAllData(CSV_FILE_PATH);
        System.out.println("_______________________________________________");
    }

    public static void readDataLineByLine(String file) {
        try {
            FileReader filereader = new FileReader(file);
            CSVReader reader = new CSVReader(filereader);
            String[] nextRecord;

            while ((nextRecord = reader.readNext()) != null) {
                for (String cell : nextRecord) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
            reader.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void readAllData(String file) {
        try {
            FileReader filereader = new FileReader(file);
            CSVReader reader = new CSVReaderBuilder(filereader).build();
            List<String[]> allData = reader.readAll();
      
            for (String[] row : allData) {
                for (String cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
