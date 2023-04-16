package com.kuaishou.live.preview.item.presenter.ad.LivePreviewAdAutoToLivePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.kuaishou.live.preview.item.presenter.ad.LivePreviewAdAutoToLivePresenter$a;
import com.kuaishou.live.preview.item.presenter.ad.LivePreviewAdAutoToLivePresenter$2;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.s;
import brd.t;
import t45.d;
import brd.z;
import el3.c;
import erd.g;
import crd.b;
import jl3.b;
import el3.a;
import io.reactivex.internal.functions.Functions;
import lnc.b9;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.ads.PhotoAdvertisement;
import com.kuaishou.android.model.feed.k;
import im8.f;
import o56.a;
import android.content.Context;
import ekd.p0;
import java.lang.Integer;
import java.util.concurrent.TimeUnit;
import el3.b;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import rs5.a;

public class LivePreviewAdAutoToLivePresenter extends PresenterV2	// class@000e04
{
    public final DefaultLifecycleObserver A;
    public QPhoto p;
    public BaseFragment q;
    public f r;
    public b s;
    public a t;
    public b u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public a z;

    public void LivePreviewAdAutoToLivePresenter(){
       super();
       this.v = false;
       this.w = true;
       this.x = false;
       this.y = false;
       this.z = new LivePreviewAdAutoToLivePresenter$a(this);
       this.A = new LivePreviewAdAutoToLivePresenter$2(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, LivePreviewAdAutoToLivePresenter.class, "2")) {
          return;
       }
       if (this.P8()) {
          if (this.q.getParentFragment() != null) {
             objArray = SlidePlayViewModel.S0(this.q.getParentFragment());
          }
          if (objArray != null) {
             objArray.P(this.q, this.z);
          }
          this.q.getLifecycle().addObserver(this.A);
          this.X7(RxBus.f.f(s.class).observeOn(d.a).subscribe(new c(this)));
          this.X7(this.s.c().distinctUntilChanged().subscribe(new a(this), Functions.e));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewAdAutoToLivePresenter.class, "3")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = (this.q.getParentFragment() != null)? SlidePlayViewModel.S0(this.q.getParentFragment()): null;
       if (slidePlayVie != null) {
          slidePlayVie.D(this.q, this.z);
       }
       b9.a(this.u);
       this.q.getLifecycle().removeObserver(this.A);
       this.u = null;
       return;
    }
    public final boolean P8(){
       Object obj = PatchProxy.apply(null, this, LivePreviewAdAutoToLivePresenter.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (k.B(this.p) != null && k.B(this.p).mAutoIntoLiveSeconds > null)? true: false;
       return b;
    }
    public final boolean R8(){
       Object obj = PatchProxy.apply(null, this, LivePreviewAdAutoToLivePresenter.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.P8() && (!this.r.get().booleanValue() && (this.v != null && (this.y != null && (this.w != null && (this.x == null && p0.C(a.B)))))))? true: false;
       return b;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewAdAutoToLivePresenter.class, "4")) {
          return;
       }
       b9.a(this.u);
       if (this.R8()) {
          this.u = t.just(Integer.valueOf(1)).delay((long)k.B(this.p).mAutoIntoLiveSeconds, TimeUnit.SECONDS).observeOn(d.a).subscribe(new b(this));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, LivePreviewAdAutoToLivePresenter.class, "1")) {
          return;
       }
       this.p = this.q8(QPhoto.class);
       this.q = this.r8("DETAIL_FRAGMENT");
       this.r = this.x8("LIVE_ANCHOR_END");
       this.s = this.r8("LIVE_PLAY_STATE");
       this.t = this.r8("LIVE_SIMPLE_ENTER_LIVE_SERVICE");
       return;
    }
}
