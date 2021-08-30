package com.example.languagemanualitschoolsamsung;

import android.app.Application;
import android.content.SharedPreferences;

import androidx.room.Room;

import com.example.languagemanualitschoolsamsung.database.AppDatabase;
import com.example.languagemanualitschoolsamsung.prefs.AuthPrefs;

public class App extends Application {

    public static App instance;
    private AppDatabase appDatabase;

    private AuthPrefs authPrefs;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        appDatabase = Room.databaseBuilder(
                getApplicationContext(),
                AppDatabase.class,
                "app_database"
        ).build();
        SharedPreferences preferences = getSharedPreferences("Language_Manual_IT_School", MODE_PRIVATE);
        authPrefs = new AuthPrefs(preferences);
    }

    public AppDatabase getAppDatabase() {

        return appDatabase;
    }

    public AuthPrefs getAuthPrefs() {
        return authPrefs;
    }

}





