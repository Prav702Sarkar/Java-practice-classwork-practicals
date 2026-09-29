// write a java program to store the names of 5 students in a string array & display all the names using the array.
// practical 2

public class students_array {
    public static void main(String[] args) {
        String[] students = {"Alice", "Bob", "Charlie", "David", "Eva"};

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
