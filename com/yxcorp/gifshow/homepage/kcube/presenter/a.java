package com.yxcorp.gifshow.homepage.kcube.presenter.a;
import im8.g;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import wq6.f;
import ko5.d;
import java.util.BitSet;
import com.yxcorp.gifshow.homepage.kcube.presenter.a$a;
import com.yxcorp.gifshow.homepage.kcube.presenter.a$b;
import com.yxcorp.gifshow.homepage.kcube.presenter.a$c;
import xq6.a;
import dta.i;
import com.yxcorp.gifshow.homepage.kcube.presenter.a$e;
import com.yxcorp.gifshow.homepage.kcube.presenter.a$d;
import dta.l0;
import com.kwai.robust.PatchProxyResult;
import ujc.e;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import o56.d;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import brd.t;
import dta.l;
import erd.g;
import crd.b;
import gr6.j;
import qsa.b;
import qsa.c;
import qsa.a;
import pr6.d;
import gsa.j0;
import gr6.b;
import gr6.c;
import lr6.a;
import com.kwai.kcube.ext.actionbar.KCubeTabActionBar;
import lr6.f;
import on5.b;
import com.kwai.kcube.TabIdentifier;
import wq6.g;
import dta.q;
import java.util.Objects;
import com.kwai.framework.init.e;
import t45.d;
import brd.z;
import dta.c0;
import java.lang.Runnable;
import wkd.b;
import tjc.c;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.homepage.kcube.presenter.b;
import erd.r;
import dta.d0;
import dta.e0;
import ekd.k1;
import dta.b0;
import com.kwai.kcube.ext.actionbar.KCubeTabActionBar$a;
import tra.b;
import q87.c;
import wq6.h;
import fr6.i;
import dta.h;
import lr6.c;
import lr6.d;
import android.app.Activity;
import com.yxcorp.gifshow.activity.GifshowActivity;
import dta.j;
import kotlin.jvm.internal.a;
import android.view.View;
import lnc.v9;
import lnc.l2;
import lnc.b5;
import hka.g;
import eda.n;
import dta.p;
import eda.l;
import dta.o;
import zca.r;
import dta.n;
import jsa.i;
import dta.m;
import wq6.c;
import zq6.b;
import bo5.a;
import dta.w;
import zq6.p;
import zq6.u;
import zq6.s;
import xq6.b;
import so5.a;
import ok.x;
import java.lang.Boolean;
import androidx.fragment.app.FragmentActivity;
import uv8.j0;
import java.lang.StringBuilder;
import dta.k;
import lnc.u1;
import hsa.g;
import hsa.b;
import fr6.b;
import fr6.g;
import java.util.List;
import java.util.Map;
import dta.v;
import dta.u;
import dta.a0;
import dta.x;
import dta.z;
import dta.y;
import dta.g;
import dta.r;
import dta.t;
import dta.s;
import dta.h0;
import java.util.HashMap;
import b66.k$a;

public abstract class a extends PresenterV2 implements g	// class@001752
{
    public final a A;
    public final b B;
    public a C;
    public boolean D;
    public boolean E;
    public final a$e F;
    public boolean G;
    public boolean H;
    public final c I;
    public final f p;
    public final l0 q;
    public final d r;
    public final BitSet s;
    public j0 t;
    public d u;
    public KCubeTabActionBar v;
    public Map w;
    public final i x;
    public final d y;
    public final g z;

