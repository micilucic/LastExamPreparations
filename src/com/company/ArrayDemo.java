package com.company;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{6, 7, 8};

        // koristi se samo jedan brojac, jer zelimo prvi sa prvim da sabiramo
        // ako bismo oba koristili, ona bismo svaki sa svakim sabirali
        System.out.print("+ ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print((array1[i] + array2[i]) + " ");
        }

        System.out.println(); // kako bi bilo razmaka izmedju racunica
        System.out.print("* ");
        for (int j = 0; j < array1.length; j++) {
            System.out.print((array1[j] * array2[j] + " "));
                                //obavezno zagrada kod racunanja !!!
        }
    }
}

