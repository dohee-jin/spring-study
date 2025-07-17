package com.spring.core.practice1.config;

import com.spring.core.practice1.Library;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.core.practice1.*;

import java.util.List;

@Configuration
public class LibraryConfig {

    @Bean
    public List<Book> books() {
        return List.of(
                new Book("책1", "저자1", "2020-10-11"),
                new Book("책2", "저자2", "2020-10-12"),
                new Book("책3", "저자3", "2020-10-13")
        );
    }

    @Bean
    public Library library() {
        return new Library(books());
    }
}
