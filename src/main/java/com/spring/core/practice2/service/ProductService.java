package com.spring.core.practice2.service;

import com.spring.core.practice2.repository.ProductionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    // 의존 객체
    private ProductionRepository repository;

    // 의존성 주입
    @Autowired
    public ProductService(ProductionRepository repository) {
        this.repository = repository;
    }

    public String findProduct() {
        return "데이터 정제: " + repository.findProduct();
    }
}
