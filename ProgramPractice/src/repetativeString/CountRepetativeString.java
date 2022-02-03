package repetativeString;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountRepetativeString {

	public static void main(String args[]) {
		checDublicate("prashant");

	}

	public static void checDublicate(String str) {
		if (str == null) {
			System.out.println("string is nul;");
			return;
		}

		if (str.isEmpty()) {
			System.out.println("String is empty");
		}

		if (str.length() == 1) {
			System.out.println("only single charecter string");
		}

		char charArray[] = str.toCharArray();

		Map<Character, Integer> charecherMap = new HashMap<>();

		for (Character ch : charArray) {
			if (charecherMap.containsKey(ch)) {
				charecherMap.put(ch, charecherMap.get(ch) + 1);
			} else {
				charecherMap.put(ch, 1);
			}
		}

		// Set<Map.Entry<Character, Integer>> charSet = charecherMap.entrySet();

		for (Entry<Character, Integer> entry : charecherMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("repetating charecter " + entry.getKey() + " : " + entry.getValue());
			}

		}

	}

}
