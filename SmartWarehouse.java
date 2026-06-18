public class SmartWarehouse {
    public static void main(String[] args) {

        ColdBox coldBox = new ColdBox("CB101", 150.5);

        coldBox.displayInfo();
        coldBox.unitType();
        coldBox.adjustTemp(-5);
        coldBox.showTemperature();
    }
}