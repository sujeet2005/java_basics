package OOPSConceptPart2;

public class TestCar {
// when same method is present in parent and child class with same number 
	// of arguments then it is called method overriding
	//static or compile time poly
	public static void main(String[] args) {
		BMW obj= new BMW();
		obj.start();
		obj.stop();
		obj.safety();
		obj.refuel();
		obj.engine();
		
		
		Car c= new Car();
		c.start();
		c.stop();
		c.refuel();
		
		Car c1= new BMW();//Top Casting
		c1.start();// dynamic or run time polymorphism
		c1.stop();
		c1.refuel();
		BMW b1= (BMW) new Car();
		
		
		

	}

}
