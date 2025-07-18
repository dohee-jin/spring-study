package com.spring.core.chap02_3.controller;

import com.spring.core.chap02_3.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

// 클라이언트의 요청을 처리하는 클래스
// @Component // 스프링에게 빈 등록(빈 정의)
@Controller // Web view랑 Component의 가능을 포함하고 있음
public class MyController {

    // 정제된 데이터를 받아와야하기 때문에 MyService와 의존관계
    private MyService service;

    @Autowired // 필요한 의존객체를 자동으로 결합
    // 생성자가 딱 하나면  @Autowired를 생략할 수 있음
    public MyController(MyService service) {
        System.out.println("MyController 객체 생성!");
        this.service = service;
        System.out.println("Service 의존성이 Controller에 주입됨!");
    }


    // 정제된 데이터를 응답
    public void handleRequest() {

        System.out.println("정제된 데이터를 응답 -> " + service.processData());
    }
}
