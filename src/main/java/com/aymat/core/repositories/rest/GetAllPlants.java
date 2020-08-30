package com.aymat.core.repositories.rest;

import com.google.gson.Gson;
import com.google.inject.Inject;
import com.aymat.core.repositories.rest.dto.AllPlantsDTO;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class GetAllPlants {

    private static final String URL = "http://server.growatt.com/PlantListAPI.do";
    private Gson gson;

    @Inject
    public GetAllPlants(Gson gson) {
        this.gson = gson;
    }

    public AllPlantsDTO get(String userId){
        try {
            HttpResponse<JsonNode> response = Unirest.get(URL)
                .header("accept", "application/json")
                .queryString("userId", userId)
                .asJson();
            return this.gson.fromJson(response.getBody().toString(), AllPlantsDTO.class);
        }catch (Exception ex){
            throw new RuntimeException();
        }
    }
}
