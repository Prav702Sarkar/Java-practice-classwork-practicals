// practical 3

public class int_to_double {
    public static void main(String[] args) {
        int numInt = 25;
        double numDouble = 15.75;

        // Widening conversion: int to double
        double intToDouble = numInt;

        // Narrowing conversion: double to int
        int doubleToInt = (int) numDouble;

        System.out.println("Original int value: " + numInt);
        System.out.println("Converted int to double: " + intToDouble);

        System.out.println("Original double value: " + numDouble);
        System.out.println("Converted double to int: " + doubleToInt);
    }
}
