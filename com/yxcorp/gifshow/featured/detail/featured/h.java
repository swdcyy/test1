package com.yxcorp.gifshow.featured.detail.featured.h;
import erd.o;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import lda.v;
import java.util.concurrent.Callable;
import brd.t;

public final class h implements o	// class@000f0f
{
    public final CountDownLatch b;

    public void h(CountDownLatch p0){
       this.b = p0;
    }
    public final Object apply(Object p0){
       return t.fromCallable(new v(this.b, p0));
    }
}
