package com.company;

import java.util.Scanner;

public class percentageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Scanner is a class while scanner is the object of the class instance

        // Array to store the marks of 5 subjects
        int[] marks = new int[5];
        int totalMarks = 0;
        int maximumMarks = 500; // Since each subject is out of 100 and there are 5 subjects

        // Taking user input using loops
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();

            // Validating the marks to ensure they are within the range 0-100
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks. Please enter a value between 0 and 100."); // Error message for invalid marks
                System.out.print("Enter the marks for subject " + (i + 1) + " (out of 100): "); // Prompt user again for the marks
                marks[i] = scanner.nextInt(); // Read the marks entered by the user again
            }

            // Adding the marks to totalMarks
            totalMarks += marks[i];
        }

        // Calculating the percentage
        double percentage = (double) totalMarks / maximumMarks * 100;

        // Displaying the total marks and percentage
        System.out.println("Total Marks: " + totalMarks + " out of " + maximumMarks); // Print the total marks
        System.out.println("Percentage: " + percentage + "%"); // Print the percentage

        scanner.close(); // Close the scanner object to prevent resource leak
    }
}
