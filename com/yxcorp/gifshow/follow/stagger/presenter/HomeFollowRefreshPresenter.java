package com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import java.lang.System;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter$1;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter$2;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter$3;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter$a;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter$b;
import com.yxcorp.gifshow.follow.stagger.presenter.HomeFollowRefreshPresenter$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import lnc.u1;
import qvb.q;
import qvb.j;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import androidx.lifecycle.Lifecycle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleObserver;
import java.util.Set;
import y99.a;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import iia.u1;
import com.yxcorp.gifshow.follow.stagger.container.HomeFollowFragment;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import brd.t;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import y99.a$a;
import eja.j1;
import erd.g;
import crd.b;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.trello.rxlifecycle3.components.support.RxFragment;
import com.yxcorp.gifshow.follow.stagger.presenter.c0;
import erd.r;
import eja.k1;
import com.yxcorp.gifshow.util.rx.RxBus;
import wca.n;
import t45.d;
import brd.z;
import eja.h1;
import eja.g1;
import kga.c;
import com.kwai.sdk.switchconfig.a;
import hn5.n;
import hn5.m;
import android.content.Context;
import oa5.a;
import e17.i;
import lnc.a1;
import java.lang.CharSequence;
import android.text.TextUtils;
import ya5.a;
import java.util.concurrent.TimeUnit;
import eja.i1;
import com.yxcorp.gifshow.refresh.RefreshType;
import eja.l1;
import com.yxcorp.gifshow.follow.common.log.kslog.KsLogFollowTag;
import java.util.List;
import yga.b;
import yga.c;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import java.lang.Boolean;
import com.yxcorp.gifshow.follow.config.util.FollowConfigUtil;
import qvb.i;
import com.kwai.component.homepage_interface.homeitemfragment.a;
import rja.c;
import xl8.b;
import io.reactivex.subjects.PublishSubject;
import m56.e;

public class HomeFollowRefreshPresenter extends PresenterV2	// class@0011fb
{
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public boolean F;
    public FragmentCompositeLifecycleState G;
    public a H;
    public u1 I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final Set M;
    public final Set N;
    public final DefaultLifecycleObserver O;
    public final Runnable P;
    public final o Q;
    public final q R;
    public HomeFollowFragment p;
    public i q;
    public Set r;
    public a s;
    public c t;
    public b u;
    public PublishSubject v;
    public long w;
    public boolean x;
    public boolean y;
    public boolean z;

