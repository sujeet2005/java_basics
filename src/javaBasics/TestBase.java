package javaBasics;

public class TestBase {

	public static void main(String[] args) {
		System.out.println("main method 1");
		main("testing");
		main(10);
		main(20,30);
	
	}
	public static void main(int a) {
		System.out.println("main method 4");	
	}
	
	public static void main(int a,int b) {
		System.out.println("main method 2");
		
	}
	public static void main(String args) {
		System.out.println("main method 3");
		
	}
}
