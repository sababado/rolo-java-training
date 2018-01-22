// Import the helper library. Java has many helper libraries available.
import java.util.Scanner;
import java.util.InputMismatchException;

// Class to demonstrate use of operators, input validation, and casting.
public class CastingPrimitiveTypes {
	// Intro method to the program.
	public static void main(String args[]){
		// Define a scanner to read from the system input.
		Scanner scan = new Scanner(System.in);
		
		// Multiple variables can be defined on a single line.
		int int1, int2;
		
		try {
			// scan for integer inputs.
			System.out.print("Integer 1: ");
			// the variable is initialized here.
			int1 = scan.nextInt();
			System.out.print("Integer 2: ");
			// the variable is initialized here.
			int2 = scan.nextInt();
			// For formatting, add an extra blank line:
			System.out.println();
		} catch (InputMismatchException e) {
			System.out.println("Inputs must be integers and nothing else.");
			return;
		}
		
		// Get off your ath and do some math.
		int sum = int1 + int2;
		int difference = int1 - int2;
		int product = int1 * int2;
		int division = int1 / int2;
		int remainder = int1 % int2;
		
		// Cast the integers to floats
		float castInt1 = (float) int1;
		float castInt2 = (float) int2;
		// divide, add 0.5f, then convert back to an integer.
		int divisionRoundedUp = (int)(castInt1 / castInt2 + 0.5f);
		
		// Output the results
		System.out.println("Sum: "+sum);
		System.out.println("Difference: "+difference);
		System.out.println("Product: "+product);
		System.out.println("Division: "+division);
		System.out.println("DivRound: "+divisionRoundedUp);
		System.out.println("Remainder: "+remainder);
	}
}

/*
 TEACHING NOTES
 What is the result of 5 / 2? (A: 2)
 How can the result be rounded up? (A: cast variables, add 0.5, then cast back.
 Explain casting.
 */