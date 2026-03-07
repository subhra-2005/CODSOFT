package myproject;
import java.util.Scanner;
import java.util.Random;
public class Calculator {
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
	        Random rand = new Random();

	        int score = 0;
	        String playAgain;

	        do {
	            int number = rand.nextInt(100) + 1;
	            int guess;
	            int attempts = 0;
	            int maxAttempts = 5;
	            boolean guessedCorrectly = false;

	            System.out.println("Guess the number between 1 and 100");
	            System.out.println("You have " + maxAttempts + " attempts.");

	            while (attempts < maxAttempts) {
	                System.out.print("Enter your guess: ");
	                guess = sc.nextInt();
	                attempts++;

	                if (guess == number) {
	                    System.out.println("Correct! You guessed the number.");
	                    guessedCorrectly = true;
	                    score++;
	                    break;
	                } 
	                else if (guess > number) {
	                    System.out.println("Too high!");
	                } 
	                else {
	                    System.out.println("Too low!");
	                }

	                System.out.println("Attempts left: " + (maxAttempts - attempts));
	            }

	            if (!guessedCorrectly) {
	                System.out.println("You lost! The correct number was: " + number);
	            }

	            System.out.println("Your score: " + score);

	            System.out.print("Do you want to play again? (yes/no): ");
	            playAgain = sc.next();

	        } while (playAgain.equalsIgnoreCase("yes"));

	        System.out.println("Game Over! Final Score: " + score);
	        sc.close();
	}

}
