package com.example.nesadakoca.movies.model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by nesadakoca on 3/19/18.
 */

public interface ApiRest {

    String BASE_URL = "https://simplifiedcoding.net/";
    @GET("demos/marvel")
    Call<List<Response>> getHeros();
}
