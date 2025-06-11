package array;

import java.util.Scanner;

public class ArrayDeclareLaterDef {
	public static void main(String[] args) {
		int marks[];
		int size;
		int total=0;
		float percentage;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of subjects");
		size=s.nextInt();
		marks=new int[size];	
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Enter the Marks for Subject "+(i+1));
			marks[i]=s.nextInt();
		}
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Marks for the Subject "+(i+1)+" is "+marks[i]);
			total+=marks[i];
		}
		percentage=(float)total/marks.length;
		System.out.println("Total marks is "+total);
		System.out.println("Percentage is "+percentage);
		
		
	}



}
