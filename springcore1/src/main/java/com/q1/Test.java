package com.q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("q1xml.xml");
       
        customer customer1=(customer)context.getBean("customer1");
      
       customer1.displayInfo();
	}

}
