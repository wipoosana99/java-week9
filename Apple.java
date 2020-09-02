package week9;

public class Apple {
	String color;
	String size;
	int age;
	public void print() {
		System.out.println("Apple color = " + color + " Apple size = " + size + " Apple age = " + age);
	}
	public static void main(String[]args) {
		Apple first = new Apple();
		first.color = "red";
		first.size = "small";
		first.age = 6;
		first.print();
	}
}
