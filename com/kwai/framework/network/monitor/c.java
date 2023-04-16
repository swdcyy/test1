package com.kwai.framework.network.monitor.c;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.network.monitor.NetworkMonitorInitModule;
import wkd.b;
import com.kwai.framework.network.monitor.NetworkTypeMonitor;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.IntentFilter;
import o56.a;
import com.kwai.framework.network.monitor.NetworkTypeMonitor$BaseBroadcast;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import xb6.a;
import java.lang.Throwable;
import q87.c;

public final class c implements Runnable	// class@001805
{
    public static final c b;

    static {
       c.b = new c();
    }
    public void c(){
       super();
    }
    public final void run(){
       NetworkTypeMonitor networkTypeM = b.a(0x34606e83);
       Objects.requireNonNull(networkTypeM);
       if (PatchProxy.applyVoid(null, networkTypeM, NetworkTypeMonitor.class, "1")) {
       }else {
          try{
             IntentFilter intentFilter = new IntentFilter();
             intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
             UniversalReceiver.e(a.B, new NetworkTypeMonitor$BaseBroadcast(networkTypeM), intentFilter);
          }catch(java.lang.Exception e0){
             a.C().v("NetworkTypeMonitor", "Register failed. ", e0);
          }
       }
    }
}
