package com.example.Course_Registration_System;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  CourseRegistrationSystemApplication {

	public static void main(String[] args) {
        Dotenv dotenv=Dotenv.configure().directory("./").ignoreIfMalformed().ignoreIfMissing().load();

        if(dotenv.get("DB_URL")!=null){
            System.setProperty("DB_URL",dotenv.get("DB_URL"));
        }
        if(dotenv.get("DB_USERNAME")!=null){
            System.setProperty("DB_USERNAME",dotenv.get("DB_USERNAME"));
        }
        if(dotenv.get("DB_PASS")!=null){
            System.setProperty("DB_PASS",dotenv.get("DB_PASS"));
        }
        SpringApplication.run(CourseRegistrationSystemApplication.class, args);
	}

}
