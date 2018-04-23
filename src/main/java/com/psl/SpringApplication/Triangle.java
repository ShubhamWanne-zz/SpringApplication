package com.psl.SpringApplication;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanNameAware;

public class Triangle implements BeanNameAware, Shape{
	private Point a;
	private Point b;
	private Point c;
	private String beanName;
	private List<Point> points;
	private Map<Integer,Point> points_map;
	
	
	public Map<Integer, Point> getPoints_map() {
		return points_map;
	}

	public void setPoints_map(Map<Integer, Point> points_map) {
		this.points_map = points_map;
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public void draw(){
		System.out.println("Created "+this.beanName+" with; \na = "+a+", \nb = "+b+", \nc = "+c);
	}

	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
		this.beanName = beanName;
	}

	public void init() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean "+this.beanName+" has been initialized");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean "+this.beanName+" is about to destroy");
	}

}
