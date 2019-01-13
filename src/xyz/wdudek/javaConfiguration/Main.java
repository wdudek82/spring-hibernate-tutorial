package xyz.wdudek.javaConfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyLoggerConfig.class, SportConfig.class);

        SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println("email " + theCoach.getEmail());
        System.out.println("team " + theCoach.getTeam());

        context.close();
    }
}
