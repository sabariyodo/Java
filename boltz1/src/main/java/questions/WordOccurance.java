package questions;

import java.util.HashMap;
import java.util.Map;

public class WordOccurance {
	int wordcount = 1;
	String word, nextword;

	String occ(String str) {
		System.out.println(str);
		
		//convert string to lowercase
		str = str.toLowerCase().replaceAll("[^a-zA-Z ]", "");
		
		String[] words = str.split("\\s+");
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (String string : words) {
			
			map.put(string, map.getOrDefault(string,0)+1);
		}
		
		for(Map.Entry<String, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		return str;
	}

	public static void main(String[] args) {

		String str = "I am Java developer55 i am proud of it";
		WordOccurance st = new WordOccurance();
		st.occ(str);

	}

}
