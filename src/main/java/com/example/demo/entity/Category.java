package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
public class Category {
    @Id
    private int id;

    private String title;
    private String createdAt;
    private String updatedAt;
    private int cluesCount;
    @OneToOne(mappedBy = "category")
    private Question question;
}
