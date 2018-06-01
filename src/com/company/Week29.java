package com.company;

/**
 * @author Suha Majeed
 */
public class Week29 {
    public static void main(String[] args) {
        printBoxes(6);
    }

    public static void printBoxes(int n){
        if(n == 0){return;}
        printBoxes(n-1);
        System.out.println("[]");

    }
}
