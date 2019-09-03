package ru.slavicsky.electroluxapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTextChanged;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.results_button) Button resultsButton;
    @BindView(R.id.search_view) EditText search;

    @OnClick(R.id.results_button) void search(){
        Intent intent = new Intent(MainActivity.this, ResultsActivity.class);
        intent.putExtra("query", search.getText());
        startActivity(intent);
    }

    @OnTextChanged(R.id.search_view) void onTextChanged(CharSequence charSequence, int i, int i1, int i2){
        if (charSequence.length() == 0) {
            resultsButton.setVisibility(View.INVISIBLE);
        } else {
            resultsButton.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
