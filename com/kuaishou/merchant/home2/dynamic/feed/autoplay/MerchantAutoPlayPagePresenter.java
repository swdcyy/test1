package com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayPagePresenter;
import androidx.lifecycle.LifecycleObserver;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayPagePresenter$a;
import nsd.u;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayPagePresenter$dispatcherRunnable$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayPagePresenter$multiTabSelectCallback$2;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import java.lang.String;
import kotlin.jvm.internal.a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import lx3.n;
import lx3.k;
import androidx.lifecycle.Lifecycle;
import androidx.fragment.app.Fragment;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayPagePresenter$b;
import erd.g;
import crd.b;
import brd.t;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayPagePresenter$c;
import tkd.b;
import tkd.d;
import os5.l;
import com.kuaishou.merchant.home2.dynamic.feed.autoplay.MerchantAutoPlayPagePresenter$d;
import java.lang.Runnable;
import android.view.View;
import com.kwai.robust.PatchProxyResult;
import v99.a;
import s99.d;
import px3.l;
import nw3.a;
import q87.c;
import lx3.l;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.autoplay.dispatch.AutoPlayScrollDispatcher;
import r99.i;
import px3.j;
import com.yxcorp.gifshow.autoplay.dispatch.AutoPlayScrollDispatcher$a;

public final class MerchantAutoPlayPagePresenter extends PresenterV2 implements LifecycleObserver	// class@001758
{
    public BaseFragment p;
    public k q;
    public a r;
    public t s;
    public t t;
    public View u;
    public final p v;
    public final p w;
    public static final MerchantAutoPlayPagePresenter$a x;

    static {
       MerchantAutoPlayPagePresenter.x = new MerchantAutoPlayPagePresenter$a(null);
    }
    public void MerchantAutoPlayPagePresenter(){
       super();
       this.v = s.c(new MerchantAutoPlayPagePresenter$dispatcherRunnable$2(this));
       this.w = s.c(new MerchantAutoPlayPagePresenter$multiTabSelectCallback$2(this));
    }
    public static final BaseFragment P8(MerchantAutoPlayPagePresenter p0){
       p0 = p0.p;
       if (p0 == null) {
          a.S("rootFragment");
       }
       return p0;
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, MerchantAutoPlayPagePresenter.class, "4")) {
          return;
       }
       MerchantAutoPlayPagePresenter tq = this.q;
       if (tq == null) {
          a.S("multiTabService");
       }
       tq.c(this.S8());
       tq = this.p;
       if (tq == null) {
          a.S("rootFragment");
       }
       tq.getLifecycle().addObserver(this);
       tq = this.t;
       if (tq != null) {
          this.X7(tq.subscribe(new MerchantAutoPlayPagePresenter$b(this)));
       }
       tq = this.s;
       if (tq == null) {
          a.S("buyerFragmentHiddenObservable");
       }
       this.X7(tq.subscribe(new MerchantAutoPlayPagePresenter$c(this)));
       this.X7(d.a(-1492894991).Jy().subscribe(new MerchantAutoPlayPagePresenter$d(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, MerchantAutoPlayPagePresenter.class, "5")) {
          return;
       }
       this.stopAllPlayCard();
       MerchantAutoPlayPagePresenter tq = this.q;
       if (tq == null) {
          a.S("multiTabService");
       }
       tq.d(this.S8());
       tq = this.u;
       if (tq != null) {
          tq.removeCallbacks(this.R8());
       }
       tq = this.p;
       String str = "rootFragment";
       if (tq == null) {
          a.S(str);
       }
       tq.getLifecycle().removeObserver(this);
       tq = this.p;
       if (tq == null) {
          a.S(str);
       }
       View view = tq.getView();
       if (view != null) {
          view.removeCallbacks(this.R8());
       }
       return;
    }
    public final Runnable R8(){
       Object obj = PatchProxy.apply(null, this, MerchantAutoPlayPagePresenter.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.v.getValue();
    }
    public final n S8(){
       Object obj = PatchProxy.apply(null, this, MerchantAutoPlayPagePresenter.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.w.getValue();
    }
    public void j8(){
       MerchantAutoPlayPagePresenter merchantAuto = MerchantAutoPlayPagePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, merchantAuto, "3")) {
          return;
       }
       this.p = this.r8("FEED_FRAGMENT");
       this.t = this.t8("MERCHANT_BUYER_TAB_SELECTED");
       this.s = this.r8("MERCHANT_BUYER_FRAGMENT_HIDDEN_OBSERVABLE");
       this.q = this.r8("MERCHANT_HOME_MULTI_TAB_SERVICE");
       a uoa = this.r8("MERCHANT_AUTO_PLAY_MANAGER");
       this.r = uoa;
       l ol = PatchProxy.apply(objArray, this, merchantAuto, "11");
       if (ol != PatchProxyResult.class) {
       }else {
          ol = new l();
       }
       uoa.b(ol);
       return;
    }
    public final void stopAllPlayCard(){
       if (PatchProxy.applyVoid(null, this, MerchantAutoPlayPagePresenter.class, "9")) {
          return;
       }
       MerchantAutoPlayPagePresenter tr = this.r;
       if (tr == null) {
          a.S("autoPlayManager");
       }
       tr.l();
       return;
    }
    public final void tryStartDispatch(){
       MerchantAutoPlayPagePresenter merchantAuto = MerchantAutoPlayPagePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, merchantAuto, "8")) {
          return;
       }
       if (d.a(-1492894991).h1()) {
          objArray = new Object[0];
          a.C().w("MerchantAutoPlayPagePresenter", "liveFloatingWindowShowing  not startDispatch", objArray);
          return;
       }else {
          RecyclerView recyclerView = l.a.a(this.u);
          if (recyclerView != null) {
             AutoPlayScrollDispatcher uAutoPlayScr = PatchProxy.applyOneRefs(recyclerView, this, merchantAuto, "12");
             if (uAutoPlayScr != PatchProxyResult.class) {
             }else {
                AutoPlayScrollDispatcher$a k = AutoPlayScrollDispatcher.k;
                j oj = PatchProxy.apply(objArray, this, merchantAuto, "13");
                if (oj != PatchProxyResult.class) {
                }else {
                   oj = new j();
                }
                uAutoPlayScr = k.a(recyclerView, oj, R.id.play_view_container, 0, 10);
             }
             merchantAuto = this.r;
             if (merchantAuto == null) {
                a.S("autoPlayManager");
             }
             merchantAuto.t(uAutoPlayScr);
             uAutoPlayScr.b("merchantBuyerHomeDispatch");
          }
          return;
       }
    }
}
