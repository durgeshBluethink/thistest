package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Question {
    @Id
    private int id;

    private String answer;
    private String question;
    private int value;
    private String airdate;
    private String createdAt;
    private String updatedAt;
    private int categoryId;
    private int gameId;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
}
