package VendingMachine;

public class Pant{
    private double pant;
    private PantType type;
    private double resultat;
    private Can can;
    private Bottle bottle;
    private double volume;
    private boolean isBottle = false;

    public Pant(){
        if (volume >= 1){
            pant = PantType.C.getPrice();
        }
        if (volume == 0.5 && isBottle == true ){
            pant = PantType.B.getPrice();
        }
        if (volume < 1 ){
            pant = PantType.A.getPrice();
        }
        else{
            System.out.println("Something done goofed up");
        }
    }
}
