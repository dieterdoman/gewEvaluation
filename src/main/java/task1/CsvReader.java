package task1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvReader
{
    private final List<List<String>> data = new ArrayList<>();

    public List<List<String>> readCSVFile(File dataFile)
    {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(dataFile));
            while (bufferedReader.ready()) {
                String line = bufferedReader.readLine();
                String [] OneRow = line.split(",|\\s|;");
                data.add(Arrays.asList(OneRow));
            }
        }
        catch (Exception e) {
            String message = e.getMessage();
            System.out.println("File not found:" + message);
        }
        return data;
    }
}
