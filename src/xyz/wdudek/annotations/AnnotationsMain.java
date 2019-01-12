package xyz.wdudek.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsMain {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("annotation-applicationContext.xml");
        TennisCoach theCoach = context.getBean("tennisCoach", TennisCoach.class);

        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getTeam());

        context.close();
    }
}
