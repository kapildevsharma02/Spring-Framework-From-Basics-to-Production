package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_LifeCycle {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/lifecycle/lifecycleconfig.xml");
		Samosa samosa = (Samosa) context.getBean("samosa1");
		System.out.println(samosa);
		/*
		 * Registering shutdown hook and this implementation is inside the class
		 * AbstractApplicationContext
		 */
		context.registerShutdownHook();

		System.out.println("****************************");

		Pepsi pepsi = (Pepsi) context.getBean("pepsi");
		System.out.println(pepsi);
	}

}
