package day_3;

class Human{
	int legs=2;
	int hands=2;
	void speak() {
		System.out.println("speaking..");
	}
	void eat() {
		System.out.println("eating..");
	}
}

class Father extends Human{
	String land="20 acors";
	void drive() {
		System.out.println("he knows how to dirve bike..");
	}
}

class Son extends Father{
	void play(){
		System.out.println("he is playing..");
	}
}

public class MLInheritance {

	public static void main(String[] args) {
		Son s=new Son();
		s.play();
		s.drive();
		s.eat();
		s.speak();
	}

}
