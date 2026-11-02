/*
Program 12: WAP to create a user-defined package containing a class with
a custom method, and then write a separate main class that imports this
package to create an object and execute the method.
*/

import userdefinedpackage.Car;

public class class_object {
    public static void main(String[] args) {
        Car car = new Car();

        car.showDetails();
        car.startCar();
        car.accelerate();
    }
}
