package com.example.languagemanualitschoolsamsung;

import android.app.Application;

import androidx.room.Room;

import com.example.languagemanualitschoolsamsung.database.AppDatabase;

public class App extends Application {

    public static App instance;
    private AppDatabase appDatabase;

    @Override
    public void onCreate() {
        super.onCreate();
        appDatabase = Room.databaseBuilder(
                getApplicationContext(),
                AppDatabase.class,
                "app_database"
        ).build();
    }

    public AppDatabase getAppDatabase() {
        return appDatabase;
    }
}





