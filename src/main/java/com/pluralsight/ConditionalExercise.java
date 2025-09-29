package com.pluralsight;


import java.util.Scanner;

public class ConditionalExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        // Ask the user for their age
//        System.out.print("Enter your age: ");
//        int age = scanner.nextInt();
//
//        // TODO: Write an if statement that checks if age is >= 18
//        // If true, print "You are an adult."
//
//        if (age >= 18) {
//            System.out.println("You are an adult.");
//        } else {
//            System.out.println("You are not an adult yet.");
//        }


        // Ask the user for their grade
        System.out.print("Enter your grade (A-F): ");
        String grade = scanner.next();

        // TODO: Use if-else if statements to print different messages
        // based on the grade entered.
        if (grade.equals("A")) {
            System.out.println("Excellent!");
        } else if (grade.equals("B")) {
            System.out.println("Good Job");
        } else if (grade.equals("C")) {
            System.out.println("You passed.");
        } else if (grade.equals("D")) {
            System.out.println("Barely passed");
        } else if (grade.equals("F")) {
            System.out.println("Failed.");
        } else {
            System.out.println("Invalid grade");
        }

    }
}
