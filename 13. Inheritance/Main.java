// Import the helper library. Java has many helper libraries available.
import java.util.Scanner;
import java.util.InputMismatchException;

// The main class demonstrating custom classes and objects
public class Main {
	// Intro method to the program.
	public static void main(String args[]){
        // Get first person's info
        System.out.println("***Person 1");
        Person person = askForPerson();
        greetPerson(person);
        
        // Get second person's info
        System.out.println("\n***Person 2");
        Person person2 = askForPerson();
        greetPerson(person2);
	}
    
    private static Person askForPerson() {
        System.out.println("Tell me about yourself...");
        
        Scanner scan = new Scanner(System.in);
        
        // get Strings
        System.out.print("First Name: ");
        String firstName = scan.nextLine();
        System.out.print("Last Name: ");
        String lastName = scan.nextLine();
        
        // Get the age, keep asking until it is correct
        int age = 0;
        boolean inputFailed;
        do {
            inputFailed = false; // set this here to ensure that the value is always 'false' at the beginning of the loop
            try {
                System.out.print("Age: ");
                age = scan.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("A person's age must be a whole number");
                inputFailed = true;
            }
            scan.nextLine(); // Consumes "\n" from hitting 'enter' since "nextInt()" doesn't consume it.
        } while(inputFailed);

        System.out.println("-------------");
        
        return new Person(firstName, lastName, age);
    }
    
    private static void greetPerson(Person person) {
        System.out.println("Hello "+person.getFullName());
        int n = 10;
        System.out.println("In " + n + " years you will be " + (person.getAge() + 10));
    }
}

/*
 TEACHING NOTES
 Create a method to ask for a person.
 Create and return a person object.
 Create a method to greet a person.
 Use both methods in the main method.
 Do it for a second person.
 */
