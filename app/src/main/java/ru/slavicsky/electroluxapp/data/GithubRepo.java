package ru.slavicsky.electroluxapp.data;

import android.os.Parcel;

public class GithubRepo {

    private String repoName;
    private String lastUpdate;
    private String user;
    private int stars;

    protected GithubRepo(Parcel in) {
        repoName = in.readString();
        lastUpdate = in.readString();
        user = in.readString();
        stars = in.readInt();
    }

    public String getNickname() {
        return repoName;
    }

    public void setNickname(String nickname) {
        this.repoName = nickname;
    }

    public String getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        this.lastUpdate = lastUpdate;
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
