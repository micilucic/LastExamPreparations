package com.company;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {
        String[] monatsNamen = new String[] {"Januar", "Februar", "Maerz", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};

        for (int i = 0; i < monatsNamen.length; i++) {
            System.out.println((monatsNamen[i]) + " " + (i+1));
        }
    }
}
