package com.example.gardenplanner;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GardenplannerApplication {

	static {
		Dotenv dotenv = Dotenv.configure()
				.ignoreIfMissing()
				.load();

		// Set all required secrets as system properties so Spring can read them in application.properties.
		System.setProperty("MONGODB_URI", dotenv.get("MONGODB_URI"));
	}

	public static void main(String[] args) {
		SpringApplication.run(GardenplannerApplication.class, args);
	}

}
