package com.aymat.entrypoints;

import com.google.inject.Inject;
import com.aymat.core.repositories.rest.GetAllPlants;
import com.aymat.core.repositories.rest.LoginPlants;
import com.aymat.core.repositories.rest.dto.LoginPlantaDTO;
import spark.Request;
import spark.Response;
import spark.Route;

public class GetPlantsEntrypoint implements Route {

    private LoginPlants loginPlants;
    private GetAllPlants getAllPlants;

    @Inject
    public GetPlantsEntrypoint(LoginPlants loginPlants, GetAllPlants getAllPlants){
        this.loginPlants = loginPlants;
        this.getAllPlants = getAllPlants;
    }

    @Override
    public Object handle(Request request, Response response){
        String u = request.queryParams("u");
        String p = request.queryParams("p");

        if(u == null || u.isEmpty()){
            throw new RuntimeException("User obligatorio.");
        }
        if(p == null || p.isEmpty()){
            throw new RuntimeException("Pass obligatoria.");
        }

        LoginPlantaDTO dto = this.loginPlants.post(u, p);
        return this.getAllPlants.get(dto.getBack().getUserId().toString());
    }

}