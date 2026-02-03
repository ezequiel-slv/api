package com.ezequiel.api;

import com.ezequiel.api.service.ApiService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

	private final ApiService apiService;

	public ApiApplication(ApiService apiService) {
		this.apiService = apiService;
	}
	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		apiService.getEndereco();
	}
}
