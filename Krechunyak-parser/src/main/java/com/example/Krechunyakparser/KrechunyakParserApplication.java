package com.example.Krechunyakparser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import io.github.bonigarcia.wdm.WebDriverManager;

@SpringBootApplication
public class KrechunyakParserApplication {
	public static void main(String[] args) {
		SpringApplication.run(KrechunyakParserApplication.class, args);
		WebDriverManager.chromedriver().setup();
	}
}