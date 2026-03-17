package oop;

public class TesztAllatfarm {

    public static void main(String[] args) {
        BruteForceMegoldas brute = new BruteForceMegoldas(new Egyenlet(3.5, 0.5, 4.0 / 3, 100, 100));
        brute.megoldas();

        //Ellenőrzés
        int jo = 0, osszes = 0;
        for (Megoldas megoldas : brute.getMegoldasok()) {
            if (megoldas != null) {
                osszes++;
                if (megoldas.getX() + megoldas.getY() + megoldas.getZ() == 100 && 3.5 * megoldas.getX() + 0.5 * megoldas.getY() + (4.0 / 3) * megoldas.getZ() == 100) {
                    jo++;
                    System.out.println("Ellenőrizve: " + megoldas.getX() + ", " + megoldas.getY() + ", " + megoldas.getZ() + " = " + (megoldas.getX() + megoldas.getY() + megoldas.getZ()));
                } else {
                    System.out.println("Hibás! " + megoldas.getX() + "," + megoldas.getY() + "," + megoldas.getZ() + " = " + (megoldas.getX() + megoldas.getY() + megoldas.getZ()));
                }
            }
        }
        System.out.println("\nJó megoldások: " + jo + "/" + osszes);
        assert jo == osszes : "Van hibás!";
    }
}
