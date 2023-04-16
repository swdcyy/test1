package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import lnc.a1;
import j8a.b0;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h$a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h$b;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.h$c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.lang.Runnable;
import ekd.k1;
import vy6.a;
import jta.c;
import r7a.f;
import androidx.viewpager.widget.ViewPager$i;
import j8a.y;
import erd.g;
import crd.b;
import brd.t;
import com.smile.gifmaker.mvps.utils.model.DefaultObservableAndSyncable;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.g;
import erd.o;
import j8a.z;
import io.reactivex.internal.functions.Functions;
import tkd.b;
import tkd.d;
import ayb.i;
import com.yxcorp.gifshow.util.rx.RxBus;
import fda.b;
import com.yxcorp.gifshow.util.rx.RxBus$ThreadMode;
import j8a.a0;
import uw9.o;
import java.lang.StringBuilder;
import q87.c;
import java.lang.Boolean;
import im8.f;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.AnimatorSet;
import java.util.Objects;
import rf5.u;
import com.yxcorp.utility.Log;
import com.kwai.library.groot.framework.viewpager.GrootTouchViewPager;
import com.yxcorp.gifshow.widget.SwipeLayout;
import android.widget.TextView;
import android.view.View;
import j8a.u;
import android.view.ViewConfiguration;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import fda.c;
import android.graphics.PointF;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import uw9.v3;
import com.kwai.feature.api.feed.detail.router.PhotoDetailParam;
import com.kuaishou.android.model.mix.PhotoMeta;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kuaishou.android.model.mix.HyperTag;
import android.animation.ValueAnimator;
import jta.d;
import java.lang.Integer;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureGuideManager;
import az6.a;
import com.yxcorp.gifshow.detail.slideplay.b;
import java.util.List;
import android.app.Activity;
import com.yxcorp.gifshow.detail.slideplay.c;
import com.yxcorp.utility.n;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import hn5.n;
import hn5.m;
import android.content.Context;
import xx9.a;
import android.view.ViewStub;
import android.view.ViewParent;
import j8a.x;
import android.view.View$OnTouchListener;
import uw9.q3;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.f;
import w4.n;
import w4.a;
import w4.e$a;
import com.kwai.framework.model.user.User;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;
import uw9.l0;

public class h extends PresenterV2	// class@001992
{
    public f A;
    public PhotoDetailParam B;
    public t C;
    public AnimatorSet D;
    public boolean E;
    public boolean F;
    public Runnable G;
    public Runnable H;
    public int I;
    public int J;
    public Runnable K;
    public final Runnable L;
    public SlidePlayViewModel M;
    public a N;
    public final int O;
    public final String P;
    public int Q;
    public boolean R;
    public l0 S;
    public NasaBizParam T;
    public final ViewPager$i U;
    public final a V;
    public final c W;
    public View p;
    public View q;
    public TextView r;
    public LottieAnimationView s;
    public f t;
    public f u;
    public User v;
    public QPhoto w;
    public BaseFragment x;
    public boolean y;
    public u z;
    public static final int X;

