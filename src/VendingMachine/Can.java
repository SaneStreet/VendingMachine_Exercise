package VendingMachine;

public class Can {
    private String name;
    private PantType type;
    private double price;
    private double volume;

    // Constructs the Can object with following elements:
    public Can(String name, PantType type, double price, double volume) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.volume = volume;
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
    // Method to getting Volume of Can
    public double getVolume() {
        return volume;
    }

}
