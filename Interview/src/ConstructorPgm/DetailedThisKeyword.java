package ConstructorPgm;

public class DetailedThisKeyword {
	int registerNumber;
	String name;
	DetailedThisKeyword()
	{
		registerNumber=666;
		name="Vinothkumar Selvaarasan";
	}
	DetailedThisKeyword(int registerNumber,String name)
	{
		this();
		this.printData();
		this.registerNumber=registerNumber;
		this.name=name;
		this.printData();
	}
	void printData()
	{
		System.out.println("Register Number is "+registerNumber);
		System.out.println("Name is "+name);
	}
	public static void main(String[] args) {
		DetailedThisKeyword dtk=new DetailedThisKeyword(666,"Ashokkumar Selvaarasan");
	}


}
