package com.company;

public class Runterzaehlen {
    public static void main(String[] args) {
        runterZaehlen(99);

        herunterZaehlen(9,23);
    }
    public static void runterZaehlen ( int lastNumber) {
        System.out.println(lastNumber);
        lastNumber--;
        if (lastNumber <= 99 && lastNumber>=0) {
            runterZaehlen(lastNumber);
        }
    }
    public static void herunterZaehlen (int endNumber, int firstNumber) {
        if (firstNumber > 0 && endNumber<=firstNumber) {
            herunterZaehlen(endNumber, firstNumber -1);
        }
        System.out.println("Ende.");
    }
}
