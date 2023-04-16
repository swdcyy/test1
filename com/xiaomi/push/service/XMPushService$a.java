package com.xiaomi.push.service.XMPushService$a;
import android.content.BroadcastReceiver;
import com.xiaomi.push.service.XMPushService;
import java.lang.Object;
import com.xiaomi.push.service.y;
import android.os.Looper;
import java.lang.String;
import rs8.c;
import java.lang.StringBuilder;
import android.content.Context;
import android.content.Intent;
import java.lang.System;
import ys8.v;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Class;
import ys8.a;
import ws8.d4;

public class XMPushService$a extends BroadcastReceiver	// class@001145
{
    public final Object a;
    public final XMPushService b;

    public void XMPushService$a(XMPushService p0){
       this.b = p0;
       this.a = new Object();
    }
    public void XMPushService$a(XMPushService p0,y p1){
       super(p0);
    }
    public static void c(XMPushService$a p0){
       p0.a();
    }
    public final void a(){
       if (Looper.myLooper() == Looper.getMainLooper()) {
          c.u("[Alarm] Cannot perform lock.notifyAll in the UI thread!");
          return;
       }else {
          XMPushService$a ta = this.a;
          _monitor_enter(ta);
          try{
             this.a.notifyAll();
          }catch(java.lang.Exception e1){
             c.l("[Alarm] notify lock. "+e1);
          }
          _monitor_exit(ta);
          return;
       }
    }
    public final void b(long p0){
       if (Looper.myLooper() == Looper.getMainLooper()) {
          c.u("[Alarm] Cannot perform lock.wait in the UI thread!");
          return;
       }else {
          XMPushService$a ta = this.a;
          _monitor_enter(ta);
          try{
             this.a.wait(p0);
          }catch(java.lang.InterruptedException e3){
             c.l("[Alarm] interrupt from waiting state. "+e3);
          }
          _monitor_exit(ta);
          return;
       }
    }
    public void onReceive(Context p0,Intent p1){
       long l = System.currentTimeMillis();
       c.t("[Alarm] heartbeat alarm has been triggered.");
       if ((v.p).equals(p1.getAction())) {
          if (TextUtils.equals(p0.getPackageName(), p1.getPackage())) {
             c.t("[Alarm] Ping XMChannelService on timer");
             p1 = new Intent(p0, XMPushService.class);
             p1.putExtra("time_stamp", System.currentTimeMillis());
             p1.setAction("com.xiaomi.push.timer");
             a.h(p0).i(p1);
             this.b(3000);
             c.l("[Alarm] heartbeat alarm finish in "+(System.currentTimeMillis() - l));
          }
       }else {
          c.l("[Alarm] cancel the old ping timer");
          d4.a();
       }
       return;
    }
}
