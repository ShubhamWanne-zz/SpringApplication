package com.psl.SpringApplication;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{   
	@SuppressWarnings("resource")
	public static void main( String[] args ){
		BeanFactory beanfactory = new ClassPathXmlApplicationContext("spring.xml");
		Triangle triangle = (Triangle) beanfactory.getBean("triangle");
    	triangle.draw();	
    			
    			
    }
}
