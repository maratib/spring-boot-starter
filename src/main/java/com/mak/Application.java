package com.mak;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {

	@Value("${server.port}")
	private int serverPort;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@PostConstruct()
	public void onStart() throws Exception {
		System.out.println("App Loaded");
		log.warn("*** Application started at PORT *** : " + serverPort);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("CommandLineRunner");
	}


}
