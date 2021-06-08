package com.softeq.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubStringsMy {
    public static void main(String[] args) {

        String smallest = "";
        String largest = "";
        String s = "welcometojava";
        int k = 3;

        java.util.List<String> strings = new java.util.ArrayList<>();
        for (int i = 0; i <= s.length()-k; i ++) {
            strings.add(s.substring(i, i + k));
        }
        java.util.Collections.sort(strings);
        smallest += strings.get(0);
        largest += strings.get(strings.size()-1);

        System.out.println(strings);
        System.out.println(smallest + " " + largest);

    }
}
