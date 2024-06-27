package studentManagmentSystem;

public class Student {
	
	private int id;
    private String name;
    private String email;
    private double attendancePercentage;
    private double cgpa;

    public Student(int id, String name, String email, double attendancePercentage, double cgpa) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.attendancePercentage = attendancePercentage;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getAttendancePercentage() {
        return attendancePercentage;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", attendancePercentage=" + attendancePercentage +
                ", cgpa=" + cgpa +
                '}';
    }

}
