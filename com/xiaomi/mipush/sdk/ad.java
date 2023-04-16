package com.xiaomi.mipush.sdk.ad;
import android.content.BroadcastReceiver;
import com.xiaomi.mipush.sdk.NotificationClickedActivity;
import android.content.Context;
import android.content.Intent;
import java.lang.String;
import rs8.c;
import android.app.Activity;

public class ad extends BroadcastReceiver	// class@0010e7
{
    public final NotificationClickedActivity a;

    public void ad(NotificationClickedActivity p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       c.s("clicked activity finish by normal.");
       this.a.finish();
    }
}
