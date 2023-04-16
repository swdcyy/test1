package com.yxcorp.gifshow.featured.detail.featured.j;
import erd.o;
import java.lang.Object;
import java.lang.Throwable;
import com.yxcorp.gifshow.featured.detail.featured.t;
import java.lang.StringBuilder;
import java.lang.String;
import pea.b;
import com.yxcorp.gifshow.featured.feedprefetcher.api.model.PrefetchHomeFeedResponse;

public final class j implements o	// class@000f11
{
    public static final j b;

    static {
       j.b = new j();
    }
    public void j(){
       super();
    }
    public final Object apply(Object p0){
       StringBuilder str = "PageList errorReturn:";
       p0 = (p0 != null)? p0.getMessage(): "";
       b.k(str+p0);
       return new PrefetchHomeFeedResponse();
    }
}
