package Abstractionconcepts;

public class TestCar {

	public static void main(String[] args) {
		BMW b= new BMW();
		b.start();
		b.stop();
		b.refuel();
		// dynamic poly
		Car c= new BMW();
		c.start();
		c.stop();
		c.refuel();
		

	}

}
