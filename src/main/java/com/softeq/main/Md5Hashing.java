package com.softeq.main;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Md5Hashing {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner input = new Scanner(System.in);
         byte[] hash = input.nextLine().trim().getBytes(StandardCharsets.UTF_8);
//        byte[] hash = "HelloWorld".getBytes(StandardCharsets.UTF_8);
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(hash);
        byte[] array = md.digest();
        for (byte i : array) {
            System.out.print(String.format("%02x", i));
        }
    }
}
