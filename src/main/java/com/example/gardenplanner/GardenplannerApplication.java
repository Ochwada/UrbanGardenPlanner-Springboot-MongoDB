package com.example.gardenplanner;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GardenplannerApplication {

	static {
		// Load environment variables from .env (ignore if .env is missing, e.g., on Heroku)
		Dotenv dotenv = Dotenv.configure()
				.ignoreIfMissing()
				.load();

		// Fetch the value from .env
		String uri = dotenv.get("MONGODB_URI");

		// Only set the system property if the value is not null
		if (uri != null) {
			System.setProperty("MONGODB_URI", uri);
			System.out.println("✅ MONGODB_URI loaded and set.");
		} else {
			System.out.println("⚠️ MONGODB_URI not found in .env file. Skipping System.setProperty.");
		}

		/** Set all required secrets as system properties so Spring can read them in application.properties.
		System.setProperty("MONGODB_URI", dotenv.get("MONGODB_URI"));*/
	}

	public static void main(String[] args) {
		SpringApplication.run(GardenplannerApplication.class, args);
	}

}
