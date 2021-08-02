package com.example.languagemanualitschoolsamsung.database;

import androidx.room.RoomDatabase;

public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}