package com.ezequiel.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class NomeDto {
    private String common;
    private String official;
    @JsonProperty("nativeName")
    private Map<String, NomeNativoDto> nomeNativo;

    public String getCommon() {
        return common;
    }

    public void setCommon(String common) {
        this.common = common;
    }

    public String getOfficial() {
        return official;
    }

    public void setOfficial(String official) {
        this.official = official;
    }

    public Map<String, NomeNativoDto> getNomeNativo() {
        return nomeNativo;
    }

    public void setNomeNativo(Map<String, NomeNativoDto> nomeNativo) {
        this.nomeNativo = nomeNativo;
    }
}
