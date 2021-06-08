package com.softeq.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MyMap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.nextLine();
        Map<String, String > phoneBook = new HashMap<>();

        for(int i = 0; i < number; i ++) {
            String name = scan.nextLine().trim();
            String phone = scan.nextLine().trim();
            phoneBook.put(name, phone);
        }

        while(scan.hasNext())
        {
            String query = scan.nextLine().trim();
            if(phoneBook.containsKey(query))
            {
                System.out.println(query + "=" + phoneBook.get(query));
            }
            else
            {
                System.out.println("Not found");
            }
        }
        scan.close();
    }
}
