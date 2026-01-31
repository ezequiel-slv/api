package com.ezequiel.api.service;

import com.ezequiel.api.dto.EnderecoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@Service
public class ApiService {

    public EnderecoDto getEndereco(String cep){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://restcountries.com/v3.1/independent?status=true")).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Autowired
    private RestTemplate restTemplate;

    public String allDates(){
        String url = "https://restcountries.com/v3.1/independent?status=true";

        ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);

        return forEntity.getBody();
    }

}
