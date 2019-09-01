package ru.slavicsky.electroluxapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ru.slavicsky.electroluxapp.adapters.ReposAdapter;
import ru.slavicsky.electroluxapp.data.GithubRepo;

public class ResultsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<GithubRepo> repos;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        repos = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler_view_repos);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        ReposAdapter adapter = new ReposAdapter(repos);
        recyclerView.setAdapter(adapter);
    }
}
