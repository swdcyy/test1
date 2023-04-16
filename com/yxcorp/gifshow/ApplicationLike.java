package com.yxcorp.gifshow.ApplicationLike;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Configuration;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import z1.k;
import android.content.Intent;
import java.lang.String;
import android.os.Handler;

public interface abstract ApplicationLike	// class@001026
{

    void attachBaseContext(Context p0);
    Resources getResources(Resources p0);
    void onConfigurationChanged(Configuration p0);
    void onCreate();
    void onLowMemory();
    void onTerminate();
    void onTrimMemory(int p0);
    Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,int p2,k p3);
    Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,String p2,Handler p3,int p4,k p5);
    Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,String p2,Handler p3,k p4);
    Intent registerReceiver(BroadcastReceiver p0,IntentFilter p1,k p2);
}
