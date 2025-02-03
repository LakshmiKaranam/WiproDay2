package day_3;



public class TestPolymorphism {
	static int add(int a, int b){
		return a+b;
	}
	static int add(int a, int b,int c){
		return a+b+c;
	}
	static double add(double a,double b) {
		return a+b;
	}
	public static void main(String[] args) {
		int sum=add(2,3);
		int result=add(2,3,4);
		double total=add(2.5,3.5);
		System.out.println("sum of two integer numbers: "+sum);
		System.out.println("sum of three integer numbers: "+result);
		System.out.println("sum of two double values: "+total);
	}

}
