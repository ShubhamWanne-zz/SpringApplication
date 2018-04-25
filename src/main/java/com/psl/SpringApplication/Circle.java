package com.psl.SpringApplication;

public class Circle implements Shape{
	
	private Point center;
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Drawing circle with center ("+center.getX()+", "+center.getY()+")");
	}

}
