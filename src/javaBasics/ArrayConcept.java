package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
//Disadvantages of array
//size is fixed (static arr)// Collections are used= ArrayList, LinkedList,HashTable
		
//stores similar elements---Object Array stores different elements
		
		//
		int i[]=new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
	int b=	i.length;
	System.out.println(i[2]);
	//String array
	String str[]=new String[9];
	str[0]="Hello";
	System.out.println(str[0]);
	System.out.println("------");
	System.out.println(str.length);
	//char array
	char ch[]=new char[9];
	ch[0]=2;
	ch[1]='q';
	//Object array is used to store diff dataTypes
	Object obj[]=new Object[5];
	obj[0]="helo";
	obj[2]=12.33;
	obj[1]="25";
	obj[3]='m';
	System.out.println(obj[3]);
	
		
	
	
	
	
	
	

	}

}
