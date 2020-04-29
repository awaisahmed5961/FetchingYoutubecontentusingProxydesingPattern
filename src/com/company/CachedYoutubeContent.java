package com.company;

public class CachedYoutubeContent implements YoutubeContent {
    private  String videoName;

    public CachedYoutubeContent(String videoName) {
        this.videoName = videoName;
    }

    @Override
    public void listVideos() {
        if(videoName == null){
            Youtube youtubeContent = new Youtube(videoName);
            youtubeContent.listVideos();
        }
        else{
            System.out.println("returning Video form Cached data" +this.videoName);
        }
    }

    @Override
    public void getVideoInfo() {
        if(videoName == null){
            Youtube youtubeContent = new Youtube(videoName);
            youtubeContent.getVideoInfo();
        }
        else{
            System.out.println("returning Video  information form Cached data" +this.videoName);
        }
    }

    @Override
    public void downloadVideo() {
        if(videoName == null){
            Youtube youtubeContent = new Youtube(videoName);
            youtubeContent.downloadVideo();
        }
        else{
            System.out.println("returning download Video form Cached data" +this.videoName);
        }
    }
}
