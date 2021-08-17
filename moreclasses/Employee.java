package com.moreclasses;

public class Employee extends Person1
{
	private String Designation;
	public Employee()
	{
		
	}
	public Employee(String fn,String ln,String des)
	{
		super(fn, ln);
		Designation =des;
		System.out.println(fn + " "+ ln + " " + des);
	
	}

	public static void main(String[] args)
	{ 
		Employee em = new Employee("bulbul", "chauhan", "admin");
	}

}
