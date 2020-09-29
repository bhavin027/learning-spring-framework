package org.bhavin.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		// load bean config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// retrieve beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		// compare objects are same 
		boolean result = (theCoach == alphaCoach);
		
		//print results
		System.out.println("\nPointing to the same object: "+result);
		System.out.println("\nMemory location for theCoach: "+theCoach);
		System.out.println("\nMemory location for alphaCoach: "+alphaCoach);
		
		//close context
		context.close();

	}

}
