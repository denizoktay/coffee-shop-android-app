package com.denizoktay.a00268434_denizoktay_androidproject2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Event2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event2);
        WebView myBrowser = findViewById(R.id.webView5);
        myBrowser.setWebViewClient(new WebViewClient());
        myBrowser.loadUrl("https://worldcoffeeevents.org/rules-regulations-released-for-2020-world-coffee-championships/");

    }
}
