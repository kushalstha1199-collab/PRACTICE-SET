// Interface
interface Discountable {
    void applyDiscount(double pct);
}

// Electronics Class
class Electronics implements Discountable {
    private String productName;
    private double price;

    // Constructor
    public Electronics(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    // Apply discount
    @Override
    public void applyDiscount(double pct) {
        double discount = price * pct / 100;
        price -= discount;

        System.out.println(productName +
                " new price: " + price);
    }
}