package com.spring.core.practice1;

import lombok.ToString;

@ToString
public class Book {

    private String title;
    private String author;
    private String publish;

    public Book(String title, String author, String publish) {
        this.title = title;
        this.author = author;
        this.publish = publish;
    }


}
