package com.kwai.component.homepage_interface.uxmonitor.UxMonitorExpUtil$feedUxMonitor$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import ub5.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;
import java.lang.reflect.Type;

public final class UxMonitorExpUtil$feedUxMonitor$2 extends Lambda implements a	// class@00097f
{
    public static final UxMonitorExpUtil$feedUxMonitor$2 INSTANCE;

    static {
       UxMonitorExpUtil$feedUxMonitor$2.INSTANCE = new UxMonitorExpUtil$feedUxMonitor$2();
    }
    public void UxMonitorExpUtil$feedUxMonitor$2(){
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final c invoke(){
       Object obj = PatchProxy.apply(null, this, UxMonitorExpUtil$feedUxMonitor$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return a.t().getValue("feed_ux_monitor", c.class, null);
    }
}
