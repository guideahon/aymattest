package com.aymat.core.repositories.rest;

import com.aymat.core.repositories.rest.dto.AllPlantsDTO;
import com.aymat.core.repositories.rest.dto.PlantDetailDTO;
import com.google.gson.Gson;
import com.google.inject.Inject;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class GetPlantDetail {

    private static final String URL = "http://server.growatt.com/newPlantAPI.do";
    private Gson gson;

    @Inject
    public GetPlantDetail(Gson gson) {
        this.gson = gson;
    }

    public PlantDetailDTO get(String plantId){
        try {
            HttpResponse<JsonNode> response = Unirest.get(URL)
                .header("accept", "application/json")
                .queryString("plantId", plantId)
                .queryString("op", "getAllDeviceListThree")
                .queryString("pageNum", "1")
                .queryString("pageSize", "1")
                .asJson();
            return this.gson.fromJson(response.getBody().toString(), PlantDetailDTO.class);
        }catch (Exception ex){
            throw new RuntimeException();
        }
    }
}
