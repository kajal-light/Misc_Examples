package com.k1.shape;

public class RightAngleTriangle implements Shapes{
	private double lenght;
	private double height;
	public RightAngleTriangle() {
		// TODO Auto-generated constructor stub
	}
	
	
public RightAngleTriangle(int a,int b) {
	this.lenght=a;
	this.height=b;
	
}

public double getLenght() {
	return lenght;
}

public void setLenght(double lenght) {
	this.lenght = lenght;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}
@Override
public double area() {
	return (lenght*height/2.0);
	
}


@Override
public double perimeter() {
	double h = Math.hypot(this.getLenght(), this.getHeight());
	return h+this.getLenght()+this.getHeight();
}
	
	
}