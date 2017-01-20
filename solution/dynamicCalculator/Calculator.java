import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String operation = getOperation(scanner);

		while (!operation.equals("E") && !operation.equals("EXIT")) {
			double result = 0;

			System.out.print("Input a value for a: ");
			double a = scanner.nextDouble();

			System.out.print("Input a value for b: ");
			double b = scanner.nextDouble();
			
			if (operation.equals("A") || operation.equals("ADD")) {
				result = a + b;
			} else if (operation.equals("S") || operation.equals("SUBTRACT")) {
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
			}
			System.out.println("Result: " + result);

			operation = getOperation(scanner);
		}		
	}

	private static String getOperation(Scanner scanner) {
		System.out.print("Input an operation: ");
		return scanner.next();
	}
}