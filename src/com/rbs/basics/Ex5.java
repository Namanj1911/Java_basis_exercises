package com.rbs.basics;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scanner.nextInt();
        boolean flag = false;
        for(int i=1; i<=n; i++) {
            for(int j = 1; j<=i; j++) {
                if (i%3 == 0) {
                    flag = true;
                    continue;
                }
                System.out.print(i + " ");
            }
            if(!flag){
                System.out.println();
            }
            flag = false;
        }
    }
}
