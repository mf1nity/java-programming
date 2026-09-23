import java.util.Scanner;

public class Access {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter codename: ");
		String code = scanner.next();
		while (!code.equalsIgnoreCase("momo")) {
			System.out.print("Invalid code please try again: ");
			code = scanner.next();
		}
		System.out.println("Welcome");
		System.out.println("Initializing framework...");
		scanner.close();
		}
	}
