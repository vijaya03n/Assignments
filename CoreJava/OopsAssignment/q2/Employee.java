package q2;

class Manager extends Employee {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
		return incentive+salary;
    }
}

class Labour extends Employee {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
		return overtime+salary;
    }
}

public class Employee {

	
	static int salary = 10000;
    public int getSalary(int salary){
		return salary;}
   

	public static void main(String[] args) {
		
		Manager manager=new Manager();
		Labour labour=new Labour();
		
		System.out.println("salary of manager: "+manager.getSalary(salary));
		System.out.println("salary of manager: "+labour.getSalary(salary));
		

	}

}

