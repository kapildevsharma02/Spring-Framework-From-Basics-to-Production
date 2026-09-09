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

		System.out.println("**********Using Annotation Implmenting Bean Life Cycle*********");
		System.out.println("!!Post Contruct & Pre Destroy!!");

		Example example = (Example)context.getBean("example");
		System.out.println(example);
	}

}
