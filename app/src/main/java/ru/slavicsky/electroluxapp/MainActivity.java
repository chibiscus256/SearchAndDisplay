package ru.slavicsky.electroluxapp;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button resultsButton = findViewById(R.id.results_button);
        EditText search = findViewById(R.id.search_view);

        search.addTextChangedListener((new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            //preventing empty input
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.length() == 0) {
                    resultsButton.setVisibility(View.INVISIBLE);
                } else {
                    resultsButton.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        }));

        resultsButton.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ResultsActivity.class);
            intent.putExtra("query", search.getText());
            startActivity(intent);
        });
    }

}
