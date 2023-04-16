package com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$a;
import nsd.u;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import ln5.c;
import java.util.HashMap;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$b;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$c;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$mTabSelfPageOffsetListener$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.kcube.decorator.IContainerDecorator;
import wra.b;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import wq6.f;
import java.util.List;
import wq6.g;
import java.util.Iterator;
import wq6.h;
import com.kwai.kcube.TabIdentifier;
import java.lang.Boolean;
import com.yxcorp.gifshow.DefaultHelper;
import java.lang.System;
import fr6.b;
import fr6.e;
import fr6.i;
import zq6.r;
import pn5.a;
import zq6.p;
import as6.b;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$j;
import z1.a;
import brd.t;
import pr6.d;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$k;
import brd.w;
import erd.c;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$l;
import erd.r;
import java.util.concurrent.TimeUnit;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$m;
import erd.g;
import crd.b;
import com.google.android.material.appbar.AppBarLayout$c;
import com.google.android.material.appbar.AppBarLayout;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$n;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$d;
import brd.a0;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$e;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$f;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$g;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$o;
import erd.o;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$p;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$q;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$h;
import androidx.core.view.ScrollStrategy;
import android.view.View;
import android.widget.LinearLayout;
import android.view.ViewGroup$LayoutParams;
import java.util.Objects;
import com.google.android.material.appbar.AppBarLayout$LayoutParams;
import com.yxcorp.gifshow.home.block.topbar.presenter.KCubeBlockTabPresenter$i;
import com.kwai.robust.PatchProxyResult;
import bo5.a;
import co5.p$b;
import co5.p;
import android.content.Context;
import com.kwai.component.homepage_interface.skin.HomeActionBarSkinHelper;
import lnc.a1;
import com.kwai.library.widget.textview.IconifyTextViewNew$a;

public final class KCubeBlockTabPresenter extends PresenterV2	// class@00167c
{
    public final int A;
    public final boolean p;
    public AppBarLayout q;
    public View r;
    public IContainerDecorator s;
    public b t;
    public final c u;
    public final HashMap v;
    public final AppBarLayout$c w;
    public final KCubeBlockTabPresenter$c x;
    public final p y;
    public final String z;
    public static final KCubeBlockTabPresenter$a B;

