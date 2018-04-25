package com.psl.SpringApplication;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{  
	public static void main( String[] args ){
		AbstractApplicationContext beanfactory = new ClassPathXmlApplicationContext("spring.xml");
		beanfactory.registerShutdownHook();
		Shape shape = (Shape) beanfactory.getBean("circle");
		shape.draw();
//		Triangle triangle2 = (Triangle) beanfactory.getBean("triangle2");
//    	triangle2.draw();	    			
//		Triangle triangle = (Triangle) beanfactory.getBean("parentTriangle");
//    	triangle.draw();	    			
	}
}
