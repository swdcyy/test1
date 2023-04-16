package com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter$childAttachStateChangeListener$2$a;
import androidx.recyclerview.widget.RecyclerView$o;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter$childAttachStateChangeListener$2;
import java.lang.Object;
import android.view.View;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import kp.r1;
import java.lang.System;
import com.yxcorp.gifshow.hot.stagger.presenter.rerank.HomeHotRankPresenter;
import com.kuaishou.eve.kit.rerank.BizPage;
import e50.m;
import j50.a;
import j50.b;
import hf6.b;
import java.util.Objects;
import ff6.d;
import g50.c;
import com.kuaishou.eve.kit.rerank.config.RankABParam;
import ekd.k1;
import java.util.List;
import ff6.c;
import java.lang.Runnable;
import t45.c;

public final class HomeHotRankPresenter$childAttachStateChangeListener$2$a implements RecyclerView$o	// class@0018ca
{
    public final HomeHotRankPresenter$childAttachStateChangeListener$2 b;

    public void HomeHotRankPresenter$childAttachStateChangeListener$2$a(HomeHotRankPresenter$childAttachStateChangeListener$2 p0){
       this.b = p0;
       super();
    }
    public void m3(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeHotRankPresenter$childAttachStateChangeListener$2$a.class, "2")) {
          return;
       }
       a.p(p0, "view");
       p0 = p0.getTag(R.id.item_view_bind_data);
       if (p0 != null && (p0 instanceof QPhoto && !r1.G2(p0.mEntity))) {
          r1.O4(p0.mEntity, System.currentTimeMillis());
          HomeHotRankPresenter$childAttachStateChangeListener$2 this$0 = this.b.this$0;
          HomeHotRankPresenter t = this$0.t;
          if (t != null) {
             QPhoto mEntity = p0.mEntity;
             a.o(mEntity, "data.mEntity");
             a uoa = new a(mEntity);
             String str = "explore_feature";
             if (t.o0(this$0.x.b().getBizId(), str, uoa)) {
                HomeHotRankPresenter x = this.b.this$0.x;
                Objects.requireNonNull(x);
                if (PatchProxy.applyVoid(null, x, d.class, "9") || (x.isEnabled() && k1.l(x.d().c().getRankEsUploadRatio()))) {
                   d h = x.h;
                   if (h != null) {
                      c.a(new c(h.p0(x.b().getBizId(), "user_feature"), h.p0(x.b().getBizId(), str), x));
                   }
                }
             }
          }
       }
       return;
    }
    public void w6(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeHotRankPresenter$childAttachStateChangeListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "view");
       p0 = p0.getTag(R.id.item_view_bind_data);
       if (p0 != null && (p0 instanceof QPhoto && !r1.G2(p0.mEntity))) {
          r1.N4(p0.mEntity, System.currentTimeMillis());
       }
    label_0030 :
       return;
    }
}
