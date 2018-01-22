// Import the helper library. Java has many helper libraries available.
import java.util.Scanner;
import java.util.InputMismatchException;

// The main class for a machine that produces money in the fewest coins and bills as possible.
public class ChangeMachine {
	// Intro method to the program.
	public static void main(String args[]){
		// Define a scanner to read from the system input.
		Scanner scan = new Scanner(System.in);
		
		// Define the moneyRequested variable.
		float moneyRequested;
		
		try {
			// scan for integer inputs.
			System.out.print("Withdraw how much? Example: $4.34\n$");
			moneyRequested = scan.nextFloat();
			// For formatting, add an extra blank line:
			System.out.println();
		} catch (InputMismatchException e) {
			System.out.println("Inputs must a float and nothing else.");
			return;
		}
		
		// Assign a new variable to moneyRequested so that the original value is never lost.
		// Also convert the value to an integer to work better with modulus.
		int moneyLeft = (int)(moneyRequested * 100);
		
		// calculate each dollar/coin quantity, then reduce the money left value of that dollar/coin value.
		int dollars = moneyLeft / 100;
		moneyLeft %= 100;
		
		int quarters = moneyLeft / 25;
		moneyLeft %= 25;
		
		int dimes = moneyLeft / 10;
		moneyLeft %= 10;
		
		int nickles = moneyLeft / 5;
		moneyLeft %= 5;
		
		// moneyLeft is now in pennies
		
		// Print the results in a concatenated string
		System.out.println("Withdraw of $"+moneyRequested+" will be granted in the form of:\n"
			+ "\tDollars: "+ dollars
			+ "\tQuarters: "+ quarters
			+ "\tDimes: "+ dimes
			+ "\tNickles: "+ nickles
			+ "\tPennies: "+ moneyLeft
			);
	}
}

/*
 TEACHING NOTES
 Get input for a float value.
 'Cache' the input value so that it never gets lost.
 Modulus doesn't work well with double and float.
 Convert the request to an int and mod from there.
 */