package ConstructorPgm;

public class SimpleCons {
	
	SimpleCons()
	{
		System.out.println("Welcome to Java Constructor");
	}
	void printdata()
	{
		System.out.println("I am a methods");
	}
	public static void main(String[] args) {
		SimpleCons scons=new SimpleCons();
		scons.printdata();
	}
}
