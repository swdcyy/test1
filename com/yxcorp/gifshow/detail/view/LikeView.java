package com.yxcorp.gifshow.detail.view.LikeView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.airbnb.lottie.LottieAnimationView;
import android.widget.ImageView;
import android.animation.Animator;
import android.view.View;
import com.yxcorp.gifshow.util.cdnresource.CdnResource$ResourceKey;
import android.animation.Animator$AnimatorListener;
import java.lang.Runnable;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import java.lang.Integer;
import java.lang.Boolean;
import n9a.k;
import com.yxcorp.gifshow.util.cdnresource.f;
import p5.f;
import java.lang.StringBuilder;
import w4.e;
import com.kwai.robust.PatchProxyResult;
import n9a.j;
import android.animation.AnimatorSet;
import android.util.Property;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import n9a.l;
import n9a.m;
import android.view.ViewGroup;
import java.lang.Float;
import java.lang.Math;
import com.yxcorp.gifshow.detail.view.DetailToolBarButtonView;

public class LikeView extends FrameLayout	// class@001a48
{
    public View b;
    public LottieAnimationView c;
    public Animator d;
    public Animator e;
    public String f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CdnResource$ResourceKey k;
    public CdnResource$ResourceKey l;
    public static final int m;

    public void LikeView(Context p0){
       super(p0);
       this.i = 0x7f0f000c;
       this.j = 0x7f0f000d;
    }
    public void LikeView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.i = 0x7f0f000c;
       this.j = 0x7f0f000d;
    }
    public void LikeView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.i = 0x7f0f000c;
       this.j = 0x7f0f000d;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, LikeView.class, "11")) {
          return;
       }
       this.c.f();
       this.c.t();
       if (this.g != null) {
          this.c.setAlpha(0x437f0000);
       }
       this.c.setVisibility(4);
       LikeView td = this.d;
       if (td != null) {
          td.cancel();
       }
       td = this.e;
       if (td != null) {
          td.cancel();
       }
       this.g(this.b);
       return;
    }
    public final void b(LottieAnimationView p0,CdnResource$ResourceKey p1,int p2,Animator$AnimatorListener p3,Runnable p4,ClientContent$ContentPackage p5,boolean p6,boolean p7){
       LikeView likeView = this;
       object oobject = p0;
       object oobject1 = p3;
       object oobject2 = p4;
       if (PatchProxy.isSupport(LikeView.class)) {
          Object[] objArray = new Object[]{oobject,p1,Integer.valueOf(p2),oobject1,oobject2,p5,Boolean.valueOf(p6),Boolean.valueOf(p7)};
          if (PatchProxy.applyVoid(objArray, this, LikeView.class, "12")) {
             return;
          }
       }
       if (p1 != null) {
          f.e(likeView.f, p0, p1, p2, new k(this, oobject2), p5, p6);
       }else {
          e uoe = f.c().b("rawRes_"+p2);
          if (p7 && uoe != null) {
             p0.setComposition(uoe);
          }else {
             p0.setAnimation(p2);
          }
          this.post(oobject2);
       }
       p0.k(1);
       p0.a(p3);
       return;
    }
    public boolean c(){
       Object obj = PatchProxy.apply(null, this, LikeView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b.isSelected();
    }
    public void d(boolean p0,Animator$AnimatorListener p1){
       if (PatchProxy.isSupport(LikeView.class) && PatchProxy.applyVoidTwoRefs(Boolean.valueOf(p0), p1, this, LikeView.class, "7")) {
          return;
       }
       this.e(p0, p1, null, false);
       return;
    }
    public void e(boolean p0,Animator$AnimatorListener p1,ClientContent$ContentPackage p2,boolean p3){
       int this;
       LikeView tc;
       LikeView tb;
       Object[] objArray;
       if (PatchProxy.isSupport(LikeView.class) && PatchProxy.applyVoidFourRefs(Boolean.valueOf(p0), p1, null, Boolean.valueOf(p3), this, LikeView.class, "9")) {
          return;
       }
       this.a();
       j oj = new j(this);
       int i = 5;
       int i1 = 4;
       int i2 = 3;
       int i3 = 2;
       int i4 = 1;
       this = 0;
       int i5 = 6;
       object oobject = null;
       if (p0) {
          tc = this.c;
          tb = this.b;
          if (PatchProxy.isSupport(LikeView.class)) {
             objArray = new Object[i5];
             objArray[this] = tc;
             objArray[i4] = tb;
             objArray[i3] = p1;
             objArray[i2] = oj;
             objArray[i1] = oobject;
             objArray[i] = Boolean.valueOf(p3);
             if (!PatchProxy.applyVoid(objArray, this, LikeView.class, "18")) {
             }
          }else if(this.d == null){
             AnimatorSet uAnimatorSet = PatchProxy.applyOneRefs(tb, this, LikeView.class, "14");
             if (uAnimatorSet != PatchProxyResult.class) {
             }else {
                uAnimatorSet = new AnimatorSet();
                PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[i3];
                propertyValu[this] = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[i3]{0x3f800000,0x3f666666});
                propertyValu[i4] = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[i3]{0x3f800000,0x3f666666});
                ObjectAnimator objectAnimat = ObjectAnimator.ofPropertyValuesHolder(tb, propertyValu);
                objectAnimat.setDuration(300);
                objectAnimat.setInterpolator(new AccelerateDecelerateInterpolator());
                float[] uofloatArray = new float[i3];
                uofloatArray[this] = tb.getAlpha();
                uofloatArray[i4] = 0;
                ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(tb, View.ALPHA, uofloatArray);
                objectAnimat1.setDuration(200);
                objectAnimat1.setStartDelay(100);
                objectAnimat1.setInterpolator(new LinearInterpolator());
                Animator[] uAnimatorArr = new Animator[i3];
                uAnimatorArr[this] = objectAnimat1;
                uAnimatorArr[i4] = objectAnimat;
                uAnimatorSet.playTogether(uAnimatorArr);
             }
             this.d = uAnimatorSet;
          }
          this.b(tc, this.k, this.i, super(this, tc, tb, p1), oj, null, true, p3);
       }else {
          tc = this.c;
          tb = this.b;
          if (PatchProxy.isSupport(LikeView.class)) {
             objArray = new Object[i5];
             objArray[this] = tc;
             objArray[i4] = tb;
             objArray[i3] = p1;
             objArray[i2] = oj;
             objArray[i1] = oobject;
             objArray[i] = Boolean.valueOf(p3);
             if (!PatchProxy.applyVoid(objArray, this, LikeView.class, "19")) {
             }
          }else {
          }
       }
    label_0119 :
       return;
    }
    public void f(boolean p0,Animator$AnimatorListener p1,boolean p2){
       if (PatchProxy.isSupport(LikeView.class) && PatchProxy.applyVoidThreeRefs(Boolean.valueOf(p0), p1, Boolean.valueOf(p2), this, LikeView.class, "8")) {
          return;
       }
       this.e(p0, p1, null, p2);
       return;
    }
    public void g(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LikeView.class, "13")) {
          return;
       }
       p0.setScaleX(0x3f800000);
       p0.setScaleY(0x3f800000);
       p0.setAlpha(0x3f800000);
       return;
    }
    public void h(CdnResource$ResourceKey p0,int p1){
       this.l = p0;
       this.j = p1;
    }
    public void i(String p0,CdnResource$ResourceKey p1,int p2){
       this.f = p0;
       this.l = p1;
       this.j = p2;
    }
    public void j(String p0,CdnResource$ResourceKey p1,int p2){
       this.f = p0;
       this.k = p1;
       this.i = p2;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, LikeView.class, "3")) {
          return;
       }
       super.onDetachedFromWindow();
       this.a();
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, LikeView.class, "1")) {
          return;
       }
       super.onFinishInflate();
       this.b = this.findViewById(0x7f0a1778);
       this.c = this.findViewById(0x7f0a1545);
       return;
    }
    public void setAlphaProgress(float p0){
       if (PatchProxy.isSupport(LikeView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LikeView.class, "5")) {
          return;
       }
       this.c.setAlpha(Math.max(p0, (0x3f800000 - p0)));
       LikeView tb = this.b;
       if (tb instanceof DetailToolBarButtonView) {
          tb.setProgress(p0);
       }
       return;
    }
    public void setDisableExitAnim(boolean p0){
       this.h = p0;
    }
    public void setEndRawId(int p0){
       this.l = null;
       this.j = p0;
    }
    public void setIsAlphaExitStyle(boolean p0){
       this.g = p0;
    }
    public void setSelected(boolean p0){
       if (PatchProxy.isSupport(LikeView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, LikeView.class, "2")) {
          return;
       }
       super.setSelected(p0);
       this.b.setSelected(p0);
       return;
    }
    public void setSpeed(float p0){
       if (PatchProxy.isSupport(LikeView.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, LikeView.class, "6")) {
          return;
       }
       this.c.setSpeed(p0);
       return;
    }
    public void setStratRawId(int p0){
       this.k = null;
       this.i = p0;
    }
}
