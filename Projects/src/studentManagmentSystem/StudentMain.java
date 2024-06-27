package studentManagmentSystem;

public class StudentMain {

	public static void main(String[] args) {
		
		StudentManagementSystem sms = new StudentManagementSystem();

        // Adding students with attendance percentage and CGPA
        sms.addStudent(1, "Alice", "alice@example.com", 85.5, 3.8);
        sms.addStudent(2, "Bob", "bob@example.com", 92.0, 3.9);

        // Printing all students
        sms.printAllStudents();

        // Retrieving a student by ID
        Student student = sms.getStudentById(1);
        if (student != null) {
            System.out.println("Retrieved student: " + student);
        } else {
            System.out.println("Student not found.");
        }

        // Removing a student by ID
        sms.removeStudentById(2);

        // Printing all students after removal
        sms.printAllStudents();
    }
		
}
