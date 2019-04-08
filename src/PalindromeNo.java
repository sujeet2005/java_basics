package Programs;

public class PalindromeNo {

	public static void main(String[] args) {
		palindrome(1231);
		

	}

	
	public static void palindrome(int num)
	
	{
		int r=0;
		int sum = 0;
		int t=num;
		while(num>0)
		{
		
		
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
		
		}
		if (sum==t)
		{
			System.out.println("Is it a palindrome no.");
		}
		else 
			System.out.println("it is not a palindrome no.");
		
		
	}
	
}
