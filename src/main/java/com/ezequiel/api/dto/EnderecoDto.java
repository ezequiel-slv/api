package com.ezequiel.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnderecoDto {
    private Object name;
    private String common;
    private String official;
    private Map<String, Object> nativeName;
}
