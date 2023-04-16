package com.yxcorp.gifshow.featured.detail.featured.g;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.featured.detail.featured.t;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Boolean;

public final class g implements x	// class@000f0e
{
    public static final g b;

    static {
       g.b = new g();
    }
    public void g(){
       super();
    }
    public final Object get(){
       return Boolean.valueOf(a.t().d("enablePrefetchVideoByAegonScore", false));
    }
}
