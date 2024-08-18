import java.util.List;
import java.util.ArrayList;

public class Student {
	private String StudentID;
	private String StudentName;
	private int PhoneNumber;
	private String EmailID;
	private  List<String> RegisteredCourses;
	
	public  Student(String Id, String Name,int Number,String Email)
	{
		this.StudentID = Id;
		this.StudentName =Name;
		this.PhoneNumber = Number;
		this.EmailID = Email;
		this.RegisteredCourses = new ArrayList<>();
	}
	
	public String getStudentID()
	{
		return StudentID;
	}
	public String getStudentName()
	{
		return StudentName;
	}
	public int getPhoneNumber()
	{
		return PhoneNumber;
	}
	public String getEmailID()
	{
		return EmailID;
	}
	public List<String> getResisteredCourses()
	{
		return RegisteredCourses;
	}
	public void registercourse(String CourseCode)
	{
		RegisteredCourses.add(CourseCode);
	}
	public void dropcourse(String CourseCode)
	{
		RegisteredCourses.remove(CourseCode);
	}
	//@override
	public String toString()
	{
		return "Student ID :" + StudentID +"\n" +
		 "Name :" + StudentName +"\n" +
		 "Number :" + PhoneNumber +"\n" +
		 "Email :" + EmailID +"\n" +
		 "RegisteredCourses :" ;
		
	}
	
	

}
