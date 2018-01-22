// Import the helper library. Java has many helper libraries available.
import java.util.Scanner;

// Class to demonstrate use of user input.
public class UserInput {
	// Intro method to the program.
	public static void main(String args[]){
		// Define a scanner to read from the system input.
		// A scanner can also read from a file or other sources.
		Scanner scan = new Scanner(System.in);
		
		// Prompt for the first line
		System.out.print("Line 1: ");
		// Read the first line
		String lineOne = scan.nextLine();
		
		// Prompt for the second line
		System.out.print("Line 2: ");
		// Read the second line
		String lineTwo = scan.nextLine();
		
		// Output the inputs
		System.out.println("1: "+ lineOne);
		System.out.println("2: "+ lineTwo);
	}
}

/*
 TEACHING NOTES
 First run of the program should show how to read the lines and output the lines.
 The second run of the program should engage the audience on user experience.
 Meaning the developer should put a prompt in front of each line being read, asking for information.
 Ask for a string one and string two. Then ask for noun/personName. Explain importance of properly naming
 variables.
 */
// EXERCISE
// INPUT
// Name: <input name>
// Age: <input age>
// OUTPUT
// <name> is <age> years old.