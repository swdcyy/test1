package com.yxcorp.gifshow.widget.CollectAnimationView;
import android.widget.RelativeLayout;
import android.content.Context;
import lnc.a1;
import android.util.AttributeSet;
import android.animation.AnimatorSet;
import com.kwai.robust.PatchProxyResult;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import java.lang.Float;
import java.lang.Integer;
import android.widget.ImageView;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.widget.ImageView$ScaleType;
import android.graphics.drawable.Drawable;
import com.yxcorp.gifshow.widget.CollectAnimationView$a;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import zf6.j;
import java.lang.Number;
import java.lang.Boolean;
import com.yxcorp.gifshow.widget.CollectAnimationView$b;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;

public class CollectAnimationView extends RelativeLayout	// class@001803
{
    public ImageView b;
    public ImageView c;
    public int d;
    public int e;
    public AnimatorSet f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;

    public void CollectAnimationView(Context p0){
       super(p0);
       this.d = a1.e(0x41f00000);
       this.e = a1.e(0x41f00000);
       this.g = 0;
       this.h = false;
       this.f(p0);
    }
    public void CollectAnimationView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = a1.e(0x41f00000);
       this.e = a1.e(0x41f00000);
       this.g = 0;
       this.h = false;
       this.f(p0);
    }
    public void CollectAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = a1.e(0x41f00000);
       this.e = a1.e(0x41f00000);
       this.g = 0;
       this.h = false;
       this.f(p0);
    }
    public final AnimatorSet a(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object[] objArray = null;
       AnimatorSet obj = PatchProxy.apply(objArray, this, CollectAnimationView.class, "6");
       if (obj != patchProxyRe) {
          return obj;
       }
       AnimatorSet uAnimatorSet = this.b(0x3f800000, 0.20f, 100);
       AnimatorSet uAnimatorSet1 = this.b(0.20f, 0x3f800000, 100);
       obj = this.b(0x3f800000, 0x3f8c5a1d, 60);
       AnimatorSet uAnimatorSet2 = this.b(0x3f8c5a1d, 0x3f76e979, 120);
       AnimatorSet uAnimatorSet3 = this.b(0x3f76e979, 0x3f81ad43, 120);
       AnimatorSet uAnimatorSet4 = this.b(0x3f81ad43, 0x3f7ec56d, 120);
       AnimatorSet uAnimatorSet5 = this.b(0x3f7ec56d, 0x3f803afb, 120);
       AnimatorSet uAnimatorSet6 = new AnimatorSet();
       if (this.h != null) {
          Animator[] uAnimatorArr = new Animator[]{uAnimatorSet,uAnimatorSet1,obj,uAnimatorSet2,uAnimatorSet3,uAnimatorSet4,uAnimatorSet5};
          uAnimatorSet6.playSequentially(uAnimatorArr);
       }else {
          Animator[] uAnimatorArr3 = new Animator[]{obj,uAnimatorSet1,uAnimatorSet};
          uAnimatorSet6.playSequentially(uAnimatorArr3);
       }
       obj = PatchProxy.apply(objArray, this, CollectAnimationView.class, "8");
       if (obj != patchProxyRe) {
       }else {
          obj = new AnimatorSet();
          Animator[] uAnimatorArr2 = new Animator[]{ObjectAnimator.ofInt(this.b, "alpha", new int[2]{255,0}),ObjectAnimator.ofInt(this.c, "alpha", new int[2]{0,255})};
          obj.playTogether(uAnimatorArr2);
          obj.setDuration(240);
          if (this.h == null) {
             obj.setStartDelay(20);
          }
       }
       AnimatorSet uAnimatorSet7 = new AnimatorSet();
       Animator[] uAnimatorArr1 = new Animator[]{uAnimatorSet6,obj};
       uAnimatorSet7.playTogether(uAnimatorArr1);
       return uAnimatorSet7;
    }
    public final AnimatorSet b(float p0,float p1,int p2){
       AnimatorSet obj;
       if (PatchProxy.isSupport(CollectAnimationView.class)) {
          obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Float.valueOf(p1), Integer.valueOf(p2), this, CollectAnimationView.class, "7");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       if (this.h == null) {
          p1 = p0;
          p0 = p1;
       }
       obj = new AnimatorSet();
       float[] uofloatArray = new float[]{p0,p1};
       float[] uofloatArray1 = new float[]{p0,p1};
       float[] uofloatArray2 = new float[]{p0,p1};
       uofloatArray2 = new float[]{p0,p1};
       Animator[] uAnimatorArr = new Animator[]{ObjectAnimator.ofFloat(this.b, "scaleX", uofloatArray),ObjectAnimator.ofFloat(this.b, "scaleY", uofloatArray1),ObjectAnimator.ofFloat(this.c, "scaleX", uofloatArray2),ObjectAnimator.ofFloat(this.c, "scaleY", uofloatArray2)};
       obj.playTogether(uAnimatorArr);
       obj.setDuration((long)p2);
       return obj;
    }
    public final ImageView c(Context p0){
       ImageView obj = PatchProxy.applyOneRefs(p0, this, CollectAnimationView.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new ImageView(p0);
       obj.setLayoutParams(new LinearLayout$LayoutParams(-1, -1));
       obj.setScaleType(ImageView$ScaleType.CENTER_INSIDE);
       return obj;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, CollectAnimationView.class, "5")) {
          return;
       }
       CollectAnimationView tf = this.f;
       if (tf != null && tf.isRunning()) {
          this.f.cancel();
          this.b.setScaleX(0x3f800000);
          this.b.setScaleY(0x3f800000);
          this.c.setScaleX(0x3f800000);
          this.c.setScaleY(0x3f800000);
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, CollectAnimationView.class, "9")) {
          return;
       }
       this.h = true;
       this.d();
       this.b.setImageDrawable(this.getHollowDrawable());
       this.c.setImageDrawable(this.getSolidDrawable());
       AnimatorSet uAnimatorSet = this.a();
       this.f = uAnimatorSet;
       uAnimatorSet.addListener(new CollectAnimationView$a(this));
       this.f.start();
       return;
    }
    public final void f(Context p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, CollectAnimationView.class, "1")) {
          return;
       }
       this.b = this.c(p0);
       ImageView imageView = this.c(p0);
       this.c = imageView;
       this.addView(imageView);
       this.addView(this.b);
       return;
    }
    public boolean g(){
       return this.h;
    }
    public final Drawable getHollowDrawable(){
       Object obj = PatchProxy.apply(null, this, CollectAnimationView.class, "16");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g == 3) {
          return j.l(this.getContext(), this.getHollowNormal(), 2);
       }
       return j.k(this.getContext(), this.getHollowNormal());
    }
    public int getHollowNormal(){
       Object obj = PatchProxy.apply(null, this, CollectAnimationView.class, "19");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       switch (this.g){
           case 1:
             return 0x7f0824b6;
           case 2:
             return 0x7f0824bd;
           case 3:
           case 6:
           case 13:
             return 0x7f080522;
           case 4:
             return 0x7f0824bc;
           case 5:
             return 0x7f0823ce;
           case 7:
             return 0x7f0824bb;
           case 9:
             return 0x7f0823d0;
           case 10:
             return 0x7f0823cf;
           case 11:
             return 0x7f0818a5;
           case 12:
             return this.k;
           default:
          label_0019 :
             return 0x7f0824b5;
       }
    }
    public final int getHollowPressed(){
       CollectAnimationView tg = this.g;
       if (tg != 1) {
          if (tg != 2) {
             if (tg != 3) {
                if (tg != 4) {
                   if (tg != 12) {
                      return 0x7f0818a7;
                   }else {
                      return this.l;
                   }
                }
             }else {
                return 0x7f080523;
             }
          }else {
             return 0x7f0818a8;
          }
       }
       return 0x7f0824b7;
    }
    public final Drawable getSolidDrawable(){
       Object obj = PatchProxy.apply(null, this, CollectAnimationView.class, "15");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (this.g == 3) {
          return j.l(this.getContext(), this.getSolidNormal(), 2);
       }
       return j.k(this.getContext(), this.getSolidNormal());
    }
    public int getSolidNormal(){
       Object obj = PatchProxy.apply(null, this, CollectAnimationView.class, "17");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       switch (this.g){
           case 1:
           case 4:
           case 2:
             return 0x7f0824b9;
           case 3:
             return 0x7f080587;
           case 5:
           case 9:
           case 10:
           case 13:
           case 6:
             return 0x7f0823d1;
           case 11:
             return 0x7f0818a6;
           case 12:
             return this.i;
           default:
          label_0019 :
             return 0x7f0824b8;
       }
    }
    public final int getSolidPressed(){
       CollectAnimationView obj = PatchProxy.apply(null, this, CollectAnimationView.class, "18");
       if (obj != PatchProxyResult.class) {
          return obj.intValue();
       }
       obj = this.g;
       if (obj == 3) {
          return 0x7f080588;
       }
       if (obj != 12) {
          return 0x7f0824ba;
       }
       return this.j;
    }
    public void h(){
       if (PatchProxy.applyVoid(null, this, CollectAnimationView.class, "12")) {
          return;
       }
       this.d();
       this.b.setAlpha(255);
       if (this.g == 3) {
          this.b.setImageDrawable(j.l(this.getContext(), this.getSolidPressed(), 2));
       }else {
          this.b.setImageDrawable(j.k(this.getContext(), this.getSolidPressed()));
       }
       this.c.setImageDrawable(null);
       return;
    }
    public void i(int p0,int p1,int p2,int p3,boolean p4){
       if (PatchProxy.isSupport(CollectAnimationView.class)) {
          Object[] objArray = new Object[]{Integer.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, CollectAnimationView.class, "14")) {
             return;
          }
       }
       this.g = 12;
       this.i = p0;
       this.j = p1;
       this.k = p2;
       this.l = p3;
       this.setFavoriteState(p4);
       this.h = p4;
       return;
    }
    public void j(int p0,boolean p1){
       if (PatchProxy.isSupport(CollectAnimationView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Boolean.valueOf(p1), this, CollectAnimationView.class, "11")) {
          return;
       }
       if (p0 != this.g) {
          this.g = p0;
          this.setFavoriteState(p1);
          this.h = p1;
       }
       return;
    }
    public void k(){
       if (PatchProxy.applyVoid(null, this, CollectAnimationView.class, "10")) {
          return;
       }
       this.h = false;
       this.d();
       this.b.setImageDrawable(this.getSolidDrawable());
       this.c.setImageDrawable(this.getHollowDrawable());
       AnimatorSet uAnimatorSet = this.a();
       this.f = uAnimatorSet;
       uAnimatorSet.addListener(new CollectAnimationView$b(this));
       this.f.start();
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, CollectAnimationView.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       this.d();
       return;
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(CollectAnimationView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, CollectAnimationView.class, "3")) {
          return;
       }
       super.onMeasure(p0, p1);
       int mode = View$MeasureSpec.getMode(p0);
       p0 = View$MeasureSpec.getSize(p0);
       int mode1 = View$MeasureSpec.getMode(p1);
       p1 = View$MeasureSpec.getSize(p1);
       if (mode == Integer.MIN_VALUE && mode1 == Integer.MIN_VALUE) {
          this.setMeasuredDimension(this.d, this.e);
       }else if(mode == Integer.MIN_VALUE){
          this.setMeasuredDimension(this.d, p1);
       }else if(mode1 == Integer.MIN_VALUE){
          this.setMeasuredDimension(p0, this.e);
       }
       return;
    }
    public void setCommonState(boolean p0){
       if (PatchProxy.isSupport(CollectAnimationView.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, CollectAnimationView.class, "13")) {
          return;
       }
       CollectAnimationView tb = this.b;
       Drawable solidDrawabl = (p0)? this.getSolidDrawable(): this.getHollowDrawable();
       tb.setImageDrawable(solidDrawabl);
       this.b.setAlpha(255);
       this.c.setImageDrawable(null);
       this.c.setAlpha(0);
       return;
    }
    public void setFavoriteState(boolean p0){
       this.h = p0;
       this.d();
       this.setCommonState(p0);
    }
}
