// Import the helper library. Java has many helper libraries available.
import java.util.Scanner;
import java.util.InputMismatchException;

// The main class for a rations warehouse calculation.
// Given a number of Marines and days that they'll be in the field
// this class will determine how many MREs they should receive.
// The breakdown will be in pallets and cases. 
public class RationsWarehouse {
	// Intro method to the program.
	public static void main(String args[]){
		// Define a scanner to read from the system input.
		Scanner scan = new Scanner(System.in);
		
		// Multiple variables can be defined on a single line.
		int numMarines, numDaysInField;
		
		try {
			// scan for integer inputs.
			System.out.print("How many Marines? ");
			numMarines = scan.nextInt();
			System.out.print("How many days in the field? ");
			numDaysInField = scan.nextInt();
			// For formatting, add an extra blank line:
			System.out.println();
		} catch (InputMismatchException e) {
			System.out.println("Inputs must an integer and nothing else.");
			return;
		}
		
		// calculate total number of meals required.
		int mealsPerDay = 3;
		int totalMeals = numMarines * numDaysInField * mealsPerDay;
		
		// store numbers to variables
		int mresPerCase = 12;
		int casesPerPallet = 48;
		
		// calculate total number of cases required
		int cases = (int) ((float)totalMeals / (float)mresPerCase + 0.5f);
		// calculate total number of pallets required
		int pallets = cases / casesPerPallet;
		// calculate remaining cases required.
		cases %= casesPerPallet;
		
		// Print the results
		System.out.println(numMarines+ " Marines for "+ numDaysInField+ " will require:\n"
			+ "\tPallets: "+pallets
			+ "\tCases: "+cases
			);
	}
}

/*
 TEACHING NOTES
 Get inputs from the command line.
 Define "magic numbers"
 Calculate business logic
 
 TESTS
 30 3 -> 0,30
 180 13 -> 12,9
 150 13 -> 10,8
 */