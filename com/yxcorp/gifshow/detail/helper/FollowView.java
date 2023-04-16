package com.yxcorp.gifshow.detail.helper.FollowView;
import b3a.h;
import com.yxcorp.gifshow.widget.DetailFollowLinearLayout;
import lnc.a1;
import android.content.Context;
import com.yxcorp.gifshow.detail.helper.FollowView$a;
import com.yxcorp.gifshow.detail.helper.FollowView$b;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import com.yxcorp.gifshow.detail.view.DetailToolBarButtonView;
import com.yxcorp.gifshow.widget.DoubleFloorsTextView;
import android.graphics.drawable.GradientDrawable;
import java.lang.Integer;
import android.animation.ArgbEvaluator;
import com.airbnb.lottie.LottieAnimationView;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import android.app.Application;
import o56.a;
import zf6.k;
import zf6.j;
import android.view.View;
import android.content.res.Resources;
import cw9.c;
import com.airbnb.lottie.RenderMode;
import java.lang.Boolean;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.Objects;
import android.graphics.drawable.Drawable;
import n9a.n;
import android.widget.TextView;
import tyc.h5;
import android.widget.LinearLayout;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import e1a.g;
import android.animation.Animator$AnimatorListener;
import ok.o;
import java.lang.CharSequence;
import android.animation.AnimatorSet;

public class FollowView extends DetailFollowLinearLayout implements h	// class@001565
{
    public View e;
    public View f;
    public DetailToolBarButtonView g;
    public LottieAnimationView h;
    public LottieAnimationView i;
    public DoubleFloorsTextView j;
    public Animator k;
    public n l;
    public float m;
    public boolean n;
    public Animator o;
    public o p;
    public int q;
    public int r;
    public int s;
    public GradientDrawable t;
    public ArgbEvaluator u;
    public boolean v;
    public boolean w;
    public final Animator$AnimatorListener x;
    public final Animator$AnimatorListener y;
    public static final int z;

