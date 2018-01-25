// Import the helper library. Java has many helper libraries available.
import java.util.Scanner;

// Class to demonstrate use of user input with conditional checking.
public class UserInput {
	// Intro method to the program.
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);

		// Prompt for the first line
		System.out.print("First Name: ");
		// Read the first line
		String firstName = scan.nextLine();

		System.out.print("Last Name: ");
		String lastName = scan.nextLine();

		System.out.print("Age: ");
		int age = scan.nextInt();


		System.out.println("Hello " + firstName + " " + lastName);
		System.out.println("You are " + age + " years old.");
        
        if(age < 10) {
            System.out.println("You are young.");
        } else if(age < 30) {
            System.out.println("You are a young adult.");
        } else if(age < 50) {
            System.out.println("You are an adult.");
        } else {
            // over 50
            System.out.println("You are old.");
        }
	}
}
