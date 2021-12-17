package com.bksx.mobile.terminal.ijkplayerdemo;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import com.bksx.mobile.terminal.player_custom.Jzvd;
import com.bksx.mobile.terminal.player_custom.JzvdStd;


public class MainActivity extends AppCompatActivity {
    JzvdStd jzvdStd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jzvdStd = findViewById(R.id.video_player);
        Jzvd.releaseAllVideos();
        jzvdStd.setUp("http://v-cdn.zjol.com.cn/280443.mp4"
                , "ghjgh", JzvdStd.SCREEN_NORMAL, MediaIjk.class);
        jzvdStd.startVideo();
    }
}