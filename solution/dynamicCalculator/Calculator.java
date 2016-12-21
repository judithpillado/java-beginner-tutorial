import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int result = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Input a value for a: ");
		a = scanner.nextInt();
		System.out.print("Input a value for b: ");
		b = scanner.nextInt();

		result = a + b;
		System.out.println("Result: " + result);
	}
}