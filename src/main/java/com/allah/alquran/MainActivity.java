package com.allah.alquran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
LinearLayout tvDisplay,display,play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay=findViewById(R.id.tvDiplay);
        display=findViewById(R.id.display);
        play=findViewById(R.id.play);
        tvDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity2.video_url= "https://www.youtube.com/embed/-OcR3r9vj3c";
                Intent myintent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(myintent);
            }
        });

        display.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity2.video_url= "https://www.youtube.com/embed/5R06LRdUCSE";
                Intent myintent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(myintent);

            }
        });

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MainActivity2.video_url= "https://www.youtube.com/embed/bh5dGdbHCVc";
                Intent myintent= new Intent(MainActivity.this,MainActivity2.class);
                startActivity(myintent);

            }
        });




    }
}