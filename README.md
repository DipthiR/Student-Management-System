# Student-Management-System
# Student Management System (SMS) - Java
## Project Overview
The Student Management System (SMS) is a simple console-based application built in Java to manage student information. The system allows users to:

Add new students to the system.

View a list of all registered students.

Delete students by their roll number.

Exit the system.

This project is designed to help users manage student records and provides basic functionality to add, view, and remove student data.

## Features
Add Student: Input student details (name, roll number, age, course) and store them in memory.

View Students: Display a list of all students with their details.

Delete Student: Remove a student from the system by providing their roll number.

Exit: Close the application.

## Technology Stack
Programming Language: Java

## Libraries: Standard Java library

IDE/Editor: Any Java-compatible editor (e.g., IntelliJ IDEA, Eclipse, or VS Code)

Database: Not used in this version. Data is stored temporarily in memory using ArrayList.

## Requirements
Java Development Kit (JDK) 8 or above.

A command-line interface (CLI) to run the program.

## Installation
Clone or Download the project files:

If you're using Git, you can clone the repository:

git clone https://github.com/yourusername/student-management-system.git
Alternatively, you can simply download the project files as a ZIP and extract them.

Compile and Run the Program:

Open a terminal/command prompt in the directory where the Java files are stored.

Compile the Java files:

javac StudentManagementSystem.java
Run the compiled program:

java StudentManagementSystem
## Usage
Once the program is running, you will see a menu with four options:

==== Student Management System ====
1. Add Student
2. View Students
3. Delete Student
4. Exit
## Menu Options:
Add Student:

You will be prompted to enter the student's name, roll number, age, and course.

View Students:

Displays a list of all registered students.

Delete Student:

You will be asked to input the roll number of the student you want to remove from the system.

Exit:

Exits the application and terminates the program.

## Sample Run:

==== Student Management System ====
1. Add Student
2. View Students
3. Delete Student
4. Exit
Choose an option: 1
Enter student name: John Doe
Enter student roll number: 101
Enter student age: 20
Enter student course: Computer Science
Student added successfully.

==== Student Management System ====
1. Add Student
2. View Students
3. Delete Student
4. Exit
Choose an option: 2
Name: John Doe, Roll Number: 101, Age: 20, Course: Computer Science

==== Student Management System ====
1. Add Student
2. View Students
3. Delete Student
4. Exit
Choose an option: 3
Enter roll number of student to delete: 101
Student deleted successfully.

==== Student Management System ====
1. Add Student
2. View Students
3. Delete Student
4. Exit
Choose an option: 2
No students found.
## File Structure

StudentManagementSystem/
├── StudentManagementSystem.java   # Main program with logic
├── README.md                     # This file


## Future Enhancements
Database Integration: Store student data in a database like MySQL or SQLite for persistent storage.

Search Functionality: Add the ability to search for students by name or roll number.

Advanced User Interface: Integrate with a GUI framework like JavaFX or Swing for a more interactive experience.

Add Student Grades: Track and manage student grades, attendance, and other academic records.

Data Export: Add functionality to export student data to CSV or PDF for reporting.
