package com.company;

public class Youtube implements YoutubeContent {
    private  String VideoName;

    public Youtube(String videoName) {
        VideoName = videoName;
    }

    @Override
    public void listVideos() {
        System.out.println("Getting VideoList" +this.VideoName+ "From Youtube");

    }

    @Override
    public void getVideoInfo() {
        System.out.println("getting Video Information" +this.VideoName+ "From Youtube");
    }

    @Override
    public void downloadVideo() {
        System.out.println("downloading video" +this.VideoName+ "From Youtube");
    }
}
