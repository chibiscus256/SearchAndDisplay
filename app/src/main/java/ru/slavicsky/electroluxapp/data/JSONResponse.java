package ru.slavicsky.electroluxapp.data;

public class JSONResponse {
    public GithubRepo[] items;

    public JSONResponse(GithubRepo[] items) {
        this.items = items;
    }

    public GithubRepo[] getResults() {
        return items;
    }
}
