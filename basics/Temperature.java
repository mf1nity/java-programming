import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Plese enter the Temperature: ");
		int temp = scanner.nextInt();
		if (temp < 32 || temp > 90) {
			System.out.println("Extreme temperature");
		} else {
			System.out.println("Normal temperature");
		}
		scanner.close();
	}
}
