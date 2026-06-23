package kce;

abstract class Vehicle{
	abstract void start();
	void displayVehicleType() {
		System.out.println("Vechile Type");
	}
}
class Bike extends Vehicle{
	void start() {
		System.out.println("Bike Starts");
	}
}
class Car extends Vehicle{
	void start() {
		System.out.println("Car Starts");
	}
}
public class ex2 {
public static void main(String[] a) {
	Bike b = new Bike();
	b.displayVehicleType();
	b.start();
	Car c = new Car();
	c.displayVehicleType();
	c.start();
}
}
