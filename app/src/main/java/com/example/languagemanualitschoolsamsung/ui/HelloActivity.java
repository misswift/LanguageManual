package com.example.languagemanualitschoolsamsung.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.languagemanualitschoolsamsung.R;
import com.example.languagemanualitschoolsamsung.main.MainActivity;


public class HelloActivity extends AppCompatActivity {

    private TextView helloTextView;
    private Button forwardButton;

    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        name = getIntent().getStringExtra("name");
        initViews();
    }
    // инициализация переменных
    private void initViews() {
        setContentView(R.layout.activity_hello);
        helloTextView = findViewById(R.id.hello_text);
        forwardButton = findViewById(R.id.forward_button_hello);

        helloTextView.setText("Добро пожаловать, " + name + "!");
        // определение перехода
        forwardButton.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
    }
}