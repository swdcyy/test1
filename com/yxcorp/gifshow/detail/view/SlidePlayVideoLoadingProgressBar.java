package com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBar;
import android.widget.ProgressBar;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.graphics.drawable.ColorDrawable;
import com.kwai.library.slide.base.exp.SlidePerformanceExp;
import com.kwai.robust.PatchProxyResult;
import qrd.p;
import java.lang.Boolean;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.animation.TimeInterpolator;
import n9a.a0;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.yxcorp.gifshow.detail.view.SlidePlayVideoLoadingProgressBar$a;
import android.animation.Animator$AnimatorListener;
import android.graphics.Canvas;
import java.lang.Float;
import android.graphics.drawable.Drawable;
import java.lang.Integer;
import android.view.View;
import android.animation.AnimatorListenerAdapter;

public class SlidePlayVideoLoadingProgressBar extends ProgressBar	// class@001a6a
{
    public ValueAnimator b;
    public Drawable c;
    public Drawable d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public AnimatorListenerAdapter l;
    public static int m = 1000;

    public void SlidePlayVideoLoadingProgressBar(Context p0){
       super(p0);
       this.a();
    }
    public void SlidePlayVideoLoadingProgressBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.a();
    }
    public void SlidePlayVideoLoadingProgressBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.a();
    }
    public void a(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, SlidePlayVideoLoadingProgressBar.class, "1")) {
          return;
       }
       this.setPadding(0, 0, 0, 0);
       this.c = new ColorDrawable(-1);
       this.d = new ColorDrawable(-1);
       Boolean uBoolean = PatchProxy.apply(objArray, objArray, SlidePerformanceExp.class, "1");
       if (uBoolean == PatchProxyResult.class) {
          uBoolean = SlidePerformanceExp.d.getValue();
       }
       if (uBoolean.booleanValue()) {
          SlidePlayVideoLoadingProgressBar.m = 700;
       }
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, SlidePlayVideoLoadingProgressBar.class, "12")) {
          return;
       }
       SlidePlayVideoLoadingProgressBar tb = this.b;
       if (tb != null && tb.isRunning()) {
          this.b.setRepeatCount(0);
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, SlidePlayVideoLoadingProgressBar.class, "11")) {
          return;
       }
       this.k = false;
       this.j = false;
       this.setProgress(false);
       return;
    }
    public final void d(){
       if (PatchProxy.applyVoid(null, this, SlidePlayVideoLoadingProgressBar.class, "9")) {
          return;
       }
       if (this.k == null) {
          this.f();
          this.k = true;
          int[] ointArray = new int[]{this.getProgress(),this.getMax()};
          ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
          this.b = valueAnimato;
          valueAnimato.setDuration((long)SlidePlayVideoLoadingProgressBar.m);
          this.b.setInterpolator(new AccelerateDecelerateInterpolator());
          this.b.setRepeatMode(true);
          this.b.setRepeatCount(-1);
          this.b.addUpdateListener(new a0(this));
          this.b.addListener(new SlidePlayVideoLoadingProgressBar$a(this));
          this.b.start();
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, SlidePlayVideoLoadingProgressBar.class, "8")) {
          return;
       }
       this.j = true;
       if (this.e != null) {
          this.d();
       }
       return;
    }
    public void f(){
       if (PatchProxy.applyVoid(null, this, SlidePlayVideoLoadingProgressBar.class, "10")) {
          return;
       }
       SlidePlayVideoLoadingProgressBar tb = this.b;
       if (tb != null) {
          if (tb.isRunning()) {
             this.b.cancel();
          }
          this.b = null;
       }
       this.c();
       return;
    }
    public synchronized void onDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlayVideoLoadingProgressBar.class, "3")) {
          return;
       }
       super.onDraw(p0);
       if (this.c != null && this.d != null) {
          float f = (float)this.getProgress() / (float)this.getMax();
          if (!PatchProxy.isSupport(SlidePlayVideoLoadingProgressBar.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), this, SlidePlayVideoLoadingProgressBar.class, "4")) {
             int i = 255;
             float f1 = 0x437f0000;
             if (f - 0x3ecccccd <= 0) {
                int i1 = (int)((0.20f + f) * f1);
                if (i1 <= i) {
                   i = i1;
                }
             }else if(f - 0x3f19999a >= 0){
                float f2 = 0x3f800000;
                if (f - f2 <= 0) {
                   i = (int)(((f2 - f) * 0x3fc00001) * f1);
                   if (i < 0) {
                      i = 0;
                   }
                }
             }
             i = -1;
             if (i > -1) {
                this.c.setAlpha(i);
                this.d.setAlpha(i);
             }
          }
          if (!PatchProxy.isSupport(SlidePlayVideoLoadingProgressBar.class) || !PatchProxy.applyVoidOneRefs(Float.valueOf(f), this, SlidePlayVideoLoadingProgressBar.class, "5")) {
             if (f - 0x3f19999a <= 0) {
                this.setLeftDrawableBounds(f);
                this.setRightDrawableBounds(f);
             }else {
                this.setLeftDrawableBounds(0x3f19999a);
                this.setRightDrawableBounds(0x3f19999a);
             }
          }
          this.c.draw(p0);
          this.d.draw(p0);
       }
       return;
    }
    public void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (PatchProxy.isSupport(SlidePlayVideoLoadingProgressBar.class)) {
          Object[] objArray = new Object[]{Boolean.valueOf(p0),Integer.valueOf(p1),Integer.valueOf(p2),Integer.valueOf(p3),Integer.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, SlidePlayVideoLoadingProgressBar.class, "2")) {
             return;
          }
       }
       super.onLayout(p0, p1, p2, p3, p4);
       if (p0 && (p3 - p1) > 0) {
          this.f = p1;
          this.g = p3;
          this.h = p2;
          this.i = p4;
          this.e = true;
          if (this.j != null && this.k == null) {
             this.d();
          }
       }
       return;
    }
    public void setAnimatorListenerAdapter(AnimatorListenerAdapter p0){
       this.l = p0;
    }
    public final void setLeftDrawableBounds(float p0){
       if (PatchProxy.isSupport(SlidePlayVideoLoadingProgressBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SlidePlayVideoLoadingProgressBar.class, "6")) {
          return;
       }
       SlidePlayVideoLoadingProgressBar tf = this.f;
       int i = (this.g - tf) / 2;
       this.c.setBounds((int)((float)i - (((float)(i - tf) / 0x3f19999a) * p0)), 0, i, (this.i - this.h));
       return;
    }
    public final void setRightDrawableBounds(float p0){
       if (PatchProxy.isSupport(SlidePlayVideoLoadingProgressBar.class) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, SlidePlayVideoLoadingProgressBar.class, "7")) {
          return;
       }
       SlidePlayVideoLoadingProgressBar tg = this.g;
       int i = (tg - this.f) / 2;
       this.d.setBounds(i, 0, (int)((float)i + (((float)(tg - i) / 0x3f19999a) * p0)), (this.i - this.h));
       return;
    }
}
