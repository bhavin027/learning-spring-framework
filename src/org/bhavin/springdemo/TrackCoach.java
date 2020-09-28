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

}
