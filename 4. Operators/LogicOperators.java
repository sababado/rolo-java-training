// Import the helper library. Java has many helper libraries available.
import java.util.Scanner;
import java.util.InputMismatchException;

// The main class demonstrating conditionals and boolean logic.
public class LogicOperators {
	// Intro method to the program.
	public static void main(String args[]){
		// Define a scanner to read from the system input.
		Scanner scan = new Scanner(System.in);
		
        // Scan for integer inputs.
        System.out.print("Integer 1: ");
        int int1 = scan.nextInt();
        System.out.print("Number 2: ");
        int num2 = scan.nextInt();
        
        boolean areEqual = int1 == num2;
        boolean areNotEqual = int1 != num2;
        boolean oneIsGreater = int1 > num2;
        boolean oneIsGreaterOrEqual = int1 >= num2;
        boolean oneIsLess = int1 < num2;
        //boolean oneIsLessOrEqual = int1 >= num2;
        
        System.out.println("Are Equal: " + areEqual);
        System.out.println("Are Not Equal: " + areNotEqual);
        System.out.println("One is Greater: " + oneIsGreater);
        System.out.println("One is Greater or Equal: " + oneIsGreaterOrEqual);
        System.out.println("One is Less: " + oneIsLess);
	}
}

/*
 TEACHING NOTES
 Logic operators can be used on any primitive type.
 After running with ints, take in a float for num2 instead of an int.
 Homework assignment. Put exception handling around the input section
 Homework assignment. How do you determine if a number is odd or even?
 */
