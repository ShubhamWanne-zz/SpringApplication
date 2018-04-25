package com.psl.SpringApplication;

import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
	
	private Point center;
	@Autowired
	private MessageSource messageSource;
	
	public Point getCenter() {
		return center;
	}
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println(messageSource.getMessage("draw.shape", 
							new Object[]{"Circle",this.center.getX(),this.center.getY()}, 
							"cannot draw object", Locale.ENGLISH)
							);
	}
	
	@PostConstruct
	public void initCircle() {
		System.out.println(messageSource.getMessage("greeting", 
							new Object[]{"Circle"}, 
							"greeting not found", Locale.ENGLISH)
			);

	}
	@PreDestroy
	public void destroyCircle(){
		System.out.println(messageSource.getMessage("farewell", 
							new Object[]{"Circle"}, 
							"farewell not found", Locale.ENGLISH)
			);

	}
}
