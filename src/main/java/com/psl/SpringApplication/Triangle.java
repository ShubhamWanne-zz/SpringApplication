package com.psl.SpringApplication;

import java.util.List;
import java.util.Map;

public class Triangle {
	private Point a;
	private Point b;
	private Point c;
	
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
		System.out.println("Created triangle with; \na = "+a+", \nb = "+b+", \nc = "+c);
		System.out.println("Create triangle with List of points : "+points);
		System.out.println("Create triangle with Map of points : "+points_map);
	}
}
