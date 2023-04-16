package com.yxcorp.gifshow.widget.RatioExpandView;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import com.yxcorp.gifshow.widget.RatioExpandView$b;
import com.yxcorp.gifshow.widget.RatioExpandView$c;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import android.view.View;
import com.yxcorp.gifshow.widget.RatioExpandView$RatioExpandItemView;
import java.util.Objects;
import java.lang.Integer;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import th0.e;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.widget.b0;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import th0.n;
import android.widget.TextView;
import tyc.e4;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.widget.c0;
import com.yxcorp.gifshow.widget.d0;
import tyc.f4;
import android.animation.Animator;
import tyc.u3;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import com.yxcorp.gifshow.bubble.PostBubbleManager;
import android.app.Activity;
import com.yxcorp.gifshow.bubble.b;
import com.yxcorp.gifshow.v3.bubble.EditBubbleItem;
import ra9.c;
import com.yxcorp.gifshow.widget.y;
import com.yxcorp.gifshow.bubble.b$b;
import com.yxcorp.gifshow.bubble.a;
import android.view.ViewTreeObserver;
import com.yxcorp.gifshow.widget.RatioExpandView$a;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import java.lang.Boolean;
import tyc.d0;
import tyc.x4;
import tyc.y4;
import tyc.u5;

public class RatioExpandView extends FrameLayout	// class@0018aa
{
    public int b;
    public boolean c;
    public boolean d;
    public Drawable e;
    public Drawable f;
    public Drawable g;
    public boolean h;
    public View i;
    public LinearLayout j;
    public int k;
    public y4 l;
    public RatioExpandView$b m;
    public RatioExpandView$c n;
    public d0 o;
    public x4 p;
    public u5 q;
    public boolean r;
    public static int A = 0;
    public static int B = 0;
    public static int C = 0;
    public static int D = 0;
    public static int E = 0;
    public static int F = 0;
    public static int G = 0;
    public static float H = 0.000000;
    public static int I = 0;
    public static int J = 0;
    public static int s = 64;
    public static int t = 30;
    public static int u;
    public static int v;
    public static int w;
    public static int x;
    public static int y;
    public static int z;

