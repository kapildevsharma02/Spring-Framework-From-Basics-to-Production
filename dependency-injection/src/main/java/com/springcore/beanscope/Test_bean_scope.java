package com.springcore.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_bean_scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/beanscope/beanscope.xml");
		Employee emp = context.getBean("emp", Employee.class);
		System.out.println("The value of object " + emp);
		System.out.println(emp.hashCode());
		Employee emp1 = context.getBean("emp", Employee.class);
		System.out.println(emp1.hashCode());
	}

}
