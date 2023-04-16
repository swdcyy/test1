package com.kwaishou.merchant.daccore.mount.anim.BaseTopRightPendantView;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.String;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.StringBuilder;
import java.lang.Class;
import java.lang.Object;
import android.view.ViewParent;
import f08.b;
import android.animation.AnimatorSet;
import lnc.a1;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.Animator;
import h08.a;
import android.animation.Animator$AnimatorListener;
import z1.a;
import f08.b$a;
import java.lang.Throwable;
import java.util.Map;

public abstract class BaseTopRightPendantView extends ConstraintLayout	// class@001325
{
    public FrameLayout B;
    public FrameLayout C;
    public Animator D;
    public a E;
    public Context F;
    public String G;
    public boolean H;

    public void BaseTopRightPendantView(Context p0){
       super(p0, null);
    }
    public void BaseTopRightPendantView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void BaseTopRightPendantView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.G = "BaseTopRightPendantView";
       this.H = true;
       this.F = p0;
       this.G = this.getLogTag();
       LayoutInflater.from(p0).inflate(R.layout.arg_RES_7f0d07f4, this);
       this.setClipChildren(false);
       this.setClipToPadding(false);
       this.B = this.findViewById(0x7f0a0eee);
       FrameLayout uFrameLayout = this.findViewById(R.id.fl_animate_container);
       this.C = uFrameLayout;
       uFrameLayout.setVisibility(8);
    }
    public abstract View L();
    public abstract View M();
    public final String getLogTag(){
       return "AnimateDelegate-"+this.getClass().getSimpleName();
    }
    public void onAttachedToWindow(){
       BaseTopRightPendantView uBaseTopRigh1;
       BaseTopRightPendantView uBaseTopRigh = this;
       super.onAttachedToWindow();
       boolean b = true;
       uBaseTopRigh.H = b;
       View view = this.L();
       View view1 = this.M();
       if (view == null || view1 == null) {
          b$a.b(b.a, "leftTop anim: pendant view is null", null, null, 6, null);
       }else if(uBaseTopRigh.H != null){
          if (view.getParent() != null) {
             view.getParent().removeView(view);
          }
          if (view1.getParent() != null) {
             view1.getParent().removeView(view1);
          }
          uBaseTopRigh.C.addView(view);
          uBaseTopRigh.B.addView(view1);
          uBaseTopRigh.B.setAlpha(0);
       }
       if (uBaseTopRigh.D != null) {
          b.a("leftTop anim : current pendant is animating");
          uBaseTopRigh1 = uBaseTopRigh;
       }else {
          BaseTopRightPendantView c = uBaseTopRigh.C;
          BaseTopRightPendantView b1 = uBaseTopRigh.B;
          float f = (float)a1.e(14.00f);
          float[] uofloatArray = new float[]{f,(- f) - (float)a1.e(5.00f)};
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(c, View.TRANSLATION_X, uofloatArray);
          objectAnimat.setDuration(200);
          float f1 = (float)a1.d(0x7f07032e);
          float f2 = (float)a1.d(0x7f070340);
          float f3 = (float)a1.d(0x7f0702ef);
          float f4 = (float)a1.d(0x7f07030d);
          float f5 = (float)a1.e(68.00f);
          c.setScaleX(0x3f800000);
          c.setScaleY(0x3f800000);
          c.setTranslationY(f5);
          float[] uofloatArray1 = new float[]{0x3f800000,f3 / f1};
          float[] uofloatArray2 = new float[]{0x3f800000,f4 / f2};
          float[] uofloatArray3 = new float[]{f5,f4 / 2.00f};
          f4 = f4 - f2;
          float[] uofloatArray4 = new float[]{(- (float)a1.e(14.00f)) - (float)a1.e(5.00f),(f1 - f3) / 2.00f};
          PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(View.SCALE_X, uofloatArray1),PropertyValuesHolder.ofFloat(View.SCALE_Y, uofloatArray2),PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, uofloatArray3),PropertyValuesHolder.ofFloat(View.TRANSLATION_X, uofloatArray4)};
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(c, propertyValu);
          uofloatArray1 = new float[]{b1.getAlpha(),0x3f800000};
          PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.ALPHA, uofloatArray1)};
          ObjectAnimator objectAnimat2 = ObjectAnimator.ofPropertyValuesHolder(b1, propertyValu1);
          AnimatorSet uAnimatorSet = new AnimatorSet();
          uAnimatorSet.setDuration(400);
          uAnimatorSet.setStartDelay((long)500);
          Animator[] uAnimatorArr = new Animator[]{objectAnimat2,objectAnimat1};
          uAnimatorSet.playTogether(uAnimatorArr);
          Animator[] uAnimatorArr1 = new Animator[]{objectAnimat,uAnimatorSet};
          AnimatorSet uAnimatorSet1 = new AnimatorSet();
          uAnimatorSet1.playSequentially(uAnimatorArr1);
          uBaseTopRigh1 = this;
          uBaseTopRigh1.D = uAnimatorSet1;
          uAnimatorSet1.addListener(new a(uBaseTopRigh1));
          uBaseTopRigh = uBaseTopRigh1.E;
          if (uBaseTopRigh != null) {
             uBaseTopRigh.accept(uBaseTopRigh1.D);
          }else {
             b.a("leftTop anim : check mLiveTopPendantEnterAnimationService or mLiveTopPendantItem is null");
             uBaseTopRigh1.D.start();
          }
       }
       return;
    }
    public void setEnterAnimatorQueueConsumer(a p0){
       this.E = p0;
    }
}
