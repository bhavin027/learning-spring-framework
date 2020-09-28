package org.bhavin.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load spring xml config
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve beans from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		//call method for cricket coach
		System.out.println(theCoach.getDailyWorkout());
		//call method for fortunes
		System.out.println(theCoach.getDailyFortune());
		//call method for coach details
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		//close the context
		context.close();

	}

}
