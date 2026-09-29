import java.util.Scanner;

public class if_else {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		if (age >= 0) {
			System.out.println("The age is valid.");
		}

		if (age >= 18) {
			System.out.println("You are an adult.");
		} else {
			System.out.println("You are a minor.");
		}

		if (age >= 18) {
			if (age >= 65) {
				System.out.println("You are a senior citizen.");
			} else {
				System.out.println("You are a working-age adult.");
			}
		}

		if (age < 13) {
			System.out.println("Category: Child");
		} else if (age < 20) {
			System.out.println("Category: Teenager");
		} else if (age < 60) {
			System.out.println("Category: Adult");
		} else {
			System.out.println("Category: Senior citizen");
		}

		scanner.close();
	}
}
