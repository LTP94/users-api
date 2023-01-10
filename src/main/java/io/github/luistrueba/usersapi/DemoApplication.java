package io.github.luistrueba.usersapi;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import lombok.extern.log4j.Log4j2;


/**
 * Class that starts the application
 *
 */
@Log4j2
@SpringBootApplication()

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		log.info("UsersAPI started successfully at {}", LocalDateTime.now());
	}

}
