package permutationOfString;

public class Permutaion {

	public static void main(String args[]) {
		String str = "ABC";
		int n = str.length();
		permute(str, 0, n - 1);
	}

	public static void permute(String str, int l, int r) {// l=0  r=2
		if (l == r) {
			System.out.println(str);
		} else {
			for(int i=l;i<=r;i++) { //i=0 l=0 r=2 
				str = swap(str, l, i); //
				permute(str, l + 1, r);
				//str = swap(str, l, i);
			}
		}
	}

	public static String swap(String s, int i, int j) {
		char temp;
		char[] swapchar = s.toCharArray();
		temp = swapchar[i];
		//System.out.println(" 1 "+swapchar[i]);
		swapchar[i] = swapchar[j];
		//System.out.println(" 2 "+swapchar[i]+" - "+swapchar[j]);
		swapchar[j] = temp;
		return String.valueOf(swapchar);
	}

}

