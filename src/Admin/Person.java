package Admin;

//parent class or superclass or base class
public class Person {
	protected String name;
	protected int age;
	
	protected void print() {					
		System.out.println("Name: " + this.name + " age: " + this.age);
		
	}
}