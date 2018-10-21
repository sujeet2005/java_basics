package OOPSConceptpart1;

public class WrapperClassConcept {

	public static void main(String[] args) {
		String s="100";
		System.out.println(s+20);
		//Data Conversion String to Int
		
		int i=Integer.parseInt(s);
		System.out.println(i+20);
		
		// String to double conversion
		String y="12.23";
		double d=Double.parseDouble(y);
		System.out.println(d+10);
		
		//String to boolean
		String k="true";
		Boolean b=Boolean.parseBoolean(k);
		System.out.println(b);
		
		//int to String
		int j=200;
		System.out.println(j+20);
		String str=String.valueOf(j);
		System.out.println(str+20);
		

	}

}
