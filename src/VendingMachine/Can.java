package VendingMachine;

public class Can extends Containers {

    // Constructs the Can object with following elements:
    public Can(PantType type, double volume) {
        this.type = type;
        this.volume = volume;
        calPrice();
    }


}
