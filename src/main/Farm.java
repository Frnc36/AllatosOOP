package main;

public class Farm {

    public static void main(String[] args) {

        int allatDb = 100, aranyMax = 100;

        double sertes = 3.5, kecske = 0.5, juh = 1.25;
        double sertesMax = allatDb / sertes, kecskeMax = allatDb / kecske, juhMax = allatDb / juh;
        //System.out.println(sertesMax);
        
        for (int x = 0; x < sertesMax; x++) {
            for (int y = 0; y < kecskeMax; y++) {
                for (int z = 0; z < juhMax; z++) {
                    if ((sertes * x) + (kecske * y) + (juh * z) == aranyMax) {
                        System.out.printf("Sertésbõl: %d darab\n", x);
                        System.out.printf("Kecskébõl: %d darab\n", y);
                        System.out.printf("Juhból: %d darab\n", z);
                        System.out.println("");
                    }

                }

            }

        }
    }//main

}//class
