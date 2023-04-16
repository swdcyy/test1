package com.yxcorp.gifshow.autoplay.presenter.d;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import x99.a;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import u99.d;
import com.yxcorp.gifshow.autoplay.dispatch.a;
import java.lang.Integer;
import androidx.recyclerview.widget.RecyclerView;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import r99.i;
import androidx.recyclerview.widget.RecyclerView$r;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import qvb.i;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import qvb.q;
import qvb.j;
import brd.t;
import y99.k;
import x99.d;
import z99.b;
import erd.g;
import crd.b;
import x99.m;
import com.yxcorp.gifshow.autoplay.presenter.a;
import s99.n;
import com.yxcorp.gifshow.autoplay.state.e;
import x99.h;
import w99.d$a;
import w99.d;
import x99.j;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import hka.a;
import y99.e;
import com.yxcorp.gifshow.autoplay.presenter.b;
import erd.r;
import x99.e;
import x99.c;
import com.yxcorp.gifshow.autoplay.presenter.c;
import x99.n;
import java.util.Objects;
import y99.l;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import x99.b;
import com.yxcorp.gifshow.autoplay.presenter.d$c;
import com.kwai.library.widget.refresh.RefreshLayout$h;
import com.kwai.library.widget.refresh.RefreshLayout;
import lnc.u1;
import x99.f;
import com.yxcorp.gifshow.autoplay.presenter.d$a;
import com.yxcorp.gifshow.autoplay.presenter.d$b;
import x99.g;
import x99.l;
import x99.i;
import x99.k;
import com.yxcorp.gifshow.autoplay.state.f;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.lang.Boolean;
import java.util.HashMap;
import ekd.q1;
import wkd.b;
import com.yxcorp.gifshow.autoplay.state.NetworkState;
import im8.f;
import s99.k;
import y99.d;
import u99.c;
import io.reactivex.subjects.PublishSubject;
import w99.h;
import cda.i;

public class d extends PresenterV2	// class@001c2c
{
    public PublishSubject A;
    public h B;
    public RefreshLayout C;
    public i D;
    public int E;
    public int F;
    public boolean G;
    public RefreshLayout$h H;
    public RecyclerView$r I;
    public int J;
    public c$a K;
    public boolean L;
    public boolean M;
    public boolean N;
    public a O;
    public c$b P;
    public q Q;
    public a R;
    public boolean S;
    public b T;
    public final n U;
    public RecyclerView p;
    public d q;
    public e r;
    public f s;
    public RecyclerFragment t;
    public d u;
    public e v;
    public k w;
    public c x;
    public f y;
    public l z;

