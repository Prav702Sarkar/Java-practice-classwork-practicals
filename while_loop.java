// Program 9: Write a Java program using a while loop to repeatedly ask the user for a password until the correct password is entered.

import java.util.Scanner;

public class while_loop {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String correctPassword = "java123";
		String password = "";

		while (!password.equals(correctPassword)) {
			System.out.print("Enter password: ");
			password = scanner.nextLine();

			if (!password.equals(correctPassword)) {
				System.out.println("Incorrect password. Try again.");
			}
		}

		System.out.println("Correct password. Access granted.");
		scanner.close();
	}
}
