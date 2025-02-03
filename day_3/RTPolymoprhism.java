package day_3;

class Animal{
	public void makeSound() {
		System.out.println("Animal makes sound..");
	}
}

class Dog extends Animal{
	String color= "black";
	public void eat() {
		System.out.println("dog is eating..");
	}
	public void makeSound() {
		System.out.println("dog is barking..");
	}
}


public class RTPolymoprhism {

	public static void main(String[] args) {
		
		Dog dog= new Dog();
		System.out.println("dog color is "+dog.color);
		dog.eat();
		dog.makeSound();
	}

}
