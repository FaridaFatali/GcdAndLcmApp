package org.example;

import java.util.Scanner;

/**
 * Exercise: <a href="https://www.youtube.com/watch?v=KxAd5p1786k&list=PLEcJSEQK_cD4HTOlqV7xxMH0CYi29adgX&index=25">...</a>
 * @author Farida Fatali
 */

// Finding The Greatest Common Divisor (GCD) and The Lowest Common Multiple (LCM) of the 2 numbers entered by the user (two ways)

public class GcdAndLcm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();

        int gcd = 1;
        int lcm = 1;

        for (int i = 1; (i <= number1) && (i <= number2); i++){
            if((number1 % i == 0) && (number2 % i == 0)){
                gcd = i;
                lcm = (number1 * number2) / gcd;
            }
        }

        System.out.println("The GCD of these numbers: " + gcd);
        System.out.println("The LCM of these numbers: " + lcm);

    }
}