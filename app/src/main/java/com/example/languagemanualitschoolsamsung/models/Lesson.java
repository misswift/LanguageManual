package com.example.languagemanualitschoolsamsung.models;

import com.example.languagemanualitschoolsamsung.R;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    // создание  инициализация полей модели
    final private int id;
    final private int image;
    final private String title;
    final private List<Topic> topics;

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


    // заполнение топиков статическими данными
    public static List<Lesson> getLessons() {
        List<Lesson> result = new ArrayList<>();

        List<Topic> topics = new ArrayList();
        topics.add(new TheoreticalTopic(R.string.topic));
        int  questions =  R.string.question;
        // реализация массива ответов
        List<String> answers = new ArrayList();
        answers.add("1990");
        answers.add("1995");
        answers.add("1991");
        topics.add(new PracticalTopic(questions, answers, 2));
        result.add(new Lesson(0, R.drawable.icons_2, "Язык  Java", topics));


        List<Topic> topics1 = new ArrayList();
        topics1.add(new TheoreticalTopic(R.string.topic_1));
        int  questions1 =  R.string.question_1;
        List<String> answers1 = new ArrayList();
        answers1.add("byte");
        answers1.add("bool" );
        answers1.add("short" );
        topics1.add(new PracticalTopic(questions1, answers1, 1));
        result.add(new Lesson(0, R.drawable.icons_6, "Переменные и типы", topics1));

        List<Topic> topics2 = new ArrayList();
        topics2.add(new TheoreticalTopic(R.string.topic_2));
        int  questions2 =  R.string.question_2;
        List<String> answers2 = new ArrayList();
        answers2.add("if (условие) Действия 1 ");
        answers2.add("if (Действия 1)  else (условие) Действия 2 " );
        answers2.add("if (условие) Действия 1 else Действия 2" );
        topics2.add(new PracticalTopic(questions2, answers2, 0));
        result.add(new Lesson(0, R.drawable.icons_4, "Условные операторы", topics2));

        List<Topic> topics3 = new ArrayList();
        topics3.add(new TheoreticalTopic(R.string.topic_3));
        int  questions3 =  R.string.question_3;
        List<String> answers3 = new ArrayList();
        answers3.add("массив может хранить набор значений любых типов");
        answers3.add("массив позволяют хранить тоько набор однотипных значений" );
        topics3.add(new PracticalTopic(questions3,answers3, 1));
        result.add(new Lesson(0, R.drawable.icons_5, "Массивы", topics3));

        List<Topic> topics4 = new ArrayList();
        topics4.add(new TheoreticalTopic(R.string.topic_4));
        int  questions4 =  R.string.question_4;
        List<String> answers4 = new ArrayList();
        answers4.add("while { Действия (выполняются пока условие истинно)} (условие)");
        answers4.add("while (условие){ Действия (выполняются пока условие истинно)}");
        answers4.add("while { Действия } (условие)");
        topics4.add(new PracticalTopic(questions4, answers4, 1));
        result.add(new Lesson(0, R.drawable.icons_3, "Циклы (Loops) While", topics4));

        List<Topic> topics5 = new ArrayList();
        topics5.add(new TheoreticalTopic(R.string.topic_5));
        int  questions5 =  R.string.question_5;
        List<String> answers5 = new ArrayList();
        answers5.add(" цикл for не должен быть инициализирован");
        answers5.add(" цикл for имеет автоматическую инициализацию");
        answers5.add(" цикл for должен быть инициализирован перед первым шагом цикла");
        topics5.add(new PracticalTopic(questions5, answers5, 2));
        result.add(new Lesson(0, R.drawable.icons_7, "Циклы (Loops) For", topics5));

        List<Topic> topics6 = new ArrayList();
        topics6.add(new TheoreticalTopic(R.string.topic_6));
        int  questions6 =  R.string.question_6;
        List<String> answers6 = new ArrayList();
        answers6.add("цикл do сначала выполняет код цикла, а затем проверяет условие");
        answers6.add("цикл do сначала проверяет условие,  а затем выполняет код цикл");
        answers6.add("цикл do  выполняет код цикла бесконечно");
        topics6.add(new PracticalTopic(questions6, answers6, 0));
        result.add(new Lesson(0, R.drawable.icons_8, "Циклы (Loops)Do..While и Foreach", topics6));

        List<Topic> topics7 = new ArrayList();
        topics7.add(new TheoreticalTopic(R.string.topic_7));
        int  questions7 =  R.string.question_7;
        List<String> answers7 = new ArrayList();
        answers7.add("только переменные");
        answers7.add("переменные, константы и выражения");
        answers7.add("выражения и константы");
        topics7.add(new PracticalTopic(questions7, answers7, 1));
        result.add(new Lesson(0, R.drawable.icons_9, "Методы в Java", topics7));

        List<Topic> topics8 = new ArrayList();
        topics8.add(new TheoreticalTopic(R.string.topic_8));
        int  questions8 =  R.string.question_8;
        List<String> answers8 = new ArrayList();
        answers8.add("имеются несколько методов с одинаковыми именами и однинаковым типом данным");
        answers8.add("имеются несколько методов с одинаковым типом возвращаемых значений " );
        answers8.add("имеются несколько методов с одинаковыми именами, но с разными типами данных" );
        topics8.add(new PracticalTopic(questions8, answers8, 2));
        result.add(new Lesson(0, R.drawable.icons_10, "Перегрузка методов", topics8));

        return result;
    }

    public List<Topic> getTopics() {
        return topics;
    }
}
