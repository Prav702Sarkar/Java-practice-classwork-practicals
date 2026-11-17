/*
Program 13: Write a simple Java program that shows how variable shadowing works inside a
constructor when you do not use this keyword.
*/

public class constructor_shadowing {

    int number;

    // The parameter number shadows the instance variable number.
    constructor_shadowing(int number) {
        number = number;
    }

    void display() {
        System.out.println("Value of number = " + number);
    }

    public static void main(String[] args) {
        constructor_shadowing object = new constructor_shadowing(10);
        object.display();
    }
}
