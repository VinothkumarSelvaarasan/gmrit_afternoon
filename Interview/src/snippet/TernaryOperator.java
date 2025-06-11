package snippet;

import java.util.Scanner;

public class TernaryOperator {
	public static void main(String[] args) {
		int age;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Age");
		age=s.nextInt();
		String result=age>=18?"Your are Eligible to vote":"You are not Eligible for vote";
		System.out.println(result);
	}

}
