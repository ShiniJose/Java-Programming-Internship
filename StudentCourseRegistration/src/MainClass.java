
public class MainClass {

	public static void main(String[] args) {
		
		RegistrationSystem Sys = new RegistrationSystem();
		// Adding students
        Student student1 = new Student("S001", "Sherly", 1234567890, "sherly@example.com");
        Student student2 = new Student("S002", "Shini", 1243567890, "shini@example.com");
        Sys.addStudent(student1);
        Sys.addStudent(student2);
        
        // Adding courses
        Course course1 = new Course("C001", 2, "Math 101", "Basic Mathematics",  "MWF 10-11.30 AM");
        Course course2 = new Course("C002", 2, "Physics 101", "Introduction to Physics", "TTh 2-4 PM");
        Sys.addCourses(course1);
        Sys.addCourses(course2);
        
        // Registering courses
        Sys.RegisterCourse("S001", "C001");
        Sys.RegisterCourse("S001", "C002");
        Sys.RegisterCourse("S002", "C001");
        
        // Display students
        System.out.println("Students:");
        Sys.displayStudents();
        
     // Display courses
        System.out.println("Courses:");
        Sys.displayCourses();
        
        // Display available courses
        System.out.println("Available Courses:");
        Sys.listAvailableCourses();
        
        // Drop a course
        Sys.dropCourse("S001", "C002");
        
        // Display students after dropping a course
        System.out.println("Students after dropping a course:");
        Sys.displayStudents();
        
        // Display available courses after dropping a course
        System.out.println("Available Courses after dropping a course:");
        Sys.listAvailableCourses();
    }
        
		
		// TODO Auto-generated method stub

	}


