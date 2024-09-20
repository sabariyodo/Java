package string;

public class Count_numbers {
	 
	
	public static void main(String[] args) {
		
	String str = "Java Developers";
	
	String[] words = str.trim().split("\\s+");
	
	String s = str.trim();
	System.out.println(s);
	
	System.out.println(words.length);
	
	}

}
