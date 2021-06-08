package com.softeq.main;

import java.util.BitSet;
import java.util.Scanner;

public class MyBitSet {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int bitSetLength = get.nextInt();
        int operationsCount = get.nextInt();


//        int bitSetLength = 5;
//        int operationsCount = 4;


        BitSet b1 = new BitSet(bitSetLength);
        BitSet b2 = new BitSet(bitSetLength);


        BitSet[] bitsetArray = new BitSet[3];

        bitsetArray[1] = b1;
        bitsetArray[2] = b2;

        while (operationsCount-- > 0) {
            String operation = get.next().trim();
            int x = get.nextInt();
            int y = get.nextInt();

            switch (operation) {
                case "AND":
                    bitsetArray[x].and(bitsetArray[y]);
                    break;
                case "OR":
                    bitsetArray[x].or(bitsetArray[y]);
                    break;
                case "XOR":
                    bitsetArray[x].xor(bitsetArray[y]);
                    break;
                case "FLIP":
                    bitsetArray[x].flip(y);
                    break;
                case "SET":
                    bitsetArray[x].set(y);
            }

            System.out.printf("%d %d%n", b1.cardinality(), b2.cardinality());
        }

    }

}
