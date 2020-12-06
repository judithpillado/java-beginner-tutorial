public class Calculator {
	public static void main(String[] args) {
    int a = args[0];
		int b = args[1];
    int result = a + b;
    // a, b, and result are all variables
    // This creates error (incompatible thypes: String cannot be converted to int)
    // Java is statically and strongly typed - means that every variable has to have predifined type that can't change over time.
    // int can only hold integers.
    // int values adsre not objects
    // primitive datatypes can only hold data whereas the classes also provide methods to manipulate the data the variable holds
		System.out.println("Result: " + result);
    // System.out.println is a METHOD that is used to print the result in the console

	}
}
