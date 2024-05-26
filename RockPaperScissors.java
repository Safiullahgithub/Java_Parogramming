package com.company;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Game choices
        String[] choices = {"Rock", "Paper", "Scissors"};

        while (true) {
            // Prompt the user to enter their choice
            System.out.println("Enter your choice (Rock, Paper, Scissors). To exit the game, type 'exit': ");
            String userChoice = scanner.nextLine();

            // Exit the game if the user types 'exit'
            if (userChoice.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for playing!");
                break;
            }

            // Validate user input
            if (!userChoice.equalsIgnoreCase("Rock") &&
                    !userChoice.equalsIgnoreCase("Paper") &&
                    !userChoice.equalsIgnoreCase("Scissors")) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            // Generate the computer's choice
            int computerChoiceIndex = random.nextInt(3);
            String computerChoice = choices[computerChoiceIndex];

            // Determine the result
            String result = determineWinner(userChoice, computerChoice);

            // Display the choices and the result
            System.out.println("You chose: " + userChoice);
            System.out.println("Computer chose: " + computerChoice);
            System.out.println(result);
        }

        // Close the scanner to prevent resource leaks
        scanner.close();
    }

    // Method to determine the winner
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "It's a tie!";
        }

        switch (userChoice.toLowerCase()) {
            case "rock":
                return (computerChoice.equalsIgnoreCase("Scissors")) ? "You win!" : "You lose!";
            case "paper":
                return (computerChoice.equalsIgnoreCase("Rock")) ? "You win!" : "You lose!";
            case "scissors":
                return (computerChoice.equalsIgnoreCase("Paper")) ? "You win!" : "You lose!";
            default:
                return "Invalid input!";
        }
    }
}
