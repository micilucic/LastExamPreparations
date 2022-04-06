package com.company;

import java.util.Arrays;

public class NumberHelper {
    public static void main(String[] args) {
        int[][] array = new int[][]{
                {1, 3, 5},
                {7, 5, 2},
                {4, 6, 4}
        };

        System.out.println(Arrays.toString(getFlatArray(array)));

    }

    public static int[] getFlatArray(int[][] numbers) {

        int lenght = 0;
        for (int i = 0; i < numbers.length; i++) {
            lenght = lenght + numbers[i].length;
        }

        int[] newArray = new int[lenght];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                newArray[count] = numbers[i][j];
                count++;
            }
        }
        return newArray;
    }
}
