package com.company;

public class Main {

    public static void main(String[] args) {
        YoutubeContent content = new Youtube("Lecture_software_Construction");
        content.getVideoInfo();
        System.out.println("-----------------------------------------");
        content.getVideoInfo();

        content = new CachedYoutubeContent("Lecture_software_Construction");
        content.getVideoInfo();
        content.getVideoInfo();
    }
}
