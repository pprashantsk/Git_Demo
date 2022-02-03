package palindromeNumber;

public class NumberPali {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rem,sum=0,temp;
		int n = 454;
		
		temp = n;
		
		while(n!=0) {
			rem = n%10;
			sum = sum*10+rem;
			n = n/10;
		}
		
		System.out.println("number is : "+sum);
		
		if(sum==temp)
			System.out.println("palindrome");
		else
			System.out.println("not palindrom");

	}

}
