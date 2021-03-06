package listing4;

import java.time.*;

public class EmployeeTest {
	public static void main (String[] args){
		Employee[] staff = new Employee[3];
		
		staff[0]=new Employee("Pepegun", 1000000, 2000, 12, 5);
		staff[1]=new Employee("Jotaro", 90000,2003,11,2);
		staff[2]=new Employee("Dain", 100000,2020,3,15);
		
		// rise everyone's salary by 5%
		for (Employee e : staff)
			e.raiseSalary(5);
		
		// print out information about all Employee objects
		for (Employee e : staff)
			System.out.println("name="+e.getName()+",salary="+e.getSalary()+",hireDay="+e.getHireDay());
	}
}

class Employee
{
	private String name;
	private double salary;
	private LocalDate hireDay;
	
	public Employee(String n, double s, int year, int month, int day)
	{
		name = n;
		salary = s;
		hireDay = LocalDate.of(year,month,day);
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public LocalDate getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent/100;
		salary += raise;
	}
}
