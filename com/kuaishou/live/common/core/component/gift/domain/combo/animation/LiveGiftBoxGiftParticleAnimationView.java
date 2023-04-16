package com.kuaishou.live.common.core.component.gift.domain.combo.animation.LiveGiftBoxGiftParticleAnimationView;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.util.LinkedList;
import java.util.Random;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.List;
import com.yxcorp.gifshow.models.Gift;
import android.view.View;
import android.app.Activity;
import com.yxcorp.utility.n;
import java.lang.Float;
import java.util.Collection;
import ekd.q;
import com.yxcorp.gifshow.image.KwaiImageView;
import com.yxcorp.gifshow.image.KwaiBindableImageView;
import java.lang.Math;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import ph1.f;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ObjectAnimator;
import android.view.animation.AccelerateInterpolator;
import ph1.g;
import com.kuaishou.live.common.core.basic.degrade.j;
import android.animation.AnimatorSet;
import android.animation.Animator;
import ph1.h;
import android.animation.Animator$AnimatorListener;
import com.kwai.robust.PatchProxyResult;
import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;

public class LiveGiftBoxGiftParticleAnimationView extends FrameLayout	// class@001172
{
    public final List b;
    public final Random c;
    public static int d;

    static {
       LiveGiftBoxGiftParticleAnimationView.d = a1.d(0x7f07078c);
    }
    public void LiveGiftBoxGiftParticleAnimationView(Context p0){
       super(p0, null, 0);
    }
    public void LiveGiftBoxGiftParticleAnimationView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void LiveGiftBoxGiftParticleAnimationView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = new LinkedList();
       this.c = new Random();
       this.setVisibility(8);
    }
    public final float a(float p0,float p1,float p2,float p3){
       float f = 0x3f800000 - p0;
       p3 = p3 * 3.00f;
       return ((((((p1 * f) * f) * f) + (((p3 * p0) * f) * f)) + (((p3 * f) * p0) * p0)) + (((p2 * p0) * p0) * p0));
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, LiveGiftBoxGiftParticleAnimationView.class, "3")) {
          return;
       }
       this.removeAllViews();
       this.b.clear();
       return;
    }
    public void c(Gift p0,View p1,View p2){
       float f3;
       float f7;
       Object obj = this;
       object oobject = p0;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, LiveGiftBoxGiftParticleAnimationView.class, "1")) {
          return;
       }
       int[] ointArray = new int[2];
       p1.getLocationOnScreen(ointArray);
       float f = 2.00f;
       float f1 = (float)p1.getLeft() + ((float)(p1.getWidth() - LiveGiftBoxGiftParticleAnimationView.d) / f);
       float f2 = (float)p1.getTop() + ((float)(p1.getHeight() - LiveGiftBoxGiftParticleAnimationView.d) / f);
       int[] ointArray1 = new int[2];
       p2.getLocationOnScreen(ointArray1);
       int i = 0;
       if (!p2.getWidth()) {
          Activity uActivity = n.d(this);
          f3 = (uActivity != null)? (float)ointArray1[i] + ((float)n.k(uActivity) / f): (float)ointArray1[i];
       }else {
          f3 = ((float)p2.getWidth() / f) + (float)ointArray1[i];
       }
       float f4 = f3;
       int i1 = 1;
       float f5 = (((float)p1.getTop() + (float)(ointArray1[i1] - ointArray[i1])) + ((float)p2.getHeight() / f)) - ((float)LiveGiftBoxGiftParticleAnimationView.d / f);
       int i2 = 4;
       if (PatchProxy.isSupport(LiveGiftBoxGiftParticleAnimationView.class)) {
          Object[] objArray = new Object[]{oobject,Float.valueOf(f1),Float.valueOf(f2),Float.valueOf(f4),Float.valueOf(f5)};
          if (!PatchProxy.applyVoid(objArray, obj, LiveGiftBoxGiftParticleAnimationView.class, "2")) {
          label_00bd :
             if (!q.f(oobject.mImageUrl)) {
                obj.setVisibility(i);
                KwaiImageView giftParticle = this.getGiftParticle();
                giftParticle.P(oobject.mImageUrl);
                float f6 = ((f1 - f4) * 0.20f) * (obj.c.nextFloat() + 0x3f800000);
                if (!f2 - f5) {
                   f6 = 0;
                }else {
                   f7 = f4 - f1;
                   float f8 = f5 - f2;
                   if (Math.abs(f7) - Math.abs(f8) <= 0) {
                      f7 = (f7 * f6) / f8;
                   label_0102 :
                      ValueAnimator valueAnimato = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                      valueAnimato.setInterpolator(new AccelerateDecelerateInterpolator());
                      f uof = f;
                      f uof1 = f;
                      ValueAnimator valueAnimato1 = valueAnimato;
                      uof = new f(this, giftParticle, f1, f4, (((f1 + f4) * 0x3f000000) + f6), f2, f5, (((f2 + f5) * 0x3f000000) - f7));
                      valueAnimato1.addUpdateListener(uof1);
                      valueAnimato1.setDuration(800);
                      float[] uofloatArray = new float[]{0,(float)Math.toDegrees(Math.atan2((double)(f5 - f2), (double)(f4 - f1))) + 90.00f};
                      KwaiImageView kwaiImageVie = giftParticle;
                      ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(kwaiImageVie, "rotation", uofloatArray);
                      objectAnimat.setInterpolator(new AccelerateInterpolator());
                      objectAnimat.setDuration(800);
                      ValueAnimator valueAnimato2 = ValueAnimator.ofFloat(new float[2]{0,0x3f800000});
                      valueAnimato2.addUpdateListener(new g(kwaiImageVie));
                      valueAnimato2.setDuration(800);
                      ObjectAnimator objectAnimat1 = j.a(kwaiImageVie, new float[2]{0x3f800000,0});
                      objectAnimat1.setDuration(400);
                      objectAnimat1.setStartDelay(400);
                      super();
                      Animator[] uAnimatorArr = new Animator[]{valueAnimato1,objectAnimat,valueAnimato2,objectAnimat1};
                      this.playTogether(uAnimatorArr);
                      this.addListener(new h(obj, kwaiImageVie));
                      this.start();
                   }
                }
                f7 = 0;
                goto label_0102 ;
             }
          }
       }else {
          goto label_00bd ;
       }
       return;
    }
    public final KwaiImageView getGiftParticle(){
       KwaiImageView obj = PatchProxy.apply(null, this, LiveGiftBoxGiftParticleAnimationView.class, "4");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (!this.b.isEmpty()) {
          obj = this.b.remove(0);
          obj.setAlpha(0x3f800000);
          obj.setVisibility(0);
          return obj;
       }else {
          obj = new KwaiImageView(this.getContext());
          this.addView(obj, new ViewGroup$LayoutParams(LiveGiftBoxGiftParticleAnimationView.d, LiveGiftBoxGiftParticleAnimationView.d));
          return obj;
       }
    }
    public void setGiftParticleSizePx(int p0){
       LiveGiftBoxGiftParticleAnimationView.d = p0;
    }
}
