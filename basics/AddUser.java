import java.util.Scanner;

public class AddUser {
	public static String[] addUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your first and last name: ");
		String name = scanner.nextLine();
		System. out.print("Thank You now please enter your age: ");
		String age = scanner.next();
		scanner.nextLine();
		System.out.print("Now lastly enter your address: ");
		String address = scanner.nextLine();
		String[] user = {name, age, address};
		scanner.close();
		return user;
	}

}
