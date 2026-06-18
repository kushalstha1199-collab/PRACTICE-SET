import java.io.*;

public class ConfigLoader {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("config.txt");
            System.out.println("Config loaded");
            fr.close();
        } catch (FileNotFoundException e) {
            createDefaultConfig();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }

    static void createDefaultConfig() {
        try {
            FileWriter fw = new FileWriter("config.txt");
            fw.write("default=true");
            fw.close();
        } catch (IOException e) {
            System.out.println("Error creating file");
        }
    }
}