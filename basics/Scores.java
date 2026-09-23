public class Scores {
	public static void main(String[] args) {
		int[] scores = {3, 8, 12, 5, 16, 7, 20};
		int total = 0;
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] % 2 == 0) {
				total = total + scores[i];
				count++;
			}
		}
		System.out.println(total);
		System.out.println("there are " + count + " even numbers");
	}
}
