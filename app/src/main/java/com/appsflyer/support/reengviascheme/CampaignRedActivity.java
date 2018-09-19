package com.appsflyer.support.reengviascheme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.appsflyer.AppsFlyerLib;

public class CampaignRedActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(AppsFlyerLib.LOG_TAG, "[CampaignRedActivity.onCreate]");
        setContentView(R.layout.activity_campaign_red);
    }
}
