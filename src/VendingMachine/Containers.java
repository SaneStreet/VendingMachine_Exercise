package VendingMachine;

public abstract class Containers {
    public PantType type;
    public double volume;
    public double price = 0000;
    public boolean isBottle;

    //Getters
    public PantType getType() {
        return type;
    }
    public double getVolume() {
        return volume;
    }
    public double getPrice() {
        return price;
    }

    //Setters
    public void setType(PantType type) {
        this.type = type;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setBottle(boolean bottle) {
        isBottle = bottle;
    }

    //Methods
    public boolean isBottle() {
        return isBottle;
    }
    public double calPrice(){
        if (getType() == PantType.A){
            setPrice(1);
            getPrice();
        }
        else if (getType() == PantType.B){
            setPrice(1.5);
            getPrice();
        }
        else if (getType() == PantType.C){
            setPrice(3);
            getPrice();
        }
        return price;
    }

}
