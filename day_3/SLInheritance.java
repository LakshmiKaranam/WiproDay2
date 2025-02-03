package day_3;

class Car1{
	int wheels=4;
	boolean hasSteering =true;
	public void run() {
		System.out.println("Car is running..");
	}
}

class BMW extends Car1{
     public void stop() {
		System.out.println("car is not moving..");
		System.out.println("car is a "+super.wheels+" wheeler");
	}
}


public class SLInheritance {

	public static void main(String[] args) {
	
		BMW bmw =new BMW();
		bmw.run();
		bmw.stop();

	}

}
