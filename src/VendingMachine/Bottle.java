package VendingMachine;

public class Bottle {
    private String name;
    private PantType type;
    private double price;

    // Constructs the Bottle object with following elements:
    public Bottle(String name, PantType type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    // Method for getting Name of Bottle
    public String getName() {
        return name;
    }
    // Method for getting Type of Bottle
    public PantType getType() {
        return type;
    }
    // Method for getting Price of Bottle
    public double getPrice() {
        return price;
    }
}
