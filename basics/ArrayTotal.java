import java.util.Scanner;

public class ArrayTotal {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int total = 0;
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Please enter the number you want to add to the array: ");
			numbers[i] = scanner.nextInt();
		}

		int smallest = numbers[0];
		int largest = numbers[0];
		boolean found = false;
		for (int i = 0; i < numbers.length;i++) {
			total = total + numbers[i];
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
			if (numbers[i] == 12) {
				found = true;
				System.out.println("found at position: " + i);
			}
		}
		if (!found) {
			System.out.println("position cannot be found");
		}
		scanner.close();
	}
}
