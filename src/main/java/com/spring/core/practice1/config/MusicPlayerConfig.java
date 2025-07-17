package com.spring.core.practice1.config;

import com.spring.core.practice1.MusicPlayer;
import com.spring.core.practice1.Speaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MusicPlayerConfig {

    @Bean
    public Speaker speaker() {
        return new Speaker();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.setSpeaker(speaker());

        return musicPlayer;
    }
}
