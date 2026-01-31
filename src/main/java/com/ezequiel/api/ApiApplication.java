package com.ezequiel.api;

import com.ezequiel.api.service.ApiService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	private final ApiService apiService;

	public ApiApplication(ApiService apiService) {
		this.apiService = apiService;
	}
	public static void main(String[] args) {
		SpringApplication.run(Math.class, args);
	}

	@Override
	public void run(String... args){
		apiService.getEndereco();
	}
}
