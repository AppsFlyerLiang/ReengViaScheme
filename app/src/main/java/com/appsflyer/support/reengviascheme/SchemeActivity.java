package com.appsflyer.support.reengviascheme;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.appsflyer.AppsFlyerLib;

public class SchemeActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(AppsFlyerLib.LOG_TAG, "[SchemeActivity.onCreate]");
        setContentView(R.layout.activity_scheme);
        AppsFlyerLib.getInstance().sendDeepLinkData(this);
        gotoCampaignByIntent(getIntent());
    }

    private void gotoCampaignByIntent(Intent intent) {
        Uri data = intent.getData();
        if(data!=null && data.getScheme().equals("reengviascheme")){
            String host = data.getHost();
            if(host.equals("red")){
                Intent newIntent=new Intent(this, CampaignRedActivity.class);
                newIntent.setData(intent.getData());  // Work around
                newIntent.setAction(intent.getAction()); // Work around
                startActivity(newIntent);
            } else if(host.equals("blue")) {
                Intent newIntent=new Intent(this, CampaignBlueActivity.class);
                newIntent.setData(intent.getData());  // Work around
                newIntent.setAction(intent.getAction()); // Work around
                startActivity(newIntent);
            } else {
                Log.w(AppsFlyerLib.LOG_TAG,"[gotoCampaignByIntent] host: [" + host +"]is not handled");
            }
        }
    }

}
