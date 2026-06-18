// Main Class
public class DeviceManager {
    public static void main(String[] args) {

        // Array of ElectronicDevice objects
        ElectronicDevice[] devices = {
                new Printer(),
                new Scanner()
        };

        // Loop through devices
        for (ElectronicDevice d : devices) {
            d.powerOn();
        }
    }
}