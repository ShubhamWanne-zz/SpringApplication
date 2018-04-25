package com.psl.SpringApplication;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{

	private static final long serialVersionUID = 6655318016583285657L;

	public CustomEvent(Object source) {
		super(source);
	}

	@Override
	public String toString() {
		return "CustomEvent has been called !";
	}

	
}
