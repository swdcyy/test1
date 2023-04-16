package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.o;
import com.smile.gifmaker.mvps.presenter.PresenterV2;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.o$a;
import j8a.i1;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import androidx.fragment.app.Fragment;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import tkd.b;
import tkd.d;
import hv5.a;
import fv5.a;
import vy6.a;
import java.util.Set;
import j8a.j1;
import erd.g;
import crd.b;
import brd.t;
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
import com.yxcorp.gifshow.entity.QPhoto;
import gv5.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide;
import com.yxcorp.utility.n;
import java.util.List;
import com.kwai.component.uiconfig.visitor.VisitorModeManager;
import com.kwai.feature.api.feed.home.common.SlideGuideManager;
import java.lang.Runnable;
import android.widget.ImageView;
import android.animation.AnimatorSet;
import android.view.View$OnTouchListener;
import j8a.k1;
import android.view.ViewConfiguration;
import android.graphics.PointF;
import java.lang.Float;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.o$b;
import android.animation.ValueAnimator;
import java.lang.Integer;
import rf5.u;
import j8a.l1;
import kotlin.jvm.internal.a;
import com.kuaishou.android.model.mix.CommonMeta;
import tl8.d;
import com.kwai.feature.api.social.followSlide.model.FollowCommonMeta;
import gv5.b;
import lnc.a1;
import android.content.Context;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.n;
import w4.j;
import com.yxcorp.gifshow.recycler.fragment.BaseFragment;

public class o extends PresenterV2	// class@0019a1
{
    public t A;
    public int B;
    public View C;
    public int D;
    public int E;
    public boolean F;
    public Runnable G;
    public boolean H;
    public boolean I;
    public Runnable J;
    public AnimatorSet K;
    public boolean L;
    public q M;
    public SlidePlayViewModel N;
    public a O;
    public final a P;
    public final k3 Q;
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
    public QPhoto z;

