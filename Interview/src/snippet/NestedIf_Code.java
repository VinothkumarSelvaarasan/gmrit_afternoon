package snippet;

import java.util.Scanner;

public class NestedIf_Code {
	public static void main(String[] args) {
		int age;
		String gender;
		Scanner S=new Scanner(System.in);
		System.out.println("Enter your age ");
		age=S.nextInt();
		if(age>=60)
		{
			System.out.println("Enter the Gender");
			gender=S.next();
			if(gender.equals("Male"))
			{
				System.out.println("Middle Birth Allocated");
			}
			else {
				System.out.println("Lower Birth Allocated");
			}	
		}
		else
		{
			System.out.println("Upper Birth Allocated");
		}
	}

}
