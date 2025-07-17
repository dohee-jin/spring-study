package com.spring.core.chap01.manage;

import com.spring.core.chap01.*;

// 호텔의 레스토랑 입점과 헤드쉐프 고용은 내가 다 책임지고 하겠다.
public class HotelManager {

    // 쉐프를 고용하는 기능 - 쉐프 객체 생성을 위임
    public Chef chef() {
        return new StephaneChef();
    }

    // 레스토랑을 입점하는 기능
    public Restaurant restaurant() {
        return new WesternRestaurant(chef(), course());
    }

    // 코스를 개발하는 기능
    public Course course() {
        return new ItalianCourse();
    }

    // 호텔의 의존객체를 조립해주는 기능
    public Hotel hotel() {

        // 생성자 주입
        return new Hotel(restaurant(), chef());

        // 세터 주입
        /*Hotel hotel = new Hotel();
        hotel.setRestaurant(restaurant());
        hotel.setHeadChef(chef());

        return hotel;*/
    }
}