    public void a(f p0,d p1){
       super();
       this.s = new BitSet();
       this.x = new a$a(this);
       this.y = new a$b(this);
       this.z = new a$c(this);
       this.A = new a();
       this.B = new i(this);
       this.F = new a$e(null);
       this.G = true;
       this.H = false;
       this.I = new a$d(this);
       this.p = p0;
       this.r = p1;
       this.q = new l0(p0);
    }
    public void E8(){
       z a;
       a uoa = this;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       e uoe = e.class;
       a uoa1 = a.class;
       Object[] objArray = null;
       String str = "3";
       if (PatchProxy.applyVoid(objArray, uoa, uoa1, str)) {
          return;
       }
       if (d.g) {
          uoa.X7(RxBus.f.g(uoe, RxBus$ThreadMode.MAIN).subscribe(new l(uoa)));
       }else {
          this.Z8();
       }
       a v = uoa.v;
       j oj = this.P8();
       a p = uoa.p;
       b uob = new b();
       c uoc = PatchProxy.apply(objArray, uoa, uoa1, "10");
       if (uoc != patchProxyRe) {
       }else {
          c uoc1 = new c(uoa.u, uoa.r.l(), uoa.t, this.S8(), this.R8());
       }
       v = v.a(oj, p, uob, uoc);
       uoa.C = v;
       v.create();
       if (!PatchProxy.applyVoid(objArray, uoa, uoa1, "4")) {
          a uoa2 = 1;
          if (!uoa.p.O(b.F) && !uoa.p.O(b.G)) {
             v = uoa.F;
             a v2 = uoa.v;
             q oq = new q(uoa);
             Objects.requireNonNull(v);
             if (!PatchProxy.applyVoidTwoRefs(v2, oq, v, a$e.class, "1")) {
                v.a = uoa2;
                a = d.a;
                v.b = e.b().observeOn(a).subscribe(new c0(v, v2, oq));
                if (b.a(-1608526086).S()) {
                   v.c = RxBus.f.f(uoe).delay((long)v.b(), TimeUnit.MILLISECONDS).observeOn(a).filter(b.b).subscribe(new d0(v, v2, oq));
                }else {
                   e0 uoe0 = new e0(v, v2, oq);
                   v.d = uoe0;
                   k1.r(uoe0, (long)v.b());
                }
                v2.setOnReceiveTouchEventListener(new b0(v, v2, oq));
             }
          }else {
             Object[] objArray3 = new Object[0];
             b.C().w("CommonKCubeActionBarPresenter", "mActionBarController.bind\(\)", objArray3);
             uoa.C.d();
             uoa.E = uoa2;
          }
       }
       uoa.x.c(uoa.p.j(), uoa.p.B());
       Objects.requireNonNull(uoa.q);
       if (!PatchProxy.applyVoid(objArray, uoa, uoa1, "16")) {
          uoa.C.o(new h(uoa));
          uoa.C.n(uoa.y);
       }
       a v1 = uoa.v;
       GifshowActivity activity = this.getActivity();
       j oj1 = new j(uoa);
       a.p(v1, "view");
       a.p(activity, "activity");
       a.p(oj1, "listener");
       int i = 0x7f0a3d28;
       if (v1.getTag(i) == null) {
          v9 ov9 = new v9(activity, v1, oj1);
          v1.setTag(i, ov9);
          ov9.b(b5.a(ov9.b));
          ov9.b.k3(ov9.a);
       }
       uoa.p.W(uoa.x);
       RxBus f = RxBus.f;
       RxBus$ThreadMode mAIN = RxBus$ThreadMode.MAIN;
       uoa.X7(f.g(n.class, mAIN).subscribe(new p(uoa)));
       uoa.X7(f.g(l.class, mAIN).subscribe(new o(uoa)));
       t ot = f.g(r.class, mAIN);
       uoa.X7(ot.subscribe(new n(uoa)));
       uoa.X7(f.f(i.class).observeOn(d.a).subscribe(new m(uoa)));
       uoa.p.v(uoa.I);
       if (!PatchProxy.applyVoid(objArray, uoa, uoa1, "21")) {
          uoa.A.a(uoa.p.y().b(a.c, new w(uoa)));
       }
       if (!PatchProxy.applyVoid(objArray, uoa, uoa1, "5")) {
          Boolean uBoolean = PatchProxy.apply(objArray, objArray, a.class, "2");
          if (uBoolean == patchProxyRe) {
             uBoolean = a.b.get();
          }
          if (uBoolean.booleanValue()) {
             Object[] objArray1 = new Object[0];
             b.C().w("CommonKCubeActionBarPresenter", "runInitActionBarControl observerInitTabFinished", objArray1);
             j0 oj0 = j0.a(this.getActivity());
             Objects.requireNonNull(oj0);
             j0 oj01 = PatchProxy.apply(objArray, oj0, j0.class, str);
             if (oj01 != patchProxyRe) {
             }else {
                objArray = new Object[0];
                b.C().w("HomeGlobalEventModel", "observerInitTabFinished "+oj0, objArray);
                oj01 = oj0.a;
             }
             uoa.X7(oj01.subscribe(new k(uoa)));
          }else {
             Object[] objArray2 = new Object[0];
             b.C().w("CommonKCubeActionBarPresenter", "runInitActionBarControl", objArray2);
             this.X8();
          }
       }
       u1.a(this);
       b.a(0x430040f9).c(uoa.B);
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, a.class, "17")) {
          return;
       }
       this.F.a(this.v);
       if (this.E != null) {
          this.C.b();
       }
       this.C.destroy();
       u1.b(this);
       a tv = this.v;
       a.p(tv, "view");
       Object tag = tv.getTag(R.id.tag_status_bar_processor);
       if (tag != null) {
          tag.b.t3(tag.a);
          tv.setTag(R.id.tag_status_bar_processor, objArray);
       }
       this.A.c();
       b.a(0x430040f9).a(this.B);
       this.p.b0().n(this.z);
       this.p.w(this.I);
       k1.n(this);
       return;
    }
    public abstract j P8();
    public abstract Object R8();
    public abstract a S8();
    public abstract int V8();
    public List W8(h p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.w.get(p0.M2());
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, a.class, "6")) {
          return;
       }
       Object[] objArray = new Object[0];
       b.C().w("CommonKCubeActionBarPresenter", "initActionBarControl", objArray);
       b uob = this.p.y();
       this.A.a(uob.b(a.j, new v(this)));
       this.A.a(uob.b(a.k, new u(this)));
       this.A.a(uob.b(a.n, new a0(this)));
       this.A.a(uob.b(a.e, new x(this)));
       Object[] objArray1 = new Object[0];
       b.C().w("CommonKCubeActionBarPresenter", "watchPolyState TAB_BAR_VIEW_INFO "+this.C.c(), objArray1);
       this.A.a(uob.b(a.f, new z(this)));
       this.A.a(uob.b(a.g, new y(this)));
       a tv = this.v;
       Objects.requireNonNull(tv);
       this.A.a(uob.b(a.l, new g(tv)));
       tv = this.v;
       Objects.requireNonNull(tv);
       this.A.a(uob.b(a.m, new r(tv)));
       tv = this.v;
       Objects.requireNonNull(tv);
       this.A.a(uob.b(a.q, new t(tv)));
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, a.class, "23")) {
          return;
       }
       if (this.H != null) {
          return;
       }
       this.H = true;
       k1.s(new s(this), this, 500);
       return;
    }
    public final void Z8(){
       if (PatchProxy.applyVoid(null, this, a.class, "22")) {
          return;
       }
       if (this.p.s()) {
          this.Y8();
       }else {
          this.p.b0().f(this.z);
       }
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "2")) {
          return;
       }
       this.v = p0.findViewById(this.V8());
       return;
    }
    public Object getObjectByTag(String p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, a.class, "25");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0.equals("provider")) {
          return new h0();
       }
       return null;
    }
    public Map getObjectsByTag(String p0){
       HashMap obj = PatchProxy.applyOneRefs(p0, this, a.class, "26");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new HashMap();
       if (p0.equals("provider")) {
          obj.put(a.class, new h0());
       }else {
          obj.put(a.class, null);
       }
       return obj;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, a.class, "1")) {
          return;
       }
       this.w = this.r8("TAB_VIEW_TAP_LISTENERS");
       this.u = this.q8(d.class);
       this.t = this.r8("HOME_VIEW_PAGER");
       return;
    }
    public void onEventMainThread(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a.class, "15")) {
          return;
       }
       if (p0.a == 2) {
          this.C.E();
          this.C.s();
       }
       return;
    }
}
