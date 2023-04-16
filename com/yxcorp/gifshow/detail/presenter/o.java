package com.yxcorp.gifshow.detail.presenter.o;
import y4a.j;
import com.yxcorp.gifshow.detail.presenter.o$a;
import com.yxcorp.gifshow.detail.presenter.o$b;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import android.view.View;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import androidx.recyclerview.widget.RecyclerView;
import jta.c;
import r7a.f;
import com.yxcorp.gifshow.widget.ViewStubInflater2;
import y4a.f0;
import io.reactivex.internal.functions.Functions;
import erd.g;
import crd.b;
import brd.t;
import y4a.e0;
import tw6.e;
import com.yxcorp.gifshow.recycler.fragment.FragmentCompositeLifecycleState;
import com.yxcorp.gifshow.detail.presenter.n;
import erd.r;
import y4a.g0;
import android.view.GestureDetector;
import android.content.Context;
import android.view.GestureDetector$SimpleOnGestureListener;
import android.view.GestureDetector$OnGestureListener;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import com.yxcorp.gifshow.detail.slidev2.experiment.NasaExperimentUtils;
import wh5.c;
import im8.f;
import android.view.ViewGroup;
import java.lang.Number;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.kwai.library.widget.imageview.scale.ScaleHelpView;
import xx9.a;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibleEvent$Operation;
import com.kwai.component.photo.detail.core.event.ChangeScreenVisibilityCause;
import com.yxcorp.gifshow.entity.QPhoto;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import android.widget.FrameLayout;
import r1a.g;
import d0a.o;
import brd.y;
import mrd.a;
import qvb.i;
import wvb.e;
import qvb.n0;
import android.view.ViewParent;
import android.widget.TextView;
import android.widget.FrameLayout$LayoutParams;
import lnc.a1;
import ekd.i;
import com.yxcorp.utility.n;
import android.view.ViewGroup$LayoutParams;
import java.lang.Math;
import java.lang.CharSequence;
import lnc.ja;
import w85.a;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import ekd.m1;
import androidx.core.content.ContextCompat;
import android.content.res.Resources;
import com.kwai.component.uiconfig.homeslideplay.NasaSlidePlayExperimentUtil;
import android.graphics.drawable.Drawable;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;

public class o extends j	// class@0016f6
{
    public TextView A;
    public ViewStubInflater2 B;
    public a C;
    public RecyclerView D;
    public f E;
    public t F;
    public a G;
    public a H;
    public f I;
    public PhotoDetailParam J;
    public NasaBizParam K;
    public a L;
    public y M;
    public float N;
    public boolean O;
    public boolean P;
    public float Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public GestureDetector U;
    public t V;
    public e W;
    public final c X;
    public SlidePlayViewModel y;
    public View z;

