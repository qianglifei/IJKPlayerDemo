package com.bksx.mobile.terminal.ijkplayerdemo;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    private IjkVideoView mVideoPlayerIJK;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mVideoPlayerIJK = findViewById(R.id.video_view);
        String videoPath = "http://v-cdn.zjol.com.cn/280443.mp4";
     //   mVideoPlayerIJK.setVideoPath(videoPath);
        mVideoPlayerIJK.setPath(videoPath);
        mVideoPlayerIJK.start();
    }
}