package kce;

abstract class Employee{
	abstract void calculateSalary();
	void displayCompanyName() {
		System.out.println("Company Name : ABC");
	}
}
class PermanentEmployee extends Employee{
	void calculateSalary() {
		 System.out.println("Permanent Employee Salary = Rs.50000");
	}
}
class ContractEmployee extends Employee{
	void calculateSalary() {
		System.out.println("Contract Employee Salary = Rs.25000");
	}
}
public class ex1 {
public static void main(String[] a) {
	PermanentEmployee p = new PermanentEmployee();
    p.displayCompanyName();
    p.calculateSalary();
    ContractEmployee c = new ContractEmployee();
    c.displayCompanyName();
    c.calculateSalary();
}
}
