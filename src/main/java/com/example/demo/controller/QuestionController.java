package com.example.demo.controller;

import com.example.demo.entity.Question;
import com.example.demo.entity.QuestionDTO;
import com.example.demo.repo.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class QuestionController {
    private static final String API_ENDPOINT = "https://jservice.io/api/random";
    private static final int NUM_QUESTIONS = 5;

    private final QuestionRepository questionRepository;

    @Autowired
    public QuestionController(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @GetMapping("/play")
    public QuestionDTO play() {
        QuestionDTO questionDTO = new QuestionDTO();

        List<Question> questions = questionRepository.findAll();
        if (!questions.isEmpty()) {
            Question question = getRandomQuestion(questions);
            questionDTO.setQuestionId(question.getQuestionId());
            questionDTO.setQuestion(question.getQuestionText());
        }

        return questionDTO;
    }

}



