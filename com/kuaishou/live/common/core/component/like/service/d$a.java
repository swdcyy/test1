package com.kuaishou.live.common.core.component.like.service.d$a;
import android.animation.AnimatorListenerAdapter;
import com.kuaishou.live.common.core.component.like.service.d;
import android.animation.Animator;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kuaishou.live.common.core.component.like.service.LiveHeartParticleServiceImpl;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.ImageView;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.kuaishou.live.common.core.basic.degrade.j;
import lo1.l;
import java.lang.Float;
import com.kwai.robust.PatchProxyResult;
import android.animation.ValueAnimator;
import android.graphics.PointF;
import lo1.d;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import ekd.f;
import lo1.j;
import android.animation.Animator$AnimatorListener;
import lo1.k;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;

public class d$a extends AnimatorListenerAdapter	// class@00147c
{
    public final d a;

    public void d$a(d p0){
       this.a = p0;
       super();
    }
    public void onAnimationEnd(Animator p0){
       int i1;
       ValueAnimator valueAnimato;
       float f3;
       float f4;
       Object obj = this;
       if (PatchProxy.applyVoidOneRefs(p0, obj, d$a.class, "1")) {
          return;
       }
       super.onAnimationEnd(p0);
       d$a a = obj.a;
       d b = a.b;
       d a1 = a.a;
       Objects.requireNonNull(b);
       LiveHeartParticleServiceImpl liveHeartPar = LiveHeartParticleServiceImpl.class;
       if (!PatchProxy.applyVoidOneRefs(a1, b, liveHeartPar, "20")) {
          AnimatorSet uAnimatorSet = new AnimatorSet();
          float[] uofloatArray = new float[]{a1.getScaleX(),i1};
          int i = 0;
          i1 = 0x3e99999a;
          ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(a1, View.SCALE_X, uofloatArray);
          objectAnimat.setDuration(400);
          float[] uofloatArray1 = new float[]{a1.getScaleY(),i1};
          ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(a1, View.SCALE_Y, uofloatArray1);
          objectAnimat1.setDuration(400);
          uofloatArray1 = new float[]{a1.getAlpha(),0x3f000000};
          ObjectAnimator objectAnimat2 = j.a(a1, uofloatArray1);
          objectAnimat2.setDuration(400);
          int[] ointArray = new int[i];
          LiveHeartParticleServiceImpl p = b.p;
          if (p != null) {
             ointArray = p.d();
          }
          float f = (float)ointArray[i];
          float f1 = (float)ointArray[1];
          float translationX = a1.getTranslationX();
          float translationY = a1.getTranslationY();
          if (PatchProxy.isSupport(liveHeartPar)) {
             Object[] objArray = new Object[]{a1,Float.valueOf(translationX),Float.valueOf(translationY),Float.valueOf(f),Float.valueOf(f1)};
             valueAnimato = PatchProxy.apply(objArray, b, liveHeartPar, "21");
             if (valueAnimato != PatchProxyResult.class) {
             label_011d :
                valueAnimato.setDuration(2000);
                objectAnimat2.addListener(new j(b, a1));
                uAnimatorSet.addListener(new k(b, a1));
                uAnimatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
                Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1,objectAnimat2,valueAnimato};
                uAnimatorSet.playTogether(uAnimatorArr);
                uAnimatorSet.setStartDelay(300);
                uAnimatorSet.start();
             }
          }
          liveHeartPar = b.h;
          float f2 = 0x3f666666;
          if (liveHeartPar == 1) {
             f3 = translationY - f1;
             f4 = 0.20f;
          }else if(liveHeartPar == 2){
             f3 = ((translationY - f1) * f2) + f1;
             f2 = translationX - f;
             f4 = 0.30f;
          }else if(liveHeartPar == 3){
             f3 = ((translationY - f1) * 0x3f000000) + f1;
             f2 = translationX - f;
             f4 = 0x3f4ccccd;
          }else {
             f3 = translationY - f1;
             f4 = 0.30f;
          }
          f2 = (f2 * f4) + f;
       label_00f4 :
          valueAnimato = f.c(new PointF(translationX, translationY), new PointF(f2, translationY), new PointF(f, f3), new PointF(f, f1), 2000, new d(a1));
          goto label_011d ;
          f3 = (f3 * f4) + f1;
          f2 = ((translationX - f) * f2) + f;
          goto label_00f4 ;
       }
       return;
    }
}
