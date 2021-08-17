package com.moreclasses;

public class Person1
{
 private String  fname;
 private String lname;
 private String add;
 
 public  Person1()
 {
	 System.out.println("default");
	 
 }
 public  Person1 (String fn,String ln)
 {
	 this();
	 fname=fn;
	 lname=ln;
	System.out.println(fname +" " +lname);
 }
// public  Person1 (String fn,String ln, String ad)
// {
//	 this(fn,ln);
//	  this.add=ad;
//	  System.out.println(fname +" " +lname + " " +ad);
//
// }
 public static void main(String[] args) 
 {
	 Person1 p = new Person1("bulbul", "Chauhan");
	
}
 
}
