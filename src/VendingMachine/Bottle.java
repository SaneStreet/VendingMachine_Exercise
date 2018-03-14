package VendingMachine;

public class Bottle {
    private String name;
    private PantType type;
    private double price;
    private double volume;

    // Constructs the Bottle object with following elements:
    public Bottle(String name, PantType type, double price, double volume) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.volume = volume;
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
    // Method for getting Volume of Bottle
    public double getVolume() {
        return volume;
    }
}
