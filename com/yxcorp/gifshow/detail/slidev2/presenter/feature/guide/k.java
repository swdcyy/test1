package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.k;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import j8a.i0;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.k$a;
import j8a.o0;
import java.lang.String;
import android.view.MotionEvent;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import vy6.a;
import java.util.List;
import java.util.Set;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import j8a.p0;
import erd.g;
import crd.b;
import brd.t;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.p;
import t45.d;
import brd.z;
import j8a.q0;
import java.lang.Runnable;
import ekd.k1;
import tkd.b;
import tkd.d;
import ayb.i;
import fda.b;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import j8a.r0;
import j8a.s0;
import android.app.Activity;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewParent;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import qvb.q;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import im8.f;
import com.yxcorp.utility.n;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import android.widget.ImageView;
import android.animation.AnimatorSet;
import android.view.View$OnTouchListener;
import j8a.j0;
import android.view.ViewConfiguration;
import android.graphics.PointF;
import java.lang.Float;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.k$b;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import hn5.n;
import hn5.m;
import android.content.Context;
import qe6.b;
import xx9.a;
import y85.a;
import w85.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import java.util.Objects;
import uw9.c;
import android.content.SharedPreferences;
import android.animation.ValueAnimator;
import java.lang.Integer;
import q07.a;
import java.lang.CharSequence;
import android.text.TextUtils;
import fda.c;
import rf5.u;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import vw5.a;
import tw5.b;
import android.content.Intent;
import android.net.Uri;
import android.content.SharedPreferences$Editor;
import oe6.g;
import androidx.fragment.app.FragmentActivity;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.k$c;
import q07.c;
import j8a.k0;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.j;
import w4.j;
import j8a.n0;
import java.lang.Exception;
import kotlin.jvm.internal.a;

public class k extends PresenterV2	// class@001998
{
    public QPhoto A;
    public a B;
    public boolean C;
    public boolean D;
    public t E;
    public boolean F;
    public String G;
    public long H;
    public final Runnable I;
    public int J;
    public View K;
    public int L;
    public int M;
    public boolean N;
    public Runnable O;
    public boolean P;
    public boolean Q;
    public Runnable R;
    public AnimatorSet S;
    public boolean T;
    public q U;
    public a U0;
    public final int V;
    public NasaBizParam V0;
    public final int W;
    public final a W0;
    public final String X;
    public k3 X0;
    public SlidePlayViewModel Y;
    public a Z;
    public View p;
    public TextView q;
    public LottieAnimationView r;
    public f s;
    public f t;
    public f u;
    public u v;
    public BaseFragment w;
    public Set x;
    public t y;
    public List z;

