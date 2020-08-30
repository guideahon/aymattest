package com.aymat.core.repositories.rest;

import com.google.gson.Gson;
import com.google.inject.Inject;
import com.aymat.core.repositories.rest.dto.LoginPlantaDTO;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class LoginPlants {

    private static final String URL = "http://server.growatt.com/LoginAPI.do";
    private Gson gson;

    @Inject
    public LoginPlants(Gson gson) {
        this.gson = gson;
    }

    public LoginPlantaDTO post(String u, String p){
        try {
            HttpResponse<JsonNode> response = Unirest.post(URL)
                .header("accept", "application/json")
                .queryString("userName", u)
                .queryString("password", p)
                .asJson();
            return this.gson.fromJson(response.getBody().toString(), LoginPlantaDTO.class);
        }catch (Exception ex){
            throw new RuntimeException();
        }
    }
}
