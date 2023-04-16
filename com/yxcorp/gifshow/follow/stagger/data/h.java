package com.yxcorp.gifshow.follow.stagger.data.h;
import io.reactivex.g;
import com.yxcorp.gifshow.follow.stagger.data.i;
import java.lang.Object;
import brd.v;
import java.util.Objects;
import wkd.b;
import ob5.a;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.util.List;
import java.util.Collection;
import ekd.q;
import java.lang.System;
import lnc.c2;
import pia.k;
import b06.d;
import qvb.n0$a;
import brd.g;

public final class h implements g	// class@001177
{
    public final i b;

    public void h(i p0){
       this.b = p0;
    }
    public final void subscribe(v p0){
       boolean b;
       h tb = this.b;
       Objects.requireNonNull(tb);
       HomeFeedResponse homeFeedResp = b.a(-1684107285).e(2);
       long l = (homeFeedResp != null && (q.f(homeFeedResp.getItems()) || System.currentTimeMillis() - homeFeedResp.mPrefetchExpiredDate > 0))? 1: 0;
       if (homeFeedResp != null && (!q.f(homeFeedResp.getItems()) && l)) {
          b = (System.currentTimeMillis() - homeFeedResp.mPrefetchExpiredDate > 0)? true: false;
          homeFeedResp.mIsPrefetchExpired = b;
          List items = homeFeedResp.getItems();
          if (!q.f(items)) {
             c2[] uoc2Array = new c2[]{new k(tb, items.size())};
             d.e(items, uoc2Array);
             p0.onNext(new n0$a(homeFeedResp, 0, 1));
          }
       }else {
          p0.onComplete();
       }
       return;
    }
}
