package snippet;

import java.util.Scanner;

public class SumOfSeries {
	public static void main(String[] args) {
		int range;
		int temp=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value Range");
		range=s.nextInt();
		for(int i=0;i<=range;i++)
		{
			temp+=i;
		}
		System.out.println(temp);
	}

}
