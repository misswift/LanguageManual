package com.example.languagemanualitschoolsamsung.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.languagemanualitschoolsamsung.App;
import com.example.languagemanualitschoolsamsung.R;
import com.example.languagemanualitschoolsamsung.database.User;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class SignUpActivity extends AppCompatActivity {
    EditText emailEditText;
    EditText nameEditText;
    EditText passwordEditText;
    Button signUpButton;

    private List<User> users = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        initViews();
        initData();
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
        emailEditText = findViewById(R.id.email_edit_text_sign_up);
        nameEditText = findViewById(R.id.name_edit_text_sign_up);
        passwordEditText = findViewById(R.id.password_edit_text_sign_up);
        signUpButton = findViewById(R.id.sign_up_button);

        signUpButton.setOnClickListener(v -> {
            String email = emailEditText.getText().toString();
            String name = nameEditText.getText().toString();
            String password = passwordEditText.getText().toString();

            User user = new User(email, name, password);
            if (!users.contains(user)) {
                Completable.fromAction(() -> {
                    App.instance.getAppDatabase().userDao().saveUser(user);
                    App.instance.getAuthPrefs().setEmail(user.getEmail());
                    App.instance.getAuthPrefs().setPassword(user.getPassword());
                })
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(() -> {
                            Intent intent = new Intent(this, HelloActivity.class);
                            intent.putExtra("name", name);
                            startActivity(intent);
                        });
            } else {
                //TO DO ???????? ???????????????????????? ?????? ??????????
            }
        });
    }

}
