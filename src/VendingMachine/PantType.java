package VendingMachine;

public enum PantType {
    A(1), B(1.5), C(3);

    PantType(double price) {
        this.price = price;
    }

    private final double price;

    public double getPrice() {
        return price;
    }
}
