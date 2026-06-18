import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LogFileReader {
    public static void main(String[] args) {

        // ArrayList to store ERROR lines
        ArrayList<String> errorLogs =
                new ArrayList<>();

        try {
            // Read file
            File file = new File("server.log");
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                // Filter ERROR lines
                if (line.contains("ERROR")) {
                    errorLogs.add(line);
                }
            }

            sc.close();

            // Print ERROR logs
            System.out.println("Error Logs:");
            for (String log : errorLogs) {
                System.out.println(log);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println(
                    "File not found: " + e.getMessage()
            );
        }
    }
}