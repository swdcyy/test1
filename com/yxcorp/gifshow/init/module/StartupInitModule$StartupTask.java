package com.yxcorp.gifshow.init.module.StartupInitModule$StartupTask;
import java.lang.Thread;
import java.lang.String;
import lnc.d0;
import java.util.Map;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wkd.b;
import ob6.p;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import brd.a0;
import com.yxcorp.gifshow.init.module.u0;
import com.yxcorp.gifshow.init.module.v0;
import erd.g;
import crd.b;
import com.kwai.framework.cache.CacheManager;

public class StartupInitModule$StartupTask extends Thread	// class@0019a0
{
    public boolean b;
    public static final int c;

    public void StartupInitModule$StartupTask(boolean p0){
       super("startup-task");
       this.b = p0;
       _monitor_enter(d0.class);
       d0.a.clear();
       d0.b.clear();
       _monitor_exit(d0.class);
    }
    public void run(){
       if (PatchProxy.applyVoidWithListener(null, this, StartupInitModule$StartupTask.class, "1")) {
          return;
       }
       if (this.b == null) {
          a0 uoa0 = b.a(0x36463d96).j(RequestTiming.ON_FOREGROUND);
          uoa0.R(u0.b, uoa0.b);
       }
       b.a(0x5f2ddeb4).f(true);
       PatchProxy.onMethodExit(StartupInitModule$StartupTask.class, "1");
       return;
    }
}
