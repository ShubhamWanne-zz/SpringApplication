package com.psl.SpringApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.psl.SpringApplication.Model.Circle;
import com.psl.SpringApplication.Model.Triangle;

public class ShapeService {
	@Autowired
	private Circle circle;
	@Autowired
	private Triangle triangle;
	
	public Circle getCricle() {
		return circle;
	}
	public void setCricle(Circle cricle) {
		this.circle = cricle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	
	public void draw(){
		System.out.println(this.circle.getName());
		System.out.println(this.triangle.getName());
	}
	
}
