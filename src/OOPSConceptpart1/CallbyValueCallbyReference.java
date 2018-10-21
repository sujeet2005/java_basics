package OOPSConceptpart1;

public class CallbyValueCallbyReference {
	int p;
	int q;
	public static void main(String args[])
	{
		CallbyValueCallbyReference obj= new CallbyValueCallbyReference();
		int x=10;
		int y=20;
		obj.sum(x, y);// call by value
		obj.p=50;
		obj.q=60;
		obj.swap(obj);
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	public int sum(int a, int b)
	{
		 a=30;
		b=40;
		int c=a+b;
		return c;
	}
	
	public void swap(CallbyValueCallbyReference t)
	{
		int temp;
		temp=t.p; //temp=50;
		t.p=t.q;// t.p=60;
		t.q=temp;//t,q=50;
		
		
	}

}
