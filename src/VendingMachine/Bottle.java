package VendingMachine;

public class Bottle extends Containers {
    private boolean isBottle;

    // Constructs the Bottle object with following elements:
    public Bottle(PantType type, double volume) {
        this.type = type;
        this.volume = volume;
        calPrice();
        setBottle(true);
    }

    public boolean isBottle() {
        return isBottle;
    }

    public void setBottle(boolean bottle) {
        isBottle = bottle;
    }
}
