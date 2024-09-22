package questions;

public class WordOccurance {
	int wordcount = 1;
	String word, nextword;

	String occ(String str) {
		System.out.println(str);
		String[] st = str.split(" ");
		for (int i = 0; i < st.length; i++) {
			word = st[i];
			for (int j = 1; j < i; j++) {
				
				nextword = st[j];
			}
			if (word.equalsIgnoreCase(nextword)) {
				wordcount++;
			}
			System.out.println("word :" + st[i] + " - count : " + wordcount);
			System.out.println(st[i]);
		}

		return str;
	}

	public static void main(String[] args) {

		String str = "I am Java developer i am proud of it";
		WordOccurance st = new WordOccurance();
		st.occ(str);

	}

}
