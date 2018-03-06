package com.agungdh.ipchecker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //<< this
        setContentView(R.layout.activity_main);

        WebView view = (WebView) this.findViewById(R.id.webView);
        view.setWebViewClient(new WebViewClient());
        view.loadUrl("https://agungdh.com");
        view.getSettings().setJavaScriptEnabled(true);
    }
}
