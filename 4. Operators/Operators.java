// Import the helper library. Java has many helper libraries available.
import java.util.Scanner;

// Class to demonstrate use of operators.
public class Operators {
	// Intro method to the program.
	public static void main(String args[]){
		// Define a scanner to read from the system input.
		// A scanner can also read from a file or other sources.
		Scanner scan = new Scanner(System.in);
		
		// Scan for integer inputs.
		System.out.print("Integer 1: ");
		int int1 = scan.nextInt();
		System.out.print("Integer 2: ");
		int int2 = scan.nextInt();
		
		// Get off your ath and do some math.
		int sum = int1 + int2;
		int difference = int1 - int2;
		int product = int1 * int2;
		int division = int1 / int2;
		int remainder = int1 % int2;
		
		// Output the results
		System.out.println("Sum: "+sum);
		System.out.println("Difference: "+difference);
		System.out.println("Product: "+product);
		System.out.println("Division: "+division);
		System.out.println("Remainder: "+remainder);
	}
}

/*
 TEACHING NOTES
 Show how to read an integer.
 Then show how to perform basic math calculations, with emphasis on modulus.
 Homework assignment. How do you determine if a number is odd or even?
 */