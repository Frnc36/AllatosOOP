package oop;

public class Megoldas {

    private int x, y, z;

    public Megoldas(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public String allapot() {
        return "Megoldás: " + "\nsertesDb = " + x + ";\nkecskeDb = " + y + ";\njuhDb = " + z + ";";
    }
}
