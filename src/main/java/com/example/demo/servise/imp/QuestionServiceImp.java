package com.example.demo.servise.imp;

import com.example.demo.repo.QuestionRepository;
import com.example.demo.servise.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;

public class QuestionServiceImp implements QuestionService {
    @Autowired
    private QuestionRepository questionRepository;

}
