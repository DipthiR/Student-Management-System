import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {

    // Student class to represent each student's data
    static class Student {
        private String name;
        private String rollNumber;
        private int age;
        private String course;

        // Constructor
        public Student(String name, String rollNumber, int age, String course) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.age = age;
            this.course = course;
        }

        // Getter and Setter methods
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRollNumber() {
            return rollNumber;
        }

        public void setRollNumber(String rollNumber) {
            this.rollNumber = rollNumber;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getCourse() {
            return course;
        }

        public void setCourse(String course) {
            this.course = course;
        }

        // To display student information
        @Override
        public String toString() {
            return "Name: " + name + ", Roll Number: " + rollNumber + ", Age: " + age + ", Course: " + course;
        }
    }

    // StudentManager class to manage student records
    static class StudentManager {
        private List<Student> students;

        // Constructor
        public StudentManager() {
            students = new ArrayList<>();
        }

        // Add a student
        public void addStudent(Student student) {
            students.add(student);
        }

        // View all students
        public void viewStudents() {
            if (students.isEmpty()) {
                System.out.println("No students found.");
            } else {
                for (Student student : students) {
                    System.out.println(student);
                }
            }
        }

        // Delete a student by roll number
        public boolean deleteStudent(String rollNumber) {
            for (Student student : students) {
                if (student.getRollNumber().equals(rollNumber)) {
                    students.remove(student);
                    return true;
                }
            }
            return false;
        }
    }

    // Main system to interact with the user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        int choice;
        do {
            System.out.println("\n==== Student Management System ====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    // Add Student
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student roll number: ");
                    String rollNumber = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter student course: ");
                    String course = scanner.nextLine();

                    Student student = new Student(name, rollNumber, age, course);
                    manager.addStudent(student);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    // View all students
                    manager.viewStudents();
                    break;

                case 3:
                    // Delete Student
                    System.out.print("Enter roll number of student to delete: ");
                    String rollToDelete = scanner.nextLine();
                    boolean success = manager.deleteStudent(rollToDelete);
                    if (success) {
                        System.out.println("Student deleted successfully.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    // Exit
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
