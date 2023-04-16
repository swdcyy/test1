package com.yxcorp.gifshow.follow.slide.detail.presenter.FollowSlideRecoFeedRecordPresenter$b;
import g7c.a;
import com.kwai.framework.model.feed.BaseFeed;
import java.lang.Object;
import rq4.r;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import kotlin.jvm.internal.a;
import rq4.n;
import kp.r1;
import rq4.o;
import rq4.m;

public final class FollowSlideRecoFeedRecordPresenter$b implements a	// class@00112e
{
    public final BaseFeed a;

    public void FollowSlideRecoFeedRecordPresenter$b(BaseFeed p0){
       this.a = p0;
       super();
    }
    public final r a(r p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowSlideRecoFeedRecordPresenter$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "clientLog");
       if (p0.g == null) {
          p0.g = new n();
       }
       p0.g.i = r1.M0(this.a);
       if (p0.h == null) {
          p0.h = new o();
       }
       p0.h.a = r1.t1(this.a);
       if (p0.e == null) {
          p0.e = new m();
       }
       p0.e.j = "DETAIL";
       return p0;
    }
}
