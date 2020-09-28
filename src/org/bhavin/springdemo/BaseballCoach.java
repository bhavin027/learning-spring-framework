package org.bhavin.springdemo;

public class BaseballCoach implements Coach {
	
	//define private field for the dependency
	private fortuneService FortuneService;
	
	//define constructor for dependency injection
	
	public BaseballCoach(fortuneService theFortuneService) {
		this.FortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes running";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneservice to get a fortune
		return FortuneService.getFortune();
	}
}
