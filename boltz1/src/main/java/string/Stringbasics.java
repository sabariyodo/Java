package string;

public class Stringbasics {

	public static void main(String[] args) {
		
	//Creating by literals
		
		String s = "Sabari";
		
		System.out.println(s);
		
		String S="Sabari";
		
		System.out.println(s);
		
		System.out.println(s==S);
	
	//Creating by Object
		
		String s1 = new String();
		String s2 = new String("abc");
		char[] ch = {'a','b','c'};
		String s3 = new String(ch);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(ch);
		System.out.println(s3);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s2==s3);
		
		System.out.println(s2.equals(s3));
		
		
	}

}
