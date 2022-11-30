package org.csvmanager;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class CsvReader
{
    public static void main( String[] args )
    {
        
    }  
    
    public List<String[]> readAllLines(Path filePath) throws Exception {
        try (Reader reader = Files.newBufferedReader(filePath)) {
            try (CSVReader csvReader = new CSVReader(reader)) {
                return csvReader.readAll();
            }
        }
    }  
    
    public List<String[]> readAllExample() throws Exception {
        Path path = Paths.get(
          ClassLoader.getSystemResource("csv/twoColumn.csv").toURI());
        return CsvReaderExamples.readAllLines(path);
    }
    
    public List<String[]> readLineByLine(Path filePath) throws Exception {
        List<String[]> list = new ArrayList<>();
        try (Reader reader = Files.newBufferedReader(filePath)) {
            try (CSVReader csvReader = new CSVReader(reader)) {
                String[] line;
                while ((line = csvReader.readNext()) != null) {
                    list.add(line);
                }
            }
        }
        return list;
    }
    
    public List<String[]> readLineByLineExample() throws Exception {
        Path path = Paths.get(
          ClassLoader.getSystemResource("csv/twoColumn.csv").toURI());
        return CsvReaderExamples.readLineByLine(path);
    }
}
