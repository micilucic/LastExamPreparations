package com.company;

public class TeilerFinden {
    public static void main(String[] args) {

       teilerFinder(10);
    }

    public static void teilerFinder(int number) {

            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    System.out.println(i + " is divisor of number " + number + ".");
                }
            }
        }
    }

