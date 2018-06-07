package com.infy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		Employee emp1=(Employee) context.getBean("employee");
		System.out.println(emp1.getEmpID());
		System.out.println(emp1.getAddress().getCountry());
		System.out.println(emp1.getAddress().getPin());
		context.close();
	}

}
