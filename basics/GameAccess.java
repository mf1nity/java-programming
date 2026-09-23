public class GameAccess {
	public static void main(String[] args ) {

		int age = 16;
		boolean hasPermission = false;

		if (age >=18 || hasPermission) {
			System.out.println("Access granted");
		} else {
			System.out.println("Access denied");
		}
	}
}
