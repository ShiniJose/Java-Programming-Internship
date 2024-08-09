import java.util.Scanner;
public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char Subject;
		Scanner keyboard = new Scanner(System.in);
		char Grade;
		int Maths,Science,Computer,Total;
		float percentage;
		System.out.print("Enter Student Name :");
		String Name = keyboard.next();
		System.out.println("Enter the marks of Mathematics : ");
		Maths = keyboard.nextInt();
		System.out.println("Enter the marks of Science : ");
		Science = keyboard.nextInt();
		System.out.println("Enter the marks of ComputerScience : ");
		Computer = keyboard.nextInt();
		Total=Maths+Computer+Science;
		percentage=Total/3;
		if((percentage<=100) && (percentage>90))
		{
			Grade='O';
		}
		else if((percentage<=90) && (percentage>80))
		{
			Grade='A';
		}
		else if((percentage<=80) && (percentage>70))
		{
			Grade='B';
		}
		else if((percentage<=70) && (percentage>60))
		{
			Grade='C';
		}
		else if((percentage<=60) && (percentage>50))
		{
			Grade='D';
		}
		else
		{
			Grade='E';
		}
		System.out.println("Your Total Marks :" + Total);
		System.out.println("Your percentage :" + percentage);
		System.out.println("Your Grade :" + Grade);
			

	}


}
