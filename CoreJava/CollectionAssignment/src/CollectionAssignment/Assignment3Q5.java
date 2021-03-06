package CollectionAssignment;

import java.util.Hashtable;

class Employee{
	private String name;
	private int id;
	
	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
	@Override
	public String toString() {
		return "Employee{" +"name='" + name + '\'' +", id=" + id +"}"; 
	}
}

public class Assignment3Q5 {
	public static void main(String[] args) {
		Employee e1 = new Employee("Neeraj",1);
		Employee e2 = new Employee("test",2);
		Employee e3 = new Employee("Pankaj",4);
		
		Hashtable<Employee,String> hs = new Hashtable<>();
		hs.put(e1, "test");
		hs.put(e2, "Test2");
		hs.put(e3,"test3");
		
		System.out.println(hs);

	}
}
