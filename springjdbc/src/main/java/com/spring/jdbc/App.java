package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("My Program Started.......");
		// Spring jdbc=>jdbcTemplate
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
		StudentDao studentDao = context.getBean("studentDao", StudentDao.class);

		// Note all comments here given below is correct
		// Insert
//		Student student = new Student();
//		student.setId(777);
//		student.setName("karina");
//		student.setCity("Lucknow");
//		int result = studentDao.insert(student);
//		System.out.println("student added " + result);

		// Udpate
//		Student student = new Student();
//		student.setId(245);
//		student.setName("Raj Kumar");
//		student.setCity("Lucknow");
//		int result=studentDao.change(student);
//		System.out.println("Data changed "+result);

		// Delete
//		int result = studentDao.delete(245);
//		System.out.println("Deleted " + result);

		// Select
		Student student=studentDao.getStudent(222);
		System.out.println(student);
	}
}
