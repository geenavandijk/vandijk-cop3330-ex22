/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */

package org.example;

import java.util.Scanner;

public class ComparingNumbers {
    static public void main (String[] args){

        Scanner input = new Scanner(System.in);

        int max, number1, number2;

        System.out.println("Enter the first number: ");
        max = input.nextInt();
        System.out.println("Enter the second number: ");
        number1 = input.nextInt();
        System.out.println("Enter the third number: ");
        number2 = input.nextInt();

        if (max < number1)
            max = number1;

        if (max < number2)
            max = number2;

        System.out.printf ("The largest number is %d", max);


    }
}
