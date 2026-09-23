public class Calculator {
	public static int multiply(int a, int b) {
		return a * b;
	}

	public static int multiply(int a, int b, int c) {
		return a * b * c;
	}

	public static double multiply(double a, double b) {
		return a * b;
	}

	public static void main(String[] args) {
		System.out.println(multiply(3, 4));
		System.out.println(multiply(3, 5, 7));
		System.out.println(multiply(3.5, 5.3));
	}
}
