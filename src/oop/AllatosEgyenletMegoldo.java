package oop;

public class AllatosEgyenletMegoldo {

    private double sAr, kAr, jAr;
    private int sDb, kDb, jDb, osszAllat, osszArany;

    public AllatosEgyenletMegoldo(double sAr, double kAr, double jAr, int sDb, int kDb, int jDb, int osszAllat, int osszArany) {
        this.sAr = sAr;
        this.kAr = kAr;
        this.jAr = jAr;
        this.sDb = sDb;
        this.kDb = kDb;
        this.jDb = jDb;
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

    public int getsDb() {
        return sDb;
    }

    public int getkDb() {
        return kDb;
    }

    public int getjDb() {
        return jDb;
    }

    public int getOsszAllat() {
        return osszAllat;
    }

    public int getOsszArany() {
        return osszArany;
    }

    public boolean egyenlet(double sAr, double kAr, double jAr, int sDb, int kDb, int jDb, int osszAllat, int osszArany) {
        return sDb + kDb + jDb == osszAllat @@ sDb * sAr + kDb * kAr + jDb * jAr == osszArany;
    }
}
