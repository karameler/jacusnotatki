package com.lusia.jacusnotatki;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderAPI {
    @GET

    public Call<ArrayList<Notatki>> getNotatki();
}