import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Scanner is a class util package in Java
		// used for obtaining the input of the primitve types like int, double, strings, etc
		// object is created using the 'new' keyword followed by constructor with no parameters by default
			// constructor is a special method that is used to initialize objects
		// Scanner class uses the constructor that takes in System.in as parameter - permits you to read input from keyboard?
		// Scanner doesn't provide nextChar() method

		String operation = getOperation(scanner);

		while (!operation.equals("E") && !operation.equals("EXIT")) {
			// while is LOOP
			// used here bc we want calculator to run until the user exits the program

			double result = 0;

			System.out.print("Input a value for a: ");
			// difference b/w System.out.print and System.out.println:
			// System.out.println prints a line break at the very end. other method does not.
			double a = scanner.nextDouble();
			// is double a floating point number?
			System.out.print("Input a value for b: ");
			double b = scanner.nextDouble();

			if (operation.equals("A") || operation.equals("ADD")) {
				result = a + b;
			} else if (operation.equals("S") || operation.equals("SUBTRACT")) {
				// allows for more options for the user. more dynamic
				result = a - b;
			} else if (operation.equals("M") || operation.equals("MULTIPLY")) {
				result = a * b;
			} else if (operation.equals("D") || operation.equals("DIVIDE")) {
				result = a / b;
			} else if (operation.equals("E") || operation.equals("EXIT")) {
				return;
			} else {
				System.out.println("Only the operations (A)DD, (S)UBTRACT, (M)ULTIPLY, (D)IVIDE and (E)XIT are allowed.");
				continue;
				// continue means that the rest of the loop should be skipped and the next round should start
			}
			System.out.println("Result: " + result);

			operation = getOperation(scanner);
		}
	}

	private static String getOperation(Scanner scanner) {
		// private allows the use for the variable access w/i the class
		// static means we can access the variable in static method
		// static methods are methods that can be called w/o creating an object of class
		System.out.print("Input an operation: ");
		return scanner.next();
	}
}
