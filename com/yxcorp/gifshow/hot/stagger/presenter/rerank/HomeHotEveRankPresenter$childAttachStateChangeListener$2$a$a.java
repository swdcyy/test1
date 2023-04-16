package com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$childAttachStateChangeListener$2$a$a;
import java.lang.Runnable;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$childAttachStateChangeListener$2$a;
import java.lang.Object;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenterKt;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.System;
import java.lang.Long;
import lnc.z9;
import vsd.n;
import lnc.y9;
import java.lang.Integer;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter$childAttachStateChangeListener$2;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotEveRankPresenter;
import com.kuaishou.eve.kit.rerank.model.RerankPhoto;
import e50.g;

public final class HomeHotEveRankPresenter$childAttachStateChangeListener$2$a$a implements Runnable	// class@0018b8
{
    public final HomeHotEveRankPresenter$childAttachStateChangeListener$2$a b;
    public final Object c;

    public void HomeHotEveRankPresenter$childAttachStateChangeListener$2$a$a(HomeHotEveRankPresenter$childAttachStateChangeListener$2$a p0,Object p1){
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void run(){
       HomeHotEveRankPresenterKt homeHotEveRa = HomeHotEveRankPresenterKt.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeHotEveRankPresenter$childAttachStateChangeListener$2$a$a.class, "1")) {
          return;
       }
       HomeHotEveRankPresenter$childAttachStateChangeListener$2$a$a tc = this.c;
       long l = System.currentTimeMillis();
       if (!PatchProxy.isSupport(homeHotEveRa) || !PatchProxy.applyVoidTwoRefs(tc, Long.valueOf(l), objArray, homeHotEveRa, "2")) {
          HomeHotEveRankPresenterKt.b.f(tc, HomeHotEveRankPresenterKt.a[0], Long.valueOf(l));
       }
       tc = this.c;
       int i = HomeHotEveRankPresenterKt.b(tc) + 1;
       if (!PatchProxy.isSupport(homeHotEveRa) || !PatchProxy.applyVoidTwoRefs(tc, Integer.valueOf(i), objArray, homeHotEveRa, "6")) {
          HomeHotEveRankPresenterKt.d.f(tc, HomeHotEveRankPresenterKt.a[2], Integer.valueOf(i));
       }
       this.b.b.this$0.y.i(new RerankPhoto(this.c));
       return;
    }
}
