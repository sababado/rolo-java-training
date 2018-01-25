// Import the helper library. Java has many helper libraries available.
import java.util.Scanner;

// Class to demonstrate use of user input.
public class UserInput {
	// Intro method to the program.
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);

		// Prompt for the first line
		System.out.print("First Name: ");
		// Read the first line
		String firstName = scan.nextLine();

        // Prompt for the second line
		System.out.print("Last Name: ");
        // Read the second line
		String lastName = scan.nextLine();

        // Prompt for age
		System.out.print("Age: ");
        // Read age
		int age = scan.nextInt();

        // Print results.
		System.out.println("Hello " + firstName + " " + lastName);
		System.out.println("You are " + age + " years old.");
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
