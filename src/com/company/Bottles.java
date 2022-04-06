package com.company;

public class Bottles {
    public static void main(String[] args) {

        bottlesBeer(100, 6);
    }

    public static void bottlesBeer(int strophe, int flasche) {

        if (strophe > 0) {
            strophe--;
            if ( flasche > 10) {
                System.out.println(strophe + " bottles of beer on the wall, " + strophe + " bottles of beer. Take one down, pass it around, " + strophe + " bottles of beer on the wall.");
            } else if (strophe == 2 || flasche > 5 && flasche <= 10) {
                System.out.println(strophe + " bottles of beer on the wall, " + strophe + " bottles of beer. Take one down, pass it around.");
            } else if (strophe == 1 || flasche < 5) {
                System.out.println(strophe + " bottles of beer on the wall, " + strophe + " bottles of beer.");
            }
            bottlesBeer(strophe, flasche);
        }
    }
}

