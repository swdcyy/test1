package com.kwai.nearby.tab.presenter.NearbyItemRefreshPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.System;
import com.kwai.nearby.tab.presenter.NearbyItemRefreshPresenter$1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.app.Activity;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.n;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import pd7.p;
import erd.g;
import crd.b;
import eda.l;
import pd7.o;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import pd7.q;
import com.kuaishou.live.common.core.basic.tools.h;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.util.Set;

public class NearbyItemRefreshPresenter extends PresenterV2	// class@001035
{
    public RecyclerFragment p;
    public Set q;
    public boolean r;
    public long s;
    public boolean t;
    public boolean u;
    public final DefaultLifecycleObserver v;

    public void NearbyItemRefreshPresenter(){
       super();
       this.s = System.currentTimeMillis();
       this.v = new NearbyItemRefreshPresenter$1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, NearbyItemRefreshPresenter.class, "4")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(n.class, mAIN).subscribe(new p(this)));
       this.X7(f.g(l.class, mAIN).subscribe(new o(this)));
       this.getActivity().getLifecycle().addObserver(this.v);
       this.X7(this.p.Vg().j().subscribe(new q(this), h.b));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, NearbyItemRefreshPresenter.class, "5")) {
          return;
       }
       if (this.getActivity() == null) {
          return;
       }
       this.getActivity().getLifecycle().removeObserver(this.v);
       return;
    }
    public void P8(){
       NearbyItemRefreshPresenter nearbyItemRe = NearbyItemRefreshPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, nearbyItemRe, "7")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, nearbyItemRe, "6")) {
          this.p.N1();
       }
       this.p.v(true);
       this.s = System.currentTimeMillis();
       this.r = false;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NearbyItemRefreshPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("FRAGMENT_SELECT_LISTENER");
       return;
    }
}
