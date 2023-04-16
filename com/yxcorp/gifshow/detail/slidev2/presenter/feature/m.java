package com.yxcorp.gifshow.detail.slidev2.presenter.feature.m;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import k2b.j2;
import e8a.f1;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.m$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import qw6.a;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import e8a.g1;
import com.gifshow.tuna.player.poi.e;
import erd.g;
import crd.b;
import rkd.b;
import com.yxcorp.gifshow.entity.QPhoto;

public class m extends PresenterV2	// class@0019ab
{
    public BaseFragment p;
    public SlidePlayViewModel q;
    public j2 r;
    public QPhoto s;
    public boolean t;
    public boolean u;
    public b v;
    public a w;

    public void m(){
       super();
       this.r = new j2();
       this.t = true;
       this.u = false;
       this.v = new f1(this);
       this.w = new m$a(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, m.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.p);
       this.q = slidePlayVie;
       slidePlayVie.h(this.w);
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().i3(this.v);
       }
       this.X7(this.p.Vg().f().subscribe(new g1(this), e.b));
       return;
    }
    public void H8(){
       if (PatchProxy.applyVoid(null, this, m.class, "4")) {
          return;
       }
       if (b.e()) {
          m ts = this.s;
          if (ts != null) {
             this.r.d(ts);
          }
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, m.class, "3")) {
          return;
       }
       this.q.l(this.w);
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().s3(this.v);
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, m.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       return;
    }
}
