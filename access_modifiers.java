// Program 11: WAP to demonstrate the four access modifiers and create an
// object to demonstrate which variable can be accessed directly from
// another class.

class Student {
    private int a = 10;
    int b = 20;             
    protected int c = 30;
    public int d = 40;

    public int getA() {
        return a;
    }
}


public class access_modifiers {
    public static void main(String[] args) {

        Student s = new Student();
        
        System.out.println("Private: " + s.getA());
        System.out.println("Default: " + s.b);
        System.out.println("Protected: " + s.c);
        System.out.println("Public: " + s.d);
    }
}

