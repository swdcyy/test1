package com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RandomTextView;
import android.widget.TextView;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Canvas;
import java.lang.String;
import android.graphics.Paint;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Object;
import java.lang.Float;
import java.lang.Math;
import android.graphics.Typeface;
import ekd.d0;
import android.animation.ValueAnimator;
import java.lang.Integer;
import i84.e;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RandomTextView$a;
import android.animation.Animator$AnimatorListener;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import i84.f;
import android.view.animation.LinearInterpolator;
import i84.g;
import i84.h;
import android.text.TextPaint;
import android.graphics.Paint$Align;
import android.graphics.Paint$FontMetricsInt;
import java.lang.StringBuilder;
import com.kuaishou.merchant.marketing.platform.fullgiving.dialog.RandomTextView$b;

public class RandomTextView extends TextView	// class@001b17
{
    public int b;
    public Paint c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ValueAnimator j;
    public ValueAnimator k;
    public ValueAnimator l;
    public RandomTextView$b m;
    public int n;
    public static final int o;

    public void RandomTextView(Context p0){
       super(p0);
       this.d = true;
       this.e = false;
       this.b();
    }
    public void RandomTextView(Context p0,AttributeSet p1){
       super(p0, p1);
       this.d = true;
       this.e = false;
       this.b();
    }
    public void RandomTextView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.d = true;
       this.e = false;
       this.b();
    }
    public final void a(Canvas p0,String p1,float p2,float p3,Paint p4){
       if (PatchProxy.isSupport(RandomTextView.class)) {
          Object[] objArray = new Object[]{p0,p1,Float.valueOf(p2),Float.valueOf(p3),p4};
          if (PatchProxy.applyVoid(objArray, this, RandomTextView.class, "7")) {
             return;
          }
       }
       RandomTextView tg = this.g;
       if (p3 - (float)(- tg) >= 0 && p3 - (float)(tg * 2) <= 0) {
          p0.drawText(p1, p2, p3, p4);
       }
       return;
    }
    public final void b(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RandomTextView.class, "1")) {
          return;
       }
       this.n = this.d((int)(Math.random() * 10.00f), 0);
       if (!PatchProxy.applyVoid(objArray, this, RandomTextView.class, "9")) {
          this.setTypeface(d0.a("alte-din.ttf", this.getContext()));
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, RandomTextView.class, "8")) {
          return;
       }
       RandomTextView tj = this.j;
       if (tj != null) {
          tj.removeAllListeners();
          this.j.cancel();
          this.j = null;
       }
       tj = this.k;
       if (tj != null) {
          tj.removeAllListeners();
          this.k.cancel();
          this.k = null;
       }
       tj = this.l;
       if (tj != null) {
          tj.removeAllListeners();
          this.l.cancel();
          this.l = null;
       }
       return;
    }
    public final int d(int p0,int p1){
       p0 = p0 - (p1 % 10);
       if (p0 < 0) {
          p0 = p0 + 10;
       }
       return p0;
    }
    public void e(int p0,int p1){
       if (PatchProxy.isSupport(RandomTextView.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, RandomTextView.class, "2")) {
          return;
       }
       int i = this.f * (p0 + 10);
       this.h = i;
       int[] ointArray = new int[]{0,i};
       ValueAnimator valueAnimato = ValueAnimator.ofInt(ointArray);
       this.l = valueAnimato;
       valueAnimato.addUpdateListener(new e(this));
       this.l.addListener(new RandomTextView$a(this));
       this.l.setInterpolator(new DecelerateInterpolator());
       this.l.setDuration((((long)p1 * 400) + 1000));
       return;
    }
    public void f(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RandomTextView.class, "5")) {
          return;
       }
       if (this.e != null) {
          return;
       }
       this.e = true;
       if (!PatchProxy.applyVoid(objArray, this, RandomTextView.class, "6")) {
          RandomTextView tj = this.j;
          if (tj != null) {
             tj.setDuration(560);
             this.j.addUpdateListener(new f(this));
             this.j.setInterpolator(new LinearInterpolator());
             this.j.start();
             this.k.setDuration(800);
             this.k.setRepeatCount(-1);
             this.k.addUpdateListener(new g(this));
             this.k.addListener(new h(this));
             this.k.setInterpolator(new LinearInterpolator());
          }
       }
       return;
    }
    public void onDraw(Canvas p0){
       int measuredHeig;
       if (PatchProxy.applyVoidOneRefs(p0, this, RandomTextView.class, "3")) {
          return;
       }
       int i = 1;
       boolean b = false;
       if (this.d != null) {
          this.d = b;
          super.onDraw(p0);
          TextPaint paint = this.getPaint();
          this.c = paint;
          paint.setTextAlign(Paint$Align.CENTER);
          Paint$FontMetricsInt fontMetricsI = this.c.getFontMetricsInt();
          measuredHeig = this.getMeasuredHeight();
          this.g = measuredHeig;
          fontMetricsI = fontMetricsI.top;
          int i1 = 2;
          measuredHeig = ((((measuredHeig - fontMetricsI.bottom) + fontMetricsI) / i1) - fontMetricsI) + 30;
          this.f = measuredHeig;
          measuredHeig = measuredHeig * 10;
          this.h = measuredHeig;
          int[] ointArray = new int[i1];
          ointArray[b] = b;
          ointArray[i] = measuredHeig;
          this.j = ValueAnimator.ofInt(ointArray);
          ointArray = new int[i1];
          ointArray[b] = b;
          ointArray[i] = this.h;
          this.k = ValueAnimator.ofInt(ointArray);
          this.i = this.getMeasuredWidth() / i1;
       }
       if (!PatchProxy.applyVoidOneRefs(p0, this, RandomTextView.class, "4")) {
          if (this.e == null) {
             this.a(p0, String.valueOf(this.n), (float)this.i, (float)((this.f - this.b) - 30), this.c);
          }else {
             for (int i2 = 1; i2 < 50; i2 = i2 + 1) {
                measuredHeig = i2 - 50;
                measuredHeig = measuredHeig + i;
                measuredHeig = this.f * i2;
                measuredHeig = measuredHeig - this.b;
                measuredHeig = measuredHeig - 30;
                this.a(p0, this.d(b, measuredHeig)+"", (float)this.i, (float)measuredHeig, this.c);
             }
          }
       }
       return;
    }
    public void setScrollEndListener(RandomTextView$b p0){
       this.m = p0;
    }
}
