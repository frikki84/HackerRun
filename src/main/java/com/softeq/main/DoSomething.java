package com.softeq.main;

public class DoSomething {


    public static void main(String[] args) {
        long x = -1500000000000l;
        try {

            if (x >= -128 && x <= 127) {
                System.out.println("* byte");
            }
            if (x >= Math.pow(2, -15) && x < Math.pow(2, 15)) {
                System.out.println("* shot");
            }
            if (x >= Math.pow(2, -31) && x < Math.pow(2, 31)) {
                System.out.println("* int");
            }
            if (x >= Math.pow(2, -63) && x < Math.pow(2, 63)) {
                System.out.println("* long");
            }

        } catch (Exception e) {
            System.out.println(" can't be fitted anywhere.");
        }


    }

}












