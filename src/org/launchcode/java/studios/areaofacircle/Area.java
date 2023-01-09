package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome! Here you can calculate the area of a circle. Please enter the circle's radius: ");

        double radius;

        do {
            System.out.println("Enter a positive number for the radius: ");
            while (!input.hasNextDouble()) {
                System.out.println("The radius must be a number! Try again: ");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);

        System.out.println("The area of a circle with a radius of " + radius + " is " + Circle.getArea(radius) + " units squared.");

        input.close();
    }
}
