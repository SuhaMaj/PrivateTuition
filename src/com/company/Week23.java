package com.company;

import java.util.Scanner;

/**
 * @author Suha Majeed
 */
public class Week23 {
    public static void main(String[] args) {
//        Scanner input=new Scanner(System.in);
//        System.out.print("How many lines? : ");
//        int x=input.nextInt();
//        for(int i=x;i>=1;i--){
//            for(int j=x;j>i;j--){
//                System.out.print(" ");
//            }
//            for(int k=1;k<(i*2);k++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        Scanner input = new Scanner(System.in);
        System.out.println("How many rows? ");
        while (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter integers (whole numbers) :");
            input.next();
        }
        int number = input.nextInt();
        System.out.println("What Symbol? ");
        char symbol = input.next().charAt(0);

        for (int i = number; i > 0; i--) {
            for (int j = 0; j < number; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= (i*2); j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
