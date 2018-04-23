package com.psl.SpringApplication;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SuppressWarnings("unused")
public class Point implements ApplicationContextAware,BeanNameAware {
	private int x;
	private int y;
	private ApplicationContext context;
	private String beanName;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		// TODO Auto-generated method stub
		this.context = context;
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
