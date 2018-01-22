// Import the helper library. Java has many helper libraries available.
import java.util.Scanner;
import java.util.InputMismatchException;

// The main class demonstrating conditionals and boolean logic.
public class Conditionals {
	// Intro method to the program.
	public static void main(String args[]){
		// Define a scanner to read from the system input.
		Scanner scan = new Scanner(System.in);
		
		// Define the first number variable.
		int num;
		
		try {
			// scan for integer inputs.
			System.out.print("Enter integer 1: ");
			num = scan.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Inputs must an integer and nothing else.");
			return;
		}
		
		// Determine if the number is even. isEven will equal true if the number is even.
		// isEven will equal false if the number is odd.
		boolean isEven = num % 2 == 0;
		
		// check if the number is even;
		if(isEven) {
			// If it is even, execute this code.
			System.out.println(num+ " is even!");
		} else {
			// If the number is odd, execute this code.
			System.out.println(num+ " is odd.");
		}
		
		
		// Get a second number
		int num2;
		try {
			// scan for integer inputs.
			System.out.print("Enter integer 2: ");
			num2 = scan.nextInt();
			// For formatting, add an extra blank line:
		} catch (InputMismatchException e) {
			System.out.println("Inputs must an integer and nothing else.");
			return;
		}
		
		// determine if the second number is even.
		boolean isNum2Even = num2 % 2 == 0;
		
		// check if the second number is even;
		if(isNum2Even) {
			// If it is even, execute this code.
			System.out.println(num2+ " is even!");
		} else {
			// If the number is odd, execute this code.
			System.out.println(num2+ " is odd.");
		}
		
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
}

/*
 TEACHING NOTES
 Talk about primitive type 'boolean' and equals statement.
 Talk about if-else statement
 Talk about if-elseif-else statement
 */