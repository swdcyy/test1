package com.yxcorp.gifshow.relation.explore.presenter.p;
import com.yxcorp.gifshow.relation.explore.presenter.n;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import io.reactivex.subjects.PublishSubject;
import com.yxcorp.gifshow.relation.feed.presenter.FeedBigCardStatePresenter;
import java.lang.Integer;
import g9c.a;
import com.kwai.framework.model.user.RecoUser;
import java.util.Collection;
import ekd.q;
import java.util.List;
import com.yxcorp.gifshow.log.c0;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.concurrent.TimeUnit;
import brd.t;
import hac.a1;
import erd.g;
import crd.b;

public class p extends n	// class@00185d
{
    public b h1;
    public PublishSubject i1;

    public void p(){
       super();
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, p.class, "7")) {
          return;
       }
       super.J8();
       this.y9();
       return;
    }
    public void S8(){
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, p.class, "1")) {
          return;
       }
       super.j8();
       this.i1 = this.r8("PYMK_ACCESS_IDScard_play");
       return;
    }
    public void j9(){
       if (PatchProxy.applyVoid(null, this, p.class, "6")) {
          return;
       }
       super.j9();
       this.i1.onNext(Integer.valueOf(301));
       return;
    }
    public void m9(){
       if (PatchProxy.applyVoid(null, this, p.class, "5")) {
          return;
       }
       RecoUser recoUser = this.Z0.N0(0);
       if (recoUser != null && (!q.f(recoUser.mFeedList) && recoUser.mFeedList.get(0) != null)) {
          c0.q().k(recoUser.mFeedList.get(0));
       }
    label_0036 :
       return;
    }
    public void o9(){
       if (PatchProxy.applyVoid(null, this, p.class, "2")) {
          return;
       }
       this.y9();
       this.h1 = t.timer(100, TimeUnit.MILLISECONDS).subscribe(new a1(this));
       return;
    }
    public void q9(){
       if (PatchProxy.applyVoid(null, this, p.class, "4")) {
          return;
       }
       this.y9();
       this.i1.onNext(Integer.valueOf(301));
       return;
    }
    public final void y9(){
       if (PatchProxy.applyVoid(null, this, p.class, "3")) {
          return;
       }
       p th1 = this.h1;
       if (th1 != null) {
          th1.dispose();
       }
       return;
    }
}
