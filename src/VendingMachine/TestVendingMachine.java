package VendingMachine;

public class TestVendingMachine {
    public static void main(String[] args) {
        for (PantType panttype: PantType.values())
            System.out.printf("%s\t%s\n", panttype, panttype.getPrice());

        Can can = new Can(PantType.A, 0.7);
        System.out.println(can.getType() + "\t" + can.getVolume() + "\t" + can.getPrice());

        Bottle bot = new Bottle(PantType.C, 1.5);
        System.out.println(bot.getType() + "\t" + bot.getVolume() + "\t" + bot.getPrice());
    }
}
