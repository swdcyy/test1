package com.yxcorp.gifshow.performance.monitor.io.IOMonitorInitModule$b;
import fw8.b;
import android.app.Activity;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kwai.performance.overhead.io.monitor.IoMonitor;
import com.kwai.performance.monitor.base.Monitor;
import yf7.k;

public final class IOMonitorInitModule$b extends b	// class@0012ba
{

    public void IOMonitorInitModule$b(){
       super();
    }
    public void onActivityPostResumed(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, IOMonitorInitModule$b.class, "1")) {
          return;
       }
       a.p(p0, "activity");
       String localClassNa = p0.getLocalClassName();
       a.o(localClassNa, "activity.localClassName");
       k.d(IoMonitor.class).setCurrentActivity(localClassNa);
       return;
    }
}
