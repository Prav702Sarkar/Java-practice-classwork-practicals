// Program 8: Write a Java program using a for loop, break, and continue statements to print numbers from 1 to 20.
// i.) Skip the number 5 using continue.
// ii.) Stop the loop when the number reaches 15 using break.

public class logical_statements {
	public static void main(String[] args) {
		for (int number = 1; number <= 20; number++) {
			if (number == 5) {
				continue;
			}
			if (number == 15) {
				break;
			}
			System.out.println(number);
		}
	}
}
