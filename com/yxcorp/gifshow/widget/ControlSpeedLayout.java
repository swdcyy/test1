package com.yxcorp.gifshow.widget.ControlSpeedLayout;
import android.view.View$OnClickListener;
import ml8.d;
import android.widget.FrameLayout;
import o56.c;
import o56.a;
import android.app.Application;
import android.content.res.Resources;
import android.content.Context;
import java.util.ArrayList;
import android.util.AttributeSet;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.widget.ControlSpeedLayout$b;
import android.animation.Animator;
import android.widget.TextView;
import android.animation.ObjectAnimator;
import android.animation.ArgbEvaluator;
import android.animation.TypeEvaluator;
import android.animation.AnimatorSet;
import th0.b;
import android.animation.TimeInterpolator;
import com.yxcorp.gifshow.widget.ControlSpeedLayout$a;
import android.animation.Animator$AnimatorListener;
import java.lang.Float;
import java.lang.Integer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.lang.Math;
import java.util.Iterator;
import android.graphics.Canvas;
import android.view.ViewGroup;
import ekd.m1;
import com.yxcorp.gifshow.util.rx.RxBus;
import com.yxcorp.gifshow.widget.ControlSpeedLayout$c;
import ekd.p1;
import android.graphics.Typeface;
import lnc.a1;
import android.view.MotionEvent;
import a2.q;
import android.view.View$MeasureSpec;
import a2.i0;

public class ControlSpeedLayout extends FrameLayout implements View$OnClickListener, d	// class@00180c
{
    public View b;
    public View c;
    public View d;
    public View e;
    public View f;
    public View g;
    public TextView h;
    public TextView i;
    public TextView j;
    public TextView k;
    public TextView l;
    public ArrayList m;
    public ArrayList n;
    public final float[] o;
    public float p;
    public float q;
    public int r;
    public int s;
    public boolean t;
    public Animator u;
    public ControlSpeedLayout$b v;
    public float w;
    public boolean x;
    public static final int y;

