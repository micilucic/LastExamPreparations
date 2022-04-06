package com.company;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};

        System.out.println(Arrays.toString(reverse(array)));
    }
    public static int[] reverse (int[] original) {
        int[] newArray = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            newArray[original.length - 1 - i] = original[i];
        }
        return newArray;
    }
}
