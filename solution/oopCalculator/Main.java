import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		String operation = "A";

		Scanner scanner = new Scanner(System.in);

		while (!operation.equals("E") && !operation.equals("EXIT")) {
			System.out.print("Input a value for a: ");
			double a = scanner.nextDouble();

			System.out.print("Input a value for b: ");
			double b = scanner.nextDouble();
			
			System.out.print("Input an operation: ");
			operation = scanner.next();
			
			if (operation.equals("A") || operation.equals("ADD")) {
				calculator.add(a, b);
			} else if (operation.equals("S") || operation.equals("SUBTRACT")) {
				calculator.subtract(a, b);
			} else if (operation.equals("M") || operation.equals("MULTIPLY")) {
				calculator.multiply(a, b);
			} else if (operation.equals("D") || operation.equals("DIVIDE")) {
				calculator.divide(a, b);
			} else if (operation.equals("E") || operation.equals("EXIT")) {
				continue;
			} else {
				System.out.println("Only the operations (A)DD, (S)UBTRACT, (M)ULTIPLY, (D)IVIDE and (E)XIT are allowed.");
				continue;
			}
			System.out.println("Result: " + calculator.getResult());
		}		
	}
}