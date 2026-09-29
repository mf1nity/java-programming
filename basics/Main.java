public class Main {
	public static void main(String[] args) {
		String[] user = AddUser.addUser();
		String code = CodeAssignment.codeAssign(user[0]);
		System.out.println(code);
	}


}
