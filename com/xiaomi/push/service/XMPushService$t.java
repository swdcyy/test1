package com.xiaomi.push.service.XMPushService$t;
import android.content.BroadcastReceiver;
import com.xiaomi.push.service.XMPushService;
import android.content.Context;
import android.content.Intent;
import java.lang.StringBuilder;
import java.lang.String;
import ws8.m6;
import rs8.c;

public class XMPushService$t extends BroadcastReceiver	// class@001158
{
    public final XMPushService a;

    public void XMPushService$t(XMPushService p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       if (!XMPushService.b(this.a)) {
          XMPushService.a(this.a, true);
       }
       c.l("[HB] wifi changed, "+m6.e(p1));
       this.a.onStart(p1, true);
       return;
    }
}
