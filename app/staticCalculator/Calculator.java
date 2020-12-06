public class Calculator {
	public static void main(String[] args) {
    if (args.length != 3) {
			System.out.println("You need to pass three parameters to this Calculator. " +
				"The first two must be integers and the last one a character that " +
				"defines the operation (A, S, M or D)");
			return;
		}
    // This lets the user know what type of parameters it's expecting
		int a = 0;
		int b = 0;
		char operation = args[2].charAt(0);
		int result = 0;
    // a, b, and result are all variables
    // Java is statically and strongly typed - means that every variable has to have predifined type that can't change over time.

    try {
			a = Integer.valueOf(args[0]);
		} catch (NumberFormatException e) {
      // NumberFormatException is used whenever we want to make sure the value is a number
			System.out.println("The first parameter is not an integer!");
			return;
		}

		try {
			b = Integer.valueOf(args[1]);
		} catch (NumberFormatException e) {
			System.out.println("The second parameter is not an integer!");
			return;
		}
    //
    // char operation = args[2].charAt(0);
    // // charAt(0) will return the first char of the string
    // int result = 0;
    // // int can only hold integers.
    // // int values are not objects
    // // primitive datatypes can only hold data whereas the classes also provide methods to manipulate the data the variable holds
    switch (operation) {
      // you can use 'switch' if you don't want to use if statements
			case 'A':
      // 'case' replaces 'if'
      // 'case branch' is the proper way to call it?
				result = a + b;
				break;
        // 'break' statement is important bc otherwise it would execute multiple cases.
          // eg: case 'M' and default branch (which is the 'else' statement) might execute
			case 'S':
				result = a - b;
				break;
			case 'M':
				result = a * b;
				break;
			case 'D':
				result = a / b;
				break;
			default:
				System.out.println("Only the operations 'A', 'S', 'M' and 'D' are allowed.");
				return;
		}
		System.out.println("Result: " + result);
    // System.out.println is a METHOD that is used to print the result in the console
	}
}
