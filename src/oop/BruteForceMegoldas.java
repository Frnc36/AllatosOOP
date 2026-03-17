package oop;

public class BruteForceMegoldas {

    private Egyenlet egyenlet;
    private Megoldas[] megoldasok;
    private long ciklusSzam;  //számláló

    public BruteForceMegoldas(Egyenlet egyenlet) {
        this.egyenlet = egyenlet;
        this.megoldasok = new Megoldas[3];
        this.ciklusSzam = 0;
    }

    public void megoldas() {
        int megoldasDb = 0;
        ciklusSzam = 0;
        for (int x = 1; x <= 100; x++) {
            for (int y = 1; y <= 100; y++) {
                for (int z = 1; z <= 100; z++) {
                    ciklusSzam++;
                    if (egyenlet.egyenletAr(x, y, z) && egyenlet.egyenletDb(x, y, z)) {
                        megoldasok[megoldasDb++] = new Megoldas(x, y, z);
                    }

                }

            }

        }
    }

    public long getCiklusSzam() {
        return ciklusSzam;
    }

    public Megoldas[] getMegoldasok() {
        return megoldasok;
    }
}
