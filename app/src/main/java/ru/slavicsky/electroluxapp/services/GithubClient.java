package ru.slavicsky.electroluxapp.services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ru.slavicsky.electroluxapp.data.JSONResponse;

public interface GithubClient {
    @GET("/search/repositories?")
    Call<JSONResponse> getRepos(@Query("q") String query);
}
