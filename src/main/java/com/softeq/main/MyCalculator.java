package com.softeq.main;

public class MyCalculator implements AdvancedArithmetic{
    @Override
    public int divisor_sum(int n) {
        int count = 0;
        for (int i = 1; i < n/2; i ++) {
            if(n%i == 0) {
                count += i;
            }
        }
        return count;
    }
}

interface AdvancedArithmetic{
    int divisor_sum(int n);
}
