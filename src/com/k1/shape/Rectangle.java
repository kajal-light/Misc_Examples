package com.k1.shape;

public class Rectangle implements Shapes{
	private double length;
	private double breath;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	public Rectangle(int a,int b) {
		
		this.length=a;
		this.breath=b;
		
	}
	@Override
	public double perimeter() {
		
		return(2*(this.length+this.breath));
		
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreath() {
		return breath;
	}
	public void setBreath(double breath) {
		this.breath = breath;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.getLength()*this.getBreath();
	}
	
	
	
	

}
