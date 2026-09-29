import java.util.Scanner;
import java.util.Random;

public class CodeAssignment {
	public static String codeAssign(String name) {
		Random random = new Random();
		String code = "";
		String[] letter = {"A", "B", "C", "D", "1", "2", "3", "4"};
		for(int i = 0; i < letter.length; i++) {
			int letterIndex = random.nextInt(letter.length);
			code = code + letter[letterIndex];
				if (code.length() >= 4) {
					break;
				}
		}
		return code;
	}

}

