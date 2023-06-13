package com.example.demo.entity;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Data
public class QuestionDTO {

    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private String questionId;
    private String questionText;
    private String correctAnswer;
}
