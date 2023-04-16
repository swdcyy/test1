package com.kwai.slide.play.detail.rightactionbar.follow.element.k;
import com.kwai.slide.play.detail.rightactionbar.follow.element.f;
import lnc.a1;
import ns7.g0;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.slide.play.detail.rightactionbar.follow.element.h;
import lnc.c3$a;
import lnc.c3;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.lang.Runnable;
import ekd.k1;
import com.kwai.slide.play.detail.rightactionbar.follow.element.i;
import android.view.View;
import java.lang.Boolean;
import android.widget.TextView;
import o56.a;
import java.lang.CharSequence;
import android.view.ViewGroup$LayoutParams;
import os7.a$e;
import android.widget.ImageView;
import com.yxcorp.gifshow.detail.view.SelfAdaptiveImageView;
import com.yxcorp.utility.TextUtils;
import com.kwai.slide.play.detail.rightactionbar.follow.element.k$a;
import com.yxcorp.gifshow.detail.view.SelfAdaptiveImageView$b;
import android.view.animation.AlphaAnimation;
import ns7.v0;
import android.view.animation.Animation$AnimationListener;
import com.yxcorp.gifshow.widget.AvatarType;
import com.yxcorp.gifshow.widget.AvatarWithPendantView;
import com.airbnb.lottie.LottieAnimationView;
import android.view.animation.Animation;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.kwai.slide.play.detail.utils.ExperimentUtils;
import android.view.ViewStub;
import com.kwai.library.widget.specific.misc.CircleWithStrokeView;
import android.view.animation.ScaleAnimation;
import ns7.q0;
import android.content.res.Resources;
import cw9.c;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import com.kwai.slide.play.detail.rightactionbar.follow.element.k$b;
import android.widget.FrameLayout;
import qp7.x0;
import os7.a;
import qp7.d;
import qp7.t0;
import android.graphics.Paint;
import com.yxcorp.gifshow.live.widget.LivePlayTextureView;
import ekd.m1;
import ns7.m0;
import java.util.Objects;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import pp7.b;
import ns7.l0;
import ns7.o0;
import ns7.n0;
import ns7.k0;
import android.view.View$OnClickListener;
import com.kwai.slide.play.detail.rightactionbar.follow.element.g;
import ns7.e0;
import com.kwai.slide.play.detail.rightactionbar.follow.element.j;
import ns7.i0;
import ns7.j0;
import ns7.d0;

public class k extends f	// class@00185f
{
    public final Runnable C;
    public CircleWithStrokeView D;
    public boolean E;
    public AnimatorSet F;
    public ValueAnimator G;
    public AnimatorSet H;
    public View I;
    public TextView J;
    public View K;
    public View L;
    public View M;
    public LivePlayTextureView N;
    public FrameLayout O;
    public SelfAdaptiveImageView P;
    public a$e Q;
    public a R;
    public static float S;
    public static float T;
    public static final float U;

