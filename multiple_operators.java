// Program 4 : WAP to demonstrate the use of arithmetic, assignment, comparison,
// logical, and bitwise operators. Display the result of each operation.

public class multiple_operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Arithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        int number = a;
        System.out.println("\nAssignment Operators");
        System.out.println("number = " + number);
        number += b;
        System.out.println("number += b: " + number);

        System.out.println("\nComparison Operators");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));

        System.out.println("\nLogical Operators");
        System.out.println("(a > 0) && (b > 0): " + ((a > 0) && (b > 0)));
        System.out.println("(a > 0) || (b < 0): " + ((a > 0) || (b < 0)));
        System.out.println("!(a > b): " + (!(a > b)));

        System.out.println("\nBitwise Operators");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
    }
}
