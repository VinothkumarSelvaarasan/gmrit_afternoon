package array;

import java.util.Scanner;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		String amazonWarehouse[][]=new String[2][3];
		Scanner s=new Scanner(System.in);
for(int i=0;i<amazonWarehouse.length;i++)
{
	for(int j=0;j<amazonWarehouse[i].length;j++)
	{
		System.out.println("Enter the product you want to keep in room no "+(i+1)+(j+1));
		amazonWarehouse[i][j]=s.next();
	}
}
for(int i=0;i<amazonWarehouse.length;i++)
{
	for(int j=0;j<amazonWarehouse[i].length;j++)
	{
		System.out.println("Product in room no "+(i+1)+(j+1) + " is "+amazonWarehouse[i][j]);
	}
}
		
	}

}
