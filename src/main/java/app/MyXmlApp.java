package app;

import concert.Performance;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyXmlApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:META-INF/spring/concert2.xml");

        Performance concert = ctx.getBean("concert", Performance.class);
        concert.perform();
    }
}

//        Encoreable concert = ctx.getBean("concert", Encoreable.class);
//        concert.performEncore();
