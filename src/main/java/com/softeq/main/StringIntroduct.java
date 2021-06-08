package com.softeq.main;

public class StringIntroduct {
    public static void main(String[] args) {
        String A = "java";
        String B = "code";
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B)>0?"Yes":"No");
        String res = Character.toUpperCase(A.charAt(0)) + A.substring(1) + " " + Character.toUpperCase(B.charAt(0)) + B.substring(1);

        System.out.println(res);
    }
}
