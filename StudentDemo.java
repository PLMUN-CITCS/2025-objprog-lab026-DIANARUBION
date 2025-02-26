class Student {
    // Add private instance variables (attributes
    private String name;
    private int id;
    private double gpa;

    // Add a Static Variable to track the total number of students
    private static int studentCount = 0;

    // Create a Constructor to initialize student details
    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
        studentCount++;
    // Increment the static studentCount
    }

    // Add a displayStudentInfo Method to display student information
    public void displayStudentInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }

    // Add a Static displayStudentCount Method to display total students created
    public static void displayStudentCount() {
        System.out.println("Total students: " + studentCount);
    }
}

public class StudentDemo {
public static void main(String[] args) {
    // Create Student Objects
    Student student1 = new Student("Alice", 101, 3.8);
    Student student2 = new Student("Bob", 102, 3.5);
    Student student3 = new Student("Charlie", 103, 3.9);

    // Displaying student details
    student1.displayStudentInfo();
    student2.displayStudentInfo();
    student3.displayStudentInfo();

    // Displaying total student count using the static method
    Student.displayStudentCount();
    }
}

