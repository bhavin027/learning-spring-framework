package org.bhavin.springdemo;

public class HappyFortuneService implements fortuneService {

	@Override
	public String getFortune() {
		
		return "Today is your lucky day";
	}

}
