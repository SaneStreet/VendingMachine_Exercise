package VendingMachine;

public class Pant{
    private double pant;
    private PantType type;
    private double resultat;
    private Can can;
    private Bottle bottle;

    public Pant(){
        if (type == PantType.A){
            pant = PantType.A.getPrice();
        }
        if (type == PantType.B){
            pant = PantType.B.getPrice();
        }
        if (type == PantType.C){
            pant = PantType.C.getPrice();
        }
        else{
            System.out.println("Something done goofed up");
        }

        
    }
}
