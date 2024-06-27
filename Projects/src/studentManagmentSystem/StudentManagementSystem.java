package studentManagmentSystem;

import java.util.HashMap;

public class StudentManagementSystem {

	// HashMap to store students (ID as key, Student object as value)
    private HashMap<Integer, Student> students;

    public StudentManagementSystem() {
        students = new HashMap<>();
    }

    // Method to add a new student to the system
    public void addStudent(int id, String name, String email, double attendancePercentage, double cgpa) {
        Student newStudent = new Student(id, name, email, attendancePercentage, cgpa);
        students.put(id, newStudent);
        System.out.println("Student added successfully: " + newStudent);
    }

    // Method to retrieve a student by ID
    public Student getStudentById(int id) {
        return students.get(id);
    }

    // Method to print all students in the system
    public void printAllStudents() {
        System.out.println("List of all students:");
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }

    // Method to remove a student by ID
    public void removeStudentById(int id) {
        Student removedStudent = students.remove(id);
        if (removedStudent != null) {
            System.out.println("Student removed successfully: " + removedStudent);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}

