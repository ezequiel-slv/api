package com.ezequiel.api.service;

import com.ezequiel.api.dto.EnderecoDto;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Collections;
import java.util.List;

@Service
public class ApiService {

    public List<EnderecoDto> getEndereco(){
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://restcountries.com/v3.1/independent?status=true")).build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());


            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(response.body(),
                    new TypeReference<List<EnderecoDto>>() {
            });

        }catch (Exception e) {
            System.out.println(e.getMessage());
            return Collections.emptyList();
        }
    }
}
