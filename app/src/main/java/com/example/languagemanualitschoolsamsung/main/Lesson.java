package com.example.languagemanualitschoolsamsung.main;

import com.example.languagemanualitschoolsamsung.R;

import java.util.ArrayList;
import java.util.List;


public class Lesson {

    private int id;
    private int image;
    private String title;

    public Lesson(int id, int image, String title) {
        this.id = id;
        this.image = image;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public static List<Lesson> getLessons() {
        List<Lesson> result = new ArrayList<>();
        for (int i = 0; i < 20; ++i) {
            result.add(new Lesson(i, R.drawable.ic_launcher_background, "Урок номер - " + i));
        }
        return result;
    }
}

