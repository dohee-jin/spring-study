package com.spring.core.practice1;

import com.spring.core.practice1.config.MusicPlayerConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class MusicPlayerTest {

    @Test
    void musicPlayer() {

        ApplicationContext context = new AnnotationConfigApplicationContext(MusicPlayerConfig.class);
        MusicPlayer musicPlayer = context.getBean(MusicPlayer.class);

        musicPlayer.playMusic();
    }

}