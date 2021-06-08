package com.softeq.main;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA256 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
//        Scanner input = new Scanner(System.in);
////        MessageDigest digest;
////        try {
////            digest = MessageDigest.getInstance("SHA-256");
////            byte[] encodedhash = digest.digest(
////                input.nextLine().trim().getBytes());
////            for (byte i : encodedhash) {
////                System.out.print(String.format("%02x", i));
////            }
////        } catch (NoSuchAlgorithmException e) {
////            e.printStackTrace();
////        }
//
//        //"HelloWorld"
//        //872e4e50ce9990d8b041330c47c9ddd11bec6b503ae9386a99da8584e9bb12c4 -- MessageDigest
//        //48656c6c6f576f726c64 --- private static String bytesToHex(byte[] hash)
//
//       // byte[] hash = input.nextLine().trim().getBytes(StandardCharsets.UTF_8);
//        byte[] hash = "HelloWorld".getBytes(StandardCharsets.UTF_8);
//
//        System.out.println(String.format("%064x", new java.math.BigInteger(1,hash)));
//
//        System.out.println(bytesToHex(hash));
//    }
//
//    private static String bytesToHex(byte[] hash) {
//        StringBuilder hexString = new StringBuilder(2 * hash.length);
//        for (int i = 0; i < hash.length; i++) {
//            String hex = Integer.toHexString(0xff & hash[i]);
//            if(hex.length() == 1) {
//                hexString.append('0');
//            }
//            hexString.append(hex);
//        }
//        return hexString.toString();
//    }

        Scanner input = new Scanner(System.in);
         byte[] hash = input.nextLine().trim().getBytes(StandardCharsets.UTF_8);
      //  byte[] hash = "HelloWorld".getBytes(StandardCharsets.UTF_8);
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(hash);
        byte[] array = md.digest();
        for (byte i : array) {
            System.out.print(String.format("%02x", i));
        }
    }
}




