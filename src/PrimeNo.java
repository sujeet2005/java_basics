package Programs;

public class PrimeNo {

	public static void main(String[] args) {
		
		
		System.out.println(isPrimeNumber(0));
		System.out.println(isPrimeNumber(15));
		System.out.println(isPrimeNumber(19));
		System.out.println(isPrimeNumber(20));
				
		
	}
	
	public static boolean isPrimeNumber(int num)
	{
		if(num<=1)
		{
			return false;
		}
		
		for (int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
			
		}
		
		return true;
		
	}
	
	

}
