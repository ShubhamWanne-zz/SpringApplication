package com.psl.SpringApplication.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.psl.SpringApplication.Model.Circle;
import com.psl.SpringApplication.Model.Triangle;

@Aspect
public class CustomAspect {
	@Before("forAllCircle() && forAllGetter()")
	public void adviceForNullPointerException(JoinPoint jp){
		Circle circle = (Circle) jp.getTarget();
		System.out.println("[WARNING] check for nullPointerException before drawing "+ circle.getName());
	}
	
	@Before("forAllGetter()")
	public void adviceForParseExcepion(JoinPoint jp){
		if(jp.getTarget() instanceof Circle){
			Circle circle = (Circle) jp.getTarget();
			System.out.println("[WARNING] check for parseException before drawing "+ circle.getName());
		}else if(jp.getTarget() instanceof Triangle){
			Triangle triangle = (Triangle) jp.getTarget();
			System.out.println("[WARNING] check for parseException before drawing "+ triangle.getName());
		}
	}
	
	@Before("args(name)")
	public void adviceForCheckingEmptyString(String name){
		System.out.println("[WARNING] : checking whether string passed is empty or not");
		System.out.println((name!="")?name+" is passed":"empty string is passed");
	}
	
	@Pointcut("within(com.psl.SpringApplication.Model.Circle)")
	private void forAllCircle(){}
	
	@Pointcut("execution(public * get*(..))")
	private void forAllGetter(){}

	@Pointcut("args(String)")
	private void acceptStringArgument(){}
}


