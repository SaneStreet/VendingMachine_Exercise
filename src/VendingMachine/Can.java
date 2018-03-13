package VendingMachine;

public class Can {
    private String name;
    private PantType type;
    private double price;

    // Constructs the Can object with following elements:
    public Can(String name, PantType type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    // Method to getting Name of Can
    public String getName() {
        return name;
    }
    // Method to getting Type of Can
    public PantType getType() {
        return type;
    }
    // Method to getting the Price of Can
    public double getPrice() {
        return price;
    }

}
