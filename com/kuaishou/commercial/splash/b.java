package com.kuaishou.commercial.splash.b;
import erd.g;
import java.lang.Object;
import java.lang.Throwable;
import com.kuaishou.gifshow.network.degrade.RequestTiming;
import java.lang.String;
import com.kuaishou.commercial.splash.i;

public final class b implements g	// class@0015a3
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final void accept(Object p0){
       i.m(RequestTiming.ON_FOREGROUND, true, p0.getMessage());
    }
}
