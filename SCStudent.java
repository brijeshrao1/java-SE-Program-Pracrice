
//Creating the class for Student

import java.lang.*;
import java.util.*;

class Student
{

	//Prooerties 
	int rollNum;
	public String stuName;
	public String stuCourse;
	public int m1,m2,m3;

	//Behavoiur
	public int totalMarks()
	{
		return(m1+m2+m3);
	}

	public double avgMarks()
	{
		return((double)totalMarks()/3);
	}

	public char grade()
	{
		if(totalMarks()>=90)
			return 'A';
		else if(totalMarks()>=70&&totalMarks()<=89)
			return 'B';
		else if(totalMarks()>=50&&totalMarks()<=69)
			return 'C';
		else
			return 'F';

	}
	
}

public class SCStudent
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		Student st = new Student();

		System.out.print("Enter the rollNumer of Student :: ");
		st.rollNum = sc.nextInt();

		System.out.print("Enter the Name of Student :: ");
		st.stuName = sc.next();

		System.out.print("Enter the Subject of Student :: ");
		st.stuCourse = sc.next();

		System.out.println("Student Detail::");
		System.out.print("Enter the Marks of Student in m1,m2,m3 :: ");
		st.m1 = sc.nextInt();
		st.m2 = sc.nextInt();
		st.m3 = sc.nextInt();

		System.out.println("totalMarks of Student :: "+st.totalMarks());
		System.out.println("Avg Marks of Student :: "+st.avgMarks());
		System.out.println("grade of Student :: "+st.grade());
	}	
}