package com.lohmatiyshmel.OneAndMulti;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.gpbitfactory.bot",
        "com.gpbitfactory.middle"
})
public class OneAndMultiApplication {

    @Value("${string.profiles.active}")
    static String activeProfile;

    public static void main(String[] args) {
        SpringApplication.run(OneAndMultiApplication.class, args);
    }
}

