package com.yxcorp.gifshow.follow.stagger.selector.presenter.i;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import mrd.a;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.i$a;
import uja.e0;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.i$b;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.i$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.util.rx.RxBus;
import eda.l;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import uja.c0;
import erd.g;
import crd.b;
import eda.n;
import uja.l0;
import jb5.d;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import qvb.q;
import qvb.a;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import uja.d0;
import java.lang.Runnable;
import ekd.k1;
import androidx.fragment.app.Fragment;
import wq6.d;
import as6.a;
import fr6.a;
import fr6.e;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.h;
import brd.w;
import erd.c;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.e;
import erd.r;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.g;
import uja.i0;
import kga.c;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.d;
import uja.j0;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.f;
import uja.h0;
import lha.a;
import t45.d;
import brd.z;
import uja.k0;
import rja.c;
import uja.g0;
import sb5.a;
import uja.f0;
import java.util.Set;
import android.animation.ValueAnimator;
import java.lang.Boolean;
import com.yxcorp.gifshow.follow.stagger.selector.presenter.i$d;
import android.animation.Animator$AnimatorListener;
import uja.b0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.follow.stagger.selector.FollowFilterAction;
import ro5.a;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import java.lang.StringBuilder;
import yga.c;
import android.graphics.Typeface;
import bo5.a;
import co5.o;
import zq6.p;
import com.yxcorp.gifshow.follow.common.selector.FollowFilterHelper;
import xl8.b;
import com.kwai.component.homepage_interface.homeitemfragment.HomeItemFragment;
import com.yxcorp.gifshow.model.FollowTabNotify;
import iha.b;
import co5.p$b;
import co5.p;
import android.content.Context;
import wq6.h;
import com.kwai.component.homepage_interface.skin.HomeActionBarSkinHelper;
import lnc.a1;
import com.yxcorp.gifshow.autoplay.state.f;
import dha.d;

public class i extends PresenterV2	// class@00124c
{
    public final a A;
    public final e B;
    public final a C;
    public final q D;
    public final e E;
    public ValueAnimator F;
    public HomeFollowFragment p;
    public c q;
    public a r;
    public b s;
    public Set t;
    public Set u;
    public f v;
    public d w;
    public b x;
    public boolean y;
    public boolean z;

