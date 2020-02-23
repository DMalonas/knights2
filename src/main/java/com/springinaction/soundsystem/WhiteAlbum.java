package com.springinaction.soundsystem;

public class WhiteAlbum implements CompactDisc {
    private String title = "WhiteAlbum";
    private String artist = "WhiteAlbum";

    public String play() {
       return ("Playing " + title + " by " + artist + "\n");
    }
}
