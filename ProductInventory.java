// Main Class
public class ProductInventory {
    public static void main(String[] args) {

        // Array of Electronics
        Electronics[] inventory = {
                new Electronics("Laptop", 80000),
                new Electronics("Mobile", 30000),
                new Electronics("Headphones", 5000)
        };

        // Apply 10% discount
        for (Electronics e : inventory) {
            e.applyDiscount(10.0);
        }
    }
}