    static {
       k.S = (float)a1.e(26.00f);
       k.T = (float)a1.e(35.00f);
       k.U = (float)a1.e(0x3fc00000);
    }
    public void k(){
       super();
       this.C = new g0(this);
       this.Q = null;
    }
    public final void B(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, k.class, "16")) {
          return;
       }
       c3.c(this.F, h.a);
       c3.c(this.H, h.a);
       k tF = this.F;
       if (tF != null) {
          tF.removeAllListeners();
       }
       tF = this.H;
       if (tF != null) {
          tF.removeAllListeners();
       }
       tF = this.G;
       if (tF != null) {
          tF.cancel();
          this.G.removeAllListeners();
          this.G = objArray;
       }
       this.F = objArray;
       this.H = objArray;
       k1.m(this.C);
       c3.c(this.D, i.a);
       return;
    }
    public View C(){
       f tn = this.n;
       if (tn != null) {
          return tn;
       }
       return this.m;
    }
    public final void D(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k.class, "3")) {
          return;
       }
       if (p0 == null) {
          return;
       }
       p0.setVisibility(8);
       p0.setTranslationY(0);
       p0.setAlpha(0x3f800000);
       p0.setEnabled(true);
       return;
    }
    public void E(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "12")) {
          return;
       }
       ok = this.J;
       if (ok != null && ok.getVisibility()) {
          this.J.setVisibility(0);
          if (a.d()) {
             this.J.setContentDescription(a1.p(R.string.arg_RES_7f102ad9));
          }
          if (p0) {
             this.J.setBackgroundResource(R.drawable.arg_RES_7f0819a7);
             p0.width = a1.d(0x7f070325);
          }else {
             this.J.setBackgroundResource(R.drawable.arg_RES_7f081974);
             p0.width = a1.d(0x7f070309);
          }
          this.H(0);
       }
       return;
    }
    public final void F(a$e p0,boolean p1){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ok, "10")) {
          return;
       }
       if (this.P == null) {
          this.E(p0.b);
          this.G();
          return;
       }else {
          int i = 8;
          if (p0.a == null) {
             this.J.setVisibility(i);
             this.P.setVisibility(i);
             this.P.s0();
             return;
          }else if(TextUtils.x(p0.c)){
             this.E(p0.b);
             this.G();
             return;
          }else if(!p1){
             this.J.setVisibility(i);
             this.P.setVisibility(0);
          }
          if (a.d()) {
             this.P.setContentDescription(a1.p(R.string.arg_RES_7f102ad9));
          }
          this.P.p0(p0.c, new k$a(this, p1, p0));
          return;
       }
    }
    public void G(){
       k ok = k.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, ok, "11")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, ok, "28") && this.n != null) {
          AlphaAnimation uAlphaAnimat = new AlphaAnimation(0x3f800000, 0);
          uAlphaAnimat.setDuration(300);
          uAlphaAnimat.setAnimationListener(new v0(this));
          if (this.n.getAvatarType() == AvatarType.DYNAMIC_PENDANT) {
             this.n.getDynamicPendant().startAnimation(uAlphaAnimat);
          }else if(this.n.getAvatarType() == AvatarType.STATIC_PENDANT){
             this.n.getStaticPendant().startAnimation(uAlphaAnimat);
          }
       }
       boolean b = (this.E == null || !ExperimentUtils.c())? true: false;
       this.A(false, b);
       if (!PatchProxy.applyVoid(objArray, this, ok, "17")) {
          if (this.D == null) {
             k tL = this.L;
             if (tL instanceof ViewStub) {
                this.D = tL.inflate();
             }else {
                this.D = tL;
                tL.setVisibility(8);
             }
             ViewGroup$LayoutParams layoutParams = this.D.getLayoutParams();
             layoutParams.width = a1.e(70.00f);
             layoutParams.height = a1.e(70.00f);
             this.D.setLayoutParams(layoutParams);
             this.D.setRadius(k.S);
             this.D.setStrokeWidth((k.U / 2.00f));
          }
          this.I.setVisibility(false);
          if (this.E == null) {
             if (!PatchProxy.applyVoid(objArray, this, ok, "19") && ExperimentUtils.c()) {
                this.K.setPadding(false, false, false, false);
             }
             if (!PatchProxy.applyVoid(objArray, this, ok, "20")) {
                ScaleAnimation scaleAnimati = new ScaleAnimation(0x3f59999a, 0x3f800000, 0x3f59999a, 0x3f800000, ((float)this.K.getWidth() / 2.00f), ((float)this.K.getHeight() / 2.00f));
                ok.setDuration(300);
                ok.setFillAfter(true);
                ok.setAnimationListener(new q0(this));
                this.K.startAnimation(ok);
             }
          }else if(PatchProxy.applyVoid(objArray, this, ok, "18") || !ExperimentUtils.c()){
             this.K.setVisibility(false);
             this.K.setPadding(c.b(this.K.getResources(), R.dimen.arg_RES_7f0702ac), c.b(this.K.getResources(), R.dimen.arg_RES_7f0702ac), c.b(this.K.getResources(), R.dimen.arg_RES_7f0702ac), c.b(this.K.getResources(), R.dimen.arg_RES_7f0702ac));
          }
       }
    label_013f :
       return;
    }
    public void H(boolean p0){
       k ok = k.class;
       if (PatchProxy.isSupport(ok) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, ok, "22")) {
          return;
       }
       boolean b = true;
       AnimationSet uAnimationSe = new AnimationSet(b);
       int i = 0;
       float f = 0;
       float f1 = (p0)? 10.00f: 8.00f;
       TranslateAnimation translateAni = new TranslateAnimation(i, f, 0, 0, 0, (float)a1.e(f1), 0, 0);
       uAnimationSe.addAnimation(new AlphaAnimation(0, 0x3f800000));
       uAnimationSe.addAnimation(v11);
       uAnimationSe.setFillAfter(b);
       uAnimationSe.setDuration(300);
       uAnimationSe.setAnimationListener(new k$b(this, p0));
       if (p0) {
          k tP = this.P;
          if (tP != null) {
             tP.startAnimation(uAnimationSe);
          }
       }else {
          this.J.startAnimation(uAnimationSe);
       }
       return;
    }
    public final void I(){
       k ok = k.class;
       if (PatchProxy.applyVoid(null, this, ok, "13")) {
          return;
       }
       this.B();
       if (!PatchProxy.applyVoid(null, this, ok, "15")) {
          this.I.setVisibility(8);
          ok = this.D;
          if (ok != null) {
             ok.setVisibility(8);
          }
          this.J.setVisibility(8);
          this.J.clearAnimation();
          this.K.setVisibility(8);
          this.K.clearAnimation();
          ok = this.P;
          if (ok != null) {
             ok.setVisibility(8);
             this.P.clearAnimation();
          }
          ok = this.O;
          if (ok != null) {
             ok.setVisibility(8);
          }
          this.M = null;
       }
       return;
    }
    public void q(x0 p0){
       this.w(p0);
    }
    public void r(){
       if (PatchProxy.applyVoid(null, this, k.class, "2")) {
          return;
       }
       super.r();
       if (this.b.f()) {
          this.f.setLayerType(2, null);
       }
       return;
    }
    public void w(a p0){
       k ok = k.class;
       a uoa = a.class;
       if (PatchProxy.applyVoidOneRefs(p0, this, ok, "1")) {
          return;
       }
       super.w(p0);
       this.I = this.f.findViewById(0x7f0a39f9);
       this.J = this.f.findViewById(0x7f0a39fb);
       this.P = this.f.findViewById(0x7f0a39d0);
       this.K = this.f.findViewById(0x7f0a269a);
       this.O = this.f.findViewById(0x7f0a39fc);
       this.N = this.f.findViewById(0x7f0a39fd);
       Object[] objArray = null;
       if (!PatchProxy.applyVoid(objArray, this, ok, "9")) {
          ViewGroup$LayoutParams layoutParams = this.K.getLayoutParams();
          layoutParams.width = a1.e(54.00f);
          layoutParams.height = a1.e(54.00f);
          k.S = (float)a1.e(26.00f);
          k.T = (float)a1.e(35.00f);
          this.K.setLayoutParams(layoutParams);
       }
       View view = m1.f(this.f, R.id.nasa_live_anim_viewstub);
       this.L = view;
       if (view == null) {
          this.L = m1.f(this.f, 0x7f0a18dd);
       }
       if (this.n != null && !PatchProxy.applyVoid(objArray, this, ok, "27")) {
          f tn = this.n;
          if (tn != null) {
             tn.u();
             AlphaAnimation uAlphaAnimat = new AlphaAnimation(0, 0x3f800000);
             uAlphaAnimat.setDuration(300);
             if (this.n.getAvatarType() == AvatarType.DYNAMIC_PENDANT) {
                this.n.getDynamicPendant().startAnimation(uAlphaAnimat);
             }else if(this.n.getAvatarType() == AvatarType.STATIC_PENDANT){
                this.n.getStaticPendant().startAnimation(uAlphaAnimat);
             }
          }
       }
       m0 om0 = new m0(this);
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoidOneRefs(om0, p0, uoa, "4")) {
          p0.o.d(p0.a, om0);
       }
       l0 ol0 = new l0(this);
       if (!PatchProxy.applyVoidOneRefs(ol0, p0, uoa, "47")) {
          p0.j.d(p0.a, ol0);
       }
       o0 oo0 = new o0(this);
       if (!PatchProxy.applyVoidOneRefs(oo0, p0, uoa, "6")) {
          p0.e.d(p0.a, oo0);
       }
       n0 on0 = new n0(this);
       if (!PatchProxy.applyVoidOneRefs(on0, p0, uoa, "10")) {
          p0.v.d(p0.a, on0);
       }
       ok = this.O;
       if (ok != null) {
          ok.setOnClickListener(new k0(this));
       }
       g og = new g(this);
       if (!PatchProxy.applyVoidOneRefs(og, p0, uoa, "8")) {
          p0.u.d(p0.a, og);
       }
       e0 uoe0 = new e0(this);
       if (!PatchProxy.applyVoidOneRefs(uoe0, p0, uoa, "12")) {
          p0.w.d(p0.a, uoe0);
       }
       j oj = new j(this);
       if (!PatchProxy.applyVoidOneRefs(oj, p0, uoa, "14")) {
          p0.x.d(p0.a, oj);
       }
       this.J.setOnClickListener(new i0(this));
       ok = this.P;
       if (ok != null) {
          ok.setOnClickListener(new j0(this));
       }
       d0 uod0 = new d0(this);
       if (!PatchProxy.applyVoidOneRefs(uod0, p0, uoa, "49")) {
          p0.z.d(p0.a, uod0);
       }
       return;
    }
}
