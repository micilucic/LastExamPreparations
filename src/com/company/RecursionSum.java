package com.company;

public class RecursionSum {
    public static void main(String[] args) {

        System.out.println(getDigitSum(150));
    }
    public static int getDigitSum (int digit1) {
        int sum = 0;

        if (digit1 == 0) {
            return 0;
        }
        return sum = sum + (digit1 % 10 + getDigitSum(digit1/10));
        // digit1%10 - tako dobijamo poslednji broj: 123%10 = 3
        //digit1/10 - tako dobijamo druga dva broja i onda ispocetka
    }
}
