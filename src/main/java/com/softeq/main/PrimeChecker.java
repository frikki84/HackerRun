package com.softeq.main;

import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class PrimeChecker {
    public static void main(String[] args) {
        try {
            //BufferedReader br=new BufferedReader(new InputStreamReader(in));
//                int n1=Integer.parseInt(br.readLine());
//                int n2=Integer.parseInt(br.readLine());
//                int n3=Integer.parseInt(br.readLine());
//                int n4=Integer.parseInt(br.readLine());
//                int n5=Integer.parseInt(br.readLine());

            int n1 = 2;
            int n2 = 1;
            int n3 = 3;
            int n4 = 4;
            int n5 = 5;
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

class Prime {
    public void checkPrime(int... numbers) {
        String result = "";
        for (int i : numbers) {
            String intString = Integer.toString(i);
            BigInteger bigInteger = new BigInteger(intString);
            if (bigInteger.isProbablePrime(1)) {
                result += bigInteger + " ";
            }
        }
        System.out.println(result);
    }
}

