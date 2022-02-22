package com.joaopauloleitecosta.navegaactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SegundaActivity extends AppCompatActivity {

    private Button btnTerceiraActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnTerceiraActivity = findViewById(R.id.btnTerceiraActivity);
        btnTerceiraActivity.setOnClickListener(view -> {
            startActivity(new Intent(this, TerceiraActivity.class));
        });
    }
}