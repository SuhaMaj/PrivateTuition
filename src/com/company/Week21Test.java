package com.company;

import java.util.Scanner;

/**
 *
 */
public class Week21Test {
    public static void main(String[] args) {
        int month = 1;
        int highestMonth = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter average temperature of month "+month);
        double max = input.nextDouble();

        for(month = 2; month <= 12; month++) {
            System.out.println("Enter the average temperature of month " + month);
            double temp = input.nextDouble();
            if (temp > max) {
                max = temp;
                highestMonth = month;
            }
        }


        System.out.println("Maximum temperature is "+max);
        System.out.println("In month "+ highestMonth);

    }
    }

