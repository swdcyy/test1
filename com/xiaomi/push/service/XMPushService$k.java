package com.xiaomi.push.service.XMPushService$k;
import android.content.BroadcastReceiver;
import com.xiaomi.push.service.XMPushService;
import android.content.Context;
import android.content.Intent;
import java.lang.StringBuilder;
import java.lang.String;
import ws8.m6;
import rs8.c;
import android.os.Bundle;

public class XMPushService$k extends BroadcastReceiver	// class@00114f
{
    public final XMPushService a;

    public void XMPushService$k(XMPushService p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       c.l("[HB] hold short heartbeat, "+m6.e(p1));
       if (p1 != null && p1.getExtras() != null) {
          this.a.onStart(p1, 1);
       }
       return;
    }
}
