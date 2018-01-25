// The Person class with person properties.
public class Person {
	
    // Global Variables
    private String firstName;
    private String lastName;
    private int age;
    private int strength;
    private int intelligence;
    private float luckPercent;
    
    // Constructors
    public Person() {
        // Empty constructor
        this("NoFirstName", "NoLastName", 0);
        strength = 10;
        intelligence = 10;
        luckPercent = 0.5f;
    }
    
    public Person(String fName, String lName, int a) {
        firstName = fName;
        lastName = lName;
        age = a;
    }
    
    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String fName) {
        firstName = fName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lName) {
        lastName = lName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int a) {
        age = a;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
}

/*
 TEACHING NOTES
 Global variable
 Private vs Public
 Constructors
 Model class should not contain business logic, only data
 */
