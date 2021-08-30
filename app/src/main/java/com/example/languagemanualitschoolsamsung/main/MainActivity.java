package com.example.languagemanualitschoolsamsung.main;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.languagemanualitschoolsamsung.R;
import com.example.languagemanualitschoolsamsung.models.Lesson;
import com.example.languagemanualitschoolsamsung.models.Topic;
import com.example.languagemanualitschoolsamsung.topic.TopicActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private RecyclerView lessonsRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        lessonsRecyclerView = findViewById(R.id.lessons_recyclerview_main);
        LessonsAdapter adapter = new LessonsAdapter((Lesson currentLesson) -> {
            Intent intent = new Intent(this, TopicActivity.class);
            ArrayList<Topic> topics = (ArrayList<Topic>) currentLesson.getTopics();
            intent.putExtra("topics", topics);
            startActivity(intent);
        });
        lessonsRecyclerView.setAdapter(adapter);
        adapter.submitList(Lesson.getLessons());
    }
}