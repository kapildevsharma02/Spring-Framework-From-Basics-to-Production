package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
Output of the below program
Student [studentName=Durgesh Lal, city=Lucknow]
----------------------
hashcode for student singleton 775386112
----------------------
hashcode for the student2 singleton 775386112
----------------------
 */
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student student = context.getBean("ob", Student.class);
		System.out.println(student);
		System.out.println("----------------------");
		System.out.println("hashcode for student singleton " + student.hashCode());
		System.out.println("----------------------");
		Student student2 = context.getBean("ob", Student.class);
		System.out.println("hashcode for the student2 singleton " + student2.hashCode());
		System.out.println("----------------------");
	}

}
