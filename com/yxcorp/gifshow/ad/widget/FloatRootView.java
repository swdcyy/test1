package com.yxcorp.gifshow.ad.widget.FloatRootView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import o56.a;
import android.content.res.Resources;
import android.app.Application;
import cw9.c;
import com.yxcorp.gifshow.ad.widget.FloatRootView$a;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.ad.widget.FloatRootView$b;
import android.app.Activity;
import e3a.a;
import com.yxcorp.gifshow.widget.SwipeLayout;
import lnc.w9;
import joc.z;
import w59.n;
import java.lang.Runnable;
import android.view.MotionEvent;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;
import java.lang.StringBuilder;
import yx.j0;
import android.view.ViewConfiguration;
import java.lang.Math;
import java.util.Objects;
import android.os.Handler;
import java.lang.Float;
import java.lang.System;
import android.view.ViewGroup;
import java.lang.Integer;
import w59.m;

public class FloatRootView extends FrameLayout	// class@001922
{
    public int b;
    public int c;
    public int d;
    public int e;
    public FloatRootView$b f;
    public float g;
    public float h;
    public int i;
    public int j;
    public boolean k;
    public Context l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public SwipeLayout u;
    public final c v;
    public static final int w;

    public void FloatRootView(Context p0){
       super(p0, null);
    }
    public void FloatRootView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void FloatRootView(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.b = c.b(a.B.getResources(), 0x7f07006f);
       this.c = c.b(a.B.getResources(), 0x7f0703f5);
       this.d = c.b(a.B.getResources(), 0x7f0703f6);
       this.e = c.b(a.B.getResources(), 0x7f07006e);
       FloatRootView$a uoa = new FloatRootView$a(this);
       this.v = uoa;
       this.l = p0;
       if (PatchProxy.applyVoid(null, this, FloatRootView.class, "1")) {
       }else {
          this.f = new FloatRootView$b(this);
          this.setClickable(true);
          Activity uActivity = a.b(this.getContext());
          if (uActivity != null) {
             this.u = w9.c(uActivity);
          }
          FloatRootView tu = this.u;
          if (tu != null) {
             tu.c(uoa);
          }
          this.a();
       }
       return;
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, FloatRootView.class, "2")) {
          return;
       }
       this.post(new n(this));
       return;
    }
    public boolean b(MotionEvent p0){
       boolean b;
       float f;
       float f3;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       Object obj = PatchProxy.applyOneRefs(p0, this, FloatRootView.class, "7");
       if (obj != patchProxyRe) {
          return obj.booleanValue();
       }
       int action = p0.getAction();
       Object[] objArray = null;
       if (action) {
          if (action != 1) {
             if (action != 2) {
                if (action == 3) {
                label_00a5 :
                   this.c();
                   p0 = PatchProxy.apply(objArray, this, FloatRootView.class, "9");
                   if (p0 != patchProxyRe) {
                      b = p0.booleanValue();
                   }else {
                      f = (float)ViewConfiguration.get(this.l).getScaledTouchSlop();
                      b = (Math.abs((this.o - this.m)) - f <= 0 && Math.abs((this.p - this.n)) - f <= 0)? true: false;
                   }
                   if (b && !PatchProxy.applyVoid(objArray, this, FloatRootView.class, "8")) {
                      this.performClick();
                   }
                   this.k = false;
                }
             }else {
                this.m = p0.getRawX();
                this.n = p0.getRawY();
                if (!PatchProxy.applyVoidOneRefs(p0, this, FloatRootView.class, "10")) {
                   float f1 = (this.s + p0.getRawX()) - this.q;
                   float f2 = 0;
                   if (f1 - f2 <= 0) {
                      f1 = 0;
                   }else {
                      f3 = (float)this.i;
                      if (f1 - f3 > 0) {
                         f1 = f3;
                      }
                   }
                   this.setX(f1);
                   f3 = (this.t + p0.getRawY()) - this.r;
                   if (f3 - f2 > 0) {
                      f2 = (float)this.j;
                      if (f3 - f2 <= 0) {
                         f2 = f3;
                      }
                   }
                   this.setY(f2);
                   Object[] objArray1 = new Object[false];
                   j0.f("FloatRootView", "desX = "+f1, objArray1);
                   objArray1 = new Object[false];
                   j0.f("FloatRootView", "desY = "+f2, objArray1);
                }
             }
          }else {
             goto label_00a5 ;
          }
       }else if(PatchProxy.applyVoidOneRefs(p0, this, FloatRootView.class, "11")){
          this.s = this.getX();
          this.t = this.getY();
          this.q = p0.getRawX();
          this.r = p0.getRawY();
       }
       FloatRootView tf = this.f;
       Objects.requireNonNull(tf);
       if (!PatchProxy.applyVoid(objArray, tf, FloatRootView$b.class, "4")) {
          tf.b.removeCallbacks(tf);
       }
       this.o = p0.getRawX();
       f = p0.getRawY();
       this.p = f;
       this.m = this.o;
       this.n = f;
       return true;
    }
    public final void c(){
       int b;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, FloatRootView.class, "12")) {
          return;
       }
       FloatRootView tb = this.b;
       if (this.getY() - (float)tb < 0) {
          this.g = (float)tb;
       }else {
          tb = this.j;
          FloatRootView tb1 = this.b;
          this.g = (this.getY() - (float)(tb - tb1) > 0)? (float)tb - (float)tb1: this.getY();
       }
       FloatRootView obj = PatchProxy.apply(objArray, this, FloatRootView.class, "13");
       if (obj != PatchProxyResult.class) {
          b = obj.booleanValue();
       }else if(this.getX() - (float)(this.i / 2) < 0){
          b = true;
       }else {
          b = false;
       }
       obj = (b)? this.e: this.i - this.e;
       float f = (float)obj;
       this.h = f;
       FloatRootView ti = this.i;
       if (f - (float)ti > 0 || f - null < 0) {
          this.h = (float)ti;
       }
       obj = this.f;
       ti = this.h;
       tb = this.g;
       Objects.requireNonNull(obj);
       if (!PatchProxy.isSupport(FloatRootView$b.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(ti), Float.valueOf(tb), obj, FloatRootView$b.class, "1")) {
          obj.c = ti;
          obj.d = tb;
          obj.e = System.currentTimeMillis();
          obj.b.post(obj);
       }
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, FloatRootView.class, "15")) {
          return;
       }
       FloatRootView tu = this.u;
       if (tu != null) {
          tu.m(this.v);
       }
       super.onDetachedFromWindow();
       return;
    }
    public void onSizeChanged(int p0,int p1,int p2,int p3){
       if (PatchProxy.isSupport(FloatRootView.class) && PatchProxy.applyVoidFourRefs(Integer.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), Integer.valueOf(p3), this, FloatRootView.class, "4")) {
          return;
       }
       this.d = p0;
       this.c = p1;
       this.a();
       this.post(new m(this));
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, FloatRootView.class, "6");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       return this.b(p0);
    }
}
