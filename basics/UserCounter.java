public class UserCounter {
	public static void main(String[] args) {
		int count = 0;
		int total = 0;
		for (int i = 1; i <= 20;i++) {
			if (i % 4 == 0) {
				System.out.println(i);
				total = total + i;
				count++;
			}
		}
		System.out.print("count is: " + count + " and total is: " + total);
	}
}

