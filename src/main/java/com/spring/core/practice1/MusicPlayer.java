package com.spring.core.practice1;

public class MusicPlayer {

    // 의존 객체 설정
    private Speaker speaker;

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public void playMusic() {
        if(speaker == null) {
            System.out.println("스피커가 세팅되지 않았습니다.");
            return;
        }
        System.out.println("음악 재생을 시작합니다.");
        speaker.playSound();
    }
}
