package com.springinaction.soundsystem;

public class Revolver implements CompactDisc {
    private String title = "Revolver";
    private String artist = "Revolver";

    public String play() {
        return ("Playing " + title + " by " + artist + "\n");
    }
}
