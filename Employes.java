package week9;
import java.util.Date;

public class Employes {
	String name;
	String address;
	Date DateofJoin;
	int age;
	double salary;
	
	public void print() {
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Date: " + DateofJoin);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
	}
	public static void main(String[]args) {
		Employes ton = new Employes();
		ton.name="Jhon";
		ton.address="sator";
		ton.DateofJoin=new Date();
		ton.age=20;
		ton.salary=20000;
		ton.print();
		System.out.println("==========");
	}
	
}
