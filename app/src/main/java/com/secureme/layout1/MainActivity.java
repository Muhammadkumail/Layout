package com.secureme.layout1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClick_showList(View view)
    {
        Intent intent=new Intent();
        intent.setClass(MainActivity.this, QouteActivity.class);
        startActivity(intent);
    }
    public void onClick_showmap(View view)
    {
        Intent intent=new Intent();
        intent.setClass(MainActivity.this,MapActivity.class);
        startActivity(intent);
    }
    public void onClick_sound(View view)
    {

        MediaPlayer mediaPlayer=MediaPlayer.create(this,R.raw.chicken);
        mediaPlayer.start();
    }
}
