package StringPgm;

public class PalinString {
	public static void main(String[] args) {
		//Scanner s=new Scanner()
		String name="madam";
		String reverseString="";
		for(int i=name.length()-1;i>=0;i--)
		{
			reverseString+=name.charAt(i);
		}
		System.out.println("Reverse Value is "+reverseString);
		
		if(name.equalsIgnoreCase(reverseString))
		{
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		}
		
	}

}
