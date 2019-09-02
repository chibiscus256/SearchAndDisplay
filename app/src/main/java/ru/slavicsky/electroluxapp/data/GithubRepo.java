package ru.slavicsky.electroluxapp.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.squareup.moshi.Json;

public class GithubRepo {
    @Json(name = "name")
    public String repoName;
    @Json(name = "size")
    public int size;
    @Json(name = "html_url")
    public String owner;
    @Json(name = "stargazers_count")
    public int stars;


}

