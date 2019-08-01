package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TennisJavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
				
		// call method to get the daily fortune
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
			
		// close the context
		context.close();
		
	}

}


