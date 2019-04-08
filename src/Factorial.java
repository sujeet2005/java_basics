package Programs;

public class Factorial {
	

	public static void main(String[] args) {
		
		fact(3);

	}
	
	public static int fact  (int num)
	{
			int fact=1;
			for(int i=num;i>0;i--)
			{
				fact=fact*i;
				
			}
			System.out.println(fact);
			return num;

}
}

