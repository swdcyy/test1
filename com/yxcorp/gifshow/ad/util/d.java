package com.yxcorp.gifshow.ad.util.d;
import ok.x;
import java.lang.Object;
import g59.i;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class d implements x	// class@00187c
{
    public static final d b;

    static {
       d.b = new d();
    }
    public void d(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("pauseAnimationWhenSliding", false));
    }
}