    public void i(){
       super();
       this.y = true;
       this.z = false;
       this.A = a.g();
       this.B = new i$a(this);
       this.C = new e0(this);
       this.D = new i$b(this);
       this.E = new i$c(this);
    }
    public void E8(){
       i oi = i.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oi, "2")) {
          return;
       }
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       this.X7(f.g(l.class, mAIN).subscribe(new c0(this)));
       this.X7(f.g(n.class, mAIN).subscribe(new l0(this)));
       this.p.Qh().h(this.D);
       this.getActivity().F2(this.C);
       if (!PatchProxy.applyVoid(objArray, this, oi, "9")) {
          k1.s(new d0(this), this, 16);
          a.d(this.p).b0().a(this.B);
          this.X7(t.combineLatest(this.A, new FragmentCompositeLifecycleState(this.p).i(), h.a).filter(e.b).skipUntil(this.A.filter(g.b)).distinctUntilChanged().subscribe(new i0(this), c.a));
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "7")) {
          this.X7(this.r.filter(d.b).subscribe(new j0(this), c.a));
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "6")) {
          this.X7(new FragmentCompositeLifecycleState(this.p).g().filter(f.b).subscribe(new h0(this), c.a));
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "4")) {
          this.X7(f.f(a.class).observeOn(d.a).subscribe(new k0(this)));
       }
       if (!PatchProxy.applyVoid(objArray, this, oi, "3")) {
          this.X7(this.q.l().distinctUntilChanged().subscribe(new g0(this), c.a));
       }
       this.W8();
       this.X7(f.g(a.class, mAIN).subscribe(new f0(this)));
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, i.class, "18")) {
          return;
       }
       k1.n(this);
       this.t.remove(this.E);
       this.p.Qh().f(this.D);
       this.getActivity().l3(this.C);
       this.X8();
       i tF = this.F;
       if (tF != null) {
          tF.cancel();
       }
       a.d(this.p).b0().d(this.B);
       return;
    }
    public final void P8(boolean p0){
       ValueAnimator valueAnimato;
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "15")) {
          return;
       }
       oi = this.F;
       if (oi != null && (oi.isStarted() || this.F.isRunning())) {
          this.F.cancel();
          this.F.removeAllUpdateListeners();
       }
       float[] uofloatArray = new float[2];
       if (p0) {
          uofloatArray = {0,0x3f800000};
          valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       }else {
          uofloatArray = {0x3f800000,0};
          valueAnimato = ValueAnimator.ofFloat(uofloatArray);
       }
       this.F = valueAnimato;
       valueAnimato.setDuration(150);
       this.F.addListener(new i$d(this, p0));
       this.F.addUpdateListener(new b0(this));
       this.F.start();
       return;
    }
    public final void R8(FollowFilterAction p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, i.class, "8")) {
          return;
       }
       a.c(this.p);
       c.a(KsLogFollowTag.FOLLOW_SELECTOR.appendTag("FollowFilterTabRadioPresenter"), "changeTabRotateDegrees"+p0);
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, i.class, "17")) {
          return;
       }
       c.a(KsLogFollowTag.FOLLOW_SELECTOR.appendTag("FollowFilterTabRadioPresenter"), "hideTabRadioAndRemoveListener");
       this.V8(false);
       this.t.remove(this.E);
       return;
    }
    public final void V8(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "16")) {
          return;
       }
       if (p0) {
          this.P8(false);
       }else if(a.u(this.p)){
          c.a(KsLogFollowTag.FOLLOW_SELECTOR.appendTag("FollowFilterTabRadioPresenter"), "hideTriangle");
          a.k(this.p);
       }
       return;
    }
    public final void W8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, i.class, "10")) {
          return;
       }
       i tp = this.p;
       Typeface dEFAULT = Typeface.DEFAULT;
       if (!PatchProxy.applyVoidTwoRefs(tp, dEFAULT, objArray, a.class, "11")) {
          a.a(tp, a.u, new o(dEFAULT));
       }
       this.t.add(this.E);
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, i.class, "20")) {
          return;
       }
       this.S8();
       FollowFilterHelper.l();
       this.s.d(Boolean.FALSE);
       return;
    }
    public final void Y8(boolean p0){
       i oi = i.class;
       if (PatchProxy.isSupport(oi) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "13")) {
          return;
       }
       String str = "FollowFilterTabRadioPresenter";
       if (!this.p.c1() || this.x.c() != null) {
          List list = KsLogFollowTag.FOLLOW_SELECTOR.appendTag(str);
          StringBuilder str1 = "mFollowTabNotifyInfo = ";
          i tx = this.x;
          String str2 = (tx == null || tx.c() == null)? "empty": this.x.c().toString();
          c.a(list, str1+str2);
          return;
       }else {
          c.a(KsLogFollowTag.FOLLOW_SELECTOR.appendTag(str), "showTriangle");
          if (!PatchProxy.isSupport(oi) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, oi, "14")) {
             if (p0) {
                this.P8(true);
             }else {
                p$b uob = p.c();
                uob.b(HomeActionBarSkinHelper.l(a.d(this.p), this.getContext()));
                uob.a(0x3f800000);
                uob.d((float)a1.e(0x3f000000));
                a.t(this.p, uob);
             }
          }
          this.s.d(Boolean.TRUE);
          return;
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, i.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("FOLLOW_FILTER_STATE");
       this.r = this.r8("FOLLOW_FILTER_ACTION_DISPATCHER");
       this.s = this.r8("FOLLOW_FILTER_SHOW_STATUS");
       this.t = this.r8("FOLLOW_FILTER_TAB_CLICK_LISTENER");
       this.u = this.r8("FOLLOW_FILTER_TAB_CLICK_INTERCEPT");
       this.v = this.r8("HOST_PLAY_STATE_MENU_SLIDE");
       this.w = this.r8("FOLLOW_FEEDS_STATE_REFRESH");
       this.x = this.r8("FOLLOW_TAB_NOTIFY_INFO");
       return;
    }
}
