package com.spring.core.practice2.service;

import com.spring.core.SpringCoreApplication;
import com.spring.core.practice2.config.ProductConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ProductServiceTest {

    @Test
    void test() {

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringCoreApplication.class);
        ProductService service = context.getBean(ProductService.class);

        String result = service.findProduct();
        System.out.println(result);

    }

}