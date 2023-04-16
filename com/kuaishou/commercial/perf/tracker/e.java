package com.kuaishou.commercial.perf.tracker.e;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.String;
import yx.j0;

public final class e implements g	// class@001518
{
    public static final e b;

    static {
       e.b = new e();
    }
    public void e(){
       super();
    }
    public final void accept(Object p0){
       p0 = new Object[0];
       j0.c("ad_apm", "logger page first frame error", p0);
    }
}
