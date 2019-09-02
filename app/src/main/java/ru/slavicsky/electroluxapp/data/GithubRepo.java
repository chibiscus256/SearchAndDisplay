package ru.slavicsky.electroluxapp.data;

import com.squareup.moshi.Json;

public class GithubRepo {
    @Json(name = "name")
    public String repoName;
    @Json(name = "size")
    public int size;
    @Json(name = "html_url")
    public String url;
    @Json(name = "stargazers_count")
    public int stars;
}

