package com.company;

import java.util.Scanner;

/**
 * @author Suha Majeed
 */
public class Week33 {

    public static void main(String[] args) {

        final int NO_OF_STUDENTS = 50;
        double [] marks = new double[NO_OF_STUDENTS];

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the mark. Enter any letter to quit: ");
        int currentSize = 0;
        while (input.hasNextDouble()){
            System.out.print("Please enter the mark.Enter any letter to quit: ");
            if(currentSize < marks.length){
                marks[currentSize] = input.nextDouble();
                currentSize++;
            }
            input.next();
        }


        for(int i = 0; i < currentSize; i++){
            System.out.println(marks[i]);
        }

        System.out.println("No of student who sat for the exam: "+currentSize);


    }
}
