package IT; //this statement must be the first line

import Admin.Person;

//Inheritance
//child class or subclass
public class Employee extends Person{	
	private int empId;
	private String dept;	
	
	//setter methods
	void setEmpId(int empId) {
		this.empId = empId;
	}
	//setter method
	void setDept(String dept) {
		this.dept = dept;
	}	
	
	void setNameAndAge(String name, int age) {
		this.name = name; //--from parent class
		this.age = age; // --- from parent class
		
	}
	void show() {
		print(); // --from parent class
		System.out.println("EmpId: " + this.empId + " dept: " + this.dept);
	}
}

class second{	
	void setValue() {
		Employee obj = new Employee();
		//obj.empId = 100; //not allowed as EmpId is private
		//obj.name = "123";
		obj.setEmpId(100);
		obj.setDept("IT");
		obj.setNameAndAge("Sudha", 30);
		
		obj.show();
	}
	
	
	
}

