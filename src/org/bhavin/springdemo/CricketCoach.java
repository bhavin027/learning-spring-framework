package org.bhavin.springdemo;

public class CricketCoach implements Coach {

	private fortuneService FortuneService;
	
	//add coach details
	
	private String emailAddress;
	private String team;
		
	// create a no arg constructor
	
	public CricketCoach() {
		System.out.println("CricketCoach: Inside no arg constructor");
	}
	// getter and setter method for details
	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside setter methode- setEmailAddress");
		this.emailAddress = emailAddress;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		System.out.println("CricketCoach: Inside setter methode- setTeam");
		this.team = team;
	}
	// setter method
	public void setFortuneService(fortuneService thefortuneService) {
		System.out.println("CricketCoach: Inside setter methode- setFortuneService");
		this.FortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {	
		return "Practice batting 10min";
	}

	@Override
	public String getDailyFortune() {
		return "Rock it: "+FortuneService.getFortune();
	}

}
