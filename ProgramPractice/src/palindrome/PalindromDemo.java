package palindrome;

public class PalindromDemo {
	
	public static void main(String args[]) {
		System.out.println(palindrome("agda"));
	}
	
	static boolean palindrome(String s) {
		boolean palind = true;
		char[] ch = s.toCharArray();
		int l = 0, r= s.length()-1;
		
		if(l>=r)
			return palind;
		else if(ch[l]!=ch[r])
			return palind = false;
		
		String remaningStr = s.substring(l+1, r);
		
		return palindrome(remaningStr);
	}
}
