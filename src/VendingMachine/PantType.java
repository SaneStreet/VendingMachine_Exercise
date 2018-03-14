package VendingMachine;

public enum PantType {
    A(1), B(1.5), C(3);

    // Constructor - Price
    PantType(double price) {
        this.price = price;
    }

    private final double price;

    // Method - get Price
    public double getPrice() {
        return price;
    }
}