    public void HomeFollowRefreshPresenter(){
       super();
       this.w = System.currentTimeMillis();
       this.J = false;
       this.K = false;
       this.L = false;
       this.M = new HomeFollowRefreshPresenter$1(this);
       this.N = new HomeFollowRefreshPresenter$2(this);
       this.O = new HomeFollowRefreshPresenter$3(this);
       this.P = new HomeFollowRefreshPresenter$a(this);
       this.Q = new HomeFollowRefreshPresenter$b(this);
       this.R = new HomeFollowRefreshPresenter$c(this);
    }
    public void E8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HomeFollowRefreshPresenter.class, "3")) {
          return;
       }
       u1.a(this);
       this.q.h(this.R);
       this.getActivity().getLifecycle().addObserver(this.O);
       this.r.add(this.Q);
       this.H = new a(this.p);
       if (this.I == null) {
          this.I = new u1(this.p);
       }
       HomeFollowRefreshPresenter tH = this.H;
       Objects.requireNonNull(tH);
       a uoa = PatchProxy.apply(objArray, tH, a.class, "1");
       if (uoa != PatchProxyResult.class) {
       }else if(tH.a.isDetached() || tH.a.getActivity() == null){
          tH.a();
          uoa = t.empty();
       }else if(tH.c == null){
          a$a uoa1 = new a$a(tH);
          tH.c = uoa1;
          u1.a(uoa1);
       }
       uoa = tH.b;
       this.X7(uoa.subscribe(new j1(this)));
       FragmentCompositeLifecycleState uFragmentCom = new FragmentCompositeLifecycleState(this.p);
       this.G = uFragmentCom;
       this.X7(uFragmentCom.g().filter(c0.b).subscribe(new k1(this)));
       this.X7(RxBus.f.f(n.class).observeOn(d.a).subscribe(new h1(this)));
       this.X7(this.v.subscribe(new g1(this), c.a));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, HomeFollowRefreshPresenter.class, "2")) {
          return;
       }
       this.A = a.t().b("followHotLaunchMiddleTime", 0xdbba0);
       this.B = a.t().b("notFollowTabBackMiddleTime", 0xdbba0);
       this.C = a.t().b("notFollowTabBackLongTime", 0x36ee80);
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, HomeFollowRefreshPresenter.class, "9")) {
          return;
       }
       u1.b(this);
       this.q.f(this.R);
       HomeFollowRefreshPresenter tH = this.H;
       if (tH != null) {
          tH.a();
       }
       this.r.remove(this.Q);
       if (this.getActivity() == null) {
          return;
       }else {
          this.getActivity().getLifecycle().removeObserver(this.O);
          return;
       }
    }
    public void P8(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowRefreshPresenter.class, "10")) {
          return;
       }
       if (m.a().U3(p0) && a.b()) {
          i oi = i.l();
          if (oi != null && (oi.s() && TextUtils.equals(a1.p(0x7f100da1), oi.n()))) {
             oi.h();
             a.a();
          }
       }
    label_003e :
       return;
    }
    public final void R8(){
       if (PatchProxy.applyVoid(null, this, HomeFollowRefreshPresenter.class, "16")) {
          return;
       }
       this.V8();
       this.X7(t.just(this.p).delay(0, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new i1(this), c.a));
       return;
    }
    public final void S8(RefreshType p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowRefreshPresenter.class, "15")) {
          return;
       }
       this.V8();
       this.X7(t.just(this.p).delay(0, TimeUnit.MILLISECONDS).observeOn(d.a).subscribe(new l1(this, p0), c.a));
       return;
    }
    public void V8(){
       if (PatchProxy.applyVoid(null, this, HomeFollowRefreshPresenter.class, "14")) {
          return;
       }
       c.i(KsLogFollowTag.STAGGER_REFRESH.appendTag("HomeFollowRefreshPresenter"), "scrollToTop");
       this.p.N1();
       return;
    }
    public void W8(Activity p0){
       boolean b;
       HomeFollowRefreshPresenter homeFollowRe = HomeFollowRefreshPresenter.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, homeFollowRe, "5")) {
          return;
       }
       if (p0 != null && this.K == null) {
          HomeFollowRefreshPresenter tG = this.G;
          if (tG != null && tG.c()) {
             this.K = true;
             PatchProxyResult patchProxyRe = PatchProxyResult.class;
             Object obj = PatchProxy.applyOneRefs(p0, this, homeFollowRe, "6");
             if (obj != patchProxyRe) {
                b = obj.booleanValue();
             }else if(FollowConfigUtil.x() != 1){
                if (FollowConfigUtil.x() == 2) {
                   Object obj1 = PatchProxy.applyOneRefs(p0, this, homeFollowRe, "7");
                   if (obj1 != patchProxyRe) {
                      b = obj1.booleanValue();
                   }else if(this.L == null || (this.M.contains(p0.getLocalClassName()) || this.N.contains(p0.getLocalClassName()))){
                      b = true;
                   }else {
                      b = false;
                   }
                   if (!b) {
                   label_006e :
                      b = false;
                   }
                }else {
                   goto label_006e ;
                }
             }
             b = true;
             if (b) {
                this.E = false;
                this.F = false;
             }else {
                boolean b1 = this.M.contains(p0.getLocalClassName());
                this.E = b1;
                this.F = b1 ^ true;
             }
             this.D = System.currentTimeMillis();
             this.L = false;
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HomeFollowRefreshPresenter.class, "1")) {
          return;
       }
       this.p = this.r8("FRAGMENT");
       this.q = this.r8("PAGE_LIST");
       this.r = this.r8("FRAGMENT_SELECT_LISTENER");
       this.s = this.r8("HOME_REFRESH_CONTROLLER");
       this.t = this.r8("FOLLOW_FILTER_STATE");
       this.u = this.r8("FOLLOW_IS_IN_PYMK_DETAIL_PAGE");
       this.v = this.r8("HOME_FOLLOW_PHOTO_CLICK_EVENT");
       return;
    }
    public void onEventMainThread(e p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HomeFollowRefreshPresenter.class, "4")) {
          return;
       }
       this.W8(p0.a);
       return;
    }
}
