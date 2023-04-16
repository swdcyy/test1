package com.yxcorp.gifshow.featured.feedprefetcher.config.b;
import ok.x;
import java.lang.Object;
import com.yxcorp.gifshow.featured.feedprefetcher.config.c;
import com.kwai.sdk.switchconfig.a;
import java.lang.String;
import java.lang.Long;

public final class b implements x	// class@000fb4
{
    public static final b b;

    static {
       b.b = new b();
    }
    public void b(){
       super();
    }
    public final Object get(){
       return Long.valueOf(a.t().b("prefetchCacheSizeUpdateDuration", 0x493e0));
    }
}
