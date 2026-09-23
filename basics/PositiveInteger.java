import java.util.Scanner;

public class PositiveInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a integer: ");
		while (!scanner.hasNextInt()) {
			System.out.print("invalid please enter a integer: ");
			scanner.nextLine();
		}
		int number = scanner.nextInt();
		while (number <= 0) {
			System.out.print("Invalid only positive integers: ");
			while (!scanner.hasNextInt()) {
				System.out.print("only numbers pleaseeeeee");
				scanner.nextLine();
			}
			number = scanner.nextInt();
		}
		System.out.println("Your number is: " + number);
		scanner.close();
	}
}
