package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
/*	//Create the object
		Coach baseBallCoach=new BaseBallCoach();
		
	//use the object
		System.out.println("BaseBall Coach");
		System.out.println(baseBallCoach.getDailyWorkout());
		
		Coach trackCoach=new TrackCoach();
		
		System.out.println("Track Coach");
		System.out.println(trackCoach.getDailyWorkout());*/
		
		
		
		//load the spring configuration file
		
		
		//Create the container
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrieve the beans from the container
		
		Coach myTrackCoach=context.getBean("trackCoach",Coach.class);
		Coach myBaseBallCoach=context.getBean("baseBallCoach",Coach.class);
		
		
		//call the methods on the bean
		//TrackCoach
		System.out.println(myTrackCoach.getDailyWorkout());
		//BaseBallCoach
		System.out.println(myBaseBallCoach.getDailyWorkout());
		
		//context.close
		context.close();

		
		
		
		
		
	}

}
