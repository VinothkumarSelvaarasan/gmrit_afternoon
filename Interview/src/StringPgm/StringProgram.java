package StringPgm;

public class StringProgram {
	public static void main(String[] args) {
		String name=" Vinothkumar";
		String lname="Selvaarasan";
		String paragraph="Nature is the connection between the physical"
				+ " world surrounding us and the life inside us. "
				+ "Nature is God’s most precious and valuable gift to "
				+ "humans.";
		
		System.out.println("Character At "+name.charAt(4));
		String data[]=paragraph.split(" ");
		System.out.println("Split Method--> "+ data[4]);
		System.out.println("Username "+name.concat(lname));
		System.out.println("Name"+name.trim());
		System.out.println(name.endsWith("ar"));
		System.out.println(name.length());
		
	}

}
