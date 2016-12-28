public class Calculator {
	private double result;

	public Calculator() {
		result = 0.0;
	}

	public void add(double a, double b) {
		result = a + b;
	}

	public void subtract(double a, double b) {
		result = a - b;
	}

	public void multiply(double a, double b) {
		result = a * b;
	}

	public void divide(double a, double b) {
		result = a / b;
	}

	public double getResult() {
		return result;
	}
}