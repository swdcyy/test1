package com.xiaomi.push.service.receivers.PingReceiver;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.StringBuilder;
import java.lang.String;
import rs8.c;
import com.xiaomi.push.service.XMPushService;
import ys8.v;
import java.lang.Object;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.Class;
import java.lang.System;
import ys8.a;
import java.lang.Throwable;
import ws8.d4;

public class PingReceiver extends BroadcastReceiver	// class@001191
{

    public void PingReceiver(){
       super();
    }
    public void onReceive(Context p0,Intent p1){
       c.t(p1.getPackage()+" is the package name");
       if (XMPushService.e()) {
          return;
       }
       if ((v.p).equals(p1.getAction())) {
          if (TextUtils.equals(p0.getPackageName(), p1.getPackage())) {
             String str = "Ping XMChannelService on timer";
             try{
                c.t(str);
                str = new Intent(p0, XMPushService.class);
                str.putExtra("time_stamp", System.currentTimeMillis());
                str.setAction("com.xiaomi.push.timer");
                a.h(p0).i(str);
             }catch(java.lang.Exception e4){
                c.o(e4);
             }
          }
       }else {
          c.l("cancel the old ping timer");
          d4.a();
       }
    }
}
