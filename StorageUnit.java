// Abstract class
abstract class StorageUnit {
    protected String unitID;
    protected double capacity;

    // Constructor using
    public StorageUnit(String unitID, double capacity) {
        this.unitID = unitID;
        this.capacity = capacity;
    }

    // Display storage details
    public void displayInfo() {
        System.out.println("Storage Unit ID: " + unitID);
        System.out.println("Capacity: " + capacity + " cubic meters");
    }

    // Abstract method
    public abstract void unitType();
}