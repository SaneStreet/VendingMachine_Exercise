package VendingMachine;

public class TestVendingMachine {
    public static void main(String[] args) {
        for (PantType panttype: PantType.values())
            System.out.printf("%s\t%s\n", panttype, panttype.getPrice());

        Can can = new Can("Coke", PantType.A, PantType.A.getPrice(), 1);
        System.out.println("Brand: " + can.getName() + "\nPant: " + can.getType() + "(" + can.getPrice() + ") \nVolume: " + can.getVolume() + "\n") ;

        Bottle bot = new Bottle("Pepsi", PantType.B, PantType.B.getPrice(), 0.5);
        System.out.println("Brand: " + bot.getName() + "\nPant: " + bot.getType() + "(" + bot.getPrice() + ") \nVolume: " + bot.getVolume());


    }
}
