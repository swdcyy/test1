package com.yxcorp.gifshow.featured.detail.a;
import erd.o;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import brd.t;

public final class a implements o	// class@000e96
{
    public static final a b;

    static {
       a.b = new a();
    }
    public void a(){
       super();
    }
    public final Object apply(Object p0){
       p0 = (p0 == null)? t.just(new HomeFeedResponse()): t.just(p0);
       return p0;
    }
}