    public void o(){
       super();
       this.P = new o$a(this);
       this.Q = new i1(this);
    }
    public void E8(){
       if (PatchProxy.applyVoid(null, this, o.class, "4")) {
          return;
       }
       this.N = SlidePlayViewModel.B0(this.w.getParentFragment());
       this.O = d.a(0x6c2883df).hZ();
       this.F = false;
       this.Y8();
       o tN = this.N;
       if (tN != null) {
          tN.P(this.w, this.P);
       }
       this.x.add(this.Q);
       this.X7(this.y.subscribe(new j1(this)));
       return;
    }
    public void F8(){
       if (PatchProxy.applyVoid(null, this, o.class, "3")) {
          return;
       }
       ViewStub viewStub = this.getActivity().findViewById(R.id.up_slide_guide_layout_stub);
       this.p = (viewStub != null && viewStub.getParent() != null)? viewStub.inflate(): this.getActivity().findViewById(0x7f0a1192);
       this.q = this.getActivity().findViewById(0x7f0a11a9);
       this.r = this.getActivity().findViewById(0x7f0a4338);
       this.C = this.getActivity().findViewById(0x7f0a11a1);
       return;
    }
    public void J8(){
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "5")) {
          return;
       }
       o tN = this.N;
       if (tN != null) {
          tN.D(this.w, this.P);
       }
       this.x.remove(this.Q);
       if (!PatchProxy.applyVoid(objArray, this, oo, "8")) {
          oo = this.N;
          if (oo != null) {
             oo.b(this.W8());
          }
       }
       return;
    }
    public boolean P8(){
       boolean b1;
       boolean b2;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       o oo = o.class;
       QPhoto obj = PatchProxy.apply(null, this, oo, "10");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (this.N != null && (this.O.l() && (!this.s.get().booleanValue() && (this.N.C() && this.L != null)))) {
          obj = PatchProxy.apply(null, this, oo, "21");
          if (obj != patchProxyRe) {
             b1 = obj.booleanValue();
          }else {
             obj = this.V8();
             if (obj != null) {
                FollowSlideRecoGuide uFollowSlide1 = a.a.a(obj.mEntity);
                if (uFollowSlide1 != null && uFollowSlide1.mFollowGuideV1HasShowed != null) {
                   b1 = true;
                }
             }
             b1 = false;
          }
          if (!b1) {
             Object obj1 = PatchProxy.apply(null, this, oo, "20");
             if (obj1 != patchProxyRe) {
                b2 = obj1.booleanValue();
             }else {
                QPhoto qPhoto = this.V8();
                if (qPhoto != null) {
                   FollowSlideRecoGuide uFollowSlide = a.a.a(qPhoto.mEntity);
                   if (uFollowSlide != null && uFollowSlide.mRecoGuideHasShowed != null) {
                      b2 = true;
                   }
                }
                b2 = false;
             }
             if (!b2 && (!n.I(this.getActivity()) && (this.N.I0().size() > 1 && (this.N.a0() != (this.N.Q() - 1) && (!VisitorModeManager.f() && !SlideGuideManager.a().b(this.getActivity())))))) {
                b = true;
             }
          }
       }
    label_00c8 :
       return b;
    }
    public void R8(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, o.class, "17")) {
          return;
       }
       if (this.F != null || (this.I == null || (this.p != null && this.q != null))) {
          this.s.set(Boolean.FALSE);
          this.t.set(Boolean.TRUE);
          o tr = this.r;
          if (tr == null) {
             return;
          }else {
             o tJ = this.J;
             if (tJ != null) {
                tr.removeCallbacks(tJ);
             }
             this.r.f();
             this.r.t();
             tr = this.K;
             if (tr != null) {
                tr.removeAllListeners();
                this.K.cancel();
                this.K = objArray;
             }
             int i = 8;
             this.p.setVisibility(i);
             this.r.setVisibility(i);
             this.q.setVisibility(i);
             this.p.setOnTouchListener(objArray);
             if (this.H != null) {
                tr = this.N;
                if (tr != null) {
                   tr.J1(this.D, this.E);
                }
             }
             this.F = true;
             this.I = false;
             k1 ok1 = new k1(this);
             this.G = ok1;
             this.p.postDelayed(ok1, (long)ViewConfiguration.getJumpTapTimeout());
             SlideGuideManager.a().f(false);
          }
       }
       return;
    }
    public final PointF S8(PointF p0,PointF p1,float p2,float p3){
       if (PatchProxy.isSupport(o.class)) {
          Object obj = PatchProxy.applyFourRefs(p0, p1, Float.valueOf(p2), Float.valueOf(p3), this, o.class, "14");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return new PointF(((p1.x - p0.x) * p2), ((p1.y - p0.y) * p3));
    }
    public final QPhoto V8(){
       Object[] objArray = null;
       List obj = PatchProxy.apply(objArray, this, o.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.N.e0();
       int i = this.N.a0() + 1;
       if (obj.size() > i) {
          objArray = obj.get(i);
       }
       return objArray;
    }
    public final q W8(){
       o$b uob;
       o obj = PatchProxy.apply(null, this, o.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.M;
       if (obj == null) {
          uob = new o$b(this);
          this.M = uob;
       }
       return uob;
    }
    public final void X8(int p0,int p1,ValueAnimator p2){
       if (PatchProxy.isSupport(o.class) && PatchProxy.applyVoidThreeRefs(Integer.valueOf(p0), Integer.valueOf(p1), p2, this, o.class, "15")) {
          return;
       }
       if (this.r != null) {
          o tq = this.q;
          if (tq != null) {
             this.H = true;
             tq.setTranslationY((- p2.getAnimatedValue().y));
             this.r.setTranslationY((- p2.getAnimatedValue().y));
             tq = this.N;
             if (tq != null) {
                tq.J1(p0, (int)((float)p1 + p2.getAnimatedValue().y));
             }
          }
       }
       return;
    }
    public void Y8(){
       if (PatchProxy.applyVoid(null, this, o.class, "11")) {
          return;
       }
       o tG = this.G;
       if (tG != null) {
          o tp = this.p;
          if (tp != null) {
             tp.removeCallbacks(tG);
          }
       }
       return;
    }
    public void Z8(){
       a a;
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "12")) {
          return;
       }
       if (this.p == null) {
          return;
       }
       this.v.F(false, 7);
       this.p.postDelayed(new l1(this), 200);
       this.s.set(Boolean.TRUE);
       this.t.set(Boolean.FALSE);
       boolean b = true;
       this.I = b;
       if (!PatchProxy.applyVoid(objArray, this, oo, "19")) {
          QPhoto qPhoto = this.V8();
          if (qPhoto != null) {
             a = a.a;
             FollowSlideRecoGuide uFollowSlide = a.a(qPhoto.mEntity);
             if (uFollowSlide == null) {
                uFollowSlide = new FollowSlideRecoGuide();
             }
             uFollowSlide.mFollowGuideV1HasShowed = b;
             qPhoto = qPhoto.mEntity;
             if (!PatchProxy.applyVoidTwoRefs(qPhoto, uFollowSlide, a, a.class, "2")) {
                a.p(qPhoto, "entity");
                CommonMeta uCommonMeta = qPhoto.a(CommonMeta.class);
                if (uCommonMeta != null) {
                   FollowCommonMeta uFollowCommo = b.a(uCommonMeta);
                   if (uFollowCommo != null) {
                      uFollowCommo.mFollowSlideRecoGuide = uFollowSlide;
                   }
                }
             }
          }
       }
    label_0079 :
       oo = this.O;
       String str = (oo != null)? oo.j(): a1.p(R.string.arg_RES_7f104868);
       a.h(this.getContext(), R.raw.arg_RES_7f0f0052).addListener(new n(this, str));
       return;
    }
    public void a9(){
       o oo = o.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, oo, "2")) {
          return;
       }
       if (this.O.l() && !this.s.get().booleanValue()) {
          o tN = this.N;
          if (tN == null || (!tN.r() && !PatchProxy.applyVoid(objArray, this, oo, "6"))) {
             if (this.P8()) {
                this.Z8();
             }else if(PatchProxy.applyVoid(objArray, this, oo, "7")){
                oo = this.N;
                if (oo != null) {
                   oo.e(this.W8());
                }
             }
          }
       }
       return;
    }
    public void j8(){
       if (PatchProxy.applyVoid(null, this, o.class, "1")) {
          return;
       }
       this.s = this.x8("DETAIL_HAS_SHOWN_GUIDE");
       this.t = this.x8("DETAIL_CAN_CLEAR_SCREEN");
       this.u = this.x8("DETAIL_FROM_SLIDE");
       this.v = this.q8(u.class);
       this.w = this.r8("DETAIL_FRAGMENT");
       this.x = this.r8("DETAIL_SCREEN_TOUCH_LISTENER");
       this.y = this.r8("DETAIL_CANCEL_GUIDE_OBSERVABLE");
       this.z = this.q8(QPhoto.class);
       this.A = this.r8("DETAIL_PLAY_TIME_DOWN_OBSERVABLE");
       return;
    }
}
