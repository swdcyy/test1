package com.kwai.component.perflog.monitor.JunkMonitor$junkMonitorSwitch$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class JunkMonitor$junkMonitorSwitch$2 extends Lambda implements a	// class@000a0c
{
    public static final JunkMonitor$junkMonitorSwitch$2 INSTANCE;

    static {
       JunkMonitor$junkMonitorSwitch$2.INSTANCE = new JunkMonitor$junkMonitorSwitch$2();
    }
    public void JunkMonitor$junkMonitorSwitch$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, JunkMonitor$junkMonitorSwitch$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("enableJunkMonitor", false);
    }
}
