package day_3;


abstract class Employee{
	String name;
	int id;
	public Employee(String name,int id) {
		this.name=name;
		this.id=id;
	}
	public abstract double calculateSalary();
	public abstract void displayDetails();
}

class FullTimeEmployee extends Employee{
	double salary;
	public FullTimeEmployee(String name, int id,double salary) {
		super(name,id);
		this.salary=salary;
	}
	public double calculateSalary() {
		return salary;
	}
	public void displayDetails() {
		System.out.print("Full Time Employee: ");
		System.out.println("name: "+name+" "+"id: "+id+" "+"salary: "+calculateSalary());
	
	}
}

class PartTimeEmployee extends Employee{
	double hourlyWage;
	double hours;
	
	public PartTimeEmployee(String name, int id, double hourlyWage,double hours) {
		super(name,id);
		this.hourlyWage=hourlyWage;
		this.hours=hours;
	}
	public double calculateSalary() {
		return hourlyWage*hours;
	}

	public void displayDetails() {
		System.out.print("Part Time Employee: ");
		System.out.println("name: "+name+" "+"id: "+id+" "+"salary: "+calculateSalary());
	}
}

public class EmployeeManagementSystem {

	public static void main(String[] args) {
		Employee[] employee = new Employee[3];
		employee[0]= new FullTimeEmployee("Yuggu",101,30000);
		employee[1]=new PartTimeEmployee("Ravi",102,100,35);
		employee[2]=new FullTimeEmployee("Mani",103,35000);
		
		for(Employee e:employee) {
			e.displayDetails();
		}
	}

}
