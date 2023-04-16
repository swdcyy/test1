package com.kwai.framework.network.monitor.NetworkMonitorInitModule;
import com.kwai.framework.init.TTIInitModule;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.AsyncTask;
import com.kwai.framework.network.monitor.d;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import android.app.Activity;
import com.kwai.framework.network.monitor.b;
import b76.a;
import com.kwai.framework.network.monitor.c;
import com.kwai.framework.init.e;
import android.os.Bundle;
import com.kwai.framework.network.monitor.a;

public class NetworkMonitorInitModule extends TTIInitModule	// class@0017fc
{
    public static final int q;

    public void NetworkMonitorInitModule(){
       super();
    }
    public int f0(){
       return 21;
    }
    public void i0(){
       if (PatchProxy.applyVoid(null, this, NetworkMonitorInitModule.class, "1")) {
          return;
       }
       AsyncTask.m.execute(d.b);
       return;
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkMonitorInitModule.class, "3")) {
          return;
       }
       AsyncTask.m.execute(b.b);
       return;
    }
    public void k0(a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NetworkMonitorInitModule.class, "4")) {
          return;
       }
       e.g(c.b, "NetworkMonitorInitModule");
       return;
    }
    public void l0(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, NetworkMonitorInitModule.class, "2")) {
          return;
       }
       AsyncTask.m.execute(a.b);
       return;
    }
}
