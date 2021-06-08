package com.softeq.main;

import java.util.Scanner;

public class SubArrays {
    public static void main(String[] args) {

//        int[] array = {1, -2, 4, -5, 1};
//        int n = array.length;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int count = 0;
        int res = 0;

        for (int i = 0; i < n; i ++) {
            for (int j = i; j < n; j ++) {
                res +=  array[j];
                if (res < 0) {
                    count++;
                }
//                System.out.println((i+1) + " step: " +res);
            }
            res = 0;
        }
        System.out.println(count);

    }
}
