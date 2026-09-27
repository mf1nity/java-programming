import java.util.Scanner;
import java.util.Random;

public class CodeAssignment {
	public static String codeAssign(String name) {
		Random random = new Random();
		String code = "";
		String[] letter = {"A", "B", "C", "D"};
		int[] numbers = {1, 2, 3, 4};
		for(int i = 0; i < letter.length; i++) {
			int letterIndex = random.nextInt(letter.length - 1);
			int numberIndex = random.nextInt(numbers.length - 1);
			code = code + letter[letterIndex] + numbers[numberIndex];
				if (code.length() >= 4) {
					break;
				}
		}
		return code;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Thank you " + name + " your code is: " + codeAssign(name));
	}
}

