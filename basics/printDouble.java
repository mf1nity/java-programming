import java.util.Scanner;

public class printDouble {
	public static int pd(int number){
		return number * number ;
	}

	public static int multiply(int a , int b) {
		return a * b;
	}

	public static boolean iseven(int number) {
		boolean even = number % 2 == 0;
		return even;
	}

	public static void main(String[] args) {
		System.out.println(iseven(4));
	}
}
