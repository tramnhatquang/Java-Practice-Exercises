package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class CSV {
    // this function will read data from the CSV file and returns a list
    public static List<String[]> read(String file) throws IOException {
        List<String[]> data = new LinkedList<>();
        String dataRow;
        BufferedReader br = new BufferedReader(new FileReader(file));
        while ((dataRow = br.readLine()) != null)
        {
            String[] dataRecord = dataRow.split(",");
            data.add(dataRecord);
        }
        return data;
    }
}
