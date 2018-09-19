package com.appsflyer.support.reengviascheme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.appsflyer.AppsFlyerLib;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(AppsFlyerLib.LOG_TAG, "[MainActivity.onCreate]");
        setContentView(R.layout.activity_main);
    }
}
