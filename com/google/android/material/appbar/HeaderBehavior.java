package com.google.android.material.appbar.HeaderBehavior;
import com.google.android.material.appbar.ViewOffsetBehavior;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.VelocityTracker;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.Runnable;
import android.widget.OverScroller;
import java.lang.Math;
import com.google.android.material.appbar.HeaderBehavior$a;
import a2.i0;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewConfiguration;
import u1.a;

public abstract class HeaderBehavior extends ViewOffsetBehavior	// class@001620
{
    public int activePointerId;
    public Runnable flingRunnable;
    public boolean isBeingDragged;
    public int lastMotionY;
    public OverScroller scroller;
    public int touchSlop;
    public VelocityTracker velocityTracker;

    public void HeaderBehavior(){
       super();
       this.activePointerId = -1;
       this.touchSlop = -1;
    }
    public void HeaderBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       this.activePointerId = -1;
       this.touchSlop = -1;
    }
    public boolean canDragView(View p0){
       return false;
    }
    public final void ensureVelocityTracker(){
       if (this.velocityTracker == null) {
          this.velocityTracker = VelocityTracker.obtain();
       }
       return;
    }
    public final boolean fling(CoordinatorLayout p0,View p1,int p2,int p3,float p4){
       HeaderBehavior headerBehavi = this;
       HeaderBehavior flingRunnabl = headerBehavi.flingRunnable;
       if (flingRunnabl != null) {
          p1.removeCallbacks(flingRunnabl);
          headerBehavi.flingRunnable = null;
       }
       if (headerBehavi.scroller == null) {
          headerBehavi.scroller = new OverScroller(p1.getContext());
       }
       headerBehavi.scroller.fling(0, this.getTopAndBottomOffset(), 0, Math.round(p4), 0, 0, p2, p3);
       if (headerBehavi.scroller.computeScrollOffset()) {
          HeaderBehavior$a uoa = new HeaderBehavior$a(this, p0, p1);
          headerBehavi.flingRunnable = uoa;
          i0.k0(p1, uoa);
          return true;
       }else {
          this.onFlingFinished(p0, p1);
          return false;
       }
    }
    public int getMaxDragOffset(View p0){
       return (- p0.getHeight());
    }
    public int getScrollRangeForDragFling(View p0){
       return p0.getHeight();
    }
    public int getTopBottomOffsetForScrollingSibling(){
       return this.getTopAndBottomOffset();
    }
    public void onFlingFinished(CoordinatorLayout p0,View p1){
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       HeaderBehavior headerBehavi;
       if (this.touchSlop < null) {
          this.touchSlop = ViewConfiguration.get(p0.getContext()).getScaledTouchSlop();
       }
       float f = 0.00f;
       boolean b = true;
       if (p2.getAction() == f && this.isBeingDragged != null) {
          return b;
       }else {
          int actionMasked = p2.getActionMasked();
          if (actionMasked) {
             headerBehavi = -1;
             if (actionMasked != b) {
                if (actionMasked != f) {
                   if (actionMasked == 3) {
                   }
                }else {
                   HeaderBehavior tactivePoint = this.activePointerId;
                   if (tactivePoint != headerBehavi) {
                      int i = p2.findPointerIndex(tactivePoint);
                      if (i != headerBehavi) {
                         int i1 = (int)p2.getY(i);
                         if (Math.abs((i1 - this.lastMotionY)) > this.touchSlop) {
                            this.isBeingDragged = b;
                            this.lastMotionY = i1;
                         }
                      }
                   }
                }
             }else {
             }
          }else {
             this.isBeingDragged = false;
             actionMasked = (int)p2.getX();
             int i2 = (int)p2.getY();
             if (this.canDragView(p1) && p0.C(p1, actionMasked, i2)) {
                this.lastMotionY = i2;
                this.activePointerId = p2.getPointerId(false);
                this.ensureVelocityTracker();
             }
          }
       label_0083 :
          headerBehavi = this.velocityTracker;
          if (headerBehavi != null) {
             headerBehavi.addMovement(p2);
          }
          return this.isBeingDragged;
       }
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       int i;
       HeaderBehavior tvelocityTra;
       if (this.touchSlop < null) {
          this.touchSlop = ViewConfiguration.get(p0.getContext()).getScaledTouchSlop();
       }
       int actionMasked = p2.getActionMasked();
       int b = false;
       if (actionMasked) {
          i = -1;
          if (actionMasked != 1) {
             if (actionMasked != 2) {
                if (actionMasked == 3) {
                label_007e :
                   this.isBeingDragged = b;
                   this.activePointerId = i;
                   tvelocityTra = this.velocityTracker;
                   if (tvelocityTra != null) {
                      tvelocityTra.recycle();
                      this.velocityTracker = null;
                   }
                }
             }else {
                actionMasked = p2.findPointerIndex(this.activePointerId);
                if (actionMasked == i) {
                   return b;
                }else {
                   actionMasked = (int)p2.getY(actionMasked);
                   b = this.lastMotionY - actionMasked;
                   if (this.isBeingDragged == null) {
                      HeaderBehavior ttouchSlop = this.touchSlop;
                      if (Math.abs(b) > ttouchSlop) {
                         this.isBeingDragged = true;
                         b = (b > 0)? b - ttouchSlop: b + ttouchSlop;
                      }
                   }
                   int i1 = b;
                   if (this.isBeingDragged != null) {
                      this.lastMotionY = actionMasked;
                      this.scroll(p0, p1, i1, this.getMaxDragOffset(p1), 0);
                   }
                }
             }
          }else {
             HeaderBehavior tvelocityTra1 = this.velocityTracker;
             if (tvelocityTra1 != null) {
                tvelocityTra1.addMovement(p2);
                this.velocityTracker.computeCurrentVelocity(1000);
                this.fling(p0, p1, (- this.getScrollRangeForDragFling(p1)), 0, this.velocityTracker.getYVelocity(this.activePointerId));
                goto label_007e ;
             }else {
                goto label_007e ;
             }
          }
       }else {
          i = (int)p2.getY();
          if (p0.C(p1, (int)p2.getX(), i) && this.canDragView(p1)) {
             this.lastMotionY = i;
             this.activePointerId = p2.getPointerId(b);
             this.ensureVelocityTracker();
          }else {
             return b;
          }
       }
       tvelocityTra = this.velocityTracker;
       if (tvelocityTra != null) {
          tvelocityTra.addMovement(p2);
       }
       return true;
    }
    public final int scroll(CoordinatorLayout p0,View p1,int p2,int p3,int p4){
       return this.setHeaderTopBottomOffset(p0, p1, (this.getTopBottomOffsetForScrollingSibling() - p2), p3, p4);
    }
    public int setHeaderTopBottomOffset(CoordinatorLayout p0,View p1,int p2){
       return this.setHeaderTopBottomOffset(p0, p1, p2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public int setHeaderTopBottomOffset(CoordinatorLayout p0,View p1,int p2,int p3,int p4){
       int topAndBottom = this.getTopAndBottomOffset();
       if (p3 && (topAndBottom >= p3 && topAndBottom <= p4)) {
          int i = a.b(p2, p3, p4);
          if (topAndBottom != i) {
             this.setTopAndBottomOffset(i);
             topAndBottom = topAndBottom - i;
          label_0016 :
             return topAndBottom;
          }
       }
       topAndBottom = 0;
       goto label_0016 ;
    }
}
