import java.util.Scanner;

public class InputValidation {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a integer: ");
		while (!scanner.hasNextInt()) {
			System.out.print("Invalid enter a integer: ");
			scanner.nextLine();
		}
		int number = scanner.nextInt();
		System.out.println("You entered " + number);
		scanner.close();
	}
}
