// Class to demonstrate use of primitive variable types.
public class PrimitiveTypes {
	// Intro method to the program.
    public static void main(String args[]){
        String str = "My First String";
        // str = "Possibility of multiple characters";
        char c = 'g';
        int i = 4;
        float f = 4.0f; // good example of float
        float f2 = 4; // bad example of float. Can lead to undesirable effects
        double d = 4.00000000000001;
    
        System.out.println("String: " + str);
        // String: another string
        System.out.println("Character: " + c);
        System.out.println("Integer: " + i);
        System.out.println("Float: "+f);
        System.out.println("Float2: "+f2);
        System.out.println("Double: "+ d);
    }
}

/*
 TEACHING NOTES
 Char is 1-byte
 Integers are 8-bytes
 Floats are 32-bytes
 Doubels are 64-bytes
*/
