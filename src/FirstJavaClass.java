import IT.Employee;

public class FirstJavaClass {

	public static void main(String[] args) {
		Student student1 = new Student(); //---this will call default constructor
		//System.out.println(student1.name);
		//Two ways to assign values:
		
		//way1: assigning values to the properties
		student1.name = "Sudha";
		student1.rollNo = 123;
		
		
		//way 2: or we can use constructors to assign values to properties/instance variables
		Student student2 = new Student("Shreyansh", 234, "FSD Phase1");
		System.out.println(student2.name);	
		
		
		//student1 and student2 are called as reference variable
		
		
		Employee obj = new Employee();
	}
}
class Student{ //encapsulation
	String name; //----properties or instance variables
	int rollNo;
	String courseEnrolled;	
	
	
	//methods or behaviour
	void attendSession(){
		
		Student obj = new Student();
		
		//open webex
	}	
	
	//constructor overloading or polymorphism
	
	//constructor --> no argument constructor
	Student(){	
		
	}
	//parameterized constructor
	Student(String name, int rollNo, String courseEnrolled){
		this.name = name;
		this.rollNo = rollNo;
		this.courseEnrolled = courseEnrolled;	
		
		int x; //--local variable
	}	
	
	Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
		this.courseEnrolled = courseEnrolled;	
		
		int x; //--local variable
	}	
	
}
