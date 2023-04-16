package com.yxcorp.gifshow.hot.stagger.secondfloor.presenter.HotSecondFloorGuidePresenter;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.hot.stagger.secondfloor.presenter.HotSecondFloorGuidePresenter$a;
import nsd.u;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.hot.stagger.secondfloor.secondfloorstate.SlideConstants;
import java.lang.Object;
import java.util.Objects;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import qrd.p;
import java.lang.Number;
import lnc.a1;
import zf6.k;
import com.yxcorp.gifshow.hot.stagger.secondfloor.presenter.HotSecondFloorGuidePresenter$c;
import com.yxcorp.gifshow.hot.stagger.secondfloor.presenter.HotSecondFloorGuidePresenter$b;
import com.yxcorp.gifshow.findsecondfloor.widget.SecondFloorRefreshLayout;
import kotlin.jvm.internal.a;
import pfa.b;
import nfa.a;
import q87.c;
import com.kwai.library.widget.refresh.RefreshLayout;
import com.yxcorp.gifshow.recycler.fragment.RecyclerFragment;
import android.view.View;
import com.yxcorp.gifshow.util.rx.RxBus;
import fa5.c;
import brd.t;
import t45.d;
import brd.z;
import uva.h;
import erd.g;
import crd.b;
import fa5.b;
import uva.i;
import fa5.e;
import uva.j;
import fa5.d;
import uva.k;
import qvb.q;
import qvb.j;
import android.app.Activity;
import androidx.fragment.app.FragmentActivity;
import ib5.q;
import androidx.slidingpanelayout.widget.SlidingPaneLayout$d;
import androidx.fragment.app.Fragment;
import xl8.b;
import uva.l;
import erd.r;
import uva.m;
import mfa.b;
import jsa.a;
import com.yxcorp.gifshow.hot.stagger.secondfloor.presenter.HotSecondFloorGuidePresenter$onBind$2;
import uva.n;
import msd.l;
import ekd.k1;
import android.animation.ValueAnimator;
import com.airbnb.lottie.LottieAnimationView;
import android.view.ViewGroup;
import android.widget.TextView;
import lnc.b9;
import java.lang.Boolean;
import wva.b;
import android.view.Window;
import android.widget.FrameLayout;
import android.content.Context;
import i2b.a;
import uva.g;
import android.view.View$OnClickListener;
import androidx.constraintlayout.widget.ConstraintLayout;
import uva.b0;
import java.lang.Runnable;
import qvb.i;

public final class HotSecondFloorGuidePresenter extends PresenterV2	// class@0018d7
{
    public ValueAnimator A;
    public ValueAnimator B;
    public i C;
    public View D;
    public LottieAnimationView E;
    public TextView F;
    public FrameLayout G;
    public ConstraintLayout H;
    public View I;
    public b J;
    public b K;
    public b L;
    public float M;
    public final int N;
    public final int O;
    public float P;
    public boolean Q;
    public final String R;
    public final q S;
    public final HotSecondFloorGuidePresenter$b T;
    public RecyclerFragment p;
    public SecondFloorRefreshLayout q;
    public b r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public ValueAnimator x;
    public ValueAnimator y;
    public ValueAnimator z;
    public static final HotSecondFloorGuidePresenter$a U;

