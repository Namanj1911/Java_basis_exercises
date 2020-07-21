package com.rbs.basics;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scanner.nextInt();
         int first = 2;
         int second = 1;
         int third = 3;
         System.out.print(first + " " + second + " " + third + " ");
         int next = 0;
         while ( next <= n ) {
             next = first + second + third;
             if (next <= n)
                System.out.print(next + " ");
             first = second;
             second = third;
             third = next;
         }
    }
}
