package com.spring.core.chap02_3.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// 해당 패키지 범위 안에서 @Component 가 붙은 클래스들을
@ComponentScan(basePackages = "com.spring.core.chap02_3")
public class MyModelConfig {

    // 빈 등록(빈 정의): 스프링에게 관리를 위임할 객체들을 저장
    /*
    @Bean
    public MyRepository repository() {
        return new MyRepository();
    }

    @Bean
    public MyService service() {
        return new MyService(repository());
    }

    @Bean
    public MyController controller() {
        return new MyController(service());
    }
    */
}
