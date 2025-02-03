package day_3;
class Vehicle{
	public void startEngine() {
		System.out.println("Engine starting..");
	}
}

class Car extends Vehicle{
	@Override
	public void startEngine() {
		System.out.println("Car engine is starting...");
	}
}

class Motorcycle extends Vehicle{
	@Override
	public void startEngine() {
		System.out.println("Motorcycle engine is starting...");
	}
}

public class Polymorphism {
	public static void VehicleTestDrive(Vehicle vehicle){
		vehicle.startEngine();
	}

	public static void main(String[] args) {
		Vehicle car=new Car();
		Vehicle bike=new Motorcycle();
		
		System.out.println("testing Car engine");
		VehicleTestDrive(car);
		System.out.println("testing Motorcycle engine");
		VehicleTestDrive(bike);
		
		

	}

}
