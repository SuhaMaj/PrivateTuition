package com.company;

/**
 * @author Suha Majeed
 */
public class Week28 {

    public static void main(String[] args) {
        int totalPennies = getPennies(150);
        int taxPennies = getPennies(160000*2.0);
        String input = "jjj";
        if(input.charAt(0) == ' ')
        System.out.println((20*100)%100.0);
        System.out.println("total pennies = "+totalPennies);
        System.out.println("tax pennies = "+taxPennies);
    }

    private static int getPennies(double total) {
        int totalPennies = (int)(Math.round(100*total) );

        return totalPennies;
    }


}
