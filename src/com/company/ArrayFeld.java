package com.company;

import java.util.Arrays;

public class ArrayFeld {
    public static void main(String[] args) {
        int[] num = new int[]{5, 7, 2, 6};
        int[] num1 = new int[] { 8, 6, 6, 3, 2};

        arrangeOrder(num1);
        System.out.println(Arrays.toString(num1));

    }

    public static void arrangeOrder(int[] numbers) {
        int[] sortedArray = new int[numbers.length];

        for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    int tempStorage = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = tempStorage;
            }
        }
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i] > numbers[i+1]) {
                arrangeOrder(numbers);
            }
        }
    }
}
