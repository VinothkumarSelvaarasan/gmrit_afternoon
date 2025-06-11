package array;

public class ContinuePgm {
	public static void main(String[] args) {
		int marks[]= {90,91,92,93,99};
		for(int i=0;i<marks.length;i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.println(marks[i]);
		}
	}

}
