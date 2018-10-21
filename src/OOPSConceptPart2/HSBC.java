package OOPSConceptPart2;

public class HSBC implements USBAnk,BraxilBank{

	// if a class is implementing a interface and it is necessary to define all mehthods of interface
	
	public void credit() {
		System.out.println("hsbc credit");
	}

	
	public void debit() {
		System.out.println("hsbc debit");
		
	}

	
	public void transferMoney() {
		System.out.println("hsbc transfermoney");
		
	}
	
	public void educationLoan()
	{
		
		System.out.println(" hsbc edu loan");
	}
	public void CarLoan()
	{
		
		System.out.println(" hsbc Car loan");
	}
	
	public void mutualfund()
	{
		
		System.out.println(" Brazil  mutual fundloan");
	}
}
