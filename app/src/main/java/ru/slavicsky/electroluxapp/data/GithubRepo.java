package ru.slavicsky.electroluxapp.data;

import android.os.Parcel;
import android.os.Parcelable;

import com.squareup.moshi.Json;

public class GithubRepo implements Parcelable {
    @Json(name = "name")
    public String repoName;
    @Json(name = "size")
    public int size;
    @Json(name = "login")
    public String login;
    @Json(name = "stargazers_count")
    public int stars;

    protected GithubRepo(Parcel in) {
        repoName = in.readString();
        size = in.readInt();
        login = in.readString();
        stars = in.readInt();
    }

    public static final Creator<GithubRepo> CREATOR = new Creator<GithubRepo>() {
        @Override
        public GithubRepo createFromParcel(Parcel in) {
            return new GithubRepo(in);
        }

        @Override
        public GithubRepo[] newArray(int size) {
            return new GithubRepo[size];
        }
    };

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(repoName);
        parcel.writeInt(size);
        parcel.writeString(login);
        parcel.writeInt(stars);
    }

    public static class GithubResult{
        private GithubRepo[] results;

        public GithubResult(GithubRepo[] results) {
            this.results = results;
        }
        public GithubRepo[] getResults() {
            return results;
        }
    }
}

