package com.learn;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for(int number = 1; number <  9; number +=2) {
            System.out.println("number = " + number);
        }

        for(int number = 100; number < 140; number +=10) {
            System.out.println("number = " + number);
        }
        System.out.println("==================================");

//        Create a for statement using a range of numbers from 1 to 1000 inclusive.
//
//            Sum all the numbers that can be divided with both 3 and also with 5.
//
//        For those numbers that met the above conditions, print out the number.
//
//        break out of the loop once you find 5 numbers that met the above conditions.
//
//        After breaking out of the loop print the sum of the numbers that met the above conditions.
//
//                Note: Type all code in main method

        int count = 0;
        int sum = 0;

        for(int number = 1; number <= 1000; number ++) {

            if(number % 3 == 0 && number% 5 == 0) {
                count++;
                sum+=number;

                System.out.println("Found number = " + number);
            }

            if(count == 5) {
                    break;
            }


        }

        System.out.println("Sum = " + sum);

    }

}
