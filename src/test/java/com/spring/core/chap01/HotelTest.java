package com.spring.core.chap01;

import com.spring.core.chap01.manage.HotelManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    // 테스트 메소드
    @Test
    void Hotel() {

        // Hotel hotel = new Hotel();
        // hotel.reserve();
        // 호텔객체를 생성 - 매니저한테 문의
        HotelManager manager = new HotelManager();

        Hotel hotel = manager.hotel();
        hotel.reserve();
    }
}