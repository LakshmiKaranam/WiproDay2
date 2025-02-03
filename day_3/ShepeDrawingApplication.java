package day_3;


abstract class Shape{
	public abstract void draw();
	
}

class Circle extends Shape{
	public void draw() {
		System.out.println("Drwaing a Circle");
	}
}

class Rectangle extends Shape{
	public void draw() {
		System.out.println("Drawing a Rectangle");
	}
}

public class ShepeDrawingApplication {

	public static void main(String[] args) {
		Shape[] shapes= new Shape[3];
		
		shapes[0]=new Circle();
		shapes[1]=new Rectangle();
		shapes[2]=new Circle();
		
		for(Shape s:shapes) {
			s.draw();
		}

	}

}
