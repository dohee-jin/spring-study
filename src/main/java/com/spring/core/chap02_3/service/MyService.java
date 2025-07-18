package com.spring.core.chap02_3.service;

import com.spring.core.chap02_3.myrepository.MyRepository;
import org.springframework.stereotype.Service;

// 데이터베이스에서 가져온 데이터를 정제하는 클래스
//@Component
@Service // Component 라고 해도 되지만 명시적으로 작성
public class MyService {

    // 데이터베이스에 데이터를 가져오기 위한 의존관계
    private MyRepository repository;

    // 의존성 생성자 주입

    public MyService(MyRepository repository) {
        System.out.println("MyService 객체 생성!");
        this.repository = repository;
        System.out.println("Repository 의존성이 Service에 주입됨!");
    }

    public String processData() {
        return "데이터를 정제해서 전처리 -> " + repository.findData().getData();
    }
}
