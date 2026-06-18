// Interface
interface Refrigerated {
    void adjustTemp(double temperature);
}

// Subclass
class ColdBox extends StorageUnit implements Refrigerated {
    private double temperature;

    // Constructor
    public ColdBox(String unitID, double capacity) {
        super(unitID, capacity);
    }

    // Implement abstract method
    @Override
    public void unitType() {
        System.out.println("Unit Type: Cold Storage Box");
    }

    // Implement interface method
    @Override
    public void adjustTemp(double temperature) {
        this.temperature = temperature;
        System.out.println("Temperature adjusted to: " + temperature + "°C");
    }

    // Show current temperature
    public void showTemperature() {
        System.out.println("Current Temperature: " + temperature + "°C");
    }
}