package com.psl.SpringApplication;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.SpringApplication.Service.ShapeService;

/**
 * Hello world!
 *
 */
public class App 
{  
	public static void main( String[] args ){
		
		AbstractApplicationContext beanfactory = new ClassPathXmlApplicationContext("spring.xml");
		beanfactory.registerShutdownHook();
		
		/*
		 * Spring Beans Tutorials
		 
		Shape shape = (Shape) beanfactory.getBean("circle");
		shape.draw();
		beanfactory.close();
		Triangle triangle2 = (Triangle) beanfactory.getBean("triangle2");
    	triangle2.draw();	    			
		Triangle triangle = (Triangle) beanfactory.getBean("parentTriangle");
    	triangle.draw();	    

		*/
		/*
		 * Aspect Tutorials
		 */
		ShapeService shape = beanfactory.getBean("shapeService",ShapeService.class);
		shape.draw();
		System.out.println("********************Updating the name of Shape********************");
		shape.getTriangle().setName("Scalene");
		shape.getCricle().setName("Sphere");
		System.out.println(shape.getTriangle().getName());
		System.out.println(shape.getCricle().getName());
		beanfactory.close();
	}
}
