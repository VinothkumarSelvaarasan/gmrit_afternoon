
package ConstructorPgm;

public class ThisKeyword {
	int registerNo;
	String name;
	ThisKeyword(int registerNo,String name)
	{
		this.registerNo=registerNo;
		this.name=name;
	}
	void printData()
	{
		System.out.println("Register Number "+registerNo);
		System.out.println("Name is "+name);
	}
	public static void main(String[] args) {
		ThisKeyword tk=new ThisKeyword(666, "Vinothkumar");
		tk.printData();
	}

}
