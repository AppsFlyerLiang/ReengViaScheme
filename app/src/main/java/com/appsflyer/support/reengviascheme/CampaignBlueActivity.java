package com.appsflyer.support.reengviascheme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.appsflyer.AppsFlyerLib;

public class CampaignBlueActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(AppsFlyerLib.LOG_TAG, "[CampaignBlueActivity.onCreate]");
        setContentView(R.layout.activity_campaign_blue);
    }
}
