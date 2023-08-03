package org.example;

import java.util.Scanner;

// Code by the mentor

public class GcdAndLcm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int n = Math.min(number1, number2);
        int gcd = 1;
        for (int i = n; i >= 1; i--){
            if ((number1 % i == 0) && (number2 % i == 0)){
                gcd = i;
                break;
            }
        }

        int lcm = (number1 * number2) / gcd;
        System.out.println("GCD of the entered numbers: " + gcd);
        System.out.println("LCM of the entered numbers: " + lcm);
    }
}