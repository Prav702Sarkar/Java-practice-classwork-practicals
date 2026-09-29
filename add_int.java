// practical 5

import java.util.Scanner;

class add_int{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the first integer: ");
		int firstNumber = scanner.nextInt();

		System.out.print("Enter the second integer: ");
		int secondNumber = scanner.nextInt();

		int sum = firstNumber + secondNumber;
		System.out.println("Sum = " + sum);

		scanner.close();
	}
}