import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DailySalesLog {
    public static void main(String[] args) {

        // Array of 7 days sales
        double[] sales = {
                1500.50, 2000.75, 1800.00,
                2200.25, 1700.60, 2500.90,
                2100.40
        };

        // Writing sales data to file
        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("weekly_sales.txt"))) {

            for (double s : sales) {
                bw.write(String.valueOf(s));
                bw.newLine();
            }

            System.out.println(
                    "Sales data saved to weekly_sales.txt"
            );
        }
        catch (IOException e) {
            System.out.println(
                    "Error writing to file: " + e.getMessage()
            );
        }
    }
}