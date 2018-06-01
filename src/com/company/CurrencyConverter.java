package com.company;

import java.util.Scanner;

/**
 * @author Suha Majeed
 */
public class CurrencyConverter {

    public static void main(String[] args) {
        System.out.println("This program will convert currencies between Euros and Rupees(SL)");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the currency you want to convert(euro or rupee):");
        String currencyType = input.nextLine();
        System.out.println("Enter an amount in "+currencyType+"'s:");
        double currencyValue = input.nextDouble();
        double convertedCurrency;
        //this variable is set so that the end result changes with the user's choice
        String type;
        if(currencyType.equals("euro")){
            convertedCurrency = convertEuro(currencyValue);
            type = "Rupees";
        }else{
            convertedCurrency = convertRuppee(currencyValue);
            type = "Euros";
        }
        System.out.printf(currencyType+"'s: %.3f",convertedCurrency);
        System.out.print(" "+type);
    }
    public static double convertEuro(double euroFinal){
        final double EURORUPEE = 191.74;
        return euroFinal*EURORUPEE;

    }

    public static double convertRuppee(double rupee){
        final double EURORUPEE = 191.74;
        return rupee/EURORUPEE;
    }
}
