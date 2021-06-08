package com.softeq.main;

public class Regex {
    public static void main(String[] args) {
//        String regex = "[ .,?!']+";
        String s = " .,?!'";
//
//        Pattern pattern = Pattern.compile(regex);
//
//        Matcher matcher = pattern.matcher(s);
//
//        List<String> resultArray = new ArrayList<>();
//
//        while (matcher.find()) {
//            resultArray.add(matcher.);
//        }
//
//        System.out.println(resultArray);
        if (s.length() > 0) {
            String regex = "[!,?._'@\\s ]+";
            String[] tokens = s.split(regex);
            System.out.println(tokens.length);
            if (tokens.length > 0) {
                for (String token : tokens) {
                    System.out.println(token);
                }
            }
        } else {
            System.out.println(0);
        }


    }
}
