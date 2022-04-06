package com.company;

public class NarzistischeZahlen {
    public static void main(String[] args) {

        narzZahl();
    }

    public static void narzZahl() {
        for (int i = 1; i < 1000; i++) {
            if (i == Math.pow(i / 100, 3) + (Math.pow(i % 100 / 10, 3)) + (Math.pow(i % 10, 3))) {
                System.out.println(i);
            }
        }
    }
}
