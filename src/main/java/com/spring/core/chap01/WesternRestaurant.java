package com.spring.core.chap01;

// 서양식 레스토랑
public class WesternRestaurant implements Restaurant{

    // 메인 쉐프 고용
    private JannChef mainChef;

    // 요리 코스 구성
    private FrenchCourse course;


    // 생성자
    public WesternRestaurant() {
        this.mainChef = new JannChef();
        this.course = new FrenchCourse();
    }

    // 주문 기능
    @Override
    public void order() {
        System.out.println("서양 요리를 주문합니다.");
        course.combineMenu();
        mainChef.cook();
    }
}
