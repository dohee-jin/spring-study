package com.spring.core.chap01;

// 호텔의 설계도
public class Hotel {

    // 레스토랑 입점
    private final Restaurant restaurant;

    // 헤드쉐프 고용
    private final Chef headChef;

    // 생성자 주입
    public Hotel(Restaurant restaurant, Chef chef) {
        this.restaurant = restaurant;
        // this.headChef = new StephaneChef(); // DIP 위반, Jann에 너무 의존중
        this.headChef = chef;
    }

    // 세터 주입
    /*public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public void setHeadChef(Chef chef) {
        this.headChef = chef;
    }*/

    // 레스토랑 예약 기능
    public void reserve() {
        System.out.println("레스토랑을 예약합니다.");
        System.out.println("헤드셰프명:  " + headChef.getClass().getSimpleName());
        restaurant.order();
    }
}
