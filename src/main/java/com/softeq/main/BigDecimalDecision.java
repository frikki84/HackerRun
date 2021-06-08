package com.softeq.main;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class BigDecimalDecision {
    public static void main(String[] args) {
        String[] s = {"9", "-100", "50", "0", "56.5", "90", "0.12", ".12", "02.34", "000.000", "-125000000", "145879"};

        Comparator<String> customComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                BigDecimal a = new BigDecimal(s1);
                BigDecimal b = new BigDecimal(s2);
                return b.compareTo(a); // descending order
            }
        };

        Arrays.sort(s, 0, s.length, customComparator);
        for (String s1 : s) {
            System.out.println(s1);
        }


////        String [] s = {"9", "-100", "50", "0", "56.5", "90", "0.12", ".12", "02.34", "000.000", null};
//
//        List<BigDecimal> list = new ArrayList<>();
//        Map<String, BigDecimal> map = new HashMap<>();
//        for(String string : s) {
//            if (Objects.nonNull(string) && !string.isEmpty()) {
//                BigDecimal value = new BigDecimal(string);
//                list.add(value);
//                map.put(string, value);
//            }
//        }
//        Collections.sort(list, Collections.reverseOrder());
//        System.out.println("SortedList " +  list);
//        List<String> results = new ArrayList<>();
//
//        for (BigDecimal item : list) {
//            for(Map.Entry<String, BigDecimal> entry : map.entrySet()) {
//                if (entry.getValue().equals(item)) {
//                    results.add(entry.getKey());
//                    break;
//                }
//            }
//        }
//
//        s = results.toArray(new String[0]);
//        for (String s1: s) {
//            System.out.println(s1);
//        }


    }


}