    static {
       KCubeBlockTabPresenter.B = new KCubeBlockTabPresenter$a(null);
    }
    public void KCubeBlockTabPresenter(String p0,int p1){
       a.p(p0, "decoratorType");
       super();
       this.z = p0;
       this.A = p1;
       boolean b = (p1)? true: false;
       this.p = b;
       this.u = new c();
       this.v = new HashMap();
       this.w = new KCubeBlockTabPresenter$b(this);
       this.x = new KCubeBlockTabPresenter$c(this);
       this.y = s.c(new KCubeBlockTabPresenter$mTabSelfPageOffsetListener$2(this));
       return;
    }
    public static final IContainerDecorator P8(KCubeBlockTabPresenter p0){
       p0 = p0.s;
       if (p0 == null) {
          a.S("mContainerDecorator");
       }
       return p0;
    }
    public static final b R8(KCubeBlockTabPresenter p0){
       p0 = p0.t;
       if (p0 == null) {
          a.S("mHomeBlockViewState");
       }
       return p0;
    }
    public void E8(){
       KCubeBlockTabPresenter kCubeBlockTa = KCubeBlockTabPresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, kCubeBlockTa, "3")) {
          return;
       }
       KCubeBlockTabPresenter ts = this.s;
       if (ts == null) {
          a.S("mContainerDecorator");
       }
       Iterator iterator = ts.c().getChildren().iterator();
       while (iterator.hasNext()) {
          String id = iterator.next().M2().getId();
          if (id != null) {
             Boolean uBoolean = this.v.put(id, Boolean.FALSE);
          }
       }
       DefaultHelper.h(this.v);
       ts = this.s;
       if (ts == null) {
          a.S("mContainerDecorator");
       }
       boolean b = true;
       if (ts.c().isSelected()) {
          DefaultHelper.k(System.currentTimeMillis());
          DefaultHelper.i(b);
       }
       ts = this.s;
       if (ts == null) {
          a.S("mContainerDecorator");
       }
       ts.c().b0().e(this.S8());
       ts = this.s;
       if (ts == null) {
          a.S("mContainerDecorator");
       }
       ts.c().W(this.x);
       ts = this.s;
       if (ts == null) {
          a.S("mContainerDecorator");
       }
       p b1 = a.b;
       a.o(b1, "HomeBlockTopStateId.BLOCK_TAB_TRANSLATION_Y");
       ts.c().e0().a(b1, this.u);
       if (this.p != null) {
          kCubeBlockTa = this.s;
          if (kCubeBlockTa == null) {
             a.S("mContainerDecorator");
          }
          kCubeBlockTa.c().D().a(new KCubeBlockTabPresenter$j(this));
          kCubeBlockTa = this.t;
          if (kCubeBlockTa == null) {
             a.S("mHomeBlockViewState");
          }
          t ot = kCubeBlockTa.b();
          KCubeBlockTabPresenter ts1 = this.s;
          if (ts1 == null) {
             a.S("mContainerDecorator");
          }
          this.X7(t.combineLatest(ot, ts1.e().h().i(), KCubeBlockTabPresenter$k.a).filter(KCubeBlockTabPresenter$l.b).delay(500, TimeUnit.MILLISECONDS).subscribe(new KCubeBlockTabPresenter$m(this)));
          kCubeBlockTa = this.q;
          if (kCubeBlockTa == null) {
             a.S("mAppBarLayout");
          }
          kCubeBlockTa.c(this.w);
          kCubeBlockTa = this.t;
          if (kCubeBlockTa == null) {
             a.S("mHomeBlockViewState");
          }
          this.X7(kCubeBlockTa.d.subscribe(new KCubeBlockTabPresenter$n(this)));
          kCubeBlockTa = this.A;
          if (kCubeBlockTa != b) {
             if (kCubeBlockTa == 2) {
                kCubeBlockTa = this.s;
                if (kCubeBlockTa == null) {
                   a.S("mContainerDecorator");
                }
                this.X7(kCubeBlockTa.e().h().i().filter(KCubeBlockTabPresenter$d.b).firstOrError().Q(new KCubeBlockTabPresenter$e(this)));
                kCubeBlockTa = this.t;
                if (kCubeBlockTa == null) {
                   a.S("mHomeBlockViewState");
                }
                this.X7(kCubeBlockTa.b().filter(KCubeBlockTabPresenter$f.b).distinctUntilChanged().subscribe(new KCubeBlockTabPresenter$g(this)));
             }
          }else {
             kCubeBlockTa = this.t;
             if (kCubeBlockTa == null) {
                a.S("mHomeBlockViewState");
             }
             this.X7(kCubeBlockTa.b().map(KCubeBlockTabPresenter$o.b).filter(KCubeBlockTabPresenter$p.b).firstOrError().Q(new KCubeBlockTabPresenter$q(this)));
          }
          if (this.A == b) {
             kCubeBlockTa = this.t;
             if (kCubeBlockTa == null) {
                a.S("mHomeBlockViewState");
             }
             this.X7(kCubeBlockTa.b().subscribe(new KCubeBlockTabPresenter$h(this)));
          }
       }else if(PatchProxy.applyVoid(objArray, this, kCubeBlockTa, "6")){
          kCubeBlockTa = this.t;
          if (kCubeBlockTa == null) {
             a.S("mHomeBlockViewState");
          }
          kCubeBlockTa.f(2);
          kCubeBlockTa = this.s;
          if (kCubeBlockTa == null) {
             a.S("mContainerDecorator");
          }
          kCubeBlockTa.c().I0(ScrollStrategy.DISABLE_ALL_TOUCH);
          kCubeBlockTa = this.q;
          if (kCubeBlockTa == null) {
             a.S("mAppBarLayout");
          }
          int i = 0;
          View childAt = kCubeBlockTa.getChildAt(i);
          ts = this.r;
          if (ts == null) {
             a.S("mTabs");
          }
          ts.setVisibility(8);
          a.o(childAt, "appbarChild");
          ViewGroup$LayoutParams layoutParams = childAt.getLayoutParams();
          Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout.LayoutParams");
          layoutParams.d(i);
       }
       kCubeBlockTa = this.s;
       if (kCubeBlockTa == null) {
          a.S("mContainerDecorator");
       }
       if (kCubeBlockTa.e().h().c()) {
          this.V8();
       }else {
          kCubeBlockTa = this.s;
          if (kCubeBlockTa == null) {
             a.S("mContainerDecorator");
          }
          this.X7(kCubeBlockTa.e().h().j().subscribe(new KCubeBlockTabPresenter$i(this)));
       }
       return;
    }
    public void J8(){
       KCubeBlockTabPresenter tq;
       if (PatchProxy.applyVoid(null, this, KCubeBlockTabPresenter.class, "4")) {
          return;
       }
       if (this.p != null) {
          tq = this.q;
          if (tq == null) {
             a.S("mAppBarLayout");
          }
          tq.o(this.w);
       }
       tq = this.s;
       String str = "mContainerDecorator";
       if (tq == null) {
          a.S(str);
       }
       tq.c().b(this.x);
       tq = this.s;
       if (tq == null) {
          a.S(str);
       }
       tq.c().b0().m(this.S8());
       return;
    }
    public final e S8(){
       Object obj = PatchProxy.apply(null, this, KCubeBlockTabPresenter.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.y.getValue();
    }
    public final void V8(){
       if (PatchProxy.applyVoid(null, this, KCubeBlockTabPresenter.class, "5")) {
          return;
       }
       KCubeBlockTabPresenter ts = this.s;
       String str = "mContainerDecorator";
       if (ts == null) {
          a.S(str);
       }
       r or = ts.c().e0();
       p b = a.B;
       a.o(b, "HomeTopStateId.TAB_TRIANGLE_NOTIFY");
       p$b uob = p.c();
       KCubeBlockTabPresenter ts1 = this.s;
       if (ts1 == null) {
          a.S(str);
       }
       uob.b(HomeActionBarSkinHelper.l(ts1.c().j(), this.getContext()));
       uob.a(0);
       uob.d((float)a1.e(0x3f000000));
       KCubeBlockTabPresenter tt = this.t;
       if (tt == null) {
          a.S("mHomeBlockViewState");
       }
       int b1 = (!tt.c())? IconifyTextViewNew$a.b: IconifyTextViewNew$a.a;
       uob.c(b1);
       or.a(b, p.d(uob));
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, KCubeBlockTabPresenter.class, "2")) {
          return;
       }
       Objects.requireNonNull(p0, "null cannot be cast to non-null type com.google.android.material.appbar.AppBarLayout");
       this.q = p0;
       p0 = p0.findViewById(R.id.block_tabs);
       a.o(p0, "rootView.findViewById\(R.id.block_tabs\)");
       this.r = p0;
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, KCubeBlockTabPresenter.class, "1")) {
          return;
       }
       Object obj = this.q8(IContainerDecorator.class);
       a.o(obj, "inject\(IContainerDecorator::class.java\)");
       this.s = obj;
       obj = this.q8(b.class);
       a.o(obj, "inject\(HomeBlockViewState::class.java\)");
       this.t = obj;
       return;
    }
}
