package com.allah.alquran;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity2 extends AppCompatActivity {

    WebView newPage;
    public static String  video_url="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        newPage=findViewById(R.id.newPage);



        newPage.getSettings().setJavaScriptEnabled(true);
        newPage.loadUrl(video_url);
    }
}