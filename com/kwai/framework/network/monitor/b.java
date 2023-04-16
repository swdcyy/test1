package com.kwai.framework.network.monitor.b;
import java.lang.Runnable;
import java.lang.Object;
import com.kwai.framework.network.monitor.NetworkMonitorInitModule;
import wkd.b;
import tb6.b;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.utility.NetworkUtilsCached$a;
import com.yxcorp.utility.NetworkUtilsCached;

public final class b implements Runnable	// class@001804
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void run(){
       b uob = b.a(0x13545612);
       Objects.requireNonNull(uob);
       if (PatchProxy.applyVoid(null, uob, b.class, "2")) {
       }else {
          NetworkUtilsCached.n(uob);
       }
       return;
    }
}
