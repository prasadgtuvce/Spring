package com.springdemo;

public class MyApp {

	public static void main(String[] args) {
	//Create the object
		Coach baseBallCoach=new BaseBallCoach();
		
	//use the object
		System.out.println("BaseBall Coach");
		System.out.println(baseBallCoach.getDailyWorkout());
		
		Coach trackCoach=new TrackCoach();
		
		System.out.println("Track Coach");
		System.out.println(trackCoach.getDailyWorkout());

		
		
		
		
		
	}

}