    public void d(){
       super();
       this.N = true;
       this.U = new a(this);
    }
    public void E8(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "3")) {
          return;
       }
       d.d("AutoPlayCardAttachPresenter", "onBind");
       d tp = this.p;
       d tt = this.t;
       d tD = this.D;
       d tE = this.E;
       d tF = this.F;
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa)) {
          Object[] objArray1 = new Object[]{tp,tt,tD,Integer.valueOf(tE),Integer.valueOf(tF)};
          uoa = PatchProxy.apply(objArray1, objArray, uoa, "1");
          if (uoa != patchProxyRe) {
          label_0052 :
             this.R = uoa;
             this.p.addOnScrollListener(this.I);
             this.P8(this.t.Vg().c());
             this.t.q().h(this.Q);
             this.X7(this.w.c().subscribe(new d(this), new b()));
             this.T = this.t.Vg().j().subscribe(new m(this), a.b);
             this.r.a(this.U);
             this.q.a(new h(this));
             this.q.a(new j(this));
             if (this.M == null) {
                this.M = true;
                this.R8();
             }
             if (this.getActivity() instanceof GifshowActivity) {
                this.getActivity().F2(this.O);
             }
             this.X7(this.v.a().filter(b.b).filter(new e(this)).subscribe(new c(this), new b()));
             this.X7(this.t.Vg().g().filter(c.b).subscribe(new n(this), new b()));
             d tz = this.z;
             if (tz != null) {
                Objects.requireNonNull(tz);
                l ol = PatchProxy.apply(objArray, tz, l.class, "2");
                if (ol != patchProxyRe) {
                }else if(tz.a.isDetached() || tz.a.getActivity() == null){
                   ol = t.empty();
                }else {
                   ol = tz.b;
                }
                this.X7(ol.subscribe(new b(this), new b()));
             }
             d$c uoc = new d$c(this);
             this.H = uoc;
             this.C.c(uoc);
             u1.a(this);
             return;
          }
       }
       a uoa1 = new a(tp, tt, tD, tE, tF);
       goto label_0052 ;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, d.class, "2")) {
          return;
       }
       this.K = new f(this);
       this.I = new d$a(this);
       this.Q = new d$b(this);
       this.P = new g(this);
       this.O = new l(this);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, d.class, "7")) {
          return;
       }
       d.d("AutoPlayCardAttachPresenter", "onUnbind");
       this.q.a(new i(this));
       this.p.removeOnScrollListener(this.I);
       this.q.a(new k(this));
       d tT = this.T;
       if (tT != null && !tT.isDisposed()) {
          this.T.dispose();
       }
       this.r.c(this.U);
       if (this.getActivity() instanceof GifshowActivity) {
          this.getActivity().l3(this.O);
       }
       this.t.q().f(this.Q);
       this.C.E(this.H);
       this.s.a();
       u1.b(this);
       tT = this.R;
       Objects.requireNonNull(tT);
       if (!PatchProxy.applyVoid(objArray, tT, a.class, "3")) {
          tT.c.removeOnScrollListener(tT.g);
          Iterator iterator = tT.i.keySet().iterator();
          while (iterator.hasNext()) {
             RecyclerView recyclerView = iterator.next();
             recyclerView.removeOnScrollListener(tT.i.get(recyclerView));
          }
          tT.i.clear();
       }
       return;
    }
    public final void P8(boolean p0){
       d uod = d.class;
       if (PatchProxy.isSupport(uod) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uod, "6")) {
          return;
       }
       if (this.G == null && this.getActivity() != null) {
          HashMap hashMap = new HashMap();
          hashMap.put("page", this.t.o());
          hashMap.put("select", String.valueOf(p0));
          d.h("AutoPlayCardAttachPresenter", "setTabSelect", hashMap);
          if (p0) {
             q1.r0(this.getActivity()).o0("autoPlayCard");
          }else {
             q1.r0(this.getActivity()).q0("autoPlayCard");
          }
       }
       return;
    }
    public final void R8(){
       boolean b;
       if (PatchProxy.applyVoid(null, this, d.class, "5")) {
          return;
       }
       d.d("AutoPlayCardAttachPresenter", "updateAutoPlayIfNeeded");
       if (this.u == null) {
          return;
       }
       if (!this.t.isResumed()) {
          return;
       }
       if (this.s.c()) {
          return;
       }
       NetworkState networkState = b.a(0x43d75a86);
       b = true;
       if (networkState.b() != b) {
          d ty = this.y;
          if (ty == null || (ty.get() == null || !this.y.get().a(networkState.b()))) {
             b = false;
          }
       }
       this.L = b;
       this.u.a(b);
       return;
    }
    public void j8(){
       Integer integer = Integer.class;
       if (PatchProxy.applyVoid(null, this, d.class, "1")) {
          return;
       }
       this.p = this.q8(RecyclerView.class);
       this.q = this.r8("AUTO_PLAY_MANAGER_WRAPPER");
       this.r = this.r8("HOST_PLAY_STATE_RESUME");
       this.s = this.r8("HOST_PLAY_STATE_MENU_SLIDE");
       this.t = this.r8("FRAGMENT");
       this.u = this.t8("HOST_PLAY_STATE_PLAY");
       this.v = this.r8("PLAY_STATE_POST_STATE");
       this.w = this.r8("AUTO_PLAY_DISPATCH_FOCUS_STATE");
       this.x = this.r8("PLAY_LEAVE_ACTION");
       this.y = this.w8("HOST_PLAY_SWITCH_INTERCEPTOR");
       this.z = this.t8("HOST_PLAY_UPDATE_STATE");
       this.A = this.t8("PLAY_PLAYER_INTERCEPT");
       this.B = this.r8("HOST_PLAY_BACK_FROM_DETAIL");
       this.C = this.q8(RefreshLayout.class);
       this.D = this.t8("AUTO_PLAY_STRATEGY");
       this.E = this.v8("AUTO_PLAYER_VIEW_ID", integer).intValue();
       this.F = this.v8("AUTO_PLAY_CHILD_RECYCLER_VIEW_ID", integer).intValue();
       this.G = this.v8("AUTO_PLAY_KEEP_SCREEN_FLAG", Boolean.class).booleanValue();
       return;
    }
    public void onEventMainThread(i p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, d.class, "8")) {
          return;
       }
       this.R.b("photoReduce");
       return;
    }
}
