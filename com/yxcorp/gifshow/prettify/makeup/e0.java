package com.yxcorp.gifshow.prettify.makeup.e0;
import java.lang.Object;
import java.util.List;
import android.view.View;
import android.animation.Animator;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import com.kwai.robust.PatchProxyResult;
import lnc.a1;
import android.animation.ValueAnimator;
import th0.n;
import android.animation.TimeInterpolator;
import f1c.e2;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import th0.e;
import f1c.f2;
import f1c.g2;
import f1c.h2;
import android.animation.AnimatorSet;
import com.yxcorp.gifshow.prettify.makeup.e0$b;
import android.animation.Animator$AnimatorListener;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.yxcorp.gifshow.prettify.makeup.e0$a;
import android.view.animation.Animation$AnimationListener;
import f1c.i2;

public class e0	// class@001176
{

    public void e0(){
       super();
    }
    public static Animator a(boolean p0,List p1,View p2,View p3,View p4,List p5){
       ValueAnimator obj;
       object oobject = p1;
       object oobject1 = p5;
       e0 uoe0 = e0.class;
       int i = 4;
       int i1 = 3;
       int i2 = 1;
       if (PatchProxy.isSupport(uoe0)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),oobject,p2,p3,p4,oobject1};
          obj = PatchProxy.apply(objArray, null, uoe0, "5");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i3 = a1.e(18.00f);
       if (p0) {
          i3 = i3 * -1;
       }
       int i4 = a1.e(32.00f);
       if (!p0) {
          i4 = i4 * -1;
       }
       ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0x3f800000,0});
       valueAnimato.setDuration(240);
       valueAnimato.setInterpolator(new n());
       valueAnimato.addUpdateListener(new e2(p1));
       float[] uofloatArray = new float[]{0,(float)i3};
       obj = ValueAnimator.ofFloat(uofloatArray);
       obj.setDuration(300);
       obj.setInterpolator(new e());
       obj.addUpdateListener(new f2(p1));
       uofloatArray = new float[]{(float)i4,0};
       ValueAnimator valueAnimato1 = ValueAnimator.ofFloat(uofloatArray);
       valueAnimato1.addUpdateListener(new g2(oobject1));
       valueAnimato1.setDuration(300);
       valueAnimato1.setInterpolator(new e());
       ValueAnimator valueAnimato2 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
       valueAnimato2.addUpdateListener(new h2(oobject1));
       valueAnimato2.setDuration(300);
       valueAnimato2.setInterpolator(new e());
       AnimatorSet uAnimatorSet = new AnimatorSet();
       Animator[] uAnimatorArr = new Animator[i];
       uAnimatorArr[0] = valueAnimato;
       uAnimatorArr[i2] = obj;
       uAnimatorArr[2] = valueAnimato2;
       uAnimatorArr[i1] = valueAnimato1;
       uAnimatorSet.playTogether(uAnimatorArr);
       e0$b uob = new e0$b(p5, p4, p3, p2, p1);
       uAnimatorSet.addListener(i2);
       return uAnimatorSet;
    }
    public static void b(View p0,View p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, e0.class, "3")) {
          return;
       }
       Animation uAnimation = AnimationUtils.loadAnimation(a.a().a(), R.anim.arg_RES_7f010112);
       uAnimation.setAnimationListener(new e0$a(p1, p0));
       p0.startAnimation(uAnimation);
       p1.startAnimation(AnimationUtils.loadAnimation(a.a().a(), R.anim.arg_RES_7f010106));
       return;
    }
    public static Animator c(List p0,View p1,View p2,View p3,List p4){
       e0 uoe0 = e0.class;
       if (PatchProxy.isSupport(uoe0)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, null, uoe0, "6");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Animator uAnimator = e0.a(false, p0, p1, p2, p3, p4);
       uAnimator.start();
       return uAnimator;
    }
    public static void d(View p0,View p1){
       e0 uoe0 = e0.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, null, uoe0, "1")) {
          return;
       }
       if (!PatchProxy.isSupport(uoe0) || !PatchProxy.applyVoidThreeRefs(p0, p1, Boolean.FALSE, null, e0.class, "2")) {
          Animation uAnimation = AnimationUtils.loadAnimation(a.a().a(), R.anim.arg_RES_7f01010f);
          uAnimation.setAnimationListener(new i2(p1, p0, false));
          p0.startAnimation(uAnimation);
          p1.startAnimation(AnimationUtils.loadAnimation(a.a().a(), R.anim.arg_RES_7f010109));
       }
       return;
    }
    public static Animator e(List p0,View p1,View p2,View p3,List p4){
       e0 uoe0 = e0.class;
       if (PatchProxy.isSupport(uoe0)) {
          Object[] objArray = new Object[]{p0,p1,p2,p3,p4};
          Object obj = PatchProxy.apply(objArray, null, uoe0, "4");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       Animator uAnimator = e0.a(true, p0, p1, p2, p3, p4);
       uAnimator.start();
       return uAnimator;
    }
}
