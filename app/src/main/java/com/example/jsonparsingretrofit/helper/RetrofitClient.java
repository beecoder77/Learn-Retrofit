package com.example.jsonparsingretrofit.helper;

import com.example.jsonparsingretrofit.api.ApiService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    //URL nya
    private static final String ROOT_URL = "http://api.androiddeft.com/";
    //Get retrofit instace
    private static Retrofit getRetrofitInstance() {
        return new Retrofit.Builder()
                .baseUrl(ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
    //Get API service
    public static ApiService getApiService() {
        return getRetrofitInstance().create(ApiService.class);
    }
}
