package HomeWorkApp7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CsvFile extends AppData {
    public static void main(String[] args) {

        String[] header;
        int[] data;

        AppData appData = new AppData();
        appData.setHeader(new String[]{"Value1", "Value2", "Value3"});
        appData.setData(new int[]{123, 123, 300});
        header = appData.getHeader();
        data = appData.getData();

        csvWrite(header, data);
    }

    public static void csvWrite(String[] header, int[] data) {
        try (PrintWriter writer = new PrintWriter("test.csv")) {

            StringBuilder sb = new StringBuilder();
            sb.append(header[0]);
            sb.append(",");
            sb.append(header[1]);
            sb.append(",");
            sb.append(header[2]);
            sb.append("\n");

            sb.append(data[0]);
            sb.append(',');
            sb.append(data[1]);
            sb.append(',');
            sb.append(data[2]);
            sb.append('\n');

            writer.write(sb.toString());

            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}