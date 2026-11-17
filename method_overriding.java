// Program 14 (B): write a program to demonstrate method overriding 
// using a parent class Shape with a draw() method, and a child Circle that overrides draw().

class Shape {

    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class method_overriding {

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
