class Employee{
	protected int salary=100008;
	void display(){
		System.out.println("Salary : " +this.salary);
		
    	}
	
	}
public class Hw1 {
	public static void main(String[] args) {
		Employee e1= new Employee();
		e1.display();
	}
}
