package OOPSConceptpart1;

public class Functionsinjava {

	public static void main(String[] args) {
		
		Functionsinjava fj=new Functionsinjava();
		fj.test();
		
		System.out.println(fj.PQR());
		fj.c(3, 4);
		
		

	}
	public void test()
	
	{
		System.out.println("test method");
	}
	public int PQR()
	{
		System.out.println("PQR method");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
		
		
	}
	public int	 c(int x , int y)
	
	{
		System.out.println("division method");
		int d=x/y;
		return d;
	}

}
