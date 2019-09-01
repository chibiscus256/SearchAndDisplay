package ru.slavicsky.electroluxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText search = findViewById(R.id.search_view);
        Button getResultsButton = findViewById(R.id.results_button);

        getResultsButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ResultsActivity.class);
            startActivity(intent);
        });
    }



}
