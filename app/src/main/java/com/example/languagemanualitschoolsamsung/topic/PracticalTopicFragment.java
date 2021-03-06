package com.example.languagemanualitschoolsamsung.topic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.languagemanualitschoolsamsung.R;
import com.example.languagemanualitschoolsamsung.models.PracticalTopic;
import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class PracticalTopicFragment extends Fragment {

    private PracticalTopic practicalTopic;
    private RadioGroup questionsRadioGroup;
    private TextView textQuestionPractical;
    private MaterialButton checkButton;
    private List<Integer> radioButtonsID = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        practicalTopic = (PracticalTopic) getArguments().getSerializable("topic");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_practical_topic, container, false);
    }

    // метод определения правильного ответа
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textQuestionPractical = view.findViewById(R.id.questions_text);
        textQuestionPractical.setText(practicalTopic.getQuestions());
        questionsRadioGroup = view.findViewById(R.id.questions_practical_topic);
        for (int i = 0; i < practicalTopic.getAnswers().size(); i++) {
            String answer = practicalTopic.getAnswers().get(i);
            RadioButton radioButton = new RadioButton(getContext());
            radioButton.setId(View.generateViewId());
            radioButtonsID.add(radioButton.getId());
            radioButton.setText(answer);
            questionsRadioGroup.addView(radioButton);
        }

        checkButton = view.findViewById(R.id.check_button);
        checkButton.setOnClickListener(v -> {
            for (int i = 0; i < radioButtonsID.size(); i++) {
                if (questionsRadioGroup.getCheckedRadioButtonId() == radioButtonsID.get(i)) {
                    if (i == practicalTopic.getRightQuestion()) {
                        Toast.makeText(getContext(), "Правильно", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getContext(), "Ошибка", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
