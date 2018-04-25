package com.psl.SpringApplication;

import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape, ApplicationEventPublisherAware{
	
	private Point center;
	
	
	private ApplicationEventPublisher publisher;
	
	//created an object of the bean class
	@Autowired
	private MessageSource messageSource;
	
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		System.out.println(publisher.getClass());
		this.publisher = publisher;
	}

	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	public Point getCenter() {
		return center;
	}
	@Resource
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println(messageSource.getMessage("point",new Object[] {this.center.getX(),this.center.getY()},"Warning : points not found",Locale.ENGLISH));

		publisher.publishEvent(new CustomEvent(this));
	
	}
	@PostConstruct
	public void initCircle() {
		
		//we use new Object[] to put the dynamic values to the static messages
		System.out.println(this.messageSource.getMessage("greeting",new Object[]{"Circle"},"Warning: greeting not found", Locale.ENGLISH));
	
	}
	
	@PreDestroy
	public void destroyCircle(){
		System.out.println(this.messageSource.getMessage("farewell",new Object[]{"Circle"},"Warning: farewell not found", Locale.ENGLISH));
	}
		
}