    static {
       HotSecondFloorGuidePresenter.U = new HotSecondFloorGuidePresenter$a(null);
    }
    public void HotSecondFloorGuidePresenter(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       SlideConstants slideConstan = SlideConstants.class;
       super();
       this.v = true;
       SlideConstants e = SlideConstants.e;
       Objects.requireNonNull(e);
       Number number = PatchProxy.apply(null, e, slideConstan, "3");
       if (number != patchProxyRe) {
       }else {
          number = SlideConstants.c.getValue();
       }
       int i = a1.e((float)number.intValue());
       this.N = i;
       Objects.requireNonNull(e);
       Number number1 = PatchProxy.apply(null, e, slideConstan, "4");
       if (number1 == patchProxyRe) {
          number1 = SlideConstants.d.getValue();
       }
       this.O = a1.e((float)number1.intValue());
       this.P = (float)i;
       this.Q = k.d();
       this.R = "https://static.yximgs.com/udata/pkg/kwai-client-image/hot_second_floor/hot_second_floor_guide.json";
       this.S = new HotSecondFloorGuidePresenter$c(this);
       this.T = new HotSecondFloorGuidePresenter$b(this);
       return;
    }
    public static final SecondFloorRefreshLayout P8(HotSecondFloorGuidePresenter p0){
       p0 = p0.q;
       if (p0 == null) {
          a.S("mRefreshLayout");
       }
       return p0;
    }
    public static final b R8(HotSecondFloorGuidePresenter p0){
       p0 = p0.r;
       if (p0 == null) {
          a.S("mSecondFloorState");
       }
       return p0;
    }
    public void E8(){
       HotSecondFloorGuidePresenter tC;
       z a;
       HotSecondFloorGuidePresenter hotSecondFlo = HotSecondFloorGuidePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, hotSecondFlo, "3")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.C().w("HotSecondFloorGuidePresenter", "onBind", objArray1);
       if (!PatchProxy.applyVoid(objArray, this, hotSecondFlo, "7")) {
          tC = this.p;
          if (tC == null) {
             a.S("mFragment");
          }
          RefreshLayout refreshLayou = tC.Ac();
          Objects.requireNonNull(refreshLayou, "null cannot be cast to non-null type com.yxcorp.gifshow.findsecondfloor.widget.SecondFloorRefreshLayout");
          this.q = refreshLayou;
          this.D = refreshLayou.getRefreshView();
       }
       if (!PatchProxy.applyVoid(objArray, this, hotSecondFlo, "8")) {
          RxBus f = RxBus.f;
          a = d.a;
          this.X7(f.f(c.class).observeOn(a).subscribe(new h(this)));
          this.X7(f.f(b.class).observeOn(a).subscribe(new i(this)));
          this.X7(f.f(e.class).observeOn(a).subscribe(new j(this)));
          this.X7(f.f(d.class).observeOn(a).subscribe(new k(this)));
       }
       tC = this.C;
       if (tC != null) {
          tC.h(this.S);
       }
       Activity activity = this.getActivity();
       if (!activity instanceof FragmentActivity) {
          activity = objArray;
       }
       if (activity != null) {
          q.p0(activity).v0(this.T);
       }
       if (!PatchProxy.applyVoid(objArray, this, hotSecondFlo, "5")) {
          hotSecondFlo = this.r;
          if (hotSecondFlo == null) {
             a.S("mSecondFloorState");
          }
          Objects.requireNonNull(hotSecondFlo);
          t ot = PatchProxy.apply(objArray, hotSecondFlo, b.class, "9");
          if (ot != PatchProxyResult.class) {
          }else if(hotSecondFlo.h.isDetached() || hotSecondFlo.h.getActivity() == null){
             ot = t.empty();
             a.o(ot, "Observable.empty\(\)");
          }else {
             ot = hotSecondFlo.e.b();
             a.o(ot, "mSecondFloorGuideCollapse.observe\(\)");
          }
          this.X7(ot.filter(l.b).subscribe(new m(this), b.a));
       }
       this.X7(RxBus.f.f(a.class).observeOn(d.a).subscribe(new n(new HotSecondFloorGuidePresenter$onBind$2(this))));
       return;
    }
    public void J8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, HotSecondFloorGuidePresenter.class, "23")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       a.C().w("HotSecondFloorGuidePresenter", "onUnbind", objArray1);
       this.S8();
       k1.n(this);
       this.Y8();
       HotSecondFloorGuidePresenter tC = this.C;
       if (tC != null) {
          tC.f(this.S);
       }
       Activity activity = this.getActivity();
       if (activity instanceof FragmentActivity) {
          objArray = activity;
       }
       if (objArray != null) {
          q.p0(objArray).C0(this.T);
       }
       return;
    }
    public final void S8(){
       if (PatchProxy.applyVoid(null, this, HotSecondFloorGuidePresenter.class, "24")) {
          return;
       }
       this.V8(this.x);
       this.V8(this.y);
       this.V8(this.z);
       this.V8(this.A);
       this.V8(this.B);
       return;
    }
    public final void V8(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, HotSecondFloorGuidePresenter.class, "25")) {
          return;
       }
       if (p0 != null) {
          p0.cancel();
       }
       if (p0 != null) {
          p0.removeAllListeners();
       }
       if (p0 != null) {
          p0.removeAllUpdateListeners();
       }
       return;
    }
    public final void W8(){
       if (PatchProxy.applyVoid(null, this, HotSecondFloorGuidePresenter.class, "6")) {
          return;
       }
       this.w = true;
       HotSecondFloorGuidePresenter tE = this.E;
       if (tE != null) {
          tE.f();
       }
       tE = this.H;
       int i = 8;
       if (tE != null) {
          tE.setVisibility(i);
       }
       this.Y8();
       this.S8();
       tE = this.I;
       if (tE != null) {
          tE.setVisibility(i);
       }
       tE = this.F;
       if (tE != null) {
          tE.setVisibility(i);
       }
       tE = this.q;
       if (tE == null) {
          a.S("mRefreshLayout");
       }
       tE.M(0, false);
       tE = this.r;
       if (tE == null) {
          a.S("mSecondFloorState");
       }
       tE.i(false);
       tE = this.q;
       if (tE == null) {
          a.S("mRefreshLayout");
       }
       tE.setGuideMode(false);
       this.P = (float)this.N;
       this.X8();
       tE = this.r;
       if (tE == null) {
          a.S("mSecondFloorState");
       }
       tE.f(false);
       return;
    }
    public final void X8(){
       if (PatchProxy.applyVoid(null, this, HotSecondFloorGuidePresenter.class, "19")) {
          return;
       }
       HotSecondFloorGuidePresenter tD = this.D;
       if (tD != null) {
          tD.setTranslationY(0);
       }
       tD = this.D;
       if (tD != null) {
          tD.setAlpha(0x3f800000);
       }
       tD = this.D;
       if (tD != null) {
          tD.setVisibility(0);
       }
       return;
    }
    public final void Y8(){
       if (PatchProxy.applyVoid(null, this, HotSecondFloorGuidePresenter.class, "26")) {
          return;
       }
       b9.a(this.J);
       b9.a(this.K);
       b9.a(this.L);
       return;
    }
    public final void Z8(){
       boolean b1;
       HotSecondFloorGuidePresenter hotSecondFlo = HotSecondFloorGuidePresenter.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, hotSecondFlo, "9")) {
          return;
       }
       HotSecondFloorGuidePresenter obj = PatchProxy.apply(objArray, this, hotSecondFlo, "27");
       boolean b = false;
       if (obj != PatchProxyResult.class) {
          b1 = obj.booleanValue();
       }else if(this.u != null){
          obj = this.q;
          if (obj == null) {
             a.S("mRefreshLayout");
          }
          if (!obj.u()) {
             b1 = true;
          }
       }
       b1 = false;
       if (b1) {
          this.u = b;
          if (!PatchProxy.applyVoid(objArray, this, hotSecondFlo, "10")) {
             Object[] objArray1 = new Object[b];
             a.C().w("HotSecondFloorGuidePresenter", "tryShowGuide", objArray1);
             if (b.a() && (this.s == null && this.v != null)) {
                objArray1 = new Object[b];
                a.C().w("HotSecondFloorGuidePresenter", "reallyShowGuide", objArray1);
                if (!PatchProxy.applyVoid(objArray, this, hotSecondFlo, "11")) {
                   hotSecondFlo = this.D;
                   if (hotSecondFlo != null) {
                      hotSecondFlo.setTranslationY((float)a1.e(70.00f));
                   }
                   hotSecondFlo = this.D;
                   if (hotSecondFlo != null) {
                      hotSecondFlo.setAlpha(0);
                   }
                   hotSecondFlo = this.D;
                   if (hotSecondFlo != null) {
                      hotSecondFlo.setVisibility(8);
                   }
                   Activity activity = this.getActivity();
                   if (activity != null) {
                      Window window = activity.getWindow();
                      if (window != null) {
                         View decorView = window.getDecorView();
                         if (decorView != null) {
                            FrameLayout uFrameLayout = decorView.findViewById(0x1020002);
                         label_00af :
                            uFrameLayout = a.d(this.getActivity(), R.layout.arg_RES_7f0d0604, uFrameLayout, true).findViewById(R.id.hot_second_floor_guide_container_layout);
                            this.G = uFrameLayout;
                            decorView = (uFrameLayout != null)? uFrameLayout.findViewById(R.id.hot_second_floor_guide_mask_view): objArray;
                            this.I = decorView;
                            if (decorView != null) {
                               decorView.setOnClickListener(new g(this));
                            }
                            hotSecondFlo = this.G;
                            ConstraintLayout uConstraintL = (hotSecondFlo != null)? hotSecondFlo.findViewById(R.id.hot_second_floor_guide_container_view): objArray;
                            this.H = uConstraintL;
                            hotSecondFlo = this.G;
                            LottieAnimationView lottieAnimat = (hotSecondFlo != null)? hotSecondFlo.findViewById(R.id.hot_second_floor_guide_lottie): objArray;
                            this.E = lottieAnimat;
                            if (lottieAnimat != null) {
                               lottieAnimat.setAnimationFromUrl(this.R);
                            }
                            hotSecondFlo = this.G;
                            if (hotSecondFlo != null) {
                               objArray = hotSecondFlo.findViewById(0x7f0a12f2);
                            }
                            this.F = objArray;
                         }
                      }
                   }
                   Object[] objArray2 = objArray;
                   goto label_00af ;
                }
                hotSecondFlo = this.r;
                if (hotSecondFlo == null) {
                   a.S("mSecondFloorState");
                }
                hotSecondFlo.i(true);
                hotSecondFlo = this.q;
                if (hotSecondFlo == null) {
                   a.S("mRefreshLayout");
                }
                hotSecondFlo.setGuideMode(true);
                this.s = true;
                k1.p(new b0(this), this);
             }
          }
       }
       return;
    }
    public void doBindView(View p0){
       PatchProxy.applyVoidOneRefs(p0, this, HotSecondFloorGuidePresenter.class, "1");
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, HotSecondFloorGuidePresenter.class, "2")) {
          return;
       }
       Object obj = this.r8("FRAGMENT");
       a.o(obj, "inject\(AccessIds.FRAGMENT\)");
       this.p = obj;
       this.C = this.r8("PAGE_LIST");
       obj = this.r8("HOT_SECOND_HOT_STATE");
       a.o(obj, "inject\(SecondFloorAccessIds.HOT_SECOND_HOT_STATE\)");
       this.r = obj;
       return;
    }
}
