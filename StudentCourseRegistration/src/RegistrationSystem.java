import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class RegistrationSystem {
	private List<Student> Students; 
	private List<Course> Courses;
	private Map<String , List<String>> Registrations; // Map<StudentID, List<CourseID>>
	
	public  RegistrationSystem()
	{
		Students = new ArrayList<>(); // students are initialized by empty array
		Courses = new ArrayList<>(); // courses are initialized by empty array
		Registrations = new HashMap<>(); // Registration initialized by empty HashMap
	}
	
	// addStudents method to add Student details to list
	public void addStudent(Student student) {
		Students.add(student);
	}
	// addCourses method to add course details to list
	public void addCourses(Course course) {
		Courses.add(course);
	}
	public void RegisterCourse(String StudentID, String CourseID)
	{
		// Check if the course exists and is not full
        Course course = findCourse(CourseID);
        if (course != null && !course.isfull()) {
            if (!Registrations.containsKey(StudentID)) {
                Registrations.put(StudentID, new ArrayList<>());
            }
            Registrations.get(StudentID).add(CourseID);
            course.enrolledStudent();
            findStudent(StudentID).registercourse(CourseID);
        }
    }
	public void dropCourse(String studentId, String courseId) {
        List<String> registeredCourses = Registrations.get(studentId);
        if (registeredCourses != null && registeredCourses.remove(courseId)) {
            Course course = findCourse(courseId);
            if (course != null) {
                course.dropStudent();
            }
            findStudent(studentId).dropcourse(courseId);
        }
    }
	 public List<String> getRegisteredCourses(String studentId) {
	        return Registrations.getOrDefault(studentId, new ArrayList<>());
	    }
	    
	    public void displayStudents() {
	        for (Student student : Students) {
	            System.out.println(student);
	        }
	    }
	    
	    public void displayCourses() {
	        for (Course course : Courses) {
	            System.out.println(course);
	        }
	    }
	    public void listAvailableCourses() {
	        for (Course course : Courses) {
	            if (!course.isfull()) {
	                System.out.println(course);
	                System.out.println("Available Slots: " + (course.getCapacity() - course.getEnrolled()));
	            }
	        }
	    }
	    
	    private Course findCourse(String courseId) {
	        for (Course course : Courses) {
	            if (course.getCourseCode().equals(courseId)) {
	                return course;
	            }
	        }
	        return null;
	    }
	    
	    private Student findStudent(String studentId) {
	        for (Student student : Students) {
	            if (student.getStudentID().equals(studentId)) {
	                return student;
	            }
	        }
	        return null;
	    }
	}
	


