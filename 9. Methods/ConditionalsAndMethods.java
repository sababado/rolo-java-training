// Import the helper library. Java has many helper libraries available.
import java.util.Scanner;
import java.util.InputMismatchException;

// The main class demonstrating conditionals and boolean logic with methods
public class ConditionalsAndMethods {
	// Intro method to the program.
	public static void main(String args[]){
		// Define a scanner to read from the system input.
		Scanner scan = new Scanner(System.in);
		
		// Define the first number variable.
		int num;
		
		try {
			num = getInputInteger(scan, 1);
		} catch (InputMismatchException e) {
			System.out.println("Inputs must an integer and nothing else.");
			return;
		}
		
		// Determine if the number is even. isEven will equal true if the number is even.
		// isEven will equal false if the number is odd.
		boolean isEven = isNumberEven(num);
		// print the number state
		printState(num, isEven);
		
		
		// Get a second number
		int num2;
		try {
			num2 = getInputInteger(scan, 2);
		} catch (InputMismatchException e) {
			System.out.println("Inputs must an integer and nothing else.");
			return;
		}
		
		// determine if the second number is even.
		boolean isNum2Even = isNumberEven(num2);
		
		// print the number state
		printState(num2, isNum2Even);
		// Space for formatting
		System.out.println();
		
		// check if the first and second number are both even.
		if(isEven && isNum2Even) {
			// Both numbers are even.
			System.out.println(num+" and "+num2+" are both even!");
		} else if(isEven && !isNum2Even) { // can be simplified to (isEven)
			// the first number is even and the second is odd.
			System.out.println(num+" is even and "+num2+" is odd.");
		} else if(!isEven && isNum2Even) { // can be simplified to (isNum2Even)
			// The first number is odd and the second is even.
			System.out.println(num+" is odd and "+num2+" is even.");
		} else {
			// Both numbers are odd.
			System.out.println(num+" and "+num2+" are both odd.");
		}
	}
	
	/**
	 * Get a number.
	 * @param scan The Scanner object to get input from.
	 * @param numCount The counter for which input to get. (first number, second number, etc..)
	 * @return An integer.
	 */
	private static int getInputInteger(Scanner scan, int numCount) {
		// scan for integer inputs.
		System.out.print("Enter integer "+numCount+": ");
		return scan.nextInt();
	}
	
	/**
	 * Check to see if a number is even.
	 * @param num The number to check.
	 * @return Returns true if the number is even, false if the number is false.
	 */
	private static boolean isNumberEven(int num) {
		boolean isEven = num % 2 == 0;
		return isEven;
	}
	
	/**
	 * Print the state of a number.
	 * @param num The number to print.
	 * @param isEven True if the number is even, false if the number is odd.
	 */
	private static void printState(int num, boolean isEven) {
		// check if the number is even;
		if(isEven) {
			// If it is even, execute this code.
			System.out.println(num+ " is even!");
		} else {
			// If the number is odd, execute this code.
			System.out.println(num+ " is odd.");
		}
	}
}

/*
 TEACHING NOTES
 Show side by side, cleaner and more readable code.
 Show method return types and multiple parameters
 */