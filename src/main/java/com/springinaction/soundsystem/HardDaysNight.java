package com.springinaction.soundsystem;

public class HardDaysNight implements CompactDisc {
    private String title = "HardDaysNight";
    private String artist = "HardDaysNight";

    public String play() {
        return ("Playing " + title + " by " + artist + "\n");
    }
}
