package program_demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import javax.swing.plaf.FontUIResource;

public class RunLenghEncoding {
	public static void main(String args[]) {
				
		
		Employe nemp = new Employe();
		Map<String, Integer> testEmp = new HashMap<>();
		String a = null;
		testEmp.put("A", 5);
		testEmp.put(a, 6);
		
for (Entry<String, Integer> entry : testEmp.entrySet()) {
	String key = entry.getKey();
	Integer val = entry.getValue();
	System.out.println(key + " " +val);
}


		
		System.out.println(testEmp);
//		
//		Set<Entry<Employe, Integer>> entryset = testEmp.entrySet();
//		
//		List<Entry<Employe, Integer>> listMap = new ArrayList<>(entryset);
//		
//		Collections.sort(listMap, new Comparator<Entry<Employe, Integer>>() {
//			@Override
//			public int compare(Entry<Employe, Integer> e1,Entry<Employe, Integer> e2) {
//				return e1.getValue().compareTo(e2.getValue());
//			}
//		});
//		
//		for (Entry<Employe, Integer> entry : listMap) {
//			System.out.println(entry.getKey()+"--"+entry.getValue());
//		}
	}
	
	public static void main() {
		System.out.println("hi");
	}
}
