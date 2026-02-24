package com.ezequiel.api.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

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
    @JsonProperty("currencies")
    private Map<String, MoedaDto> moeda;
    @JsonProperty("demonyms")
    private Map<String, GentilicoDto> gentilico;
    @JsonProperty("idd")
    private IddDto idd;
    @JsonProperty("translations")
    private Map<String, TraducaoDto> traducao;
    private List<String> capital;
    private List<String> altSpellings;
    private String region;
    private String subregion;
    private Map<String, String> languages;
    private List<Double> latlng;
    private Boolean landlocked;
    private List<String> borders;
    private Double area;

    public NomeDto getName() {
        return name;
    }

    public void setName(NomeDto name) {
        this.name = name;
    }

    public List<String> getTld() {
        return tld;
    }

    public void setTld(List<String> tld) {
        this.tld = tld;
    }

    public String getCca2() {
        return cca2;
    }

    public void setCca2(String cca2) {
        this.cca2 = cca2;
    }

    public String getCca3() {
        return cca3;
    }

    public void setCca3(String cca3) {
        this.cca3 = cca3;
    }

    public String getCcn3() {
        return ccn3;
    }

    public void setCcn3(String ccn3) {
        this.ccn3 = ccn3;
    }

    public String getCioc() {
        return cioc;
    }

    public void setCioc(String cioc) {
        this.cioc = cioc;
    }

    public Boolean getIndependent() {
        return independent;
    }

    public void setIndependent(Boolean independent) {
        this.independent = independent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getUnMember() {
        return unMember;
    }

    public void setUnMember(Boolean unMember) {
        this.unMember = unMember;
    }

    public Map<String, MoedaDto> getMoeda() {
        return moeda;
    }

    public void setMoeda(Map<String, MoedaDto> moeda) {
        this.moeda = moeda;
    }

    public List<String> getCapital() {
        return capital;
    }

    public void setCapital(List<String> capital) {
        this.capital = capital;
    }

    public List<String> getAltSpellings() {
        return altSpellings;
    }

    public void setAltSpellings(List<String> altSpellings) {
        this.altSpellings = altSpellings;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSubregion() {
        return subregion;
    }

    public void setSubregion(String subregion) {
        this.subregion = subregion;
    }

    public Map<String, String> getLanguages() {
        return languages;
    }

    public void setLanguages(Map<String, String> languages) {
        this.languages = languages;
    }

    public List<Double> getLatlng() {
        return latlng;
    }

    public void setLatlng(List<Double> latlng) {
        this.latlng = latlng;
    }

    public Boolean getLandlocked() {
        return landlocked;
    }

    public void setLandlocked(Boolean landlocked) {
        this.landlocked = landlocked;
    }

    public List<String> getBorders() {
        return borders;
    }

    public void setBorders(List<String> borders) {
        this.borders = borders;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Map<String, GentilicoDto> getGentilico() {
        return gentilico;
    }

    public void setGentilico(Map<String, GentilicoDto> gentilico) {
        this.gentilico = gentilico;
    }

    public IddDto getIdd() {
        return idd;
    }

    public void setIdd(IddDto idd) {
        this.idd = idd;
    }

    public Map<String, TraducaoDto> getTraducao() {
        return traducao;
    }

    public void setTraducao(Map<String, TraducaoDto> traducao) {
        this.traducao = traducao;
    }
}
