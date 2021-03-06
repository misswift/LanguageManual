package com.example.languagemanualitschoolsamsung.database;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import io.reactivex.rxjava3.core.Single;

@Dao
public interface UserDao {

    // реализация запроса

    @Query("SELECT * FROM users")
    public Single<List<User>> getUsers();

    @Insert
    public void saveUser(User user);
}