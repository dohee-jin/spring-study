package com.spring.core.practice1;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString

public class Library {

    // 의존 객체 설정
    // private final List<Book> bookList = new ArrayList<>();
    private final List<Book> books;

    public Library(List<Book> books) {
        this.books = books;
    }

    public void listBooks() {
        books.forEach(System.out::println);
    }
}
