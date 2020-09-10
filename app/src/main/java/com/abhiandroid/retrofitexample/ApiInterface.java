package com.abhiandroid.retrofitexample;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;

public interface ApiInterface {

    // API's endpoints
    @GET("/marvel")

    public void getUsersList(
            Callback<List<UserListResponse>> callback);

// UserListResponse is POJO class to get the data from API, In above method we use List<UserListResponse> because the data in our API is starting from JSONArray

}
