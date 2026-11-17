// Program 14: (A) Write a java program to calculate the area of a square, rectangle, and circle using method overloading. 

import java.util.Scanner;

public class method_overloading {

    // Area of a square
    static int area(int side) {
        return side * side;
    }

    // Area of a rectangle
    static int area(int length, int breadth) {
        return length * breadth;
    }

    // Area of a circle
    static double area(double radius) {
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side of the square: ");
        int side = scanner.nextInt();

        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        System.out.println("Area of square = " + area(side));
        System.out.println("Area of rectangle = " + area(length, breadth));
        System.out.println("Area of circle = " + area(radius));

        scanner.close();
    }
}
