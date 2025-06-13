package ConstructorPgm;

public class ConsWithArguments {
	int registerNumber;
	String name;
	ConsWithArguments()
	{
		registerNumber=666;
		name="Vinothkumar Selvaarasan";
	}
	ConsWithArguments(int r,String n)
	{
		registerNumber=r;
		name=n;
	}
	void printData()
	{
		System.out.println("Register No "+registerNumber);
		System.out.println("Name is "+name);
	}
	public static void main(String[] args) {
		ConsWithArguments cwa=new ConsWithArguments();
		ConsWithArguments cwa1=new ConsWithArguments(666666,"Ashokkumar Selvaarasan");
		cwa.printData();
		cwa1.printData();
	}
	
	

}
