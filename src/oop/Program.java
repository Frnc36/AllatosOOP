package oop;

public class Program {

    public static void main(String[] args) {
        Egyenlet egyenlet = new Egyenlet(3.5, 0.5, 4.0 / 3, 100, 100);

        BruteForceMegoldas bruteforce = new BruteForceMegoldas(egyenlet);
        bruteforce.megoldas();

        System.out.printf("Lefutott ciklusok száma: %,d\n", bruteforce.getCiklusSzam());
        for (Megoldas megoldas : bruteforce.getMegoldasok()) {
            System.out.println("\n"+megoldas.allapot());
        }
    }
}
