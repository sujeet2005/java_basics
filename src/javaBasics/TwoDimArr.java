package javaBasics;

public class TwoDimArr {

	public static void main(String[] args) {

		String str[][]=new String [3][5];
		System.out.println(str.length);
		str[0][0]="A";
		str[0][1]="B";
		str[0][2]="C";
		str[0][3]="D";
		str[0][4]="E";
		
		str[1][0]="A1";
		str[1][1]="B1";
		str[1][2]="C1";
		str[1][3]="D1";
		str[1][4]="E1";
		
		str[2][0]="A2";
		str[2][1]="B2";
		str[2][2]="C2";
		str[2][3]="D2";
		str[2][4]="E2";
		
		for(int j=0;j<str.length;j++)
			
			
		for( int i=0;i<str[0].length;i++)	
		{
			System.out.println(str[j][i]);
		}
		
	
				
	}

}
