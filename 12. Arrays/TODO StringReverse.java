// Import the helper library. Java has many helper libraries available.
import java.util.Scanner;
import java.util.InputMismatchException;

// The main class demonstrating for loops.
public class ForLoops {
	// Intro method to the program.
	public static void main(String args[]){
        
        int sum = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
        System.out.println(sum);
        // Print the sum of all numbers 1 to n.
        sum = 0;
        int n = 10;
        for(int i=0; i<n; i++) {
            sum += i; // sum = sum + i
        }
        System.out.println(sum + "\n");
        
        // Extra as a math formula
        // sum = (n * (n+1) ) / 2;
	}
}

/*
 TEACHING NOTES
 Sum all numbers 1 to 10. What if you need to sum all numbers 1 to n?
 Show how to do it as a for loop
 */
