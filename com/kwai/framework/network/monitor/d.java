package com.kwai.framework.network.monitor.d;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.network.monitor.NetworkMonitorInitModule;
import wkd.b;
import com.kwai.framework.network.monitor.IPv6AddressMonitor;
import o56.a;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.content.IntentFilter;
import android.content.Context;
import android.content.BroadcastReceiver;
import android.content.Intent;
import com.kwai.performance.component.manager.receiver.UniversalReceiver;
import xb6.a;
import java.lang.Throwable;
import q87.c;

public final class d implements Runnable	// class@001806
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final void run(){
       Application b;
       IPv6AddressMonitor iPv6AddressM = b.a(-1554820802);
       b = a.B;
       Objects.requireNonNull(iPv6AddressM);
       if (PatchProxy.applyVoidOneRefs(b, iPv6AddressM, IPv6AddressMonitor.class, "1")) {
       }else if(iPv6AddressM.c == null){
          iPv6AddressM.c = true;
          try{
             UniversalReceiver.e(b, iPv6AddressM, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
          }catch(java.lang.Exception e0){
             a.C().v("IPv6AddressMonitor", "Register failed.", e0);
          }
       }else {
          Object[] objArray = new Object[0];
          a.C().s("IPv6AddressMonitor", "Already registered, ignore.", objArray);
       }
    }
}
