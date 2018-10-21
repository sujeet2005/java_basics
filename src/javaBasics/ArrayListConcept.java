package javaBasics;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// can contain duplicates
		//maintain insertin order
		//synchronized
		// allows random access
	
		ArrayList al= new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(300);
		
		System.out.println(al.size());
		al.add(400);
		al.add(500);
		System.out.println(al.size());
		
		al.add("Tom");
		al.add(12.33);
		al.add('M');
		// to print all values of arryaLisy
		
		for (int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
	}

}