    static {
       ControlSpeedLayout.y = a.a().a().getResources().getColor(0x7f060778);
    }
    public void ControlSpeedLayout(Context p0){
       super(p0);
       this.m = new ArrayList();
       this.n = new ArrayList();
       float[] uofloatArray = new float[5]{0x3ea8f5c3,0x3f000000,0x3f800000,0x40000000,0x40400000};
       this.o = uofloatArray;
       this.r = -1;
       this.u = null;
       this.v = null;
       this.w = uofloatArray[2];
       this.x = true;
    }
    public void ControlSpeedLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.m = new ArrayList();
       this.n = new ArrayList();
       float[] uofloatArray = new float[5]{0x3ea8f5c3,0x3f000000,0x3f800000,0x40000000,0x40400000};
       this.o = uofloatArray;
       this.r = -1;
       this.u = null;
       this.v = null;
       this.w = uofloatArray[2];
       this.x = true;
    }
    public void ControlSpeedLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.m = new ArrayList();
       this.n = new ArrayList();
       float[] uofloatArray = new float[5]{0x3ea8f5c3,0x3f000000,0x3f800000,0x40000000,0x40400000};
       this.o = uofloatArray;
       this.r = -1;
       this.u = null;
       this.v = null;
       this.w = uofloatArray[2];
       this.x = true;
    }
    public final void a(View p0,boolean p1){
       if (PatchProxy.isSupport(ControlSpeedLayout.class) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ControlSpeedLayout.class, "15")) {
          return;
       }
       ControlSpeedLayout$b uob = this.c(p0, p1);
       int i = -1;
       if (uob.a != i && uob.b != i) {
          if (uob.equals(this.v)) {
             return;
          }else {
             ControlSpeedLayout tu = this.u;
             if (tu != null && tu.isRunning()) {
                this.u.cancel();
                Animator uAnimator = null;
                this.u = uAnimator;
                this.v = uAnimator;
             }
             this.v = uob;
             int[] ointArray = new int[]{this.n.get(uob.a).getCurrentTextColor(),i};
             ObjectAnimator objectAnimat = ObjectAnimator.ofInt(this.n.get(uob.a), "textColor", ointArray);
             objectAnimat.setEvaluator(new ArgbEvaluator());
             int[] ointArray1 = new int[]{this.n.get(uob.b).getCurrentTextColor(),ControlSpeedLayout.y};
             ObjectAnimator objectAnimat1 = ObjectAnimator.ofInt(this.n.get(uob.b), "textColor", ointArray1);
             objectAnimat1.setEvaluator(new ArgbEvaluator());
             AnimatorSet uAnimatorSet = new AnimatorSet();
             Animator[] uAnimatorArr = new Animator[]{objectAnimat,objectAnimat1};
             uAnimatorSet.playTogether(uAnimatorArr);
             uAnimatorSet.setInterpolator(new b());
             uAnimatorSet.setDuration(300);
             uAnimatorSet.addListener(new ControlSpeedLayout$a(this, p0, this.n.get(uob.b)));
             uAnimatorSet.start();
             this.u = uAnimatorSet;
             this.v = uob;
          }
       }
       return;
    }
    public final int b(float p0,int p1,int p2){
       if (PatchProxy.isSupport(ControlSpeedLayout.class)) {
          Object obj = PatchProxy.applyThreeRefs(Float.valueOf(p0), Integer.valueOf(p1), Integer.valueOf(p2), this, ControlSpeedLayout.class, "24");
          if (obj != PatchProxyResult.class) {
             return obj.intValue();
          }
       }
       float f = (float)((p1 >> 24) & 0x00ff) / 0x437f0000;
       float f1 = (float)((p1 >> 16) & 0x00ff) / 0x437f0000;
       float f2 = (float)((p1 >> 8) & 0x00ff) / 0x437f0000;
       float f3 = (float)(p1 & 0x00ff) / 0x437f0000;
       return ((((Math.round(((f + ((((float)((p2 >> 24) & 0x00ff) / 0x437f0000) - f) * p0)) * 0x437f0000)) << 24) | (Math.round(((f1 + ((((float)((p2 >> 16) & 0x00ff) / 0x437f0000) - f1) * p0)) * 0x437f0000)) << 16)) | (Math.round(((f2 + ((((float)((p2 >> 8) & 0x00ff) / 0x437f0000) - f2) * p0)) * 0x437f0000)) << 8)) | Math.round(((f3 + (p0 * (((float)(p2 & 0x00ff) / 0x437f0000) - f3))) * 0x437f0000)));
    }
    public final ControlSpeedLayout$b c(View p0,boolean p1){
       int i2;
       if (PatchProxy.isSupport(ControlSpeedLayout.class)) {
          Object obj = PatchProxy.applyTwoRefs(p0, Boolean.valueOf(p1), this, ControlSpeedLayout.class, "13");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       int i = 0;
       int i1 = -1;
       ControlSpeedLayout uControlSpee = -1;
       while (i < this.m.size()) {
          if (p1) {
             if (p0 == this.m.get(i)) {
                if (this.g.getX() - (float)this.m.get(i).getLeft() > 0) {
                   i2 = this.m.size() - 1;
                   if (i < i2) {
                      i1 = i + 1;
                   }
                }else if(this.g.getX() - (float)this.m.get(i).getLeft() < 0 && i > 0){
                   i1 = i - 1;
                }
                i2 = i;
             }
          }else if(p0 == this.m.get(i)){
             i2 = i;
          }
          if (p0 != this.m.get(i) && this.m.get(i).isSelected()) {
             i1 = i;
          }
       label_0091 :
          i = i + 1;
       }
       return new ControlSpeedLayout$b(i1, uControlSpee);
    }
    public final View d(){
       Object[] objArray = null;
       Object obj = PatchProxy.apply(objArray, this, ControlSpeedLayout.class, "10");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       float f = 0x4f000000;
       Iterator iterator = this.m.iterator();
       while (iterator.hasNext()) {
          View view = iterator.next();
          int i = view.getWidth() / 2;
          float f1 = view.getX() + (float)i;
          int i1 = this.g.getWidth() / 2;
          float f2 = this.g.getX() + (float)i1;
          f1 = f1 - f2;
          if (Math.abs(f1) - Math.abs(f) < 0) {
             objArray = view;
             f = f1;
          }
       }
       return objArray;
    }
    public void dispatchDraw(Canvas p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ControlSpeedLayout.class, "6")) {
          return;
       }
       if (this.x != null) {
          this.x = false;
          this.g.setX(this.m.get(this.getCurrentSpeedRatioIndex()).getX());
       }
       super.dispatchDraw(p0);
       return;
    }
    public void doBindView(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ControlSpeedLayout.class, "1")) {
          return;
       }
       this.d = m1.f(p0, 0x7f0a3ac6);
       this.k = m1.f(p0, 0x7f0a3ad0);
       this.g = m1.f(p0, 0x7f0a39b1);
       this.h = m1.f(p0, 0x7f0a3acd);
       this.e = m1.f(p0, 0x7f0a3ac7);
       this.c = m1.f(p0, 0x7f0a3ac5);
       this.j = m1.f(p0, 0x7f0a3acf);
       this.b = m1.f(p0, 0x7f0a3ac4);
       this.l = m1.f(p0, 0x7f0a3ad1);
       this.f = m1.f(p0, 0x7f0a3ac8);
       this.i = m1.f(p0, 0x7f0a3ace);
       return;
    }
    public final void e(View p0,boolean p1,boolean p2){
       ObjectAnimator obj;
       float f1;
       if (PatchProxy.isSupport(ControlSpeedLayout.class) && PatchProxy.applyVoidThreeRefs(p0, Boolean.valueOf(p1), Boolean.valueOf(p2), this, ControlSpeedLayout.class, "17")) {
          return;
       }
       this.a(p0, p2);
       float f = (float)p0.getLeft();
       int i = 0;
       if (!PatchProxy.isSupport(ControlSpeedLayout.class) || !PatchProxy.applyVoidTwoRefs(Float.valueOf(f), Boolean.valueOf(p1), this, ControlSpeedLayout.class, "12")) {
          ControlSpeedLayout tg = this.g;
          float[] uofloatArray = new float[]{tg.getX(),f};
          obj = ObjectAnimator.ofFloat(tg, "x", uofloatArray);
          obj.setInterpolator(new b());
          long l = (p1)? 300: 0;
          obj.setDuration(l);
          obj.start();
       }
       if (!PatchProxy.isSupport(ControlSpeedLayout.class) || !PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), this, ControlSpeedLayout.class, "18")) {
          obj = PatchProxy.applyOneRefs(p0, this, ControlSpeedLayout.class, "16");
          if (obj != PatchProxyResult.class) {
             f1 = obj.floatValue();
          }else {
             while (true) {
                if (i < this.m.size()) {
                   if (p0 == this.m.get(i)) {
                      f1 = this.o[i];
                   }else {
                      i = i + 1;
                   }
                }else {
                   f1 = this.w;
                }
             }
          }
          if (f1 - this.w) {
             this.w = f1;
             RxBus.f.b(new ControlSpeedLayout$c(f1, p1));
          }
       }
       return;
    }
    public final int getCurrentSpeedRatioIndex(){
       ControlSpeedLayout to = this.o;
       int len = to.length;
       int i1 = 0;
       for (int i = 0; i < len && this.w - to[i]; i = i + 1) {
          i1 = i1 + 1;
       }
       return i1;
    }
    public void onAttachedToWindow(){
       if (PatchProxy.applyVoid(null, this, ControlSpeedLayout.class, "3")) {
          return;
       }
       super.onAttachedToWindow();
       p1.j(this.g, 2);
       return;
    }
    public void onClick(View p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, ControlSpeedLayout.class, "7")) {
          return;
       }
       this.e(p0, true, false);
       return;
    }
    public void onDetachedFromWindow(){
       if (PatchProxy.applyVoid(null, this, ControlSpeedLayout.class, "4")) {
          return;
       }
       super.onDetachedFromWindow();
       p1.j(this.g, 0);
       return;
    }
    public void onFinishInflate(){
       if (PatchProxy.applyVoid(null, this, ControlSpeedLayout.class, "2")) {
          return;
       }
       super.onFinishInflate();
       this.doBindView(this);
       this.m.add(this.b);
       this.m.add(this.c);
       this.m.add(this.d);
       this.m.add(this.e);
       this.m.add(this.f);
       this.n.add(this.h);
       this.n.add(this.i);
       this.n.add(this.j);
       this.n.add(this.k);
       this.n.add(this.l);
       Iterator iterator = this.m.iterator();
       while (iterator.hasNext()) {
          iterator.next().setOnClickListener(this);
       }
       this.m.get(2).setSelected(true);
       this.n.get(2).setTypeface(Typeface.DEFAULT_BOLD);
       this.s = a1.e(3.00f);
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       ControlSpeedLayout obj = PatchProxy.applyOneRefs(p0, this, ControlSpeedLayout.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       boolean b = false;
       if (!this.isEnabled()) {
          return b;
       }
       int i = q.c(p0);
       boolean b1 = true;
       if (i) {
          if (i != b1) {
             if (i != 2) {
                if (i == 3) {
                }
             }else {
                obj = this.r;
                if (obj == -1) {
                   return b;
                }else {
                   i = q.a(p0, obj);
                   if (i < 0) {
                      return b;
                   }else if(this.t == null){
                      return b;
                   }else if(Math.abs((q.f(p0, i) - this.p)) - (float)this.s > 0){
                      return b1;
                   }
                }
             }
          }else {
          }
       }else {
          this.p = p0.getX();
          this.q = this.g.getX();
          float f = (float)a1.e(3.00f);
          if (this.p - (this.g.getX() + f) <= 0 || this.p - ((this.g.getX() + (float)this.g.getWidth()) - f) >= 0) {
             b1 = false;
          }
          this.t = b1;
          this.r = q.e(p0, b);
       }
    label_0094 :
       return super.onInterceptTouchEvent(p0);
    }
    public void onMeasure(int p0,int p1){
       if (PatchProxy.isSupport(ControlSpeedLayout.class) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), Integer.valueOf(p1), this, ControlSpeedLayout.class, "5")) {
          return;
       }
       super.onMeasure(p0, p1);
       this.setPivotX((float)(this.getMeasuredWidth() / 2));
       this.setPivotY((float)(this.getMeasuredHeight() / 2));
       this.g.measure(View$MeasureSpec.makeMeasureSpec(this.d.getMeasuredWidth(), 0x40000000), View$MeasureSpec.makeMeasureSpec(this.d.getMeasuredHeight(), 0x40000000));
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, ControlSpeedLayout.class, "9");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       if (!this.isEnabled()) {
          return false;
       }
       int i = q.c(p0);
       if (i != 1) {
          if (i != 2) {
             if (i == 3) {
             label_0112 :
                if (!PatchProxy.applyVoid(null, this, ControlSpeedLayout.class, "11")) {
                   this.e(this.d(), true, true);
                }
                this.r = -1;
                return false;
             }
          }else {
             float f = (p0.getX() - this.p) + this.q;
             float f1 = (float)this.g.getWidth() + f;
             if (f >= 0 && f1 - (float)this.getWidth() < 0) {
                i0.R0(this.g, f);
             }
             View view = this.d();
             if (!PatchProxy.applyVoidOneRefs(view, this, ControlSpeedLayout.class, "14")) {
                ControlSpeedLayout$b uob = this.c(view, true);
                if (uob.a != -1 && uob.b != -1) {
                   i = 0;
                   while (i < this.n.size()) {
                      if (uob.a != i && uob.b != i) {
                         this.n.get(i).setTextColor(-1);
                      }
                      i = i + 1;
                   }
                   f1 = Math.abs(((this.g.getX() - (float)this.m.get(uob.b).getLeft()) / (float)(this.m.get(uob.a).getLeft() - this.m.get(uob.b).getLeft())));
                   int y = ControlSpeedLayout.y;
                   this.n.get(uob.b).setTextColor(this.b(f1, y, -1));
                   this.n.get(uob.b).setTypeface(Typeface.defaultFromStyle(true));
                   this.n.get(uob.a).setTextColor(this.b(f1, -1, y));
                   this.n.get(uob.a).setTypeface(Typeface.defaultFromStyle(false));
                   this.v = null;
                   this.u = null;
                }
             }
          }
       label_0111 :
          return true;
       }else {
          goto label_0112 ;
       }
    }
}
