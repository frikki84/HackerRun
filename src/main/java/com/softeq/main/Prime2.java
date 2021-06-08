package com.softeq.main;


import java.math.BigInteger;

public class Prime2 {
    public static void main(String[] args) {
        String n = "13";

        BigInteger decimal = new BigInteger(n);

        boolean res = decimal.isProbablePrime(1) ? true : false;
        if (res) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }



    }
}
