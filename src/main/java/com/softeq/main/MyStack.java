package com.softeq.main;

import java.util.Arrays;
import java.util.List;

public class MyStack {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<String>list = new ArrayList<>();
//        while (sc.hasNext()) {
//            String input=sc.next().trim();
//            list.add(input);
//        }


        List<String> list = Arrays.asList("{}()", "({()})","{}("," [])");

        for (String s : list) {
            String res = s.replaceAll("[^\\(\\)}]", "");
            System.out.println("res " + res);
            System.out.println(res.length() == 0);
        }
//        String input=sc.next().replaceAll();
//        while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
//        System.out.println(input.isEmpty());

    }
}