    static {
       RatioExpandView.u = a1.e((float)64);
       RatioExpandView.v = a1.e((float)RatioExpandView.t);
       RatioExpandView.w = 24;
       RatioExpandView.x = 30;
       RatioExpandView.y = 56;
       RatioExpandView.z = a1.e((float)56);
       RatioExpandView.A = a1.e(4.00f);
       RatioExpandView.B = a1.e(2.00f);
       RatioExpandView.C = a1.e(4.00f);
       RatioExpandView.D = a1.e(5.00f);
       RatioExpandView.E = 13;
       RatioExpandView.F = 12;
       RatioExpandView.G = 100;
       RatioExpandView.H = 0x3f800000;
       RatioExpandView.I = a1.a(0x7f061c81);
       RatioExpandView.J = a1.a(0x7f061c83);
    }
    public void RatioExpandView(Context p0){
       super(p0);
       this.b = 0;
       this.c = true;
       this.d = false;
       this.e = a1.f(0x7f081bc6);
       this.f = this.getResources().getDrawable(0x7f081bc5);
       this.g = a1.f(0x7f080814);
       this.h = false;
       this.m = new RatioExpandView$b(this);
       this.n = new RatioExpandView$c(this);
       this.r = false;
       this.b();
    }
    public void RatioExpandView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0;
       this.c = true;
       this.d = false;
       this.e = a1.f(0x7f081bc6);
       this.f = this.getResources().getDrawable(0x7f081bc5);
       this.g = a1.f(0x7f080814);
       this.h = false;
       this.m = new RatioExpandView$b(this);
       this.n = new RatioExpandView$c(this);
       this.r = false;
       this.b();
    }
    public void RatioExpandView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
       this.c = true;
       this.d = false;
       this.e = a1.f(0x7f081bc6);
       this.f = this.getResources().getDrawable(0x7f081bc5);
       this.g = a1.f(0x7f080814);
       this.h = false;
       this.m = new RatioExpandView$b(this);
       this.n = new RatioExpandView$c(this);
       this.r = false;
       this.b();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RatioExpandView.class, "13")) {
          return;
       }
       boolean b = false;
       this.c = b;
       int childCount = this.j.getChildCount();
       int i = 0;
       int i1 = 2;
       while (i < childCount) {
          if (i < this.j.getChildCount()) {
             View childAt = this.j.getChildAt(i);
             if (childAt instanceof RatioExpandView$RatioExpandItemView) {
                Objects.requireNonNull(childAt);
                if (!PatchProxy.isSupport(RatioExpandView$RatioExpandItemView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), childAt, RatioExpandView$RatioExpandItemView.class, "8")) {
                   RatioExpandView$RatioExpandItemView ratioExpandI = (i == childAt.f.b)? 1: null;
                   AnimatorSet uAnimatorSet = new AnimatorSet();
                   float[] uofloatArray = new float[i1];
                   uofloatArray[b] = 0;
                   float f = - childAt.e;
                   uofloatArray[1] = f;
                   ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(childAt, "translationX", uofloatArray);
                   objectAnimat.setInterpolator(new e());
                   objectAnimat.addListener(new b0(childAt));
                   float[] uofloatArray1 = new float[i1];
                   uofloatArray1[b] = (float)RatioExpandView.G;
                   uofloatArray1[1] = 0;
                   ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray1);
                   valueAnimato.setDuration(240);
                   valueAnimato.setInterpolator(new n());
                   if (ratioExpandI) {
                      childAt.c.setTextAlignment(3);
                      childAt.c.setCompoundDrawablePadding(RatioExpandView.D);
                      childAt.c.setCompoundDrawables(objArray, objArray, childAt.f.g, objArray);
                      childAt.c.setPadding(RatioExpandView.A, b, RatioExpandView.B, b);
                      childAt.c.setTextSize((float)RatioExpandView.E);
                      float[] uofloatArray2 = new float[i1];
                      uofloatArray2[b] = childAt.b.getAlpha();
                      uofloatArray2[1] = 0;
                      valueAnimato.setFloatValues(uofloatArray2);
                      valueAnimato.addUpdateListener(new e4(childAt));
                      valueAnimato.addListener(new c0(childAt));
                   }else {
                      valueAnimato.addListener(new d0(childAt));
                      valueAnimato.addUpdateListener(new f4(childAt));
                   }
                   Animator[] uAnimatorArr = new Animator[i1];
                   uAnimatorArr[b] = objectAnimat;
                   uAnimatorArr[1] = valueAnimato;
                   uAnimatorSet.playTogether(uAnimatorArr);
                   uAnimatorSet.start();
                }
             }
          }
          i = i + 1;
       }
       int[] ointArray = new int[i1];
       ointArray[b] = this.k;
       ointArray[1] = RatioExpandView.u;
       ValueAnimator valueAnimato1 = ValueAnimator.ofInt(ointArray);
       valueAnimato1.setInterpolator(new e());
       valueAnimato1.setDuration(300);
       valueAnimato1.addUpdateListener(new u3(this));
       valueAnimato1.start();
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, RatioExpandView.class, "1")) {
          return;
       }
       this.i = new View(this.getContext());
       this.i.setLayoutParams(new FrameLayout$LayoutParams(RatioExpandView.u, RatioExpandView.v));
       this.i.setBackground(this.f);
       this.addView(this.i);
       this.j = new LinearLayout(this.getContext());
       this.j.setLayoutParams(new FrameLayout$LayoutParams(-2, -2));
       this.j.setOrientation(0);
       this.addView(this.j);
       this.l = this.n;
       return;
    }
    public void c(PostBubbleManager p0,int p1){
       if (PatchProxy.isSupport(RatioExpandView.class) && PatchProxy.applyVoidTwoRefs(p0, Integer.valueOf(p1), this, RatioExpandView.class, "8")) {
          return;
       }
       if (this.getContext() instanceof Activity) {
          if (!this.j.getWidth() || !this.j.getHeight()) {
             this.j.getViewTreeObserver().addOnGlobalLayoutListener(new RatioExpandView$a(this, p0, p1));
          }else if(this.j.getChildCount() <= p1){
             return;
          }else {
             b uob = new b(EditBubbleItem.COVER_RATIO);
             uob.b(this.j.getChildAt(p1));
             uob.k(y.a);
             p0.n(uob);
          }
       }
       return;
    }
    public void d(boolean p0){
       if (PatchProxy.isSupport(RatioExpandView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, RatioExpandView.class, "14")) {
          return;
       }
       boolean b = false;
       this.c = b;
       int childCount = this.j.getChildCount();
       int i = 0;
       boolean b1 = true;
       while (i < childCount) {
          if (i < this.j.getChildCount()) {
             View childAt = this.j.getChildAt(i);
             if (childAt instanceof RatioExpandView$RatioExpandItemView) {
                Object[] objArray = null;
                if (p0 && this.d == null) {
                   View view = childAt;
                   Objects.requireNonNull(view);
                   if (!PatchProxy.applyVoid(objArray, view, RatioExpandView$RatioExpandItemView.class, "10")) {
                      view.e = view.getX();
                   }
                }
                Objects.requireNonNull(childAt);
                if (!PatchProxy.isSupport(RatioExpandView$RatioExpandItemView.class) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(i), childAt, RatioExpandView$RatioExpandItemView.class, "9")) {
                   int i1 = (i == childAt.f.b)? 1: 0;
                   RatioExpandView$RatioExpandItemView e = childAt.e;
                   if (e - 1) {
                      float f = - e;
                      childAt.setTranslationX(f);
                   }
                   childAt.b.setAlpha(0);
                   childAt.c.setTextColor(RatioExpandView.I);
                   if (i1) {
                      childAt.setVisibility(b);
                      childAt.setClickable(b1);
                      childAt.setAlpha(RatioExpandView.H);
                      RatioExpandView g = childAt.f.g;
                      g.setBounds(b, b, g.getMinimumWidth(), childAt.f.g.getMinimumHeight());
                      childAt.c.setCompoundDrawablePadding(RatioExpandView.D);
                      childAt.c.setCompoundDrawables(objArray, objArray, childAt.f.g, objArray);
                      childAt.c.setPadding(RatioExpandView.A, b, RatioExpandView.B, b);
                   }else {
                      childAt.setClickable(b);
                      childAt.setVisibility(4);
                   }
                }
             }
          }
          i = i + 1;
       }
       FrameLayout$LayoutParams layoutParams = this.i.getLayoutParams();
       layoutParams.width = RatioExpandView.u;
       this.i.setLayoutParams(layoutParams);
       if (p0) {
          this.d = b1;
       }
       return;
    }
    public boolean getExpand(){
       return this.c;
    }
    public void setEnableLandscapeVideoCoverRatioGuide(boolean p0){
       this.r = p0;
    }
    public void setOnClickItemListener(d0 p0){
       this.o = p0;
    }
    public void setOnStateChangeListener(x4 p0){
       this.p = p0;
    }
    public void setSelectIndex(int p0){
       if (PatchProxy.isSupport(RatioExpandView.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, RatioExpandView.class, "7")) {
          return;
       }
       if (p0 < this.j.getChildCount()) {
          this.b = p0;
          RatioExpandView tn = this.n;
          this.l = tn;
          tn.b();
          tn = this.o;
          if (tn != null) {
             tn.a(p0);
          }
       }
       return;
    }
    public final void setTextViewNormal(RatioExpandView$RatioExpandItemView p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, RatioExpandView.class, "15")) {
          return;
       }
       Objects.requireNonNull(p0);
       if (!PatchProxy.applyVoid(null, p0, RatioExpandView$RatioExpandItemView.class, "6")) {
          p0.b.setAlpha(0);
          p0.c.setTextColor(RatioExpandView.I);
       }
       return;
    }
    public void setVisibilityStateListener(u5 p0){
       this.q = p0;
    }
}
