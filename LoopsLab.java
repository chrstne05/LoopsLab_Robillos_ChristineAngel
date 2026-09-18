/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LoopsLab;

import java.util.Scanner;

/**
 *
 * @author chri
 */
public class LoopsLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Activity 1
        System.out.println("Enter a number to display its multiplication table:");

        int number = input.nextInt();
        System.out.println("===========================================");
        System.out.println("Multiplication table of " + number + ":");
        for (int a = 1; a <= 10; a++) {

            System.out.println(number + " * " + a + " = " + (number * a));
        }

        System.out.println("===========================================");
        System.out.println();
        System.out.println();

        
        
        //Activty 2
        System.out.println("Enter a number to calculate and display its sum:");

        int num = input.nextInt();
        int sum = 0;
        int b = 1;

        while (b <= num) {
            sum += b;
            b++;
        }
        
        System.out.println("===========================================");
        System.out.println("The sum of the numbers from 1 to " + num + " is " + sum);
        System.out.println("===========================================");

        System.out.println();
        System.out.println();

        
        
        //Activity 3
        System.out.println("Enter a number to calculate its factorial:");

        int n = input.nextInt();
        int fac = 1;
        int c = 1;

        do {
            fac = fac * c;
            c++;
        } while (c <= n);

        System.out.println("===========================================");
        System.out.println("The factorial of " + n + " is equal to " + fac);
        System.out.println("===========================================");

        System.out.println();
        System.out.println();

        
        
        //Activity 4
        System.out.println("Enter a number to find the even & odd numbers, separately:");

        int yohoo = input.nextInt();

        System.out.println("===========================================");
        System.out.println("Even numbers: ");
        for (int luh = 1; luh <= yohoo; luh++) {
            if (luh % 2 == 0) {
                System.out.print(luh + " ");
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("Odd numbers: ");
        for (int luh = 1; luh <= yohoo; luh++) {
            if (luh % 2 != 0) {
                System.out.print(luh + " ");
            }
        }
        System.out.println();

        System.out.println("===========================================");

        System.out.println();
        System.out.println();

        
        
        //Activity 5
        System.out.println("Enter a number to reverse its digits:");

        int hilu = input.nextInt();
        int reversed = 0;

        while (hilu != 0) {
            int digit = hilu % 10;
            reversed = reversed * 10 + digit;
            hilu = hilu / 10;
        }

        System.out.println("===========================================");
        System.out.println("Reversed sequence: " + reversed);
        System.out.println("===========================================");

    }

}
