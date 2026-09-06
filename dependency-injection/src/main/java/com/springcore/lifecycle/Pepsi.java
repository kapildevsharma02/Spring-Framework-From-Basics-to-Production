package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "price of pepsi " + this.price;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		// init wala code ismein likh sakte hai
		System.out.println("Taking pepsi: init ");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		// destroy wala code ismein likh sakte hai
		System.out.println("Goind to put bottle in dustbin: destroy!!");
	}

}
