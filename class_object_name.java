// Program 10: WAP to create a student class with name, roll number,
// and marks. Create three objects and display the details of the
// student with the highest marks.

public class class_object_name {

    static class Student {
        String name;
        int rollNumber;
        int marks;

        Student(String name, int rollNumber, int marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }

        void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Marks: " + marks);
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Aman", 1, 78);
        Student student2 = new Student("Riya", 2, 92);
        Student student3 = new Student("Karan", 3, 85);

        Student highestMarksStudent = student1;

        if (student2.marks > highestMarksStudent.marks) {
            highestMarksStudent = student2;
        }

        if (student3.marks > highestMarksStudent.marks) {
            highestMarksStudent = student3;
        }

        System.out.println("Student with the highest marks:");
        highestMarksStudent.displayDetails();
    }
}
