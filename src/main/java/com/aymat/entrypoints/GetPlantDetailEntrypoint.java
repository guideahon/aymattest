package com.aymat.entrypoints;

import com.aymat.core.repositories.rest.GetAllPlants;
import com.aymat.core.repositories.rest.GetPlantDetail;
import com.aymat.core.repositories.rest.LoginPlants;
import com.aymat.core.repositories.rest.dto.LoginPlantaDTO;
import com.google.inject.Inject;
import spark.Request;
import spark.Response;
import spark.Route;

public class GetPlantDetailEntrypoint implements Route {

    private LoginPlants loginPlants;
    private GetPlantDetail plantDetail;

    @Inject
    public GetPlantDetailEntrypoint(LoginPlants loginPlants, GetPlantDetail plantDetail){
        this.loginPlants = loginPlants;
        this.plantDetail = plantDetail;
    }

    @Override
    public Object handle(Request request, Response response){
        String plantId = request.params("plantId");
        String u = request.queryParams("u");
        String p = request.queryParams("p");

        if(plantId == null || plantId.isEmpty()){
            throw new RuntimeException("Id de planta obligatorio.");
        }

        if(u == null || u.isEmpty()){
            throw new RuntimeException("User obligatorio.");
        }
        if(p == null || p.isEmpty()){
            throw new RuntimeException("Pass obligatoria.");
        }

        LoginPlantaDTO dto = this.loginPlants.post(u, p);
        return this.plantDetail.get(plantId);
    }

}