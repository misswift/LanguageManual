package com.example.languagemanualitschoolsamsung.prefs;

import android.content.SharedPreferences;

public class AuthPrefs {

    private SharedPreferences preferences;

    private String email;
    private final String EMAIL_KEY = "email";

    private String password;
    private final String PASSWORD_KEY = "password";

    public AuthPrefs(SharedPreferences preferences) {
        this.preferences = preferences;
    }

    public String getEmail() {
        return preferences.getString(PASSWORD_KEY, "");
    }

    public void setEmail(String email) {
        preferences.edit().putString(EMAIL_KEY, email).apply();
    }

    public String getPassword() {
        return preferences.getString(EMAIL_KEY, "");
    }

    public void setPassword(String password) {
        preferences.edit().putString(PASSWORD_KEY, password).apply();
    }


}
