package com.yxcorp.gifshow.ad.util.b;
import ok.x;
import java.lang.Object;
import g59.i;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class b implements x	// class@00187a
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("enableRealtimePlayStats", false));
    }
}
