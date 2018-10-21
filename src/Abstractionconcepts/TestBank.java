package Abstractionconcepts;

public class TestBank {

	public static void main(String[] args) {
		HDFCbank hb= new HDFCbank();
		hb.credit();
		hb.debit();
		hb.loan();
		// Dynamic polymorphism
		Bank b=new HDFCbank();
		b.credit();
		b.debit();
		b.loan();
		

	}

}
