package ru.slavicsky.electroluxapp.services;

public class APIFactory {
    public static GithubClient createClient() {
        return RetrofitFactory.retrofit().create(GithubClient.class);
    }
}
