package com.company;

import java.util.Scanner;

/**
 * @author Suha Majeed
 */
public class Week27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter start: "); // more specific
        while(!input.hasNextInt()){
            System.out.println("Invalid input. Please enter a number that doesn't have decimal places:\n "); // more generic(whole number)
            input.next();
        }
        //start value // not needed// change variable name instead
        int start = input.nextInt();
        System.out.println("Enter finish: ");
        while(!input.hasNextInt()){
            System.out.println("Invalid input. Please enter a number that doesn't have decimal places:\n ");
            input.next();
        }
        //finish value
        int finish = input.nextInt();
        System.out.println("Enter a value to increment with: ");
        while(!input.hasNextInt()){
            System.out.println("Invalid input. Please enter a number that doesn't have decimal places:\n ");
            input.next();
        }
        //value to increment with
        int increment = input.nextInt();
        //calling the method convertToRadians to do the rest...
        convertToRadians(start,finish,increment);
    }

    /**
     * // action of method
     * @param start
     * @param finish
     * @param increment
     * @return radians
     */
    public static double convertToRadians(int start, int finish, int increment){
        final double PI = 3.141592654;
        final double DEGREE = 180.0;
        double radians = 0;
        String word = "k";
        for(;start <= finish;start += increment){
            radians = (Math.PI/DEGREE)*start;
            System.out.printf("%d %10.3f\n",start, radians);
        }
        return radians;
    }
}
