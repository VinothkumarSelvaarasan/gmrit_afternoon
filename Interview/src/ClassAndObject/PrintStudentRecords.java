package ClassAndObject;

import java.util.Scanner;

public class PrintStudentRecords {
	int registerNo;
	String name;
	String Department;
	int marks[]=new int[3];
	int total=0;
	float percentage;
	Scanner s=new Scanner(System.in);
	void getData()
	{
		System.out.println("Enter the Register Number ");
		registerNo=s.nextInt();
		System.out.println("Enter the Name ");
		name=s.next();
		System.out.println("Enter the Department ");
		Department=s.next();
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter the Marks for Subject "+(i+1));
			marks[i]=s.nextInt();
		}
	}
	float calculatePercentage()
	{
			for(int i=0;i<marks.length;i++)
			{
				total=total+marks[i];
			}
			percentage=(float)total/marks.length;
			return percentage;
	}
	void printData()
	{
		System.out.println("Register Number is "+registerNo);
		System.out.println("Name is "+name);
		System.out.println("Department is "+Department);
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Marks for Subject "+(i+1)+" is "+marks[i]);
		}

		System.out.println("Percentage "+calculatePercentage());
		System.out.println("Total "+total);
	}
	public static void main(String[] args) {
		PrintStudentRecords psr=new PrintStudentRecords();
		psr.getData();
		psr.printData();
	}
	
}
