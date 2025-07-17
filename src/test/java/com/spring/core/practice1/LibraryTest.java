package com.spring.core.practice1;

import com.spring.core.practice1.config.LibraryConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void library() {

        ApplicationContext context = new AnnotationConfigApplicationContext(LibraryConfig.class);

        Library library = context.getBean(Library.class);
        library.listBooks();

    }
}