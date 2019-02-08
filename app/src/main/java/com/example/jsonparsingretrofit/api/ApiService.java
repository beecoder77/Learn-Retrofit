package com.example.jsonparsingretrofit.api;

import com.example.jsonparsingretrofit.data.EmployeeList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("retrofit/json_object.json")
    Call<EmployeeList> getMyJSON();
}
