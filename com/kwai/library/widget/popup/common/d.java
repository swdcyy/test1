package com.kwai.library.widget.popup.common.d;
import java.lang.Object;
import android.view.View;
import android.animation.Animator;
import android.content.Context;
import com.yxcorp.utility.n;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.view.animation.Interpolator;
import c2.a;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet$Builder;
import android.view.ViewParent;
import android.graphics.drawable.Drawable;
import o07.m;
import android.animation.ValueAnimator$AnimatorUpdateListener;

public class d	// class@000992
{

    public void d(){
       super();
    }
    public static Animator a(View p0){
       int i;
       int i1;
       float f = (float)p0.getMeasuredHeight();
       float f1 = 0x3f800000;
       double d = (double)((f * f1) / (float)n.u(p0.getContext()));
       if (d - 0x3fbc28f5c28f5c29 < 0) {
          i = 200;
       }else if(d - 0x3fcc28f5c28f5c29 < 0){
          i = 250;
       }else if(d - 0x3fd999999999999a < 0){
          i = 300;
       }else if(d - 0x3fe8000000000000 < 0){
          i = 350;
       }else {
          i = 400;
       }
       float[] uofloatArray = new float[]{f,i1};
       i1 = 0;
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray);
       objectAnimat.setInterpolator(a.b(i1, 0x3f19999a, 0.30f, f1));
       ValueAnimator valueAnimato = d.c(p0, 0);
       if (valueAnimato != null) {
          valueAnimato.setInterpolator(a.b(0.25f, 0.10f, 0.25f, f1));
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.setDuration((long)i);
       if (valueAnimato != null) {
          Animator[] uAnimatorArr = new Animator[]{objectAnimat,valueAnimato};
          uAnimatorSet.playTogether(uAnimatorArr);
       }else {
          uAnimatorSet.play(objectAnimat);
       }
       return uAnimatorSet;
    }
    public static Animator b(View p0){
       int i = 2;
       float[] uofloatArray = new float[i];
       uofloatArray[0] = 0;
       uofloatArray[1] = (float)p0.getMeasuredHeight();
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.TRANSLATION_Y, uofloatArray);
       float f = 0x3f800000;
       objectAnimat.setInterpolator(a.b(0x3f000000, 0, 0.30f, f));
       ValueAnimator valueAnimato = d.c(p0, 1);
       if (valueAnimato != null) {
          valueAnimato.setInterpolator(a.b(0.05f, 0.20f, 0.20f, f));
       }
       AnimatorSet uAnimatorSet = new AnimatorSet();
       uAnimatorSet.setDuration(200);
       if (valueAnimato != null) {
          Animator[] uAnimatorArr = new Animator[i];
          uAnimatorArr[0] = objectAnimat;
          uAnimatorArr[1] = valueAnimato;
          uAnimatorSet.playTogether(uAnimatorArr);
       }else {
          uAnimatorSet.play(objectAnimat);
       }
       return uAnimatorSet;
    }
    public static ValueAnimator c(View p0,boolean p1){
       ValueAnimator valueAnimato = null;
       if (p0.getParent() instanceof View) {
          Drawable background = p0.getParent().getBackground();
          if (background == null) {
             return valueAnimato;
          }else {
             background = background.mutate();
             if (background != null) {
                ValueAnimator valueAnimato1 = (p1)? ValueAnimator.ofInt(new int[2]{'L',0}): ValueAnimator.ofInt(new int[2]{0,'L'});
                valueAnimato = valueAnimato1;
                valueAnimato.addUpdateListener(new m(background));
             }
          }
       }
       return valueAnimato;
    }
}
