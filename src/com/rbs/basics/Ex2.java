package com.rbs.basics;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius");
        int r = scanner.nextInt();
        System.out.println("Enter Output required:");
        String request = scanner.next();

        switch(request) {
            case "DIA":
                System.out.println("Diameter of circle is " + 2*r);
                break;
            case "AR":
                System.out.println("Area of the circle is " + Math.PI*r*r);
                break;
            case "PER":
                System.out.println("Perimeter of the circle is " + 2*Math.PI*r);
                break;
            case "ARSEM":
                System.out.println("Area of semi circle is " + Math.PI*r);
                break;
            default:
                System.out.println("Invalid request.");
        }
    }
}
