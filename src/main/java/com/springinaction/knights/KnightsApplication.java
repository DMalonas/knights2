package com.springinaction.knights;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class KnightsApplication {

    public static void main(String[] args) {
        ApplicationContext bn = new AnnotationConfigApplicationContext(KnightConfig.class);
        Quest qt = bn.getBean(Quest.class);
        Knight kt = bn.getBean(Knight.class);
        kt.embarkOnQuest();
    }

}
