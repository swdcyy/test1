package com.kwai.component.perflog.monitor.JunkMonitor$commitDispatchList$2;
import msd.a;
import kotlin.jvm.internal.Lambda;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.sdk.switchconfig.a;

public final class JunkMonitor$commitDispatchList$2 extends Lambda implements a	// class@000a0a
{
    public static final JunkMonitor$commitDispatchList$2 INSTANCE;

    static {
       JunkMonitor$commitDispatchList$2.INSTANCE = new JunkMonitor$commitDispatchList$2();
    }
    public void JunkMonitor$commitDispatchList$2(){
       super(0);
    }
    public Object invoke(){
       return Boolean.valueOf(this.invoke());
    }
    public final boolean invoke(){
       Object obj = PatchProxy.apply(null, this, JunkMonitor$commitDispatchList$2.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return a.t().d("commitDispatchList", false);
    }
}
