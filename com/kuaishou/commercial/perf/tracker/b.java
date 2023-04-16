package com.kuaishou.commercial.perf.tracker.b;
import ok.x;
import java.lang.Object;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class b implements x	// class@001515
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("AdFpsMonitor", false));
    }
}
