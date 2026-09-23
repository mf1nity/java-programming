import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age please: ");
		int age = scanner.nextInt();
		if (age >= 65) {
			System.out.println("You are a senior");
		} else if (age >= 18) {
			System.out.println("You are an adult");
		} else {
			System.out.println("You are a minor");
		}
		scanner.close();
		}
	}
