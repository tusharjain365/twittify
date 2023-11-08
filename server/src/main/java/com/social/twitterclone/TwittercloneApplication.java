package com.social.twitterclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class TwittercloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwittercloneApplication.class, args);
	}

}
