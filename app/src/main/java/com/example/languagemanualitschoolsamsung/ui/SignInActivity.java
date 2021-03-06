package com.example.languagemanualitschoolsamsung.ui;


import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.languagemanualitschoolsamsung.App;
import com.example.languagemanualitschoolsamsung.R;
import com.example.languagemanualitschoolsamsung.database.User;
import com.example.languagemanualitschoolsamsung.main.MainActivity;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class SignInActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private Button signInButton;

    private List<User> users = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        initData();
        initViews();
    }

    private void initData() {
        App.instance
                .getAppDatabase()
                .userDao()
                .getUsers()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(users -> {
                    this.users = users;
                });
    }

    private void initViews() {
        emailEditText = findViewById(R.id.email_edit_text_sign_in);
        passwordEditText = findViewById(R.id.password_edit_text_sign_in);
        signInButton = findViewById(R.id.sign_in_button);

        signInButton.setOnClickListener(v -> {
            String email = emailEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            User user = getUserByEmail(email);
            if (user != null
                    && user.getEmail().equals(email)
                    && user.getPassword().equals(password)) {
                Intent intent = new Intent(this, MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }

    private User getUserByEmail(String email) {
        User result = null;
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                result = user;
            }
        }
        return result;
    }
}