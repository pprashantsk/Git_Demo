package isogram;

import java.util.HashSet;
import java.util.Set;

public class IsogramLogic {
	
	public static void main(String args[]) {
		System.out.println(isIsogram("prashanht"));
	}
	
	static boolean isIsogram(String s) {
		boolean isogram=true;
		char[] ch = s.toCharArray();
		Set<Character> chSet = new HashSet<>();
		
		Set<Character> repeted = new HashSet<>();
		
		for (Character character : ch) {
			if(chSet.contains(character)) {
				isogram = false;
				repeted.add(character);
			}else {
				chSet.add(character);
			}
		}
		System.out.println("repeted = "+repeted);
		System.out.println("non-repeted = "+chSet);
		
		return isogram;
	}

}
