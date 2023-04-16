package com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import android.content.BroadcastReceiver;
import java.lang.Object;
import android.content.Context;
import vs8.x;
import vs8.f0;
import android.content.Intent;
import android.content.ComponentName;
import java.lang.String;
import ys8.a;
import java.lang.Throwable;
import rs8.c;
import ws8.b6;
import ws8.k0;
import vs8.r;
import com.xiaomi.mipush.sdk.au;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.e;
import vs8.f;
import vs8.b;
import vs8.e;
import android.os.Handler;
import ws8.z6;
import zs8.a;
import java.lang.Runnable;

public class NetworkStatusReceiver extends BroadcastReceiver	// class@001190
{
    public boolean b;
    public static boolean a;

    public void NetworkStatusReceiver(){
       super();
       this.b = false;
       this.b = true;
    }
    public void NetworkStatusReceiver(Object p0){
       this.b = false;
       NetworkStatusReceiver.a = true;
    }
    public static void a(NetworkStatusReceiver p0,Context p1){
       p0.a(p1);
    }
    public static boolean a(){
       return NetworkStatusReceiver.a;
    }
    public final void a(Context p0){
       String str;
       au c;
       if (!x.l(p0).J() && (f0.d(p0).s() && !f0.d(p0).y())) {
          try{
             Intent intent = new Intent();
             intent.setComponent(new ComponentName(p0, "com.xiaomi.push.service.XMPushService"));
             intent.setAction("com.xiaomi.push.network_status_changed");
             a.h(p0).i(intent);
          }catch(java.lang.Exception e0){
             c.o(e0);
          }
       }
    }
    public void onReceive(Context p0,Intent p1){
       if (this.b != null) {
          return;
       }
       z6.c().post(new a(this, p0));
       return;
    }
}
