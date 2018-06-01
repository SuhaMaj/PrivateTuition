package com.company;

/**
 * @author Suha Majeed
 */
public class Week30 {
    public static void main(String[] args) {
        int [] values = {2, 3, 5, 7, 11};
        String [] a = {"a"};
        for(int i = 0; i < 5; i++ ){
            values[i]++;
            //System.out.println(values[i]);
        }

        for(int i = 0; i< a.length; i++){
            System.out.println(values[i]);
        }


    }

}
