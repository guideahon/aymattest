package com.aymat.configuration;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.aymat.configuration.routers.AymatRouter;
import com.aymat.core.repositories.rest.GetAllPlants;
import com.aymat.core.repositories.rest.LoginPlants;
import com.aymat.entrypoints.*;
import org.apache.http.HttpStatus;
import org.bson.codecs.configuration.CodecRegistry;

import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

import org.bson.codecs.pojo.PojoCodecProvider;
import spark.Request;
import spark.Response;


import static spark.Spark.*;

public class Main extends AbstractModule {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new Main());
        port(8080);

        options("/*",
                (request, response) -> {

                    String accessControlRequestHeaders = request
                            .headers("Access-Control-Request-Headers");
                    if (accessControlRequestHeaders != null) {
                        response.header("Access-Control-Allow-Headers",
                                accessControlRequestHeaders);
                    }

                    String accessControlRequestMethod = request
                            .headers("Access-Control-Request-Method");
                    if (accessControlRequestMethod != null) {
                        response.header("Access-Control-Allow-Methods",
                                accessControlRequestMethod);
                    }

                    return "OK";
                });

        before((request, response) -> {
            response.type("application/json");
            response.header("Access-Control-Allow-Origin", "*");
        });

        path("/aymat", new AymatRouter(injector));

        System.out.println("READY TO ROCK AND ROLL");
    }

    @Override
    protected void configure() {
        bind(GetPlantsEntrypoint.class);

        bind(LoginPlants.class);
        bind(GetAllPlants.class);

        bind(MongoDatabase.class).toInstance(getMongoInstance());

        exception(RuntimeException.class, this::badRequest);

    }

    private MongoDatabase getMongoInstance(){
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        MongoClientSettings settings = MongoClientSettings.builder()
                .codecRegistry(pojoCodecRegistry)
                .build();

        MongoClient mongoClient = MongoClients.create(settings);
        return mongoClient.getDatabase("local");
    }

    private void badRequest(Exception exception, Request req, Response res) {
        res.status(HttpStatus.SC_BAD_REQUEST);
        res.body(exception.getMessage());
    }
}
