package com.yxcorp.gifshow.follow.stagger.selector.presenter.c;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import uja.i;
import uja.j;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.c$a;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.c$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.view.View;
import ekd.m1;
import com.yxcorp.gifshow.panel.sizer.view.MaxHeightFrameLayout;
import uja.m;
import java.lang.Runnable;
import android.widget.FrameLayout;
import android.view.View$OnLayoutChangeListener;
import brd.t;
import rja.c;
import uja.k;
import kga.c;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.a;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.b;
import erd.r;
import uja.l;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import uo5.a;
import android.animation.Animator;
import ekd.f;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.Fragment;
import android.content.Context;
import o56.f;
import ro5.a;
import oo5.a;
import com.yxcorp.utility.n;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import java.lang.StringBuilder;
import yga.c;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import mrd.a;
import com.yxcorp.gifshow.autoplay.state.f;

public class c extends PresenterV2	// class@001241
{
    public AnimatorSet A;
    public boolean B;
    public View C;
    public View$OnLayoutChangeListener D;
    public final a E;
    public final SlidingPaneLayout$d F;
    public final RefreshLayout$h G;
    public final int p;
    public HomeFollowFragment q;
    public c r;
    public a s;
    public f t;
    public List u;
    public boolean v;
    public float w;
    public View x;
    public MaxHeightFrameLayout y;
    public AnimatorSet z;

    public void c(){
       super();
       this.p = -1;
       this.v = true;
       this.w = 0;
       this.B = false;
       this.D = new i(this);
       this.E = new j(this);
       this.F = new c$a(this);
       this.G = new c$b(this);
    }
    public void E8(){
       c uoc = c.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, uoc, "2")) {
          return;
       }
       if (this.y == null) {
          MaxHeightFrameLayout maxHeightFra = m1.f(this.m8(), R.id.mhf_sizer);
          this.y = maxHeightFra;
          maxHeightFra.post(new m(this));
       }
       if (this.x == null) {
          this.x = m1.f(this.m8(), 0x7f0a0f85);
       }
       this.y.addOnLayoutChangeListener(this.D);
       if (!PatchProxy.applyVoid(objArray, this, uoc, "9")) {
          this.X7(this.r.l().subscribe(new k(this), c.a));
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "10")) {
          this.X7(this.s.subscribe(new a(this), c.a));
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "3")) {
          this.X7(this.q.Vg().i().filter(b.b).subscribe(new l(this), c.a));
       }
       if (!PatchProxy.applyVoid(objArray, this, uoc, "4")) {
          this.q.Ac().c(this.G);
       }
       this.getActivity().F2(this.E);
       a.b(this.getActivity(), this.F);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, c.class, "11")) {
          return;
       }
       this.y.removeOnLayoutChangeListener(this.D);
       this.getActivity().l3(this.E);
       a.d(this.getActivity(), this.F);
       this.q.Ac().E(this.G);
       return;
    }
    public final void P8(){
       if (PatchProxy.applyVoid(null, this, c.class, "15")) {
          return;
       }
       this.S8();
       f.a(this.z);
       f.a(this.A);
       this.r.q(false);
       c ty = this.y;
       ty.setTranslationY((float)(ty.getMeasuredHeight() * -1));
       return;
    }
    public void R8(boolean p0){
       c uoc = c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uoc, "18")) {
          return;
       }
       if (f.b(this.q.getActivity())) {
          a.n(this.q, p0);
          a.h(this.q, p0);
       }
       return;
    }
    public void S8(){
       if (PatchProxy.applyVoid(null, this, c.class, "17")) {
          return;
       }
       View[] viewArray = new View[]{this.x,this.C};
       n.Z(8, viewArray);
       this.R8(1);
       return;
    }
    public void V8(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "6")) {
          return;
       }
       if (this.y.getTranslationY() - null) {
          c.i(KsLogFollowTag.FOLLOW_SELECTOR.appendTag("FollowFilterAnimPresenter"), p0+" reset TranslationY");
          c ty = this.y;
          ty.setTranslationY((float)(ty.getMeasuredHeight() * -1));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, c.class, "1")) {
          return;
       }
       this.q = this.r8("FRAGMENT");
       this.r = this.r8("FOLLOW_FILTER_STATE");
       this.s = this.r8("FOLLOW_FILTER_ACTION_DISPATCHER");
       this.t = this.r8("HOST_PLAY_STATE_MENU_SLIDE");
       this.u = this.r8("FOLLOW_FILTER_BOXES");
       return;
    }
}
