package javaBasics;

import java.util.concurrent.SynchronousQueue;

public class FunctionsInjava {

	public static void main(String[] args) {
		FunctionsInjava obj= new FunctionsInjava();	
		obj.test();
		
		int d=obj.sum();
		System.out.println(d);
		String str=obj.PQR();
		System.out.println(str);
	}
	// no input no o/p
	public void test()
	{
		System.out.println("test method");
		
	}
	public void test(int i)
	{
		System.out.println("test method");
		
	}
	public void test(int i, int j)
	{
		System.out.println("test method");
		
	}
	//some o/p
	public int sum()
	{
		System.out.println("sum mehtod");
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	//some output
	public String PQR()
	{
		System.out.println("String mehtod");
		String s="selenium";
		return s;
	}
	//input and o/p

}
