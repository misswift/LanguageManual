package com.example.languagemanualitschoolsamsung.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.languagemanualitschoolsamsung.App;
import com.example.languagemanualitschoolsamsung.R;
import com.example.languagemanualitschoolsamsung.main.MainActivity;

public class WelcomeActivity extends AppCompatActivity {
    private Button signUpButton;
    private TextView signInTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String email = App.instance.getAuthPrefs().getEmail();
        String password = App.instance.getAuthPrefs().getPassword();
        //условие перехода при наличии сохраненной регистрации
        if (!email.isEmpty() && !password.isEmpty()){
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }

        initViews();
    }

    private void initViews() {
        setContentView(R.layout.activity_welcome);
        signUpButton = findViewById(R.id.sign_up_button_welcome);
        signInTextView = findViewById(R.id.sign_in_text_welcome);

        signUpButton.setOnClickListener(v -> {
            startActivity(new Intent(this, SignUpActivity.class));

        });
        signInTextView.setOnClickListener(v -> startActivity(new Intent(this, SignInActivity.class)));
    }
}
