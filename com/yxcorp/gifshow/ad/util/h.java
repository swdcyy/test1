package com.yxcorp.gifshow.ad.util.h;
import lnc.a1;
import java.lang.Object;
import android.animation.ValueAnimator;
import android.animation.ObjectAnimator;
import com.yxcorp.gifshow.ad.util.i$c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.util.h$f;
import android.animation.Animator$AnimatorListener;
import android.view.View;
import java.lang.Boolean;
import ky8.a;
import android.animation.TimeInterpolator;
import g59.a0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import java.lang.Math;
import com.yxcorp.gifshow.ad.util.h$b;
import g59.b0;
import android.util.Property;
import com.yxcorp.gifshow.ad.util.h$c;
import java.lang.Long;
import java.lang.Integer;
import g59.w;
import g59.x;
import g59.y;
import com.yxcorp.gifshow.ad.util.h$a;
import g59.z;
import com.yxcorp.gifshow.ad.util.h$d;
import com.yxcorp.gifshow.ad.util.h$e;

public final class h	// class@001886
{
    public ValueAnimator a;
    public ValueAnimator b;
    public ValueAnimator c;
    public static final int d;

    static {
       h.d = a1.e(12.00f);
    }
    public void h(){
       super();
       this.c = ObjectAnimator.ofFloat(new float[2]{0,0x3f800000});
    }
    public void a(ValueAnimator p0,i$c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, h.class, "8")) {
          return;
       }
       h tb = this.b;
       if (tb != null) {
          tb.cancel();
       }
       this.b = p0;
       p0.addListener(new h$f(this, p1));
       this.b.start();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, h.class, "9")) {
          return;
       }
       h ta = this.a;
       if (ta != null) {
          ta.cancel();
       }
       ta = this.b;
       if (ta != null) {
          ta.cancel();
       }
       return;
    }
    public void c(View p0,View p1,boolean p2,i$c p3){
       if (PatchProxy.isSupport(h.class) && PatchProxy.applyVoidFourRefs(p0, p1, Boolean.valueOf(p2), p3, this, h.class, "2")) {
          return;
       }
       int d = (p2)? h.d: - h.d;
       int[] ointArray = new int[]{0,d};
       ValueAnimator valueAnimato = ObjectAnimator.ofInt(ointArray);
       valueAnimato.setInterpolator(super(0.25f, 0.10f, 0.25f, 0.10f));
       valueAnimato.setDuration(360);
       valueAnimato.addUpdateListener(new a0(p0, d));
       valueAnimato.addListener(new h$b(this, p0, Math.max(p0.getWidth(), p1.getWidth())));
       int i = (p2)? - h.d: h.d;
       p1.setTranslationY((float)i);
       p1.setTranslationX(0);
       p1.setAlpha(0);
       int[] ointArray1 = new int[]{i,0};
       ValueAnimator valueAnimato1 = ObjectAnimator.ofInt(ointArray1);
       valueAnimato1.setInterpolator(new a(0.25f, 0.10f, 0.25f, 0.10f));
       valueAnimato1.setDuration(360);
       valueAnimato1.setStartDelay(valueAnimato.getDuration());
       valueAnimato1.addUpdateListener(new b0(p1, i));
       this.h(valueAnimato, valueAnimato1, p3);
       return;
    }
    public void d(View p0,View p1,i$c p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "4")) {
          return;
       }
       ObjectAnimator objectAnimat = ObjectAnimator.ofFloat(p0, View.ALPHA, new float[2]{0x3f800000,0});
       objectAnimat.setDuration(180);
       objectAnimat.addListener(new h$c(this, p0, Math.max(p0.getWidth(), p1.getWidth())));
       p1.setTranslationX(0);
       p1.setAlpha(0);
       ObjectAnimator objectAnimat1 = ObjectAnimator.ofFloat(p1, View.ALPHA, new float[2]{0,0x3f800000});
       objectAnimat1.setDuration(180);
       this.g(objectAnimat, objectAnimat1, p2);
       return;
    }
    public void e(View p0,long p1,View p2,long p3,int p4,i$c p5){
       h oh = h.class;
       if (PatchProxy.isSupport(oh)) {
          Object[] objArray = new Object[]{p0,Long.valueOf(p1),p2,Long.valueOf(p3),Integer.valueOf(p4),p5};
          if (PatchProxy.applyVoid(objArray, this, oh, "3")) {
             return;
          }
       }
       int[] ointArray = new int[]{0,p4};
       ValueAnimator valueAnimato = ObjectAnimator.ofInt(ointArray);
       valueAnimato.setDuration(p1);
       valueAnimato.addUpdateListener(new w(p0));
       int[] ointArray1 = new int[]{p4,0};
       ValueAnimator valueAnimato1 = ObjectAnimator.ofInt(ointArray1);
       valueAnimato1.setDuration(p3);
       valueAnimato1.addUpdateListener(new x(p2));
       this.g(valueAnimato, valueAnimato1, p5);
       return;
    }
    public void f(View p0,View p1,i$c p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "1")) {
          return;
       }
       int d = h.d;
       int[] ointArray = new int[]{0,d};
       ValueAnimator valueAnimato = ObjectAnimator.ofInt(ointArray);
       valueAnimato.setDuration(360);
       valueAnimato.addUpdateListener(new y(p0, d));
       valueAnimato.addListener(new h$a(this, p0, Math.max(p0.getWidth(), p1.getWidth())));
       p1.setTranslationY((float)d);
       p1.setTranslationX(0);
       p1.setAlpha(0);
       int[] ointArray1 = new int[]{d,0};
       ValueAnimator valueAnimato1 = ObjectAnimator.ofInt(ointArray1);
       valueAnimato1.setDuration(360);
       valueAnimato1.setStartDelay(200);
       valueAnimato1.addUpdateListener(new z(p1, d));
       this.h(valueAnimato, valueAnimato1, p2);
       return;
    }
    public final void g(ValueAnimator p0,ValueAnimator p1,i$c p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "5")) {
          return;
       }
       h ta = this.a;
       if (ta != null) {
          ta.cancel();
       }
       this.a = p0;
       p0.addListener(new h$d(this, p1, p2));
       p0.start();
       return;
    }
    public final void h(ValueAnimator p0,ValueAnimator p1,i$c p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, h.class, "7")) {
          return;
       }
       h ta = this.a;
       if (ta != null) {
          ta.cancel();
       }
       this.a = p0;
       p0.addListener(new h$e(this, p2));
       p0.start();
       this.a(p1, p2);
       return;
    }
}
