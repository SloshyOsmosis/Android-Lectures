package com.example.week11activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button changeButton;
    TextView newText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        newText = findViewById(R.id.textView);
        changeButton = findViewById(R.id.firstButton);
    }

    public void pressMeButton(View view) {
        newText.setText("Find a great idea for the next app");
    }
}