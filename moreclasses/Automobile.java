package com.moreclasses;

public class Automobile
{
	private String color;
	private int speed ;
	private int make;
	public static final int no_of_gears = 5;
	
	public String getColor()
	{
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() 
	{
		return speed;
	}
	
	public int getMake() 
	{
		return make;
	}
	public void changeGear(int gear)
	{
	  if(gear == 5)
	  {
		 int  Speed=speed+10; 
		 
		  System.out.println("Speed" + speed);
	  }

	  
	}
	
	
	
	public void  accelerator(int speed)
	{
		for(int i=10;i<100;i++)
		{
			
		}
	}
	public void brake(int speed)
	{
		speed=speed - 10;
	}
	public static void main(String[] args) 
	{
		
		Automobile auto = new Automobile();
		auto.setColor("blue");
		System.out.println(auto.getColor());
		
		auto.changeGear(5);
			
				 

		
		}
		
		 
		
		
}
	

