package OOPSConceptpart1;

public class StaticAndNonStatic {
 String name="Tom"; //non static global variable
 static int age=25; // static global variable
	public static void main(String[] args) {
		
		sum(); //calling directly
		StaticAndNonStatic.sum(); //calling with class name
		System.out.println(age);
		
		// how to call non static 
		StaticAndNonStatic obj= new StaticAndNonStatic();
		System.out.println(obj.name);
		obj.sendMail();
		sum();
		//can i acccess static methods by using Object refrence -- Yes
		obj.sum();
	}
	
	public void sendMail()
	{
		System.out.println("Send Mail");
		
	}
	public static void sum()
	{
		System.out.println("sum");
		
	}

}
