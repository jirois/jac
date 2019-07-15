package com.example.alc4app;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class about_alc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        WebView webView = (WebView) findViewById(R.id.about_web_alc);

        webView.loadUrl("https://andela.com/alc/");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);



    }

    private void openWebView(String webView) {
        Uri webpage = Uri.parse(webView);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

}
