package com.ezequiel.api.dto;

import java.util.List;

public class IddDto {
    private String root;
    private List<String> suffixes;

    public String getRoot() {
        return root;
    }

    public void setRoot(String root) {
        this.root = root;
    }

    public List<String> getSuffixes() {
        return suffixes;
    }

    public void setSuffixes(List<String> suffixes) {
        this.suffixes = suffixes;
    }
}
