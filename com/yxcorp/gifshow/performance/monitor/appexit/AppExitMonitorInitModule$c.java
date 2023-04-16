package com.yxcorp.gifshow.performance.monitor.appexit.AppExitMonitorInitModule$c;
import java.lang.Runnable;
import java.lang.String;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.performance.stability.app.exit.monitor.AppExitMonitor;
import com.kwai.performance.monitor.base.Monitor;
import yf7.k;

public final class AppExitMonitorInitModule$c implements Runnable	// class@000e4e
{
    public final String b;

    public void AppExitMonitorInitModule$c(String p0){
       this.b = p0;
       super();
    }
    public final void run(){
       if (PatchProxy.applyVoid(null, this, AppExitMonitorInitModule$c.class, "1")) {
          return;
       }
       k.d(AppExitMonitor.class).setProcessState(true, this.b);
       return;
    }
}
