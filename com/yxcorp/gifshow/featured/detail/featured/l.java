package com.yxcorp.gifshow.featured.detail.featured.l;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.featured.detail.featured.t;
import kda.e;
import java.lang.StringBuilder;
import java.lang.String;
import q87.c;
import com.yxcorp.gifshow.featured.feedprefetcher.api.model.DynamicPrefetchFeedResponse;

public final class l implements o	// class@000f13
{
    public static final l b;

    static {
       l.b = new l();
    }
    public void l(){
       super();
    }
    public final Object apply(Object p0){
       e uoe = e.C();
       StringBuilder str = "getLocalCacheObservable exception:";
       p0 = (p0 != null)? p0.getMessage(): "";
       Object[] objArray = new Object[0];
       uoe.w("NasaSlidePageList", str+p0, objArray);
       return new DynamicPrefetchFeedResponse();
    }
}
