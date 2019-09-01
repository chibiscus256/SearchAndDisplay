package ru.slavicsky.electroluxapp.services;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import ru.slavicsky.electroluxapp.data.GithubRepo;

public interface GithubClient {
    @GET("/search/repositories?")
    Call<List<GithubRepo>> getRepos(@Query("q") String query);
}
