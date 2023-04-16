package com.google.android.material.appbar.HeaderBehaviorEx;
import com.google.android.material.appbar.ViewOffsetBehavior;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Runnable;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import java.lang.Math;
import com.google.android.material.appbar.HeaderBehaviorEx$a;
import android.view.View;
import a2.i0;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewConfiguration;
import android.view.VelocityTracker;
import sj.d;
import com.google.android.material.appbar.HeaderBehavior;

public final class HeaderBehaviorEx extends ViewOffsetBehavior	// class@001622
{
    public Runnable a;
    public OverScroller b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public VelocityTracker g;
    public int h;
    public AppBarLayout$Behavior i;
    public boolean j;
    public static final String k;

    static {
       HeaderBehaviorEx.k = HeaderBehaviorEx.class.toString();
    }
    public void HeaderBehaviorEx(Context p0,AttributeSet p1,AppBarLayout$Behavior p2){
       super(p0, p1);
       this.d = -1;
       this.f = -1;
       this.i = p2;
    }
    public void HeaderBehaviorEx(AppBarLayout$Behavior p0){
       super();
       this.d = -1;
       this.f = -1;
       this.i = p0;
    }
    public final boolean c(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3,float p4){
       HeaderBehaviorEx headerBehavi = this;
       LinearLayout linearLayout = p1;
       HeaderBehaviorEx a = headerBehavi.a;
       if (a != null) {
          linearLayout.removeCallbacks(a);
          headerBehavi.a = null;
       }
       if (headerBehavi.b == null) {
          headerBehavi.b = new OverScroller(p1.getContext());
       }
       headerBehavi.b.fling(0, this.getTopAndBottomOffset(), 0, Math.round(p4), 0, 0, p2, p3);
       if (headerBehavi.b.computeScrollOffset()) {
          HeaderBehaviorEx$a uoa = new HeaderBehaviorEx$a(this, p0, linearLayout, headerBehavi.b.getCurrY());
          headerBehavi.a = uoa;
          i0.k0(linearLayout, uoa);
          return true;
       }else {
          headerBehavi.i.o(p0, linearLayout);
          return false;
       }
    }
    public boolean d(CoordinatorLayout p0,AppBarLayout p1,MotionEvent p2){
       HeaderBehaviorEx headerBehavi1;
       if (this.f < null) {
          this.f = ViewConfiguration.get(p0.getContext()).getScaledTouchSlop();
       }
       HeaderBehaviorEx headerBehavi = 2;
       if (p2.getAction() == headerBehavi && this.c != null) {
          return true;
       }else {
          int i = (int)p2.getX();
          int i1 = (int)p2.getY();
          int actionMasked = p2.getActionMasked();
          if (actionMasked) {
             headerBehavi1 = -1;
             if (actionMasked != 1) {
                if (actionMasked != headerBehavi) {
                   if (actionMasked == 3) {
                   }
                }else {
                   HeaderBehaviorEx td = this.d;
                   if (td != headerBehavi1) {
                      int i2 = p2.findPointerIndex(td);
                      if (i2 != headerBehavi1) {
                         int i3 = (int)p2.getY(i2);
                         if (Math.abs((i3 - this.e)) > this.f) {
                            this.c = true;
                            this.e = i3;
                         }
                      }
                   }
                }
             }else {
             }
          }else {
             this.c = false;
             this.h();
             if (this.i.e(p1) && p0.C(p1, i, i1)) {
                this.e = i1;
                this.d = p2.getPointerId(false);
                this.ensureVelocityTracker();
                this.i.a();
             }
          }
       label_008f :
          headerBehavi1 = this.g;
          if (headerBehavi1 != null) {
             headerBehavi1.addMovement(p2);
          }
          return this.c;
       }
    }
    public boolean e(CoordinatorLayout p0,AppBarLayout p1,MotionEvent p2){
       HeaderBehaviorEx tg;
       HeaderBehaviorEx tf;
       if (this.f < null) {
          this.f = ViewConfiguration.get(p0.getContext()).getScaledTouchSlop();
       }
       int i = (int)p2.getX();
       int i1 = (int)p2.getY();
       int actionMasked = p2.getActionMasked();
       boolean b = false;
       if (actionMasked) {
          i = -1;
          if (actionMasked != 1) {
             if (actionMasked != 2) {
                if (actionMasked == 3) {
                label_0098 :
                   this.c = b;
                   this.d = i;
                   tg = this.g;
                   if (tg != null) {
                      tg.recycle();
                      this.g = null;
                   }
                }
             }else {
                i1 = p2.findPointerIndex(this.d);
                if (i1 == i) {
                   return b;
                }else {
                   i = (int)p2.getY(i1);
                   i1 = this.e - i;
                   if (this.c == null) {
                      tf = this.f;
                      if (Math.abs(i1) > tf) {
                         this.c = true;
                         i1 = (i1 > 0)? i1 - tf: i1 + tf;
                      }
                   }
                   int i2 = i1;
                   if (this.c != null) {
                      this.e = i;
                      tf = this.i;
                      tf.scroll(p0, p1, i2, tf.l(p1), 0);
                   }
                }
             }
          }else {
             HeaderBehaviorEx tg1 = this.g;
             if (tg1 != null) {
                tg1.addMovement(p2);
                this.g.computeCurrentVelocity(1000);
                float yVelocity = this.g.getYVelocity(this.d);
                v1 = yVelocity;
                int i3 = (tg1 < 0)? -10000: 0;
                int i4 = (tg1 < 0)? 0: - p1.getTop();
                this.c(p0, p1, i3, i4, yVelocity);
                goto label_0098 ;
             }else {
                goto label_0098 ;
             }
          }
       }else if(p0.C(p1, i, i1) && this.i.e(p1)){
          this.e = i1;
          this.d = p2.getPointerId(b);
          this.ensureVelocityTracker();
       }else {
          return b;
       }
       tg = this.g;
       if (tg != null) {
          tg.addMovement(p2);
       }
       return true;
    }
    public final void ensureVelocityTracker(){
       if (this.g == null) {
          this.g = VelocityTracker.obtain();
       }
       return;
    }
    public void g(int p0){
       this.h = p0;
    }
    public void h(){
       if (this.a != null) {
          HeaderBehaviorEx tb = this.b;
          if (tb != null && tb.computeScrollOffset()) {
             this.b.abortAnimation();
          }
       }
       return;
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       return this.d(p0, p1, p2);
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       return this.e(p0, p1, p2);
    }
}
