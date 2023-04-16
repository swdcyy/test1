package com.kwai.framework.network.monitor.a;
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

public final class a implements Runnable	// class@001803
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final void run(){
       b uob = b.a(0x13545612);
       Objects.requireNonNull(uob);
       if (PatchProxy.applyVoid(null, uob, b.class, "1")) {
       }else {
          NetworkUtilsCached.m(uob);
       }
       return;
    }
}
