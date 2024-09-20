package string;

public class String_functions {

	public static void main(String[] args) {
		
		String s1="  Java Developers  ";
		String s2 = "java";
		String s3 = "Java";
		
				
	//Strip functions	
		/*System.out.println(s1.length());
		System.out.println(s1.stripLeading());
		System.out.println(s1.stripTrailing());
		System.out.println(s1.strip());
		
		
	//length
		System.out.println(s1.length());
	//matches
		String regex="Java|java|Java Developers";
		
		System.out.println(s2.matches(regex));
		
	//string to char
	 
	 
		System.out.println(s2.charAt(1));
		for (int i = 0; i < s2.length(); i++) {
			char c = s2.charAt(i);
			System.out.println("index" + i+"value"+"  "+c); }
			
			// string to char[]
		char[] ch = s2.toCharArray();
		System.out.println(ch[2]); 
		
	//char to String
		char c ='s';
		String st = String.valueOf(c);
		System.out.println(st);
		
		String str = Character.toString(c);
		System.out.println(str);*/
		
	// Char[] to string -- String class constructor
		
		char[] ch = s1.toCharArray();
		 
		String str = new String(ch);
		
		System.out.println(str);
		
			
	}

}
