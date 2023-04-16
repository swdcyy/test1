package com.yxcorp.gifshow.featured.detail.featured.k;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.featured.detail.featured.t;
import lnc.i3;
import java.lang.String;
import android.util.Log;
import k2b.u1;
import java.lang.StringBuilder;
import pea.b;
import com.yxcorp.gifshow.featured.feedprefetcher.api.model.PrefetchHomeFeedResponse;

public final class k implements o	// class@000f12
{
    public static final k b;

    static {
       k.b = new k();
    }
    public void k(){
       super();
    }
    public final Object apply(Object p0){
       i3 oi3 = i3.f();
       oi3.d("exception", Log.getStackTraceString(p0));
       u1.R("NASA_PREFETCH_CACHE_RERANK_ORDER", oi3.e(), 14);
       b.k("getLocalCacheObservable exception:"+Log.getStackTraceString(p0));
       return new PrefetchHomeFeedResponse();
    }
}
