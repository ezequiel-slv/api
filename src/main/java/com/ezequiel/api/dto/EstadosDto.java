package com.ezequiel.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EstadosDto {
    private NomeDto name;
    private List<String> tld;
    private String cca2;
    private String cca3;
    private String ccn3;
    private String cioc;
    private Boolean independent;
    private String status;
    private Boolean unMember;
    private Map<String, MoedaDto> moeda;
    private List<String> capital;
    private List<String> altSpellings;
    private String region;
    private String subregion;
    private Map<String, String> languages;
    private List<Double> latlng;
    private Boolean landlocked;
    private List<String> borders;

}