    public void o(){
       super();
       this.W = new o$a(this);
       this.X = new o$b(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "12")) {
          return;
       }
       super.E8();
       SlidePlayViewModel slidePlayVie = SlidePlayViewModel.B0(this.r.getParentFragment());
       this.y = slidePlayVie;
       this.T = slidePlayVie.r();
       this.D = this.m8().findViewById(0x7f0a2d47);
       if (this.T != null) {
          this.a9();
       }else {
          this.d9();
       }
       this.I.a(this.X);
       this.B.d(this.m8());
       g e = Functions.e;
       this.X7(this.F.subscribe(new f0(this), e));
       this.X7(this.V.subscribe(new e0(this), e));
       this.y.c0(this.W);
       j tr = this.r;
       if (tr instanceof BaseFragment) {
          this.X7(tr.Vg().f().filter(n.b).subscribe(new g0(this), e));
       }
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       this.U = new GestureDetector(this.getContext(), new GestureDetector$SimpleOnGestureListener());
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, o.class, "19")) {
          return;
       }
       this.Z8();
       this.I.c(this.X);
       this.y.d0(this.W);
       return;
    }
    public boolean P8(){
       Object obj = PatchProxy.apply(null, this, o.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (!NasaExperimentUtils.n() && !c.b())? true: false;
       return b;
    }
    public RecyclerView R8(){
       Object obj = PatchProxy.apply(null, this, o.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.E.get();
    }
    public View S8(){
       o obj = PatchProxy.apply(null, this, o.class, "11");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.B.c()) {
          return this.B.a();
       }
       obj = this.D;
       if (obj != null && !obj.getVisibility()) {
          return this.D;
       }
       return null;
    }
    public int V8(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return p0.getMeasuredHeight();
    }
    public void W8(MotionEvent p0){
       Object[] objArray;
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "6")) {
          return;
       }
       boolean b = false;
       this.O = b;
       this.p.setBackgroundColor(b);
       float f = 0x3f800000;
       if (this.p.getParentView() != null) {
          this.p.getParentView().setAlpha(f);
       }
       if (this.b9()) {
          return;
       }else {
          String str = "SlidePlayLongAtlasScaleHelperPresenter";
          if (this.S != null && this.P == null) {
             this.C.e(b);
             this.C.d(new ChangeScreenVisibleEvent(this.v, ChangeScreenVisibleEvent$Operation.UNCLEAR, ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN));
             objArray = new Object[b];
             o.C().w(str, "不允许进入清屏，松手恢复原状"+this.v.getPhotoId(), objArray);
             return;
          }else if(this.p.getParentView() != null){
             this.p.getParentView().removeView(this.A);
          }
          o tP = this.P;
          if (tP == null || (this.Q - f < 0 || (tP == null && this.Q - 0x3fc00000 < 0))) {
             if (this.C.c()) {
                Object[] objArray1 = new Object[b];
                o.C().w(str, "缩放不到位，退出清屏", objArray1);
                this.C.d(new ChangeScreenVisibleEvent(this.v, ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN));
                if (this.P != null && this.Q - f < 0) {
                   g.a(this.r, this.v, b, "SLIDE");
                }
             }
          }else {
             objArray = new Object[b];
             o.C().w(str, "显示控制栏"+this.C.c(), objArray);
             if (this.C.c()) {
                g.a(this.r, this.v, true, null);
                this.M.onNext(new o(true, true, this.v.isAllowPhotoDownload()));
             }
          }
          return;
       }
    }
    public void X8(MotionEvent p0){
       boolean b;
       i oi;
       o oo = o.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oo, "4")) {
          return;
       }
       this.N = this.c9(p0);
       String str = 2;
       Object[] objArray = null;
       int i = 0;
       if (this.G.i() == null || (!this.G.i().booleanValue() && (this.H.i() == null || !this.H.i().booleanValue()))) {
          p0 = PatchProxy.apply(objArray, this, oo, "17");
          if (p0 != PatchProxyResult.class) {
             b = p0.booleanValue();
          }else if(this.y.X0() instanceof e){
             oi = this.y.X0().m();
          }else {
             oi = this.y.X0();
          }
          if (oi instanceof n0 && (oi.isLoading() && oi.K())) {
             b = true;
          }else {
             b = false;
          }
          if (!b) {
             o tz = this.z;
             if (tz != null && (tz.getVisibility() && this.v.getFilterStatus() != str)) {
                b = false;
             label_009c :
                this.S = b;
                this.p.setBackgroundColor(i);
                if (this.p.getParentView() != null) {
                   this.p.getParentView().setAlpha(0);
                }
                if (this.b9()) {
                   return;
                }else {
                   b = this.C.c();
                   this.P = b;
                   if (this.S != null && !b) {
                      Object[] objArray1 = new Object[i];
                      o.C().w("SlidePlayLongAtlasScaleHelperPresenter", "不允许进清屏模式"+this.v.getPhotoId(), objArray1);
                      this.C.d(new ChangeScreenVisibleEvent(this.v, ChangeScreenVisibleEvent$Operation.CLEAR, ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN));
                      this.C.e(true);
                      return;
                   }else {
                      this.Q = 0;
                      if (b) {
                         this.M.onNext(new o(str));
                      }else if(!PatchProxy.applyVoid(objArray, this, oo, "13") && this.A.getParent() == null){
                         FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-2, -2);
                         layoutParams.gravity = 1;
                         layoutParams.topMargin = a1.e(10.00f);
                         if (i.c()) {
                            layoutParams.topMargin = layoutParams.topMargin + n.A(this.getContext());
                         }
                         this.A.setVisibility(8);
                         this.p.getParentView().addView(this.A, layoutParams);
                      }
                      this.C.d(new ChangeScreenVisibleEvent(this.v, ChangeScreenVisibilityCause.SCALE_SCREEN_CLEAN));
                      Object[] objArray2 = new Object[i];
                      o.C().w("SlidePlayLongAtlasScaleHelperPresenter", "开始缩放清屏", objArray2);
                      return;
                   }
                }
             }
          }
       }
    label_009b :
       b = true;
       goto label_009c ;
    }
    public void Y8(MotionEvent p0,boolean p1){
       o oo = o.class;
       if (PatchProxy.isSupport(oo) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, oo, "5")) {
          return;
       }
       if (p1 && p0.getPointerCount() == 2) {
          if (Math.abs((this.c9(p0) - this.N)) - 0x40400000 < 0) {
             return;
          }else {
             p1 = true;
             float f = 0x3f800000;
             if (this.O == null) {
                this.O = p1;
                this.p.setBackgroundColor(0xff000000);
                if (this.p.getParentView() != null) {
                   this.p.getParentView().setAlpha(f);
                }
             }
             if (!this.b9() && this.p.getScaleView() != null) {
                float scaleX = this.p.getScaleView().getScaleX();
                this.Q = scaleX;
                if (this.P == null && this.S == null) {
                   if (scaleX - 0x3fc00000 >= 0) {
                      this.A.setText(this.getContext().getString(R.string.arg_RES_7f10383e));
                      if (this.R == null) {
                         this.R = p1;
                         ja.a();
                      }
                   }else if(scaleX - f > 0){
                      this.A.setVisibility(0);
                      this.A.setText(this.getContext().getString(R.string.arg_RES_7f103839));
                      this.R = false;
                   }else if(scaleX - f <= 0){
                      this.A.setVisibility(8);
                      this.R = false;
                   }
                }
             }
          }
       }
    label_00c1 :
       return;
    }
    public void a9(){
       if (PatchProxy.applyVoid(null, this, o.class, "7")) {
          return;
       }
       this.p.e(this.U);
       this.p.setScaleEnabled(false);
       return;
    }
    public final boolean b9(){
       boolean b1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       Object obj = PatchProxy.apply(null, this, oo, "14");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!NasaExperimentUtils.n()) {
          Object obj1 = PatchProxy.apply(null, this, oo, "15");
          if (obj1 != patchProxyRe) {
             b1 = obj1.booleanValue();
          }else if(this.L.g() && this.y.b1()){
             b1 = true;
          }else {
             b1 = false;
          }
          if (b1 || (!c.b() && !VisitorModeManager.f())) {
          label_0050 :
             return b;
          }
       }
    label_004f :
       b = true;
       goto label_0050 ;
    }
    public final float c9(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, o.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj.floatValue();
       }
       return (float)Math.sqrt((double)(((p0.getX(1) - p0.getX(0)) * (p0.getX(1) - p0.getX(0))) + ((p0.getY(1) - p0.getY(0)) * (p0.getY(1) - p0.getY(0)))));
    }
    public void d9(){
       if (PatchProxy.applyVoid(null, this, o.class, "8")) {
          return;
       }
       this.p.setScaleEnabled(true);
       this.p.j(this.U);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, o.class, "2")) {
          return;
       }
       super.doBindView(p0);
       this.z = m1.f(p0, 0x7f0a43e6);
       if (!NasaExperimentUtils.n()) {
          TextView textView = new TextView(this.getContext());
          this.A = textView;
          textView.setTextColor(ContextCompat.getColor(this.getContext(), R.color.arg_RES_7f0620c7));
          this.A.setTextSize(14.00f);
          o tA = this.A;
          Resources resources = this.getContext().getResources();
          int i = (NasaSlidePlayExperimentUtil.e())? 0x7f0802b3: 0x7f0802b2;
          tA.setBackground(resources.getDrawable(i));
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       super.j8();
       this.E = this.x8("DETAIL_COMMENT_RECYCLER_VIEW");
       this.F = this.r8("DETAIL_SLIDE_SCREEN_VISIBILITY_EVENT");
       this.C = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       this.G = this.r8("DETAIL_LOADING_ANIM_OBSERVABLE");
       this.H = this.r8("NASA_PLAY_FAILED_RETRY_SHOW");
       this.J = this.q8(PhotoDetailParam.class);
       this.K = this.q8(NasaBizParam.class);
       this.L = this.q8(a.class);
       this.M = this.r8("NASA_SCALE_CLEAN_CONTROLLER_SHOW_OBSERVER");
       this.B = this.r8("NASA_LONG_PHOTO_SCREEN_CLEAN_VIEW");
       this.I = this.r8("NASA_SIDEBAR_STATUS");
       this.V = this.r8("PhOTOSTATUS_OBSERVABLE");
       return;
    }
}
