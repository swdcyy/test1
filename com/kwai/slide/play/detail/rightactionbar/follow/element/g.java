package com.kwai.slide.play.detail.rightactionbar.follow.element.g;
import androidx.lifecycle.Observer;
import com.kwai.slide.play.detail.rightactionbar.follow.element.k;
import java.lang.Object;
import java.lang.Boolean;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import as7.a;
import q87.c;
import android.widget.ImageView;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import lnc.a1;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import ns7.s0;
import android.view.View;
import android.view.animation.Animation$AnimationListener;
import android.widget.FrameLayout;
import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import ns7.c0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import os7.a$e;
import ns7.t0;
import ns7.h0;
import ns7.p0;
import android.animation.Animator$AnimatorListener;

public final class g implements Observer	// class@001859
{
    public final k b;

    public void g(k p0){
       this.b = p0;
    }
    public final void onChanged(Object p0){
       k p;
       Object[] objArray2;
       g b = this.b;
       Objects.requireNonNull(b);
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       k ok = k.class;
       float f = 0;
       String str = "scaleY";
       String str1 = "scaleX";
       boolean b1 = true;
       String str2 = "AvatarAndFollowElementView";
       Object[] objArray = null;
       float f1 = 10.00f;
       int i = 0;
       if (p0.booleanValue()) {
          if (!PatchProxy.applyVoid(objArray, b, ok, "5")) {
             objArray = new Object[i];
             a.C().s(str2, "showLiveWindow", objArray);
             p = b.P;
             p = (p != null && !p.getVisibility())? b.P: b.J;
             b.M = p;
             if (!PatchProxy.applyVoidOneRefs(p, b, ok, "23")) {
                AnimationSet uAnimationSe = new AnimationSet(b1);
                if (p != b.P) {
                   f1 = 8.00f;
                }
                TranslateAnimation translateAni = new TranslateAnimation(0, 0, 0, 0, 0, 0, 0, (float)a1.e(f1));
                AlphaAnimation uAlphaAnimat = new AlphaAnimation(0x3f800000, f);
                uAnimationSe.addAnimation(uAlphaAnimat);
                uAnimationSe.addAnimation(str2);
                uAnimationSe.setFillAfter(b1);
                uAnimationSe.setDuration(300);
                uAlphaAnimat.setAnimationListener(new s0(b, p));
                p.startAnimation(uAnimationSe);
             }
             p = b.O;
             if (p != null) {
                p.setClickable(true);
                b.O.requestLayout();
                b.O.clearAnimation();
                p = b.O;
                ObjectAnimator objectAnimat = PatchProxy.applyOneRefs(p, b, ok, "7");
                if (objectAnimat != patchProxyRe) {
                }else {
                   PropertyValuesHolder[] propertyValu = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(str1, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat(str, new float[2]{0,0x3f800000}),PropertyValuesHolder.ofFloat("alpha", new float[2]{0,0x3f800000})};
                   objectAnimat = ObjectAnimator.ofPropertyValuesHolder(p, propertyValu);
                   objectAnimat.addUpdateListener(new c0(p));
                   objectAnimat.setInterpolator(new DecelerateInterpolator());
                   objectAnimat.setDuration(300);
                   objectAnimat.setCurrentPlayTime(0);
                }
                objectAnimat.start();
             }
          }
       }else if(PatchProxy.applyVoid(objArray, b, ok, "4")){
          Object[] objArray1 = new Object[0];
          a.C().s(str2, "hideLiveWindow", objArray1);
          p = b.Q;
          if (p != null && p.a != null) {
             p = b.M;
             if (p != null) {
                if (PatchProxy.applyVoidOneRefs(p, b, ok, "24")) {
                   objArray2 = objArray;
                label_0178 :
                   b.M = objArray2;
                   p = b.O;
                   if (p != null) {
                      p.clearAnimation();
                      if (!b.O.getVisibility() && !b.O.getAlpha() - 0x3f800000) {
                         p = b.O;
                         ObjectAnimator objectAnimat1 = PatchProxy.applyOneRefs(p, b, ok, "8");
                         if (objectAnimat1 != patchProxyRe) {
                         }else {
                            PropertyValuesHolder[] propertyValu1 = new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(str1, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat(str, new float[2]{0x3f800000,0}),PropertyValuesHolder.ofFloat("alpha", new float[2]{0x3f800000,0})};
                            objectAnimat1 = ObjectAnimator.ofPropertyValuesHolder(p, propertyValu1);
                            objectAnimat1.addUpdateListener(new h0(p));
                            objectAnimat1.setInterpolator(new DecelerateInterpolator());
                            objectAnimat1.setDuration(300);
                            objectAnimat1.setCurrentPlayTime(0);
                            objectAnimat1.addListener(new p0(b, p));
                         }
                         objectAnimat1.start();
                      }else {
                         b.O.setVisibility(8);
                      }
                   }
                }else {
                   AnimationSet uAnimationSe1 = new AnimationSet(true);
                   if (p != b.P) {
                      f1 = 8.00f;
                   }
                   TranslateAnimation translateAni1 = new TranslateAnimation(0, 0, 0, 0, 0, (float)a1.e(f1), 0, 0);
                   AlphaAnimation uAlphaAnimat1 = new AlphaAnimation(f, 0x3f800000);
                   uAnimationSe1.addAnimation(uAlphaAnimat1);
                   uAnimationSe1.addAnimation(v11);
                   uAnimationSe1.setFillAfter(true);
                   uAnimationSe1.setDuration(300);
                   uAlphaAnimat1.setAnimationListener(new t0(b, p));
                   p.startAnimation(uAnimationSe1);
                }
             }
          }
          objArray2 = null;
          goto label_0178 ;
       }
       return;
    }
}
