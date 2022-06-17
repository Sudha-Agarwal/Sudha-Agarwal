package Admin;

//parent class or superclass or base class
public class Person {
	private String name;
	private int age;
	
	//no args constructor
		protected Person(){
			System.out.println("Parent no args constructor called");
		}
		protected Person(String name, int age){
			this.name = name;
			this.age = age;		
		}	
	
	
	
	protected void print() {					
		System.out.println("Name: " + this.name + " age: " + this.age);
		
	}
}