    static {
       FollowView.z = a1.e(35.00f);
    }
    public void FollowView(Context p0){
       super(p0);
       this.v = true;
       this.x = new FollowView$a(this);
       this.y = new FollowView$b(this);
    }
    public void FollowView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.v = true;
       this.x = new FollowView$a(this);
       this.y = new FollowView$b(this);
    }
    public void FollowView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.v = true;
       this.x = new FollowView$a(this);
       this.y = new FollowView$b(this);
    }
    public void a(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowView.class, "25")) {
          return;
       }
       if (this.v != null) {
          super.a(p0);
       }
       return;
    }
    public void b(float p0){
       if (PatchProxy.isSupport(FollowView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, FollowView.class, "15")) {
          return;
       }
       if (this.n == null) {
          return;
       }
       this.m = p0;
       this.g.setProgress(p0);
       float f = 0x3f800000;
       this.j.a(p0, (f - p0));
       FollowView tt = this.t;
       if (tt != null) {
          if (p0 - f >= 0) {
             tt.setColor(this.q);
          }else if(p0 <= 0){
             FollowView ts = (this.w != null)? this.s: this.r;
             tt.setColor(ts);
          }else {
             tt.setColor(this.u.evaluate(p0, Integer.valueOf(this.r), Integer.valueOf(this.q)).intValue());
          }
       }
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, FollowView.class, "22")) {
          return;
       }
       FollowView ti = this.i;
       if (ti != null) {
          ti.f();
          this.i.t();
       }
       ti = this.h;
       if (ti != null) {
          ti.f();
          this.h.t();
       }
       ti = this.k;
       if (ti != null) {
          ti.cancel();
       }
       return;
    }
    public final int e(int p0){
       Application obj;
       if (PatchProxy.isSupport(FollowView.class)) {
          obj = PatchProxy.applyOneRefs(Integer.valueOf(p0), this, FollowView.class, "5");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       obj = a.b();
       int i = (!k.d() || k.e())? 1: 2;
       return j.c(obj, p0, i);
    }
    public final int f(View p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FollowView.class, "20");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       return ((p0.getWidth() - (FollowView.z / 2)) - c.b(p0.getResources(), 0x7f0701e2));
    }
    public final void g(LottieAnimationView p0,int p1){
       if (PatchProxy.isSupport(FollowView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, FollowView.class, "17")) {
          return;
       }
       p0.setAnimation(p1);
       p0.setSpeed(0x3fc00000);
       p0.k(true);
       p0.setRenderMode(RenderMode.HARDWARE);
       return;
    }
    public float getProgress(){
       return this.m;
    }
    public boolean h(){
       boolean b;
       FollowView obj = PatchProxy.apply(null, this, FollowView.class, "21");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.h;
       if (obj == null || !obj.p()) {
          obj = this.k;
          if (obj == null || !obj.isRunning()) {
             b = false;
          label_002b :
             return b;
          }
       }
       b = true;
       goto label_002b ;
    }
    public void i(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FollowView.class, "7")) {
          return;
       }
       this.j.setTranslationX(0);
       this.e.setTranslationX(0);
       this.f.setTranslationX(0);
       this.g.setVisibility(0);
       FollowView tg = this.g;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoid(objArray, tg, DetailToolBarButtonView.class, "14")) {
          float f = 0x437f0000;
          if (tg.getDrawable() != null) {
             tg.getDrawable().setAlpha((int)(tg.i(tg.d) * f));
          }
          DetailToolBarButtonView f1 = tg.f;
          if (f1 != null) {
             f1.setAlpha((int)(tg.i(tg.d) * f));
          }
          f1 = tg.g;
          if (f1 != null) {
             f1.setAlpha((int)(tg.i(tg.e) * f));
          }
       }
       tg = this.l;
       Objects.requireNonNull(tg);
       if (!PatchProxy.applyVoid(objArray, tg, n.class, "4")) {
          n c = tg.c;
          if (c != null) {
             c.setVisibility(8);
          }
          n d = tg.d;
          if (d != null) {
             d.setVisibility(8);
          }
       }
       return;
    }
    public void j(int p0,int p1){
       String str = "14";
       if (PatchProxy.isSupport(FollowView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, FollowView.class, str)) {
          return;
       }
       FollowView tj = this.j;
       if (tj != null) {
          Objects.requireNonNull(tj);
          if (!PatchProxy.isSupport(DoubleFloorsTextView.class) || !PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), tj, DoubleFloorsTextView.class, str)) {
             h5.a(tj.b, p0);
             h5.a(tj.c, p1);
          }
       }
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, FollowView.class, "3")) {
          return;
       }
       this.setBackgroundResource(R.drawable.arg_RES_7f0801f2);
       this.j(this.e(R.color.arg_RES_7f06175d), this.e(R.color.arg_RES_7f06175d));
       return;
    }
    public void l(){
       if (PatchProxy.applyVoid(null, this, FollowView.class, "4")) {
          return;
       }
       this.setBackgroundResource(R.drawable.arg_RES_7f0801f3);
       this.j(this.e(R.color.arg_RES_7f061674), this.e(R.color.arg_RES_7f061674));
       return;
    }
    public void m(){
       if (PatchProxy.applyVoid(null, this, FollowView.class, "23")) {
          return;
       }
       if (this.o == null) {
          FollowView te = this.e;
          ObjectAnimator objectAnimat = PatchProxy.applyOneRefs(te, this, FollowView.class, "24");
          if (objectAnimat != PatchProxyResult.class) {
          }else {
             float[] uofloatArray = new float[]{(float)te.getWidth(),0};
             objectAnimat = ObjectAnimator.ofFloat(te, View.TRANSLATION_X, uofloatArray);
             objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
             objectAnimat.setDuration(400);
             objectAnimat.addListener(new g(this, te));
          }
          this.o = objectAnimat;
       }
       this.o.cancel();
       this.o.start();
       return;
    }
    public void n(boolean p0){
       FollowView tj;
       Animator[] uAnimatorArr;
       if (PatchProxy.isSupport(FollowView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FollowView.class, "9")) {
          return;
       }
       if (p0 && this.h()) {
          return;
       }
       FollowView obj = null;
       int i = 8;
       if (this.p.apply(obj)) {
          n on = n.class;
          PatchProxyResult patchProxyRe = PatchProxyResult.class;
          if (!PatchProxy.isSupport(FollowView.class) || !PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FollowView.class, "8")) {
             if (this.w != null && p0) {
                this.f.setVisibility(i);
                tj = this.j;
                if (tj != null) {
                   tj.setText(a1.p(R.string.arg_RES_7f101021));
                }
                this.l();
             }else if(this.e.getVisibility() == i){
                if (!p0) {
                   this.e.setVisibility(i);
                }else if(this.h()){
                   tj = this.o;
                   if (tj != null) {
                      tj.cancel();
                   }
                   this.d();
                   if (this.h == null) {
                      tj = this.l;
                      Objects.requireNonNull(tj);
                      n on1 = PatchProxy.apply(obj, tj, on, "1");
                      if (on1 != patchProxyRe) {
                      }else if(tj.c == null){
                         tj.c = tj.a();
                      }
                      on1 = tj.c;
                      this.h = on1;
                   }
                   this.g(this.h, R.raw.arg_RES_7f0f0047);
                   this.h.a(this.y);
                   if (this.i == null) {
                      tj = this.l;
                      Objects.requireNonNull(tj);
                      on = PatchProxy.apply(obj, tj, on, "2");
                      if (on != patchProxyRe) {
                      }else if(tj.d == null){
                         tj.d = tj.a();
                      }
                      on = tj.d;
                      this.i = on;
                   }
                   this.g(this.i, R.raw.arg_RES_7f0f0048);
                   this.i.a(this.y);
                   if (this.k == null) {
                      this.k = new AnimatorSet();
                      tj = this.j;
                      FollowView te = this.e;
                      obj = this.f;
                      AnimatorSet uAnimatorSet = PatchProxy.applyThreeRefs(tj, te, obj, this, FollowView.class, "18");
                      if (uAnimatorSet != patchProxyRe) {
                      }else {
                         uAnimatorSet = new AnimatorSet();
                         float[] uofloatArray1 = new float[]{0,(float)this.f(te)};
                         uofloatArray1 = new float[]{0,(float)(FollowView.z / 2)};
                         uofloatArray1 = new float[]{0,(float)(c.b(tj.getResources(), 0x7f0701e1) - c.b(tj.getResources(), 0x7f0701de))};
                         uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(te, View.TRANSLATION_X, uofloatArray1),ObjectAnimator.ofFloat(tj, View.TRANSLATION_X, uofloatArray1),ObjectAnimator.ofFloat(obj, View.TRANSLATION_X, uofloatArray1)};
                         uAnimatorSet.playTogether(uAnimatorArr);
                         uAnimatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                         uAnimatorSet.setDuration(300);
                      }
                      tj = this.e;
                      ObjectAnimator objectAnimat = PatchProxy.applyOneRefs(tj, this, FollowView.class, "19");
                      if (objectAnimat != patchProxyRe) {
                      }else {
                         float[] uofloatArray = new float[]{(float)this.f(tj),(float)tj.getWidth()};
                         objectAnimat = ObjectAnimator.ofFloat(tj, View.TRANSLATION_X, uofloatArray);
                         objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
                         objectAnimat.setDuration(200);
                         objectAnimat.setStartDelay(400);
                      }
                      uAnimatorArr = new Animator[]{uAnimatorSet,objectAnimat};
                      this.k.playSequentially(uAnimatorArr);
                      this.k.addListener(this.x);
                   }
                   if (this.m - 0x3f000000 > 0) {
                      this.h.s();
                   }else {
                      this.i.s();
                   }
                }
             }
          }
       }else if(PatchProxy.isSupport(FollowView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, FollowView.class, "10")){
          if (this.w != null && p0) {
             this.f.setVisibility(0);
             this.j.setText(a1.p(R.string.arg_RES_7f100f8f));
             this.f.setVisibility(i);
             this.k();
          }else {
             this.d();
             this.i();
             if (p0) {
                this.m();
             }else {
                this.setVisibility(0);
             }
          }
       }
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, FollowView.class, "6")) {
          return;
       }
       super.onFinishInflate();
       this.g = this.findViewById(0x7f0a0f4e);
       this.j = this.findViewById(0x7f0a0fa2);
       this.f = this.findViewById(0x7f0a0f4f);
       this.l = new n(this.g);
       this.e = this;
       return;
    }
    public void setAtlasNewStyle(boolean p0){
       this.w = p0;
    }
    public void setFollowPredict(o p0){
       this.p = p0;
    }
    public void setNeedDrawBG(boolean p0){
       this.v = p0;
    }
    public void setProgress(float p0){
       if (PatchProxy.isSupport(FollowView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, FollowView.class, "16")) {
          return;
       }
       this.g.setProgress(p0);
       return;
    }
    public void setText(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, FollowView.class, "1")) {
          return;
       }
       this.j.setText(p0);
       return;
    }
}
