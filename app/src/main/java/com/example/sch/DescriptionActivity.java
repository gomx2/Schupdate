package com.example.sch;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.content.Intent;
import android.widget.SearchView;

public class DescriptionActivity extends AppCompatActivity {

    private static final String TAG = "DescriptionActivity";

    private Context mContext;
    private Bundle extras;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        mContext = DescriptionActivity.this;

        webView = (WebView) findViewById(R.id.simpleWebView);
        extras = getIntent().getExtras();
        if (!extras.equals(null)) {

            String data = extras.getString("title");
            Log.d(TAG, "onCreate: the coming data is " + data);
            String url = "file:///android_asset/" + data + ".html";

            webView.loadUrl(url);


        }
        WebSettings webSettings = webView.getSettings();
        webSettings.setBuiltInZoomControls(true);
        webSettings.setDisplayZoomControls(false);
        webSettings.setJavaScriptEnabled(true);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.toolbar_contains,menu);
           return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.backcontains:
                Intent intent= new Intent (DescriptionActivity.this, MainActivity.class);
                startActivity(intent);

        }
        return super.onOptionsItemSelected(item);
    }
}

