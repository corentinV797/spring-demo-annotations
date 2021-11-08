package com.luv2code.springdemo.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.luv2code.springdemo.SportConfig;
import com.luv2code.springdemo.coach.Coach;
import com.luv2code.springdemo.coach.SwimCoach;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach myCoach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCoach.getEmail());
		System.out.println(myCoach.getTeam());
		context.close();
	}

}
