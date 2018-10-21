package Abstractionconcepts;

public abstract class Bank {
	
	// partial abstraction
	//hiding the implementation logic-abstraction
	// abs has abs and non abs mehthods
	// cannot create object of Abs class  and interface
	
	
public abstract void loan();//  abstract method // no method body
// non abstract mehthods
public void credit()
{
	System.out.println("credit mehtod");
}
	
public void debit()
{
	System.out.println("debit mehtod");
}	

}
