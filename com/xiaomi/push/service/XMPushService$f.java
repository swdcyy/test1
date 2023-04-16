package com.xiaomi.push.service.XMPushService$f;
import android.content.BroadcastReceiver;
import com.xiaomi.push.service.XMPushService;
import android.content.Context;
import android.content.Intent;
import java.lang.StringBuilder;
import java.lang.String;
import ws8.m6;
import rs8.c;

public class XMPushService$f extends BroadcastReceiver	// class@00114a
{
    public final XMPushService a;

    public void XMPushService$f(XMPushService p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       c.l("network changed, "+m6.e(p1));
       this.a.onStart(p1, 1);
    }
}
