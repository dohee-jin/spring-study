package com.spring.core.practice2.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ProductionRepository {

    public String findProduct() {
        return "상품 데이터" ;
    }
}
