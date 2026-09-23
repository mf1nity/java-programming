public class ForPractice {
	public static void main(String[] args) {
		int total = 0;
		for(int i = 1;i <= 20;i++) {
			System.out.println(i);
			total = total + i;
		}
		System.out.println("There are " + total + " numbers");
	}
}
