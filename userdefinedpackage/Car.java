package userdefinedpackage;

public class Car {
    String brand = "Toyota";
    String color = "Red";
    int speed = 0;

    public void showDetails() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Color: " + color);
        System.out.println("Car Speed: " + speed + " km/h");
    }

    public void startCar() {
        System.out.println("The car has started.");
    }

    public void accelerate() {
        speed = speed + 20;
        System.out.println("The car is moving at " + speed + " km/h.");
    }
}
