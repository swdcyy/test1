package com.yxcorp.gifshow.featured.detail.featured.milano.presenter.g$a;
import qvb.q;
import com.yxcorp.gifshow.featured.detail.featured.milano.presenter.g;
import java.lang.Object;
import java.lang.Throwable;
import qvb.p;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import sy6.a;
import com.yxcorp.gifshow.model.response.feed.HomeFeedResponse;
import java.util.List;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.featured.feedprefetcher.config.c;
import java.lang.StringBuilder;
import pea.b;
import mea.c;
import com.yxcorp.gifshow.featured.feedprefetcher.api.model.UsePrefetchReason;

public class g$a implements q	// class@000f38
{
    public final g b;

    public void g$a(g p0){
       this.b = p0;
       super();
    }
    public void M1(boolean p0,Throwable p1){
       p0.y = false;
    }
    public void Z1(boolean p0,boolean p1){
       p0.y = true;
    }
    public boolean rg(){
       return p.e(this);
    }
    public void t5(boolean p0){
    }
    public void v2(boolean p0,boolean p1){
       g$a uoa = g$a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), Boolean.valueOf(p1), this, uoa, "1")) {
          return;
       }
       g$a tb = this.b;
       tb.y = false;
       if (tb.L == null) {
          List obj = tb.p.h0();
          if (obj instanceof HomeFeedResponse) {
             obj = obj.getItems();
             if (!q.f(obj)) {
                p1.M = obj.size();
                if (this.b.M > c.a()) {
                   obj.L = true;
                   b.d("feed finish loading, mFirstPageSize = "+this.b.M);
                   tb = this.b;
                   if (tb.B.mTriggerPrefetchAfterVideoCount == -1) {
                      tb.K = tb.M;
                      b.d("feed finish loading, mVideoViewCntThreshold = "+this.b.K);
                   }
                }
             }
          }
       }
       if (this.b.z != null) {
          b.d("feed finish loading, retry now");
          tb = this.b;
          tb.e9(tb.A);
       }
       return;
    }
}
