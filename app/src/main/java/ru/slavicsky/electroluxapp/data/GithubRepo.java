package ru.slavicsky.electroluxapp.data;

import android.os.Parcel;

import com.squareup.moshi.Json;

public class GithubRepo {
    @Json(name = "name")
    private String repoName;
    @Json(name = "size")
    private int size;
    @Json(name = "login")
    private String user;
    @Json(name = "stargazers_count")
    private int stars;

    protected GithubRepo(Parcel in) {
        repoName = in.readString();
        size = in.readInt();
        user = in.readString();
        stars = in.readInt();
    }

    public String getNickname() {
        return repoName;
    }

    public void setNickname(String nickname) {
        this.repoName = nickname;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
