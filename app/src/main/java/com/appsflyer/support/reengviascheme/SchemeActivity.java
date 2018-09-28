package com.appsflyer.support.reengviascheme;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.appsflyer.AppsFlyerConversionListener;
import com.appsflyer.AppsFlyerLib;

import java.util.Map;

//https://reengviasheme.onelink.me/gsho?pid=aftest&af_dp=reengviascheme%3A%2F%2Fred&is_retargeting=true

public class SchemeActivity extends AppCompatActivity implements AppsFlyerConversionListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(AppsFlyerLib.LOG_TAG, "[SchemeActivity.onCreate]");
        setContentView(R.layout.activity_scheme);
        AppsFlyerLib.getInstance().sendDeepLinkData(this);
        AppsFlyerLib.getInstance().registerConversionListener(this, this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AppsFlyerLib.getInstance().unregisterConversionListener();
    }

    @Override
    public void onInstallConversionDataLoaded(Map<String, String> map) {

    }

    @Override
    public void onInstallConversionFailure(String s) {

    }

    @Override
    public void onAppOpenAttribution(Map<String, String> map) {
        Log.d(AppsFlyerLib.LOG_TAG, "[onAppOpenAttribution]");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Log.d(AppsFlyerLib.LOG_TAG, entry.getKey() + "=" + entry.getValue());
        }

        String scheme=map.get("scheme");
        String host=map.get("host");
        String path=map.get("path");
        if(host.equals("red")){
            Intent newIntent=new Intent(this, CampaignRedActivity.class);
//            newIntent.setData(getIntent().getData());
            startActivity(newIntent);
            finish();
        } else if(host.equals("blue")) {
            Intent newIntent=new Intent(this, CampaignBlueActivity.class);
//            newIntent.setData(getIntent().getData());
            startActivity(newIntent);
            finish();
        } else {
            Log.w(AppsFlyerLib.LOG_TAG,"[gotoCampaignByIntent] host: [" + host +"]is not handled");
        }
    }

    @Override
    public void onAttributionFailure(String s) {

    }

}
