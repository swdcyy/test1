package com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaAudioFocusPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.util.t0;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaAudioFocusPresenter$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaAudioFocusPresenter$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.NasaAudioFocusPresenter$3;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import com.yxcorp.gifshow.util.t0$a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import e8a.h;
import erd.g;
import crd.b;
import java.util.Objects;
import e8a.j;
import java.lang.Runnable;
import t45.c;
import e8a.i;

public class NasaAudioFocusPresenter extends PresenterV2	// class@001912
{
    public BaseFragment p;
    public SlidePlayViewModel q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final t0 u;
    public final a v;
    public final t0$a w;
    public final DefaultLifecycleObserver x;

    public void NasaAudioFocusPresenter(){
       super();
       this.u = new t0();
       this.v = new NasaAudioFocusPresenter$a(this);
       this.w = new NasaAudioFocusPresenter$b(this);
       this.x = new NasaAudioFocusPresenter$3(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, NasaAudioFocusPresenter.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.p);
       this.q = slidePlayVie;
       slidePlayVie.E(this.v);
       this.p.getLifecycle().addObserver(this.x);
       this.u.d(this.w);
       this.X7(this.p.Vg().i().subscribe(new h(this)));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NasaAudioFocusPresenter.class, "3")) {
          return;
       }
       this.q.g0(this.v);
       this.u.d(objArray);
       this.p.getLifecycle().removeObserver(this.x);
       return;
    }
    public void P8(){
       NasaAudioFocusPresenter tu;
       if (PatchProxy.applyVoid(null, this, NasaAudioFocusPresenter.class, "4")) {
          return;
       }
       if (this.p.Vg().c() && (this.s != null && (this.t != null && this.r == null))) {
          this.r = true;
          tu = this.u;
          Objects.requireNonNull(tu);
          c.a(new j(tu));
       }else if(this.p.Vg().c() && (this.s == null || (this.t == null && this.r != null))){
          this.r = false;
          tu = this.u;
          Objects.requireNonNull(tu);
          c.a(new i(tu));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, NasaAudioFocusPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
}
