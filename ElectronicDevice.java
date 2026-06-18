// Abstract Class
abstract class ElectronicDevice {

    // Abstract method
    public abstract void powerOn();
}

// Printer Class
class Printer extends ElectronicDevice {

    @Override
    public void powerOn() {
        System.out.println("Printer is powering on...");
    }
}