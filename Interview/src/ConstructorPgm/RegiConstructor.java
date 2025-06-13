package ConstructorPgm;

public class RegiConstructor {
	int registerNo;
	String name;
	RegiConstructor()
	{
		registerNo=666;
		name="VinothkumarSelvaarasan";
	}
	void printData()
	{
		System.out.println("Register Number is "+registerNo);
		System.out.println("Name is "+name);
	}
	public static void main(String[] args) {
		RegiConstructor rc=new RegiConstructor();
		rc.printData();
	}
	

}
