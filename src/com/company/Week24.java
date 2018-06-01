package com.company;

/**
 * @author Suha Majeed
 */
public class Week24 {
    public static void main(String[] args) {
        System.out.println(calVolume(60));
    }

    public static char calVolume(double lenght){
        if(lenght < 0){
            System.out.println("Incorrect");
            return 0;
        }else{
            return 'F';
               }

    }
}
