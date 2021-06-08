package com.softeq.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Pairs {
    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        int t = s.nextInt();
//        String [] pair_left = new String[t];
//        String [] pair_right = new String[t];
//
//        for (int i = 0; i < t; i++) {
//            pair_left[i] = s.next();
//            pair_right[i] = s.next();
//        }


        String [] pair_left = {"john", "hg","hg", "mary", "ben", "ben"};
        String [] pair_right = {"mary", "om", "om", "bobby", "tom", "tom"};
int t = pair_left.length;
        Set<List<String>> set = new HashSet<>();
        for (int i =0; i < t; i ++) {
            List<String> list = Arrays.asList(pair_left[i], pair_right[i]);
            System.out.println(list);
            set.add(list);
            System.out.println(set.size());
        }
    }
}
