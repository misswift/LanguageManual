package com.example.languagemanualitschoolsamsung.models;

import com.example.languagemanualitschoolsamsung.R;

import java.util.ArrayList;
import java.util.List;

public class Lesson {

    private int id;
    private int image;
    private String title;
    private List<Topic> topics;

    public Lesson(int id, int image, String title, List<Topic> topics) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.topics = topics;
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

        List<Topic> topics = new ArrayList();
        topics.add(new TheoreticalTopic(R.string.topic_1));
        List<String> questions = new ArrayList();
        questions.add("Question - ");
        questions.add("Question - " + 1);
        questions.add("Question - " + 2);
        topics.add(new PracticalTopic(questions, 2));
        result.add(new Lesson(0, R.drawable.icons_2, "Язык  Java", topics));


        List<Topic> topics1 = new ArrayList();
        topics1.add(new TheoreticalTopic(R.string.topic_2));
        List<String> questions1 = new ArrayList();
        questions1.add("Question - ");
        questions1.add("Question - " + 1);
        questions1.add("Question - " + 2);
        topics1.add(new PracticalTopic(questions1, 2));
        result.add(new Lesson(0, R.drawable.icons_6, "Переменные и типы", topics1));

        List<Topic> topics2 = new ArrayList();
        topics2.add(new TheoreticalTopic(R.string.topic_3));
        List<String> questions2 = new ArrayList();
        questions2.add("Question - ");
        questions2.add("Question - " + 1);
        questions2.add("Question - " + 2);
        topics2.add(new PracticalTopic(questions2, 3));
        result.add(new Lesson(0, R.drawable.icons_4, "Условные операторы", topics2));

        List<Topic> topics3 = new ArrayList();
        topics3.add(new TheoreticalTopic(R.string.topic_4));
        List<String> questions3 = new ArrayList();
        questions3.add("Question - ");
        questions3.add("Question - " + 1);
        questions3.add("Question - " + 2);
        topics3.add(new PracticalTopic(questions3, 3));
        result.add(new Lesson(0, R.drawable.icons_5, "Массивы", topics3));

        List<Topic> topics4 = new ArrayList();
        topics4.add(new TheoreticalTopic(R.string.topic_5));
        List<String> questions4 = new ArrayList();
        questions4.add("Question - ");
        questions4.add("Question - " + 1);
        questions4.add("Question - " + 2);
        topics4.add(new PracticalTopic(questions4, 3));
        result.add(new Lesson(0, R.drawable.icons_3, "Циклы (Loops) While", topics4));

        List<Topic> topics5 = new ArrayList();
        topics5.add(new TheoreticalTopic(R.string.topic_6));
        List<String> questions5 = new ArrayList();
        questions5.add("Question - ");
        questions5.add("Question - " + 1);
        questions5.add("Question - " + 2);
        topics5.add(new PracticalTopic(questions5, 3));
        result.add(new Lesson(0, R.drawable.icons_7, "Циклы (Loops) For", topics5));

        List<Topic> topics6 = new ArrayList();
        topics6.add(new TheoreticalTopic(R.string.topic_7));
        List<String> questions6 = new ArrayList();
        questions6.add("Question - ");
        questions6.add("Question - " + 1);
        questions6.add("Question - " + 2);
        topics6.add(new PracticalTopic(questions6, 3));
        result.add(new Lesson(0, R.drawable.icons_8, "Циклы (Loops) Foreach", topics6));

        List<Topic> topics7 = new ArrayList();
        topics7.add(new TheoreticalTopic(R.string.topic_8));
        List<String> questions7 = new ArrayList();
        questions7.add("Question - ");
        questions7.add("Question - " + 1);
        questions7.add("Question - " + 2);
        topics7.add(new PracticalTopic(questions7, 3));
        result.add(new Lesson(0, R.drawable.icons_9, "Методы в Java", topics7));

        List<Topic> topics8 = new ArrayList();
        topics8.add(new TheoreticalTopic(R.string.topic_9));
        List<String> questions8 = new ArrayList();
        questions8.add("Question - ");
        questions8.add("Question - " + 1);
        questions8.add("Question - " + 2);
        topics8.add(new PracticalTopic(questions8, 3));
        result.add(new Lesson(0, R.drawable.icons_10, "Перегрузка методов", topics8));

        List<Topic> topics9 = new ArrayList();
        topics9.add(new TheoreticalTopic(R.string.topic_10));
        List<String> questions9 = new ArrayList();
        questions9.add("Question - ");
        questions9.add("Question - " + 1);
        questions9.add("Question - " + 2);
        topics9.add(new PracticalTopic(questions9, 3));
        result.add(new Lesson(0, R.drawable.icons_2, "Переопределение методов", topics9));


        return result;
    }

    public List<Topic> getTopics() {
        return topics;
    }
}
