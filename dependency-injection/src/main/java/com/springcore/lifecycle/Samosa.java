package com.springcore.lifecycle;

public class Samosa {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Property!!");
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Price of Samosa " + this.price;
	}

	public void hey() {
		System.out.println("Inside init method : hey how are you?");
	}

	public void die() {
		System.out.println("Inside destroy method: bye bye i am going to die ");
	}

}
