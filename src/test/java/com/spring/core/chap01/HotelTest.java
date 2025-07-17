package com.spring.core.chap01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    // 테스트 메소드
    @Test
    void Hotel() {
        Hotel hotel = new Hotel();
        hotel.reserve();
    }
}