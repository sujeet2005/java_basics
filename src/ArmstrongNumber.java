package Programs;

public class ArmstrongNumber {
	
	
	public static void  Armstrongno(int num){
		
		int cube=0;
		int r;
		
		int temp;
		int t=num;
		while(num>0)
		{
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		
		if(t==cube)
		{
			System.out.println("Armstrong number");
		}
		else 
		System.out.println("It is not a Armstrong number");
		
		
		
	}

	public static void main(String[] args) {
		//153 -1^3+5^3+3^ =1+125=27=153
		Armstrongno(154);

	}
	
	
	

}
