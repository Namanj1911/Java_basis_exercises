package com.rbs.basics;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the previous reading: ");
        int previousReading = scanner.nextInt();
        System.out.println("Enter the current reading: ");
        int currentReading = scanner.nextInt();
        int unitsConsumed = currentReading - previousReading;
        double Bill;
        if (unitsConsumed<=30){
            Bill = unitsConsumed*2.30;
        } else if (unitsConsumed <=100) {
            Bill = (30*2.30) + (unitsConsumed-30)*3.50;
        } else {
            Bill = (30*2.3) + (70 * 3.5) + (unitsConsumed - 100) * 4.6;
        }
        System.out.print("Bill amount is ");
        System.out.printf("%.2f", Bill);
    }
}
