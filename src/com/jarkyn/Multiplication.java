package com.jarkyn;

public class Multiplication {
    public static String table(int limit) {
        String rows = "";
        for (int multiplicand = 0; multiplicand <= limit; multiplicand++) {
           for (int multiplier = 0; multiplier <= limit; multiplier++) {
                rows += row(multiplicand, multiplier) + "\n";
           }
        }
        return rows;
    }

    public static String row(int multiplicand, int multiplier) {
        return multiplicand + " x " + multiplier + " = " + multiplicand * multiplier;
    }
}