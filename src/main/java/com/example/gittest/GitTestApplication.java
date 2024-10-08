package com.example.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        System.out.println(translate("Всем привет!"));
        SpringApplication.run(GitTestApplication.class, args);
    }

    private static String translate(final String words) {
        if (words.equals("Всем привет")) {
            return "Hello world";
        }
        return "Я такого не знаю";
    }
}
