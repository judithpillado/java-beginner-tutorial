public class Calculator {
	public static void main(String[] args) {
    int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
    // a, b, and result are all variables
    // Java is statically and strongly typed - means that every variable has to have predifined type that can't change over time.
    char operation = args[2].charAt(0);
    // charAt(0) will return the first char of the string
    int result = 0;
    // int can only hold integers.
    // int values are not objects
    // primitive datatypes can only hold data whereas the classes also provide methods to manipulate the data the variable holds
    if (operation == 'A') {
			result = a + b;
		} else if (operation == 'S') {
			result = a - b;
		} else if (operation == 'M') {
			result = a * b;
		} else if (operation == 'D') {
			result = a / b;
		} else {
			System.out.println("Only the operations 'A', 'S', 'M' and 'D' are allowed.");
			return;
      // Problematic - it tells the program to quit immediately
		}
		System.out.println("Result: " + result);
    // System.out.println is a METHOD that is used to print the result in the console
	}
}
