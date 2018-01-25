// Import the helper library. Java has many helper libraries available.
import java.util.Scanner;
import java.util.InputMismatchException;

// Class to demonstrate use of operators and input validation.
public class InputValidation {
	// Intro method to the program.
	public static void main(String args[]){
		// Define a scanner to read from the system input.
		Scanner scan = new Scanner(System.in);

		// declare variables
		int int1, int2;
		float decimalNumber;

		try {
			// Scan for integer inputs.
			System.out.print("Whole Number 1: ");
			int1 = scan.nextInt();
            scan.nextLine(); // catch the "\n" that nextInt doesn't read.
            
			System.out.print("Whole Number 2: ");
			int2 = scan.nextInt();
            scan.nextLine(); // catch the "\n" that nextInt doesn't read.

			System.out.print("Enter any number: ");
			String temp = scan.nextLine();
			decimalNumber = Float.parseFloat(temp);

			System.out.println();
		} catch (InputMismatchException e) {
			System.out.println("Inputs must be a whole number and nothing else");
			return;
        } catch (NumberFormatException e) {
            System.out.println("A decimal or whole number is required, nothing else!");
            return;
        }

		// Get off your ath and do some math.
		int sum = int1 + int2 + Math.round(decimalNumber);
		int difference = int1 - int2;
		int product = int1 * int2;
		int division = int1 / int2;
		int remainder = int1 % int2; // modulus can only be used on integers

		// Output the results
		System.out.println("Sum: "+sum);
		System.out.println("Difference: "+difference);
		System.out.println("Product: "+product);
		System.out.println("Division: "+division);
		System.out.println("Remainder: "+remainder);
	}
}
