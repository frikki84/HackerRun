package com.softeq.main;

import java.math.BigInteger;
import java.util.Scanner;

public class HugeInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger number1 = new BigInteger(sc.next());
        BigInteger number2 = new BigInteger(sc.next());

        BigInteger sum = number1.add(number2);
        BigInteger mul = number1.multiply(number2);

        System.out.println(sum);
        System.out.println(mul);
    }
}
