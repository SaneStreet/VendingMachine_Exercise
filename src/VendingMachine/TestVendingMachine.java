package VendingMachine;

public class TestVendingMachine {
    public static void main(String[] args) {
        for (PantType panttype: PantType.values())
            System.out.printf("%s\t%s\n", panttype, panttype.getPrice());

        Can can = new Can("Coke", PantType.A, PantType.A.getPrice());
        System.out.println(can.getName() + "\t" + can.getType() + "\t" + can.getPrice());

        Bottle bot = new Bottle("Pepsi", PantType.B, PantType.B.getPrice());
        System.out.println(bot.getName() + "\t" + bot.getType() + "\t" + bot.getPrice());
    }
}
