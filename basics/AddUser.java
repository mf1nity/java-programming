import java.util.Scanner;

public class AddUser {
	public static String[] addUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your first and last name: ");
		String name = scanner.nextLine();
		System.out.print("Thank You now please enter your age: ");
		while (!scanner.hasNextInt()) {
			System.out.print("please enter only a number");
			scanner.nextLine();
		}
		int age = scanner.nextInt();
		while (age < 17 || age > 45) {
			System.out.print("nope wrong age to get in here, you must be between 17 and 45: ");

			while (!scanner.hasNextInt()) {
				System.out.print("Only Integers please!: ");
				scanner.nextLine();
			}
			age = scanner.nextInt();
		}
		scanner.nextLine();
		String howOld = String.valueOf(age);
		System.out.print("Now lastly enter your address: ");
		String address = scanner.nextLine();
		String[] user = {name, howOld, address};
		scanner.close();
		return user;
	}

	public static void main(String[] args) {
		String[] user = addUser();
		for (String ele : user) {
			System.out.print(ele);
		}
	}

}
