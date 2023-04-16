package com.kwai.component.perflog.monitor.JunkMonitor$enableFluencyFpsRate$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class JunkMonitor$enableFluencyFpsRate$2 extends Lambda implements a	// class@000a0b
{
    public static final JunkMonitor$enableFluencyFpsRate$2 INSTANCE;

    static {
       JunkMonitor$enableFluencyFpsRate$2.INSTANCE = new JunkMonitor$enableFluencyFpsRate$2();
    }
    public void JunkMonitor$enableFluencyFpsRate$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, JunkMonitor$enableFluencyFpsRate$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("FluencyFpsRate", false);
    }
}
