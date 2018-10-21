package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {
	// can contain duplicates
	//maintain insertion order
	//synchronized
	// allows random access

	public static <E> void main(String[] args) {
		int a[]= new int[3];//static array
		
		ArrayList al= new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al.size()); // size of array
		al.add(40);
		al.add(50);
		al.add(50);
		al.add(12.33);
		
		System.out.println(al.size());
		System.out.println(al.get(4));// to get value from index
		
		//to print all value from ArrayList
		//1. for loop
		//2. Iterator
		for (int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		//generic vs non generic
		
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(12);
		ArrayList<String> al2= new ArrayList<String>();
		al2.add("Test");
		ArrayList<E> al3= new ArrayList<E>();
		//Employee Objects
		
		Employee e1= new Employee("naveen",27,"QA");
		Employee e2= new Employee("Tom",28,"dev");
		Employee e3= new Employee("Peter",29,"admin");
		// Create Arryalist
		ArrayList<Employee> ar4= new ArrayList<Employee>();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		// iterator to traverse the values
		Iterator<Employee> it=ar4.iterator();
		while(it.hasNext())
		{
			Employee emp=it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		System.out.println("*******************");
		
		
		ArrayList<String> ar5= new ArrayList<String>();
		ar5.add("test");
		ar5.add("QTP");
		ar5.add("Selenium");
		
		ArrayList<String> ar6= new ArrayList<String>();
		ar6.add("dev");
		ar6.add("java");
		ar6.add("javascript");
		
		ar5.addAll(ar6);
		for (int i=0;i<ar5.size();i++)
		{
			System.out.println(ar5.get(i)); 
		}
			ar5.removeAll(ar6);
			System.out.println("**********");
			for (int i=0;i<ar5.size();i++)
			{
				System.out.println(ar5.get(i)); 
			}	
			System.out.println("*******");
		// retainALL
			ArrayList<String> ar7= new ArrayList<String>();
			ar7.add("test");
			ar7.add("QTP");
			ar7.add("Selenium");
			
			ArrayList<String> ar8= new ArrayList<String>();
			ar8.add("test");
			ar8.add("java");
			ar8.add("javascript");
		ar7.retainAll(ar8);
		for (int i=0;i<ar7.size();i++)
		{
			System.out.println(ar7.get(i)); 
		}	
		
	}

}
