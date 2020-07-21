package com.rbs.basics;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower limit of 4 digit number");
        int n = scanner.nextInt();
        System.out.println("Enter the upper limit of 4 digit number");
        int m = scanner.nextInt();

        for(int i = n; i <=m; i++) {
            if (i%9 == 0) {
                System.out.println(i);
            }
        }
    }
}
