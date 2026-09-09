package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String object;

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public Example() {
		super();

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Example [marks " + object + "]";
	}

	@PostConstruct
	public void start() {
		System.out.println("starting method");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("destroy method");
	}
}
