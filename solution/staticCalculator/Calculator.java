public class Calculator {
	public static void main(String[] args) {
		if (args.length != 3) {
			System.out.println("You need to pass three parameters to this Calculator. " +
				"The first two must be integers and the last one a character that " +
				"defines the operation (A, S, M or D)");
			return;
		}

		int a = 0;
		int b = 0;
		char operation = args[2].charAt(0);
		int result = 0;

		try {
			a = Integer.valueOf(args[0]);
		} catch (NumberFormatException e) {
			System.out.println("The first parameter is not an integer!");
			return;
		}

		try {
			b = Integer.valueOf(args[1]);
		} catch (NumberFormatException e) {
			System.out.println("The second parameter is not an integer!");
			return;
		}

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
		}
		System.out.println("Result: " + result);
	}
}