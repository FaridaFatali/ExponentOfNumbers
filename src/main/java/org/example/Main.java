package org.example;

import java.util.Scanner;

/**
 * Exercise: https://www.youtube.com/watch?v=3On7CtyTXRA&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=19
 * @author Farida Fatali
 */

// Program that takes the exponent with the values entered by the user (in 3 ways)

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        System.out.print("Enter the power: ");
        int power = scanner.nextInt();

//        USING WHILE:
//        int i = 1;
//        int result = 1;
//        while (i <= power){
//            result *= number;
//            i++;
//        } System.out.println(result);


//        USING FOR:
//        int result = 1;
//        for (int i = 1; i <= power; i++){
//            result *= number;
//            System.out.println(result);
//        }

//        OR JUST:
        int i = 1;
        double result = Math.pow(number, power);
        System.out.println((int) result);

    }
}