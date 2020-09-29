package org.bhavin.springdemo;

public class TrackCoach implements Coach {
	
	//define private field for dependency
	private fortuneService FortuneService;
	
	//define constructor for injection
	
	public TrackCoach() {
		
	}
	
	public TrackCoach(fortuneService theFortuneService) {
		this.FortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Warm up 5km";
	}

	@Override
	public String getDailyFortune() {
		// use fortuneservice to get fortune
		return "Just Do It: "+FortuneService.getFortune();
	}
	
	// define init and destroy method
	public void doMyStartUpStuff() {
		System.out.println("Inside my init method");
	}
	
	public void doCleanUpStuff() {
		System.out.println("Inside my destroy method");
	}
}
