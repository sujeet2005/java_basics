package Programs;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		fib(50);
	}
	
	public static void fib(int num)
	{
		int k,a,b;
		a=1;b=1;
		
		k=0;
		System.out.print("1 1 ");
		while(k<num)
		{
			k=a+b;
			System.out.print(k + " ");
			a=b;
			b=k;
			
			
			
		}
	}

}
