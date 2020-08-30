package com.aymat.configuration.routers;

import com.aymat.entrypoints.GetPlantDetailEntrypoint;
import com.google.gson.Gson;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.aymat.entrypoints.GetPlantsEntrypoint;
import spark.RouteGroup;

import static spark.Spark.*;

public class AymatRouter implements RouteGroup {

    private Injector injector;

    @Inject
    public AymatRouter(Injector injector) {
        this.injector = injector;
    }

    @Override
    public void addRoutes() {
        get("/", injector.getInstance(GetPlantsEntrypoint.class), injector.getInstance(Gson.class)::toJson);
        get("/:plantId", injector.getInstance(GetPlantDetailEntrypoint.class), injector.getInstance(Gson.class)::toJson);
    }
}
