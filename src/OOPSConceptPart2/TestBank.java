package OOPSConceptPart2;

public class TestBank {

	public static void main(String[] args) {
		System.out.println(USBAnk.min_bal);
		//USBAnk.min_bal=200;
		HSBC hs = new HSBC();
		hs.credit();
		hs.debit();
		hs.transferMoney();
		hs.educationLoan();
		hs.CarLoan();
		
		//dynamic poly- child class object can be referred by parent int
		USBAnk us= new HSBC();
		us.credit();
		us.debit();
		us.transferMoney();
		
		

	}

}
