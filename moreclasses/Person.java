package com.moreclasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person
{

	private String name;
	private Date dob;
	private String address;
	public static final int age =21  ;
	
		public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

		
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	

	public static int getAge() {
		return age;
	}

	public static void main(String[] args) throws ParseException 
	{
	 Person p = new Person();
	 p.setName("rupali");
	 System.out.println(p.getName());
	 p.setAddress("Maharastra samaj mhow");
	 System.out.println(p.getAddress());
	 
	 Date d1 =new Date();
	 SimpleDateFormat sm=new SimpleDateFormat("dd/mm/yyyy");
	 String dm =("26/02/1998");
	 p.setDob(sm.parse(dm));
	 System.out.println(sm.format(p.getDob()));
	 System.out.println(p.age);
	}
	
}
 
