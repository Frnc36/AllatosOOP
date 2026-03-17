package oop;

public class Egyenlet {

    private double sAr, kAr, jAr;
    private int osszAllat, osszArany;

    public Egyenlet(double sAr, double kAr, double jAr, int osszAllat, int osszArany) {
        this.sAr = sAr;
        this.kAr = kAr;
        this.jAr = jAr;
        this.osszAllat = osszAllat;
        this.osszArany = osszArany;
    }

    public double getsAr() {
        return sAr;
    }

    public double getkAr() {
        return kAr;
    }

    public double getjAr() {
        return jAr;
    }

    public int getOsszAllat() {
        return osszAllat;
    }
    
    public boolean egyenletDb(int x, int y, int z) {
        return x + y + z == osszAllat;
    }

    public boolean egyenletAr(int x, int y, int z) {
        return sAr * x + kAr * y + jAr * z == osszArany;
    }
}
