package string;

public class Remove_WhiteSpace {
	 static String rem="";

	
	
//Using replaceAll method
	  static String removeAllspace(String str){
		 rem = str.replaceAll("\\s", "");
		return rem;
	}
	 
//Using replace
	 static String replace(String str) {
		 rem = str.replace(" ", "");
		 return rem; 
	 }

//Using char
	 static String charmethod (String str) {
		 char[] out = str.toCharArray();
		 for(char ch: out) {
			 if(!Character.isWhitespace(ch)) {
				 rem+=ch;
			 } 
		 }
		 return rem;
	 }
	 

	public static void main(String[] args) {
		String str = "Java Developer ";
		String str1=" J a v a D e v e l o p e r";
		System.out.println(str);
		System.out.println(removeAllspace(str));
		System.out.println(replace(str1));
		System.out.println(charmethod(str1));
	}

}
