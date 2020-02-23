package com.springinaction.soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages ="com.springinaction.soundsystem")
public class CDPlayerConfig {

    @Bean
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
    @Bean
    public CompactDisc sgtPeppers() {
        int choice = (int) Math.floor(Math.random() * 4);
        if (choice == 0) {
            return new SgtPeppers();
        } else if (choice == 1) {
            return new WhiteAlbum();
        } else if (choice == 2) {
            return new HardDaysNight();
        } else {
            return new Revolver();
        }
    }
}
