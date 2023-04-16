package com.xiaomi.push.service.XMPushService$r;
import android.content.BroadcastReceiver;
import com.xiaomi.push.service.XMPushService;
import android.content.Context;
import android.content.Intent;

public class XMPushService$r extends BroadcastReceiver	// class@001156
{
    public final XMPushService a;

    public void XMPushService$r(XMPushService p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       this.a.onStart(p1, 1);
    }
}
