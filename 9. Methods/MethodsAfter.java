// The main class demonstrating methods
public class MethodsBefore {
	// Intro method to the program.
	public static void main(String args[]){
		int num = 10;
		messWithNum(num);
		
		num = 23;
		messWithNum(num);
		
		messWithNum(6);
	}
	
	/**
	 * Method to mess with a given number.
	 * @param num A number to mess with.
	 */
	private static void messWithNum(int num) {
		System.out.println("Messing with number "+num);
		num *= 10;
		System.out.println("Multiply by 10 = "+ num);
		num /= 2;
		System.out.println("divide by 2 = "+ num);
		num += 3;
		System.out.println("Add 3 = "+ num);
		num /= 3;
		System.out.println("divide by 3 = "+ num);
		num %= 8;
		System.out.println("mod by 8= "+ num);
		System.out.println();
	}
}

/*
 TEACHING NOTES
 Use a method to do a repetative task over and over.
 This example cuts the code in half.
 */