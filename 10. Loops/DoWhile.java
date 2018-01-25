// Import the helper library. Java has many helper libraries available.
import java.util.Scanner;
import java.util.InputMismatchException;

// The main class demonstrating for loops.
public class DoWhile {
	// Intro method to the program.
	public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("What is your age?");
        int age = getIntFromCmd(scan, "Age: ");
        
        System.out.println("Enter another number: ");
        int n = getIntFromCmd(scan, "Number: ");
        
        System.out.println("In "+n+" years you will be "+(age+n));
	}
    
    private static int getIntFromCmd(Scanner scan, String label) {
        // declare variables
        int number = 0;
        boolean inputFailed;
        
        // execute code first before checking condition.
        do {
            try {
                System.out.print(label);
                number = scan.nextInt();
                inputFailed = false;
            } catch(InputMismatchException e) {
                System.out.println("Age must be a whole number");
                inputFailed = true;
            }
            scan.nextLine(); // Consumes "\n" from hitting 'enter' since "nextInt()" doesn't consume it.
        } while(inputFailed); // check condition, if it fails then run the loop again.
     
        // A real number has been obtained, return that.
        return number;
    }
}

/*
 TEACHING NOTES
 First show the format of a do-while loop with a single number.
 "This code is useful, what if we want to use it over and over again?"
 Put it in a function.
 Get age and another number, add the numbers and print the output.
 */
