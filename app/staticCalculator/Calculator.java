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
