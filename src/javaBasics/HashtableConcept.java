package javaBasics;

import java.util.Hashtable;

public class HashtableConcept {

	public static void main(String[] args) {
		Hashtable ht= new Hashtable();
		ht.put("A", "Test");
		ht.put("B", "Hello");
		ht.put("C", "world");
		System.out.println(ht.size());
		
		ht.put(1, 100);
		ht.put(2, 200);
		System.out.println(ht.size());
		
		System.out.println(ht.get(2));
		System.out.println(ht.get("C"));
		Hashtable<Integer,Integer> h1= new Hashtable<Integer,Integer>();
		h1.put(1, 100);
		//h1.put("TOM", 1);
		Hashtable<String,Integer> h2= new Hashtable<String,Integer>();
	//	h1.put(1, 100);
		h2.put("TOM", 1);
		
	}

}
