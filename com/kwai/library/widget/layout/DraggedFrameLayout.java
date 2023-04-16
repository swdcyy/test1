package com.kwai.library.widget.layout.DraggedFrameLayout;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import android.view.VelocityTracker;
import android.view.MotionEvent;
import com.kwai.library.widget.layout.DraggedFrameLayout$a;
import java.lang.Math;
import android.view.ViewGroup;
import java.lang.System;
import com.kwai.library.widget.layout.DraggedFrameLayout$b;

public class DraggedFrameLayout extends FrameLayout	// class@000957
{
    public VelocityTracker b;
    public int c;
    public int d;
    public int e;
    public long f;
    public DraggedFrameLayout$b g;
    public DraggedFrameLayout$a h;

    public void DraggedFrameLayout(Context p0){
       super(p0, null);
    }
    public void DraggedFrameLayout(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void DraggedFrameLayout(Context p0,AttributeSet p1,int p2){
       super(p0, p1, p2);
       this.e = new ViewConfiguration().getScaledTouchSlop();
    }
    public final void a(){
       DraggedFrameLayout tb = this.b;
       if (tb != null) {
          tb.clear();
       }else {
          this.b = VelocityTracker.obtain();
       }
       return;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       if (this.h == null) {
          return false;
       }
       boolean i = (int)p0.getRawX();
       int i1 = (int)p0.getRawY();
       int actionMasked = p0.getActionMasked();
       if (actionMasked) {
          i = true;
          if (actionMasked != i) {
             if (actionMasked != 2) {
                if (actionMasked == 3) {
                }
             }else if(this.h.a() && (p0.getPointerCount() == i && Math.abs((this.d - i1)) > this.e)){
                return i;
             }else {
             }
          }else {
          }
       }else {
          this.c = i;
          this.d = i1;
          this.a();
       }
       return super.onInterceptTouchEvent(p0);
    }
    public boolean onTouchEvent(MotionEvent p0){
       float f;
       if (this.g == null) {
          return false;
       }
       int actionMasked = p0.getActionMasked();
       int i = (int)p0.getRawX();
       int i1 = (int)p0.getRawY();
       int i2 = i - this.c;
       int i3 = i1 - this.d;
       if (actionMasked) {
          if (actionMasked != 1) {
             if (actionMasked != 2) {
                if (actionMasked == 3) {
                label_004e :
                   DraggedFrameLayout tb = this.b;
                   if (tb == null) {
                      f = 0;
                   }else {
                      tb.computeCurrentVelocity(1000, 0x44fa0000);
                      f = this.b.getYVelocity();
                   }
                   this.g.b(i2, i3, f);
                   tb = this.b;
                   if (tb != null) {
                      tb.clear();
                      this.b.recycle();
                      this.b = null;
                   }
                }
             }else {
                long l = System.currentTimeMillis();
                if ((l - this.f) - this.g.c() > 0) {
                   this.g.a(i2, i3);
                   this.f = l;
                }
                if (this.b == null) {
                   this.a();
                }
                this.b.addMovement(p0);
             }
          }else {
             goto label_004e ;
          }
       }else {
          this.c = i;
          this.d = i1;
          this.a();
       }
       return true;
    }
    public void requestDisallowInterceptTouchEvent(boolean p0){
       if (!this.h.a()) {
          super.requestDisallowInterceptTouchEvent(p0);
       }
       return;
    }
    public void setDragListener(DraggedFrameLayout$b p0){
       this.g = p0;
    }
    public void setInterceptor(DraggedFrameLayout$a p0){
       this.h = p0;
    }
}
