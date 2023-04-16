package com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter$DelegatePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import msd.a;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter$DelegatePresenter$logTag$1;
import com.kuaishou.live.external.lite.LiteLazyLoadRecommendBarPresenter$DelegatePresenter$realPresenter$2;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import u33.b;
import pp.c;
import java.lang.StringBuilder;
import com.kuaishou.android.live.log.b;
import android.view.View;
import com.kwai.robust.PatchProxyResult;

public final class LiteLazyLoadRecommendBarPresenter$DelegatePresenter extends PresenterV2	// class@001ba2
{
    public final a p;
    public final p q;
    public boolean r;
    public boolean s;
    public final a t;
    public final a u;

    public void LiteLazyLoadRecommendBarPresenter$DelegatePresenter(a p0,a p1){
       a.p(p0, "rootViewSupplier");
       a.p(p1, "contextSupplier");
       super();
       this.t = p0;
       this.u = p1;
       this.p = LiteLazyLoadRecommendBarPresenter$DelegatePresenter$logTag$1.INSTANCE;
       this.q = s.c(LiteLazyLoadRecommendBarPresenter$DelegatePresenter$realPresenter$2.INSTANCE);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, LiteLazyLoadRecommendBarPresenter$DelegatePresenter.class, "3")) {
          return;
       }
       Object obj = this.u.invoke();
       LiteLazyLoadRecommendBarPresenter$DelegatePresenter tp = this.p;
       if (tp != null) {
          tp = new b(tp);
       }
       b.Z(tp, "onBind, context: "+obj);
       Object[] objArray = new Object[]{obj};
       this.P8().i(objArray);
       this.s = true;
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, LiteLazyLoadRecommendBarPresenter$DelegatePresenter.class, "2")) {
          return;
       }
       View view = this.t.invoke();
       LiteLazyLoadRecommendBarPresenter$DelegatePresenter tp = this.p;
       if (tp != null) {
          tp = new b(tp);
       }
       b.Z(tp, "onCreate, view: "+view);
       if (view != null) {
          this.P8().f(view);
          this.r = true;
       }
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, LiteLazyLoadRecommendBarPresenter$DelegatePresenter.class, "5")) {
          return;
       }
       LiteLazyLoadRecommendBarPresenter$DelegatePresenter tp = this.p;
       if (tp != null) {
          tp = new b(tp);
       }
       b.Z(tp, "onDestroy, hasCreate: "+this.r);
       if (this.r != null) {
          this.P8().destroy();
          this.r = false;
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LiteLazyLoadRecommendBarPresenter$DelegatePresenter.class, "4")) {
          return;
       }
       LiteLazyLoadRecommendBarPresenter$DelegatePresenter tp = this.p;
       if (tp != null) {
          tp = new b(tp);
       }
       b.Z(tp, "onUnbind, hasBind: "+this.s);
       if (this.s != null) {
          this.P8().unbind();
          this.s = false;
       }
       return;
    }
    public final PresenterV2 P8(){
       Object obj = PatchProxy.applyWithListener(null, this, LiteLazyLoadRecommendBarPresenter$DelegatePresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       PatchProxy.onMethodExit(LiteLazyLoadRecommendBarPresenter$DelegatePresenter.class, "1");
       return this.q.getValue();
    }
}