    public void k(){
       super();
       this.H = 0;
       this.I = new i0(this);
       this.V = 1;
       this.W = 2;
       this.X = "up_slide";
       this.W0 = new k$a(this);
       this.X0 = new o0(this);
    }
    public void k(boolean p0,String p1){
       super();
       this.H = 0;
       this.I = new i0(this);
       this.V = 1;
       this.W = 2;
       this.X = "up_slide";
       this.W0 = new k$a(this);
       this.X0 = new o0(this);
       this.D = p0;
       this.G = p1;
    }
    public static void P8(k p0,MotionEvent p1){
       p0.V8();
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, k.class, "5")) {
          return;
       }
       this.Y = SlidePlayViewModel.B0(this.w.getParentFragment());
       this.N = false;
       this.e9();
       k tY = this.Y;
       if (tY != null) {
          tY.P(this.w, this.W0);
       }else {
          tY = this.z;
          if (tY != null) {
             tY.add(this.W0);
          }
       }
       this.x.add(this.X0);
       this.C = this.w.getParentFragment().K0();
       this.X7(this.y.subscribe(new p0(this)));
       RxBus f = RxBus.f;
       this.X7(f.f(p.class).observeOn(d.a).subscribe(new q0(this)));
       k tI = this.I;
       if (tI != null) {
          k1.m(tI);
       }
       if (d.a(0x4f878389).CN()) {
          this.X7(f.g(b.class, RxBus$ThreadMode.MAIN).subscribe(new r0(this)));
       }else {
          this.X7(this.w.getParentFragment().n1().subscribe(new s0(this)));
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, k.class, "4")) {
          return;
       }
       ViewStub viewStub = this.getActivity().findViewById(R.id.up_slide_guide_layout_stub);
       this.p = (viewStub != null && viewStub.getParent() != null)? viewStub.inflate(): this.getActivity().findViewById(0x7f0a1192);
       this.q = this.getActivity().findViewById(0x7f0a11a9);
       this.r = this.getActivity().findViewById(0x7f0a4338);
       this.K = this.getActivity().findViewById(0x7f0a11a1);
       return;
    }
    public void J8(){
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "8")) {
          return;
       }
       this.d9();
       k tY = this.Y;
       if (tY != null) {
          tY.D(this.w, this.W0);
       }else {
          tY = this.z;
          if (tY != null) {
             tY.remove(this.W0);
          }
       }
       this.x.remove(this.X0);
       if (!PatchProxy.applyVoid(objArray, this, ok, "12")) {
          ok = this.Y;
          if (ok != null) {
             ok.b(this.X8());
          }
       }
       ok = this.I;
       if (ok != null) {
          k1.m(ok);
       }
       return;
    }
    public boolean R8(){
       Object obj = PatchProxy.apply(null, this, k.class, "14");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.S8() && !this.Y8())? true: false;
       return b;
    }
    public final boolean S8(){
       k obj = PatchProxy.apply(null, this, k.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.Y;
       boolean b = true;
       if (obj != null && (obj.L0() > b && (this.b9() && !this.s.get().booleanValue()))) {
          obj = this.Y;
          if (obj != null && (!obj.r() && (this.a9() && (!n.I(this.getActivity()) && !SlideGuideManager.a().b(this.getActivity()))))) {
          label_005d :
             return b;
          }
       }
    label_005c :
       b = false;
       goto label_005d ;
    }
    public void V8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "24")) {
          return;
       }
       this.d9();
       k1.m(this.I);
       if (this.N != null || (this.Q == null || (this.p != null && this.q != null))) {
          this.s.set(Boolean.FALSE);
          this.t.set(Boolean.TRUE);
          k tr = this.r;
          if (tr == null) {
             return;
          }else {
             k tR = this.R;
             if (tR != null) {
                tr.removeCallbacks(tR);
             }
             this.r.f();
             this.r.t();
             tr = this.S;
             if (tr != null) {
                tr.removeAllListeners();
                this.S.cancel();
                this.S = objArray;
             }
             int i = 8;
             this.p.setVisibility(i);
             this.r.setVisibility(i);
             this.q.setVisibility(i);
             this.p.setOnTouchListener(objArray);
             if (this.P != null) {
                tr = this.Y;
                if (tr != null) {
                   tr.J1(this.L, this.M);
                }
             }
             this.N = true;
             this.Q = false;
             j0 oj0 = new j0(this);
             this.O = oj0;
             this.p.postDelayed(oj0, (long)ViewConfiguration.getJumpTapTimeout());
             SlideGuideManager.a().f(false);
          }
       }
       return;
    }
    public final PointF W8(PointF p0,PointF p1,float p2,float p3){
       if (PatchProxy.isSupport(k.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, k.class, "21");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new PointF(((p1.x - p0.x) * p2), ((p1.y - p0.y) * p3));
    }
    public final q X8(){
       k$b uob;
       k obj = PatchProxy.apply(null, this, k.class, "13");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.U;
       if (obj == null) {
          uob = new k$b(this);
          this.U = uob;
       }
       return uob;
    }
    public final boolean Y8(){
       Object obj = PatchProxy.apply(null, this, k.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       int i = 0x4f878389;
       boolean b = true;
       if (d.a(i).Cw(this.V0, "UP_DOWN_SLIDE")) {
          return b;
       }
       if (!m.a().U3(this.getActivity()) || !d.a(i).sN(this.V0, "UP_DOWN_SLIDE")) {
          b = false;
       }
       return b;
    }
    public final boolean Z8(){
       boolean b;
       k obj = PatchProxy.apply(null, this, k.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (b.a() && (this.b9() && (!this.s.get().booleanValue() && !this.Z.c()))) {
          obj = this.Y;
          if (obj == null || !obj.r()) {
             b = false;
          label_0044 :
             return b;
          }
       }
    label_0043 :
       b = true;
       goto label_0044 ;
    }
    public boolean a9(){
       boolean b = (this.C != null && this.T != null)? true: false;
       return b;
    }
    public boolean b9(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       NasaFeatureGuideManager obj = PatchProxy.apply(objArray, this, k.class, "27");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       if (this.D != null) {
          return true;
       }
       if (!this.B.h().b()) {
          return NasaFeatureGuideManager.f().n();
       }
       obj = NasaFeatureGuideManager.f();
       Objects.requireNonNull(obj);
       Object obj1 = PatchProxy.apply(objArray, obj, NasaFeatureGuideManager.class, "6");
       boolean b = (obj1 != patchProxyRe)? obj1.booleanValue(): c.a.getBoolean("TrendingDetailPageGuideShowed", false);
       return (b ^ true);
    }
    public final void c9(int p0,int p1,ValueAnimator p2){
       if (PatchProxy.isSupport(k.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, k.class, "22")) {
          return;
       }
       if (this.r != null) {
          k tq = this.q;
          if (tq != null) {
             this.P = true;
             tq.setTranslationY((- p2.getAnimatedValue().y));
             this.r.setTranslationY((- p2.getAnimatedValue().y));
             tq = this.Y;
             if (tq != null) {
                tq.J1(p0, (int)((float)p1 + p2.getAnimatedValue().y));
             }
          }
       }
       return;
    }
    public final void d9(){
       if (PatchProxy.applyVoid(null, this, k.class, "30")) {
          return;
       }
       k tU0 = this.U0;
       if (tU0 != null) {
          tU0.a();
          this.U0 = null;
       }
       return;
    }
    public void e9(){
       if (PatchProxy.applyVoid(null, this, k.class, "17")) {
          return;
       }
       k tO = this.O;
       if (tO != null) {
          k tp = this.p;
          if (tp != null) {
             tp.removeCallbacks(tO);
          }
       }
       return;
    }
    public final void h9(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "29")) {
          return;
       }
       if (TextUtils.isEmpty(p0)) {
          return;
       }
       c uoc = new c();
       uoc.a("up_slide");
       uoc.b(p0);
       RxBus.f.b(uoc);
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, k.class, "1")) {
          return;
       }
       this.s = this.x8("DETAIL_HAS_SHOWN_GUIDE");
       this.t = this.x8("DETAIL_CAN_CLEAR_SCREEN");
       this.u = this.x8("DETAIL_FROM_SLIDE");
       this.v = this.q8(u.class);
       this.w = this.r8("DETAIL_FRAGMENT");
       this.x = this.r8("DETAIL_SCREEN_TOUCH_LISTENER");
       this.y = this.r8("DETAIL_CANCEL_GUIDE_OBSERVABLE");
       this.z = this.t8("DETAIL_ATTACH_LISTENERS");
       this.A = this.q8(QPhoto.class);
       this.E = this.r8("DETAIL_PLAY_TIME_DOWN_OBSERVABLE");
       this.B = this.q8(a.class);
       this.Z = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       this.V0 = this.q8(NasaBizParam.class);
       return;
    }
    public void j9(){
       if (PatchProxy.applyVoid(null, this, k.class, "26")) {
          return;
       }
       int i = -680793205;
       if (this.getActivity() != null && this.V0.getNasaSlideParam().isNearbyPage()) {
          d.a(i).T00().a();
          return;
       }else if(this.getActivity() != null && d.a(i).E8(this.getActivity().getIntent().getData())){
          return;
       }else if(this.B.h().b()){
          NasaFeatureGuideManager nasaFeatureG = NasaFeatureGuideManager.f();
          Objects.requireNonNull(nasaFeatureG);
          NasaFeatureGuideManager nasaFeatureG1 = NasaFeatureGuideManager.class;
          if (!PatchProxy.isSupport(nasaFeatureG1) || !PatchProxy.applyVoidOneRefs(Boolean.TRUE, nasaFeatureG, nasaFeatureG1, "7")) {
             SharedPreferences$Editor uEditor = c.a.edit();
             uEditor.putBoolean("TrendingDetailPageGuideShowed", true);
             g.a(uEditor);
          }
       }else {
          NasaFeatureGuideManager.f().s(false);
       }
       return;
    }
    public void k9(){
       boolean b;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "18")) {
          return;
       }
       Object obj = PatchProxy.apply(objArray, this, ok, "10");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else {
          b = this.F;
          if (b == null) {
             b = d.a(0x4f878389).CN();
             this.F = b;
          }
       }
       if (b) {
          return;
       }else {
          this.l9(-1);
          return;
       }
    }
    public void l9(int p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, ok, "19")) {
          return;
       }
       ok = this.w;
       if (ok == null || (ok.getActivity() != null && !this.w.getActivity().isFinishing())) {
          if (VisitorModeManager.f()) {
             return;
          }else if(this.p == null || this.getContext() == null){
             k$c uoc = new k$c(this, 1100, this.w.getActivity());
             this.U0 = uoc;
             try{
                c.a(uoc);
                this.v.F(false, 7);
                this.p.postDelayed(new k0(this), 200);
                this.s.set(Boolean.TRUE);
                this.t.set(Boolean.FALSE);
                this.Q = true;
                a.h(this.getContext(), R.raw.arg_RES_7f0f0052).addListener(new j(this, p0)).addFailureListener(new n0(this, p0));
             }catch(java.lang.Exception e5){
                e5.printStackTrace();
                this.d9();
             }
          }
       }
    }
    public void m9(){
       boolean b;
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "2")) {
          return;
       }
       if (this.Z8()) {
          return;
       }
       if (this.u.get().booleanValue()) {
          a uoa = this.B.h();
          Objects.requireNonNull(uoa);
          Object obj = PatchProxy.apply(objArray, uoa, a.class, "7");
          if (obj != PatchProxyResult.class) {
             b = obj.booleanValue();
          }else if(uoa.j != null){
             b = uoa.g;
          }else {
             NasaSlideParam nasaSlidePar = uoa.m.getNasaSlideParam();
             a.o(nasaSlidePar, "nasaBizParam.nasaSlideParam");
             b = nasaSlidePar.isNearbyPage();
          }
          if (b) {
             return;
          }
       }
       if (this.u.get().booleanValue()) {
          this.j9();
          return;
       }else if(PatchProxy.applyVoid(objArray, this, ok, "9")){
          if (this.R8()) {
             this.k9();
          }else if(PatchProxy.applyVoid(objArray, this, ok, "11")){
             ok = this.Y;
             if (ok != null) {
                ok.e(this.X8());
             }
          }
       }
       return;
    }
}
