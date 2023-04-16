package com.kwai.component.perflog.monitor.JunkMonitor;
import com.kwai.component.perflog.monitor.JunkMonitor$a;
import nsd.u;
import fd5.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import com.kwai.component.perflog.monitor.JunkMonitor$commitDispatchList$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.component.perflog.monitor.JunkMonitor$enableFluencyFpsRate$2;
import com.kwai.component.perflog.monitor.JunkMonitor$junkMonitorSwitch$2;
import android.os.Build$VERSION;
import com.kwai.component.perflog.monitor.JunkMonitor$b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.view.Window$OnFrameMetricsAvailableListener;
import com.kwai.performance.fluency.fps.monitor.FpsMonitor;

public final class JunkMonitor	// class@000a0d
{
    public final List a;
    public long b;
    public long c;
    public int d;
    public int e;
    public String f;
    public final HashMap g;
    public final p h;
    public final p i;
    public final p j;
    public final JunkMonitor$b k;
    public final a l;
    public static final JunkMonitor$a m;

    static {
       JunkMonitor.m = new JunkMonitor$a(null);
    }
    public void JunkMonitor(a p0){
       a.p(p0, "stageRecorder");
       super();
       this.l = p0;
       this.a = new ArrayList();
       this.f = "";
       this.g = new HashMap();
       this.h = s.c(JunkMonitor$commitDispatchList$2.INSTANCE);
       this.i = s.c(JunkMonitor$enableFluencyFpsRate$2.INSTANCE);
       this.j = s.c(JunkMonitor$junkMonitorSwitch$2.INSTANCE);
       JunkMonitor$b uob = (Build$VERSION.SDK_INT >= 24)? new JunkMonitor$b(this): null;
       this.k = uob;
       return;
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, JunkMonitor.class, "5")) {
          return;
       }
       if (Build$VERSION.SDK_INT < 24) {
          return;
       }
       JunkMonitor tk = this.k;
       if (tk != null) {
          FpsMonitor.addOnFrameMetricsAvailableListener(this.f, tk);
       }
       return;
    }
}
