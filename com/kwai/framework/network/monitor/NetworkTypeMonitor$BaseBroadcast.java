package com.kwai.framework.network.monitor.NetworkTypeMonitor$BaseBroadcast;
import android.content.BroadcastReceiver;
import com.kwai.framework.network.monitor.NetworkTypeMonitor;
import android.content.Context;
import android.content.Intent;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import o56.a;
import android.net.NetworkInfo;
import ekd.p0;
import org.greenrobot.eventbus.a;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$b;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$c;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$d;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$a;
import java.lang.StringBuilder;
import java.lang.System;
import f3b.k;

public class NetworkTypeMonitor$BaseBroadcast extends BroadcastReceiver	// class@0017fd
{
    public final NetworkTypeMonitor a;

    public void NetworkTypeMonitor$BaseBroadcast(NetworkTypeMonitor p0){
       this.a = p0;
       super();
    }
    public void onReceive(Context p0,Intent p1){
       NetworkTypeMonitor$BaseBroadcast ta;
       NetworkTypeMonitor a;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NetworkTypeMonitor$BaseBroadcast.class, "1")) {
          return;
       }
       if ((p1.getAction()).equals("android.net.conn.CONNECTIVITY_CHANGE")) {
          ta = this.a;
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoid(null, ta, NetworkTypeMonitor.class, "2")) {
             boolean b = true;
             NetworkInfo networkInfo = p0.f(a.B, b);
             a = ta.a;
             if (a != networkInfo && (a == null || (networkInfo == null || a.getType() != networkInfo.getType()))) {
                ta.a = networkInfo;
                a.d().k(new NetworkTypeMonitor$b(ta));
                if (networkInfo == null) {
                   a.d().k(new NetworkTypeMonitor$c(ta));
                }else if(networkInfo.getType() == b){
                   a.d().k(new NetworkTypeMonitor$d(ta));
                }else if(!networkInfo.getType()){
                   a.d().k(new NetworkTypeMonitor$a(ta));
                }
             }
          }
       }
       ta.b = a.a+"_"+System.currentTimeMillis();
       ta.c = k.b(a.B);
       return;
    }
}
