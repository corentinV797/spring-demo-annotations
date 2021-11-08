package com.luv2code.springdemo.coach;

import org.springframework.beans.factory.annotation.Value;

import com.luv2code.springdemo.service.FortuneService;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}

	@Value("${foo.team}")
	private String team;
	
	public SwimCoach() {}
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim 10km";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
