package com.kwai.live.gzone.guess.kshell.widget.BetOptionStatBar;
import ml8.d;
import android.widget.FrameLayout;
import lnc.a1;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import android.graphics.Typeface;
import ekd.d0;
import android.widget.TextView;
import android.content.res.Resources;
import r57.a;
import java.lang.Float;
import r57.b;
import java.lang.CharSequence;
import java.lang.Math;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import android.animation.TimeInterpolator;
import com.kwai.live.gzone.guess.kshell.widget.BetOptionStatBar$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.View;
import ekd.m1;
import a2.i0;
import java.lang.Integer;
import java.lang.Runnable;

public class BetOptionStatBar extends FrameLayout implements d	// class@000d71
{
    public float b;
    public float c;
    public Runnable d;
    public boolean e;
    public TextView f;
    public TextView g;
    public View h;
    public a i;
    public ValueAnimator j;
    public static float k = 0.130000;
    public static final int l;

    static {
       BetOptionStatBar.l = a1.e(50.00f);
    }
    public void BetOptionStatBar(Context p0){
       super(p0);
       this.b = 0;
    }
    public void BetOptionStatBar(Context p0,AttributeSet p1){
       super(p0, p1);
       this.b = 0;
    }
    public void BetOptionStatBar(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = 0;
    }
    public void a(boolean p0){
       if (PatchProxy.isSupport(BetOptionStatBar.class) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, BetOptionStatBar.class, "8")) {
          return;
       }
       this.e = p0;
       Typeface typeface = d0.a("alte-din.ttf", this.getContext());
       this.f.setTypeface(typeface);
       this.g.setTypeface(typeface);
       if (this.e == null) {
          this.i.b(this.getResources().getColor(R.color.arg_RES_7f0613e4), this.getResources().getColor(R.color.arg_RES_7f0613e4), this.getResources().getColor(R.color.arg_RES_7f0613e7), this.getResources().getColor(R.color.arg_RES_7f0613e7));
          this.i.c(0x3f000000);
       }else {
          this.i.b(this.getResources().getColor(R.color.arg_RES_7f0604c1), this.getResources().getColor(R.color.arg_RES_7f0604c1), this.getResources().getColor(R.color.arg_RES_7f060220), this.getResources().getColor(R.color.arg_RES_7f060220));
          this.i.c(0);
          this.setProgressPadding(a1.e(0x3f400000));
       }
       return;
    }
    public void b(float p0,float p1,String p2,String p3,boolean p4){
       float f1;
       BetOptionStatBar uBetOptionSt = this;
       object oobject = p2;
       object oobject1 = p3;
       int i = 2;
       int i1 = 1;
       int i2 = 0;
       if (PatchProxy.isSupport(BetOptionStatBar.class)) {
          Object[] objArray = new Object[]{Float.valueOf(p0),Float.valueOf(p1),oobject,oobject1,Boolean.valueOf(p4)};
          if (PatchProxy.applyVoid(objArray, this, BetOptionStatBar.class, "5")) {
             return;
          }
       }
       Runnable runnable = null;
       uBetOptionSt.d = runnable;
       b uob = null;
       if (!uBetOptionSt.b - uob) {
          b uob1 = new b(this, p0, p1, p2, p3, p4);
          uBetOptionSt.d = uob;
          return;
       }else {
          uBetOptionSt.f.setText(p2);
          uBetOptionSt.g.setText(p3);
          BetOptionStatBar b = uBetOptionSt.b;
          float k = BetOptionStatBar.k;
          float f = 0x3f800000;
          if (b - k < 0 || b - f > 0) {
             uBetOptionSt.b = k;
          }
          if (!p0 - uob && !p1 - uob) {
             f1 = 0x3f000000;
          }else {
             f1 = uBetOptionSt.b;
             if (p0 - f1 > 0) {
                f1 = (p0 - (f - f1) >= 0)? f - f1: p0;
             }
          }
          f = f - f1;
          BetOptionStatBar i3 = uBetOptionSt.i;
          i3.i = f1;
          i3.j = f;
          int i4 = (int)(f1 * 10000.00f);
          i3.k = i4;
          i3.l = i4 - 10000;
          k = Math.max(f1, f);
          if (p4) {
             if (!uBetOptionSt.c - f1) {
                return;
             }else {
                uBetOptionSt.c = f1;
                if (!PatchProxy.applyVoid(runnable, this, BetOptionStatBar.class, "7")) {
                   b = uBetOptionSt.j;
                   if (b != null) {
                      b.removeAllListeners();
                      uBetOptionSt.j.cancel();
                      uBetOptionSt.j = runnable;
                   }
                }
                uBetOptionSt.i.setLevel(i2);
                float[] uofloatArray = new float[i];
                uofloatArray[i2] = uob;
                uofloatArray[i1] = k;
                ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
                valueAnimato.setInterpolator(new LinearInterpolator());
                valueAnimato.setDuration((long)(k * 1000.00f));
                valueAnimato.addUpdateListener(new BetOptionStatBar$a(this));
                valueAnimato.start();
                uBetOptionSt.j = valueAnimato;
             }
          }else {
             uBetOptionSt.i.setLevel((int)(k * 10000.00f));
          }
          return;
       }
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, BetOptionStatBar.class, "1")) {
          return;
       }
       this.h = m1.f(p0, 0x7f0a32db);
       this.g = m1.f(p0, 0x7f0a366d);
       this.f = m1.f(p0, 0x7f0a1748);
       return;
    }
    public void onFinishInflate(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, BetOptionStatBar.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       if (!PatchProxy.applyVoid(objArray, this, BetOptionStatBar.class, "4")) {
          a uoa = new a();
          this.i = uoa;
          uoa.b(this.getResources().getColor(R.color.arg_RES_7f0613e5), this.getResources().getColor(R.color.arg_RES_7f0613e3), this.getResources().getColor(R.color.arg_RES_7f0613e8), this.getResources().getColor(R.color.arg_RES_7f0613e6));
          i0.v0(this.h, this.i);
       }
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(BetOptionStatBar.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, BetOptionStatBar.class, "3")) {
          return;
       }
       super.onSizeChanged(p0, p1, p2, p3);
       if (p0 > 0) {
          float f = (float)BetOptionStatBar.l / (float)p0;
          this.b = f;
          float k = BetOptionStatBar.k;
          if (f - k < 0 || (double)f - 0x3fe0000000000000 >= 0) {
             this.b = k;
          }
          BetOptionStatBar td = this.d;
          if (td != null) {
             this.post(td);
          }
       }
       return;
    }
    public void setProgressPadding(int p0){
       if (PatchProxy.isSupport(BetOptionStatBar.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, BetOptionStatBar.class, "6")) {
          return;
       }
       this.i.n = p0;
       return;
    }
}
