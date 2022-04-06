package com.company;

public class Fakultaet {
    public static void main(String[] args) {

        System.out.println(calcFaculty(3));
    }

    public static long calcFaculty(int value) {
        int fak = 1;
        for (int i = 1; i <= value; i++) {
            fak = fak * i;
            System.out.println(fak);
        }
        return fak;
    }
}