    static {
       h.X = a1.d(0x7f070ec3);
    }
    public void h(){
       super();
       this.L = new b0(this);
       this.O = 1;
       this.P = "left_slide";
       this.Q = -1;
       this.R = false;
       this.U = new h$a(this);
       this.V = new h$b(this);
       this.W = new h$c(this);
    }
    public static void P8(h p0){
       p0.a9();
    }
    public void E8(){
       h oh = h.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oh, "3")) {
          return;
       }
       this.M = SlidePlayViewModel.B0(this.x.getParentFragment());
       this.E = false;
       this.Z8();
       h tL = this.L;
       if (tL != null) {
          k1.m(tL);
       }
       this.M.P(this.x, this.V);
       this.A.a(this.W);
       this.M.i(this.U);
       this.X7(this.C.subscribe(new y(this)));
       if (!PatchProxy.applyVoid(objArray, this, oh, "7") && this.X8()) {
          this.X7(this.v.observable().distinctUntilChanged(g.b).subscribe(new z(this), Functions.e));
       }
       if (d.a(0x4f878389).xG()) {
          this.X7(RxBus.f.g(b.class, RxBus$ThreadMode.MAIN).subscribe(new a0(this)));
       }
       return;
    }
    public void J8(){
       if (PatchProxy.applyVoid(null, this, h.class, "5")) {
          return;
       }
       this.A.c(this.W);
       k1.m(this.L);
       this.M.g(this.U);
       return;
    }
    public void R8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, h.class, "19")) {
          return;
       }
       Object[] objArray1 = new Object[0];
       o.C().w("SlidePlayLeftSlideGuide", "cancelLeftSlideGuide: mIsCancelGuide "+this.E+", mIsShowCurrentGuide "+this.F+", mGuideLayout "+this.p+", mLeftSlideGuideLottieView "+this.s, objArray1);
       k1.m(this.L);
       if (this.E != null || (this.F != null && this.p != null)) {
          this.u.set(Boolean.TRUE);
          h ts = this.s;
          if (ts == null) {
             return;
          }else {
             h tH = this.H;
             if (tH != null) {
                ts.removeCallbacks(tH);
             }
             this.s.f();
             this.s.t();
             ts = this.D;
             if (ts != null) {
                ts.removeAllListeners();
                this.D.cancel();
                this.D = objArray;
             }
             ts = this.z;
             Objects.requireNonNull(ts);
             boolean b = true;
             if (!PatchProxy.applyVoid(objArray, ts, u.class, "18")) {
                Log.g("SwipeToProfileFeed", "stopSlideGuide "+ts.v);
                if (ts.v != null) {
                   ts.v = false;
                   u q = ts.q;
                   if (q != null) {
                      q.c0(b, 6);
                   }
                   q = ts.r;
                   if (q != null) {
                      q.n(b, 3);
                   }
                   ts.n();
                }
             }
             ts = this.r;
             int i = 8;
             if (ts != null) {
                ts.setVisibility(i);
             }
             this.s.setVisibility(i);
             this.p.setVisibility(i);
             this.E = b;
             this.F = false;
             u ou = new u(this);
             this.G = ou;
             this.p.postDelayed(ou, (long)ViewConfiguration.getJumpTapTimeout());
             SlideGuideManager.a().f(0);
          }
       }
       return;
    }
    public final void S8(String p0){
       h oh = h.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, oh, "21")) {
          return;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, oh, "22") && !TextUtils.x(p0)) {
          c uoc = new c();
          uoc.a("left_slide");
          uoc.b(p0);
          RxBus.f.b(uoc);
       }
       return;
    }
    public final PointF V8(PointF p0,PointF p1,float p2,float p3){
       if (PatchProxy.isSupport(h.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, h.class, "17");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new PointF(((p1.x - p0.x) * p2), ((p1.y - p0.y) * p3));
    }
    public boolean W8(){
       Object obj = PatchProxy.apply(null, this, h.class, "23");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = (this.S.L == null && this.B.getForceShowLeftSlideGuide())? true: false;
       return b;
    }
    public boolean X8(){
       h obj = PatchProxy.apply(null, this, h.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.w;
       boolean b = (obj != null && (obj.getPhotoMeta() != null && (this.w.getPhotoMeta().mHyperTag != null && this.w.getPhotoMeta().mHyperTag.mPymlFollowingIntensifyType != null)))? true: false;
       return b;
    }
    public final void Y8(ValueAnimator p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, h.class, "18")) {
          return;
       }
       if (this.r == null) {
          return;
       }
       PointF x = p0.getAnimatedValue().x;
       this.r.setTranslationX((- x));
       float f = x / (float)h.X;
       StringBuilder str = "leftTrans = "+x;
       Object[] objArray = new Object[0];
       o.C().s("SlidePlayLeftSlideGuide", str+" progress = "+f, objArray);
       h tz = this.z;
       float f1 = 0x3f800000 - f;
       Objects.requireNonNull(tz);
       u ou = u.class;
       if (PatchProxy.isSupport(ou) && (!PatchProxy.applyVoidOneRefs(Float.valueOf(f1), tz, ou, "17") && tz.o())) {
          double d = (double)f1;
          if (d - 0x3f847ae147ae147b < 0 || d - 0x3fefae147ae147ae > 0) {
             Log.g("SwipeToProfileFeed", "setProgress="+f1);
          }
          tz.u = f1;
          tz.l.c(f1);
       }
       return;
    }
    public void Z8(){
       if (PatchProxy.applyVoid(null, this, h.class, "2")) {
          return;
       }
       h tG = this.G;
       if (tG != null) {
          h tp = this.p;
          if (tp != null) {
             tp.removeCallbacks(tG);
          }
       }
       return;
    }
    public final void a9(){
       if (PatchProxy.applyVoid(null, this, h.class, "9")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("NasaGuide", "tryShow left guide", objArray);
       this.b9(this.Q);
       return;
    }
    public final void b9(int p0){
       boolean b;
       boolean b1;
       h oh = h.class;
       if (PatchProxy.isSupport(oh) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, oh, "10")) {
          return;
       }
       if (VisitorModeManager.f()) {
          return;
       }
       Object[] objArray = null;
       int i = 0x4f878389;
       if (p0 != 1) {
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          b obj = PatchProxy.apply(objArray, this, oh, "11");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else if(!this.w.isAtlasPhotos() && !this.w.isLongPhotos()){
             if (NasaFeatureGuideManager.f().n()) {
                obj = PatchProxy.apply(objArray, this, oh, "13");
                if (obj != patchProxyRe) {
                   b1 = obj.booleanValue();
                }else {
                   obj = b.e(this.B.mSlidePlayId);
                   b1 = (obj != null && (obj.Og().size() <= 1 || this.M.a0() == (obj.Og().size() - 1)))? true: false;
                }
                if (!b1) {
                label_0102 :
                   b = false;
                }
             }
             if (NasaFeatureGuideManager.f().g() || (this.W8() && !this.t.get().booleanValue())) {
                obj = PatchProxy.apply(objArray, this, oh, "20");
                if (obj != patchProxyRe) {
                   b = obj.booleanValue();
                }else if(this.y == null && (!c.k(this.getActivity(), this.w) && !this.M.r())){
                   b = true;
                }else {
                   b = false;
                }
                if (b && (!n.I(this.getActivity()) && (d.a(i).oF() && (!this.w.isSerialPayPhoto() && !SlideGuideManager.a().b(this.getActivity()))))) {
                   b = true;
                }else {
                   goto label_0102 ;
                }
             }else {
                goto label_0102 ;
             }
          }else {
             goto label_0102 ;
          }
          if (!b && !this.X8()) {
             return;
          }
       }
    label_010c :
       if (this.J != null) {
          this.K = new b0(this);
          this.Q = p0;
          return;
       }else {
          String str = "LEFT_SLIDE_SHOW_AUTHOR_PHOTOS";
          if (p0 != 1 && d.a(i).Cw(this.T, str)) {
             return;
          }else if(m.a().U3(this.getActivity()) && (p0 != 1 && d.a(i).sN(this.T, str))){
             return;
          }else if(this.N.c()){
             return;
          }else {
             this.Q = p0;
             if (!PatchProxy.applyVoid(objArray, this, oh, "12")) {
                if (!PatchProxy.applyVoid(objArray, this, oh, "6")) {
                   ViewStub viewStub = this.getActivity().findViewById(R.id.up_slide_guide_layout_stub);
                   this.p = (viewStub != null && viewStub.getParent() != null)? viewStub.inflate(): this.getActivity().findViewById(0x7f0a1192);
                   this.r = this.getActivity().findViewById(0x7f0a11a9);
                   this.s = this.getActivity().findViewById(0x7f0a1732);
                   this.q = this.getActivity().findViewById(0x7f0a11a1);
                }
                this.F = true;
                this.u.set(Boolean.FALSE);
                Object[] objArray1 = new Object[0];
                o.C().w("NasaGuide", "展示侧滑引导", objArray1);
                this.t.set(Boolean.TRUE);
                h tq = this.q;
                if (tq != null) {
                   tq.setVisibility(0);
                   this.q.setOnTouchListener(new x(this));
                }
                if (this.X8()) {
                   q3.b(1);
                }
                if (!PatchProxy.applyVoid(objArray, this, oh, "14")) {
                   if (this.p == null) {
                      this.S8("f");
                   }else {
                      e$a.a(this.getContext(), R.raw.bg, new f(this));
                   }
                }
             }
             return;
          }
       }
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, h.class, "1")) {
          return;
       }
       this.t = this.x8("DETAIL_HAS_SHOWN_GUIDE");
       this.u = this.x8("DETAIL_CAN_CLEAR_SCREEN");
       this.v = this.q8(User.class);
       this.w = this.q8(QPhoto.class);
       this.x = this.r8("DETAIL_FRAGMENT");
       this.y = this.r8("IS_DETAIL_FORM_PROFILE").booleanValue();
       this.z = this.q8(u.class);
       this.A = this.r8("NASA_SIDEBAR_STATUS");
       this.B = this.q8(PhotoDetailParam.class);
       this.C = this.r8("DETAIL_CANCEL_GUIDE_OBSERVABLE");
       this.S = this.q8(l0.class);
       this.N = this.r8("DETAIL_SCREEN_CLEAN_STATUS");
       this.T = this.q8(NasaBizParam.class);
       return;
    }
}
