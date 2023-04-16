package com.kuaishou.merchant.home2.dynamic.feed.DynamicFeedRealShowPresenter;
import androidx.lifecycle.LifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.dynamic.feed.DynamicFeedRealShowPresenter$multiTabSelectCallback$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.merchant.home2.dynamic.feed.DynamicFeedRealShowPresenter$reportRunnable$2;
import java.util.HashMap;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import lx3.n;
import lx3.k;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import java.lang.Runnable;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.Integer;
import oy3.f;

public final class DynamicFeedRealShowPresenter extends PresenterV2 implements LifecycleObserver	// class@001746
{
    public BaseFragment p;
    public k q;
    public final p r;
    public final p s;
    public final HashMap t;
    public int u;
    public View v;

    public void DynamicFeedRealShowPresenter(){
       super();
       this.r = s.c(new DynamicFeedRealShowPresenter$multiTabSelectCallback$2(this));
       this.s = s.c(new DynamicFeedRealShowPresenter$reportRunnable$2(this));
       this.t = new HashMap();
       this.u = -1;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, DynamicFeedRealShowPresenter.class, "4")) {
          return;
       }
       DynamicFeedRealShowPresenter tq = this.q;
       if (tq == null) {
          a.S("multiTabService");
       }
       tq.c(this.P8());
       tq = this.p;
       if (tq == null) {
          a.S("rootFragment");
       }
       tq.getLifecycle().addObserver(this);
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, DynamicFeedRealShowPresenter.class, "6")) {
          return;
       }
       this.t.clear();
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, DynamicFeedRealShowPresenter.class, "5")) {
          return;
       }
       DynamicFeedRealShowPresenter tq = this.q;
       if (tq == null) {
          a.S("multiTabService");
       }
       tq.d(this.P8());
       tq = this.p;
       if (tq == null) {
          a.S("rootFragment");
       }
       tq.getLifecycle().removeObserver(this);
       tq = this.v;
       if (tq != null) {
          tq.removeCallbacks(this.R8());
       }
       return;
    }
    public final n P8(){
       Object obj = PatchProxy.apply(null, this, DynamicFeedRealShowPresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.r.getValue();
    }
    public final Runnable R8(){
       Object obj = PatchProxy.apply(null, this, DynamicFeedRealShowPresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.s.getValue();
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, DynamicFeedRealShowPresenter.class, "3")) {
          return;
       }
       this.p = this.r8("FEED_FRAGMENT");
       this.q = this.r8("MERCHANT_HOME_MULTI_TAB_SERVICE");
       return;
    }
    public final void reportRealShow(){
       if (PatchProxy.applyVoid(null, this, DynamicFeedRealShowPresenter.class, "11")) {
          return;
       }
       DynamicFeedRealShowPresenter tu = this.u;
       if (tu != -1) {
          f uof = this.t.get(Integer.valueOf(tu));
          if (uof != null) {
             uof.a();
          }
       }
       return;
    }
}
