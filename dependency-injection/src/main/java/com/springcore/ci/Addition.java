package com.springcore.ci;

public class Addition {
	private int firstNumber;
	private int secondNumber;

	public void doSum() {
		System.out.println(this.firstNumber + this.secondNumber);
	}

	public Addition(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
		System.out.println("Integer constuctor is called ");
		System.out.println("Value of a " + this.firstNumber);
		System.out.println("Value of b " + this.secondNumber);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "First number " + this.firstNumber + " second number " + this.secondNumber;
	}

}
