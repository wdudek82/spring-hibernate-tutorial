package xyz.wdudek.xmlconfig;

public class CricketCoatch implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoatch(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void postInit() {
        System.out.println("CricketCoach: Initialized");
    }

    public void preDestroy() {
        System.out.println("CricketCoach: Destroyed");
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String getDailyWorkout() {
        return "Swing a bat 30 times.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
