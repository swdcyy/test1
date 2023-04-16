package com.kuaishou.live.audience.component.topbar.d$c;
import ub.a;
import com.kuaishou.live.audience.component.topbar.d;
import java.lang.ref.WeakReference;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import android.widget.LinearLayout;
import java.lang.IllegalStateException;
import ms5.a;
import ms5.a$b;
import android.graphics.drawable.Animatable;
import android.widget.ImageView;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import android.view.View;
import android.util.Property;
import android.animation.ObjectAnimator;
import d61.l;
import android.animation.TimeInterpolator;
import com.kuaishou.live.audience.component.topbar.d$a;
import android.animation.Animator$AnimatorListener;

public class d$c extends a	// class@000be9
{
    public WeakReference b;

    public void d$c(d p0){
       super();
       this.b = new WeakReference(p0);
    }
    public void onFailure(String p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d$c.class, "2")) {
          return;
       }
       d$c tb = this.b;
       if (tb != null) {
          d uod = tb.get();
          if (uod != null && !PatchProxy.applyVoid(null, uod, d.class, "19")) {
             d o = uod.O;
             if (o != null) {
                o.setVisibility(8);
                o = uod.T;
                if (o != null) {
                   d s = uod.S;
                   if (s != null) {
                      o.Lg(s, new IllegalStateException("load image failed"));
                   }
                }
                uod.T = null;
                uod.S = null;
                uod.h9();
             }
          }
       }
       return;
    }
    public void onFinalImageSet(String p0,Object p1,Animatable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, d$c.class, "1")) {
          return;
       }
       d$c tb = this.b;
       if (tb != null) {
          d uod = tb.get();
          if (uod != null) {
             p1 = d.class;
             if (!PatchProxy.applyVoid(null, uod, p1, "18")) {
                d o = uod.O;
                int i = 0;
                if (o != null) {
                   o.setVisibility(i);
                }
                o = uod.P;
                if (o != null) {
                   o.setTranslationX((float)(- uod.d9()));
                }
                uod.a9(uod.Q);
                o = uod.S;
                if (o != null) {
                   d p = uod.P;
                   if (p != null) {
                      p1 = PatchProxy.applyTwoRefs(p, o, uod, p1, "13");
                      if (p1 != PatchProxyResult.class) {
                      }else {
                         float[] uofloatArray = new float[]{(float)(- uod.d9()),0};
                         ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p, View.TRANSLATION_X, uofloatArray);
                         objectAnimat.setStartDelay(o.e);
                         objectAnimat.setDuration(250);
                         objectAnimat.setInterpolator(new l(0.20f, 0.30f, 0x3f000000, 0x3f800000));
                         objectAnimat.addListener(new d$a(uod));
                         p1 = objectAnimat;
                      }
                      uod.Q = p1;
                      p1.start();
                   }
                }
             }
          }
       }
       return;
    }
}
