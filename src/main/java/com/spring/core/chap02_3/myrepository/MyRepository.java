package com.spring.core.chap02_3.myrepository;

import com.spring.core.chap02_3.model.MyModel;
import org.springframework.stereotype.Repository;

// 데이터베이스에 접근해서 데이터를 CRUD하는 역할
//@Component
@Repository // DB 접근 시 Repository 로 어노테이션을 설정
public class MyRepository {

    public MyRepository() {
        System.out.println("MyRepository  객체 생성!");
    }

    public MyModel findData() {
        return new MyModel("DB에서 조회한 데이터입니다.");
    }
}
