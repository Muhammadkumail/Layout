package com.secureme.layout1;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

public class MainActivity extends AppCompatActivity {
    Animation animaplha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animaplha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);

    }

    public void onClick_showList(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, QouteActivity.class);
        startActivity(intent);
    }

    public void onClick_showmap(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, MapActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_alpha, R.anim.anim_alpha);
    }

    public void onClick_sound(View view) {
        view.startAnimation(animaplha);
        Intent intent =new Intent();
        intent.setClass(MainActivity.this,QouteActivity.class);
        startActivity(intent);
    }

}
