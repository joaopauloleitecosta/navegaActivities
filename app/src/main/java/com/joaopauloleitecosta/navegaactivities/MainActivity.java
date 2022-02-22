package com.joaopauloleitecosta.navegaactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSegundaActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSegundaActivity = findViewById(R.id.btnSegundaActivity);
        btnSegundaActivity.setOnClickListener(view -> {
            startActivity(new Intent(this, SegundaActivity.class));
        });
    }
}