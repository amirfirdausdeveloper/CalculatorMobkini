package com.mobkini.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class WebView extends AppCompatActivity {
    android.webkit.WebView webs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webs = findViewById(R.id.web);

        webs.loadDataWithBaseURL(null, getIntent().getStringExtra("content"), "text/html", "UTF-8", null);

    }
}
