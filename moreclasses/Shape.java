package com.moreclasses;

public class Shape
{
	private String color;
	private int borderwidth;
	public static final float PI=3.14f;
	
	
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getBorderwidth() {
		return borderwidth;
	}



	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}



	public static float getPi() {
		return PI;
	}



	public static void main(String[] args)
	{
		Shape s = new Shape();
		s.setBorderwidth(3);
		System.out.println(s.getBorderwidth());
		s.setColor("red");
		System.out.println(s.getColor());
		System.out.println(s.getPi());
		System.out.println(s.PI);
		System.out.println(Shape.PI);
	}
}
