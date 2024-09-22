package string;

public class Remove_WhiteSpace {
	  String rem="";

	
	
//Using replaceAll method
	   String removeAllspace(String str){
		 rem = str.replaceAll("\\s", "");
		return rem;
	}
	 
//Using replace
	  String replace(String str) {
		 rem = str.replace(" ", "");
		 return rem; 
	 }

//Using char
	  String charmethod (String str) {
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
		
		Remove_WhiteSpace rw = new Remove_WhiteSpace();
		
		System.out.println(str);
		System.out.println(rw.removeAllspace(str));
		System.out.println(rw.replace(str1));
		System.out.println(rw.charmethod(str1));
	}

}
