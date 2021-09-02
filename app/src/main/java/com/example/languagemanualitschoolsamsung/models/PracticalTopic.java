package com.example.languagemanualitschoolsamsung.models;

import java.util.List;

public class PracticalTopic extends Topic {

    private int questions;
    private List<String> answers;
    private int rightQuestion;

    public PracticalTopic(int questions, List<String> answers, int rightQuestion) {
        this.questions = questions;
        this.answers = answers;
        this.rightQuestion = rightQuestion;
    }

    public int getQuestions() {
        return questions;
    }

    public int getRightQuestion() {
        return rightQuestion;
    }

    public List<String> getAnswers() {
        return answers;
    }
}
