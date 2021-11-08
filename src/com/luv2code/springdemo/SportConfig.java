package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.luv2code.springdemo.coach.Coach;
import com.luv2code.springdemo.coach.SwimCoach;
import com.luv2code.springdemo.service.FortuneService;
import com.luv2code.springdemo.service.SadFortuneService;

@Configuration
//@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:mylogger.properties")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	@Bean
	public MyLoggerJavaConfig myLoggerJavaConfig(@Value("${root.logger.level}") String rootLoggerLevel,
										 @Value("${printed.logger.level}") String printedLoggerLevel) {
 
		MyLoggerJavaConfig myLoggerConfig = new MyLoggerJavaConfig(rootLoggerLevel, printedLoggerLevel);
 
		return myLoggerConfig;
	}

	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
