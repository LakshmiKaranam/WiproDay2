package day_3;

class Animal{
	void eat() {
		System.out.println("eating..");
	}
	void run() {
		System.out.println("running...");
	}
}

class Cow extends Animal{
	void makeSound(){
		System.out.println("Moo..Moo..!");
	}
}

class Cat extends Animal{
	void makeSound() {
		System.out.println("Meow..Meow..!");
	}
}




public class MultipleInheritance {

	public static void main(String[] args) {
		Cow c=new Cow();
		Cat d=new Cat();
		c.eat();
		c.makeSound();
		d.eat();
		d.makeSound();
		
	}

}
