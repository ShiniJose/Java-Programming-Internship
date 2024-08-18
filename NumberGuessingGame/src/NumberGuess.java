
import java.util.Scanner;
public class NumberGuess {

	public static void main(String[] args) {
		int SecretNumber;
		SecretNumber = (int) (Math.random() * 99+1);
		Scanner keyboard = new Scanner (System.in);
		int guess;
		do
		{
		System.out.println("Enter a guess (1-100)");
		guess = keyboard.nextInt();
		if(guess == SecretNumber)
		{
			System.out.println("!Congradulations, Your guess is correct");
		}
		else if(guess<SecretNumber)
		{
			System.out.println("Sorry, Your guess is too low");
		}
		else if(guess>SecretNumber)
		{
			System.out.println("Sorry, Your guess is too high");
		}
		}
		while(guess!=SecretNumber);
		
		int attempts = keyboard.nextInt();
		int Score=0;
		attempts = attempts-1;
		System.out.println("You Won "+" " +Score);
		System.out.println("Your attempts "+" " +attempts);
		
	}

}
