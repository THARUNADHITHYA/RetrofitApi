package com.example.retrofitapi;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface RetrofitApi {


    // Call method to retrive java based objects
    @GET("posts")
    Call<List<ModelClass>> getModelClass();



}
