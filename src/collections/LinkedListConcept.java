package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		LinkedList<String> ll= new LinkedList<String>();
		ll.add("test");
		ll.add("qtp");
		ll.add("selenium");
		ll.add("RPA");
		ll.add("UFt");
		
		//print
		System.out.println("Contents of Linkedlist "+ll);
		
		//addfirst
		ll.addFirst("naveen");
		ll.addLast("Automation");
		//add last
		System.out.println("Contents of Linkedlist "+ll);
		//get
		System.out.println(ll.get(0));
		//set
		ll.set(0, "Tom");
		System.out.println(ll.get(0));
		
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Contents of Linkedlist after removal "+ll);
		
		ll.remove(2);
		System.out.println("Contents of Linkedlist after removal "+ll);
		
		//using for loop
		System.out.println("*** using for loop");
		for(int n=0;n<ll.size();n++)
		{
			System.out.println(ll.get(n));
		}
		
		//using advance loop
		System.out.println("*** using advance for loop");
		for(String str:ll)
		{
			System.out.println(str);
		}
		//iterator
		System.out.println("*** using iterator");
		
		Iterator<String > it=ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//using while loop
		System.out.println("*** while loop");
		int num=0;
		while(ll.size()>num)
{
	System.out.println(ll.get(num));
	num++;
}

	}

}
