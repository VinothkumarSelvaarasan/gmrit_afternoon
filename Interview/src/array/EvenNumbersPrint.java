package array;

public class EvenNumbersPrint {
	public static void main(String[] args) {
		int marks[]= {89,80,90,91,92};
		
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]%2==0)
			{
				System.out.println(marks[i]+ " ");
			}
		}
	}
}
