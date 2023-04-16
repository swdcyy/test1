package com.yxcorp.gifshow.relation.feed.presenter.f;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.relation.feed.presenter.f$a;
import pac.c;
import com.yxcorp.gifshow.relation.feed.presenter.f$b;
import pac.d;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import androidx.viewpager.widget.ViewPager$i;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import brd.t;
import erd.g;
import crd.b;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.relation.feed.presenter.d;
import erd.r;
import com.yxcorp.gifshow.relation.feed.presenter.c;
import erd.o;
import com.yxcorp.gifshow.relation.feed.presenter.e;
import npb.c;
import kob.r;
import com.kuaishou.android.model.music.Music;
import com.yxcorp.gifshow.relation.feed.model.PymkBigCardUserMeta;
import pac.e;
import java.lang.Runnable;
import ekd.k1;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.relation.feed.model.PymkRecoBigCardFeed;
import tkd.b;
import tkd.d;
import android.app.Activity;
import com.yxcorp.gifshow.relation.feed.presenter.b;

public class f extends PresenterV2	// class@0018ac
{
    public SlidingPaneLayout$e A;
    public g B;
    public BaseFragment p;
    public QPhoto q;
    public PymkBigCardUserMeta r;
    public PymkRecoBigCardFeed s;
    public g t;
    public r u;
    public SlidePlayViewModel v;
    public boolean w;
    public boolean x;
    public ViewPager$i y;
    public final g z;

    public void f(){
       super();
       this.x = false;
       this.y = new f$a(this);
       this.z = new c(this);
       this.A = new f$b(this);
       this.B = new d(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, f.class, "2")) {
          return;
       }
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.p.getParentFragment());
       this.v = slidePlayVie;
       if (slidePlayVie != null) {
          slidePlayVie.i(this.y);
       }
       q.p0(this.p.getActivity()).v0(this.A);
       this.X7(this.p.Vg().j().subscribe(this.z, this.t));
       this.X7(this.p.m().filter(d.b).map(c.b).subscribe(this.z, this.t));
       this.X7(this.p.m().filter(e.b).subscribe(this.B, this.t));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, f.class, "3")) {
          return;
       }
       f tv = this.v;
       if (tv != null) {
          tv.g(this.y);
       }
       this.w = false;
       q.p0(this.p.getActivity()).C0(this.A);
       return;
    }
    public void P8(){
       if (PatchProxy.applyVoid(null, this, f.class, "5")) {
          return;
       }
       c current = this.u.getCurrent();
       if (current != null && current.c() == this.r.mMusic) {
          this.u.pause();
          this.x = true;
       }
       return;
    }
    public void R8(){
       if (PatchProxy.applyVoid(null, this, f.class, "4")) {
          return;
       }
       if (this.p.Vg().c() && this.p.isResumed()) {
          if (q.p0(this.p.getActivity()).s0()) {
             return;
          }else {
             this.x = false;
             k1.r(new e(this), 300);
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, f.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.q8(QPhoto.class);
       this.s = this.q8(PymkRecoBigCardFeed.class);
       this.r = this.q8(PymkBigCardUserMeta.class);
       this.u = d.a(-1687636538);
       if (this.p.getActivity() != null) {
          this.u.aU(this.p.getActivity());
       }
       this.t = b.b;
       return;
    }
}
