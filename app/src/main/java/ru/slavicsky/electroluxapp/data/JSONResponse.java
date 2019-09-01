package ru.slavicsky.electroluxapp.data;

import java.util.List;

public class JSONResponse {
    public GithubRepo[] items;

    public JSONResponse(GithubRepo[] items) {
        this.items = items;
    }

    public GithubRepo[] getResults() {
        return items;
    }
}
