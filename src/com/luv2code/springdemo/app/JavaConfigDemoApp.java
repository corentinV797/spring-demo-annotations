package com.luv2code.springdemo.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.luv2code.springdemo.SportConfig;
import com.luv2code.springdemo.coach.TennisCoach;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		TennisCoach myCoach = context.getBean("tennisCoach", TennisCoach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		context.close();
	}

}
