package com.kuaishou.live.common.core.component.gift.c;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.live.common.core.component.gift.d;
import java.lang.Object;
import android.animation.ValueAnimator;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import java.lang.Float;
import android.view.View;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import android.view.animation.OvershootInterpolator;

public class c implements ValueAnimator$AnimatorUpdateListener	// class@00114c
{
    public final d a;

    public void c(d p0){
       this.a = p0;
       super();
    }
    public void onAnimationUpdate(ValueAnimator p0){
       ObjectAnimator objectAnimat;
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
          return;
       }
       c ta = this.a;
       float animatedFrac = p0.getAnimatedFraction();
       Objects.requireNonNull(ta);
       d uod = d.class;
       if (!PatchProxy.isSupport(uod) || !PatchProxy.applyVoidOneRefs(Float.valueOf(animatedFrac), ta, uod, "2")) {
          int i = 2;
          int i1 = 0x3f800000;
          if (animatedFrac - 0x3f000000 > 0 || (ta.i != null && ta.d == null)) {
             int i2 = 0;
             ta.a.setVisibility(i2);
             ta.h = ta.h | 1;
             ta.a.setScaleX(0x3fd9999a);
             ta.a.setScaleY(0x3fd9999a);
             uod = ta.a;
             float[] uofloatArray = new float[i];
             float alpha = (ta.i != null)? uod.getAlpha(): 0;
             uofloatArray[i2] = alpha;
             uofloatArray[1] = i1;
             objectAnimat = j.a(uod, uofloatArray);
             ta.d = objectAnimat;
             float f = 91.00f;
             float f1 = (ta.i != null)? i1 - ta.a.getAlpha(): 0x3f800000;
             objectAnimat.setDuration((long)(f1 * f));
             ta.d.setInterpolator(new LinearInterpolator());
             ta.d.start();
          }
          v1 = animatedFrac - 0x3f0ccccd;
          if (objectAnimat > 0 || (ta.i != null && ta.e == null)) {
             ta.h = ta.h | i;
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(ta.a, "scaleX", new float[i]{0x3fd9999a,0x3f800000});
             ta.e = objectAnimat1;
             objectAnimat1.setDuration((long)((i1 - animatedFrac) * 825.00f));
             ta.e.setInterpolator(new OvershootInterpolator());
             ta.e.start();
          }
          if (objectAnimat > 0 || (ta.i != null && ta.f == null)) {
             ta.h = ta.h | 0x04;
             objectAnimat = ObjectAnimator.ofFloat(ta.a, "scaleY", new float[i]{0x3fd9999a,0x3f800000});
             ta.f = objectAnimat;
             objectAnimat.setDuration((long)((i1 - animatedFrac) * 825.00f));
             ta.f.setInterpolator(new OvershootInterpolator());
             ta.f.start();
          }
          if (ta.h == 7) {
             ta.g = true;
          }
       }
       return;
    }
}
