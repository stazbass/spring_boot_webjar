package org.baeldung.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleUrlHandlerMapping;

@SpringBootApplication
@EnableAutoConfiguration
public class Application {
    @Autowired
    private SimpleUrlHandlerMapping SimpleUrlHandlerMapping;
    @Autowired
    private static ApplicationContext applicationContext;


    public void setSimpleUrlHandlerMapping(SimpleUrlHandlerMapping handlerMapping){
        System.out.println("**********************************88");
    }
    public static void main(String[] args) {
        System.out.println("****************** START");
        applicationContext = SpringApplication.run(Application.class, args);
    }
}
