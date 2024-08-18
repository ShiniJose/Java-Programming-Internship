
public class Course {
	private String CourseCode;
	private int Capacity;
	private int Enrolled; // add the students into the list
	private String title;
	private String Description;
	String Schedule;
	
	public Course(String code, int NumOfSeats, String title, String details, String schedule)
	{
		this.CourseCode = code;
		this.Capacity = NumOfSeats;
		this.Enrolled = 0;
		this.title = title;
		this.Description = details;
		this.Schedule = schedule;
	}
	
	public String getCourseCode()
	{
		return CourseCode;
	}
	public int getCapacity()
	{
		return Capacity;
	}
	public String getTitle()
	{
		return title;
	}
	public String getDescription()
	{
		return Description;
	}
	public String getSchedule()
	{
		return Schedule;
	}
	public int getEnrolled()
	{
		return Enrolled;
	}
	public boolean isfull()
	{
		return Enrolled>=Capacity;
	}
	public boolean isempty()
	{
		return Enrolled<=Capacity;
	}
	public void enrolledStudent()
	{
		if(!isfull())
		{
			Enrolled++;
		}
	}
	public void dropStudent()
	{
		if(isempty())
		{
			Enrolled--;
		}
	}
	//@override
	public String toString()
	{
		return "CourseCode :" + CourseCode +"\n"+ 
				"Capacity :" + Capacity +"\n"+
				"Enrolled :" + Enrolled + "\n" +
				"title :" + title +"\n" +
				"Description :" + Description +"\n" +
				"Schedule :" + Schedule;
		}

}
