package com.kuaishou.commercial.perf.tracker.a;
import ok.x;
import java.lang.Object;
import hy.b;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class a implements x	// class@001514
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("BusinessNeoAPMSwitch", false));
    }
}
