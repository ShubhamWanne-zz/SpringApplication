package com.psl.SpringApplication;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

public class Circle implements Shape{
	
	private Point center;
	
	public Point getCenter() {
		return center;
	}
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println("Drawing circle with center ("+center.getX()+", "+center.getY()+")");
	}
	
	@PostConstruct
	public void initCircle() {
		System.out.println("About to instantiate a circle !");
	}
}
