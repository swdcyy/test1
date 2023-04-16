package com.google.android.material.appbar.CustomAppBarLayoutBehavior;
import sj.d;
import sj.b;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import com.google.android.material.appbar.HeaderBehaviorEx;
import java.lang.IllegalArgumentException;
import sj.a;
import com.google.android.material.appbar.AppBarLayout;
import android.view.View;
import java.lang.Math;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import java.lang.Object;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.google.android.material.appbar.HeaderScrollingViewBehavior;
import com.google.android.material.appbar.AppBarLayout$LayoutParams;
import a2.i0;
import android.os.SystemClock;
import android.view.MotionEvent;
import com.google.android.material.appbar.HeaderBehavior;
import com.google.android.material.appbar.ViewOffsetBehavior;
import u1.a;
import android.view.animation.Interpolator;
import android.widget.LinearLayout$LayoutParams;
import java.lang.Integer;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import android.view.ViewGroup;

public class CustomAppBarLayoutBehavior extends AppBarLayout$Behavior implements d, b	// class@00161d
{
    public int j;
    public final int k;
    public d l;
    public HeaderBehaviorEx m;
    public int n;
    public int o;
    public boolean p;
    public static final String q;

    static {
       CustomAppBarLayoutBehavior.q = CustomAppBarLayoutBehavior.class.toString();
    }
    public void CustomAppBarLayoutBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       this.p = true;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.j0);
       boolean booleanx = typedArray.getBoolean(2, false);
       this.n = typedArray.getDimensionPixelSize(false, false);
       int resourceId = typedArray.getResourceId(true, false);
       typedArray.recycle();
       if (!resourceId) {
          throw new IllegalArgumentException("should set head fling offset consume view , with \'flingConsumeViewId\'");
       }
       this.k = resourceId;
       if (booleanx) {
          HeaderBehaviorEx headerBehavi = new HeaderBehaviorEx(p0, p1, this);
          this.m = headerBehavi;
          headerBehavi.g(this.n);
       }
       return;
    }
    public void CustomAppBarLayoutBehavior(a p0){
       super();
       this.p = true;
       this.n = p0.b;
       this.k = p0.a;
       if (p0.c != null) {
          HeaderBehaviorEx headerBehavi = new HeaderBehaviorEx(this);
          this.m = headerBehavi;
          headerBehavi.g(this.n);
       }
       return;
    }
    public static View j(AppBarLayout p0,int p1){
       View childAt;
       p1 = Math.abs(p1);
       int childCount = p0.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return null;
          }
          childAt = p0.getChildAt(i);
          if (p1 >= childAt.getTop() && p1 <= childAt.getBottom()) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return childAt;
    }
    private boolean z(CoordinatorLayout p0,AppBarLayout p1){
       List list = p0.t(p1);
       int i = list.size();
       boolean b = false;
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return b;
          }
          CoordinatorLayout$Behavior uBehavior = list.get(i1).getLayoutParams().f();
          if (uBehavior instanceof AppBarLayout$ScrollingViewBehavior) {
             if (uBehavior.g()) {
                b = true;
                break ;
             }
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return b;
    }
    public void C(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3,boolean p4){
       View view = CustomAppBarLayoutBehavior.j(p1, p2);
       if (view != null) {
          int i = view.getLayoutParams().a();
          boolean b = false;
          if (i & 0x01) {
             int i1 = i0.C(view);
             if (p3 > 0 && (i & 0x0c)) {
                if ((- p2) < ((view.getBottom() - i1) - p1.getTopInset())) {
                label_003f :
                   boolean b1 = p1.s(b);
                   if (p4 || (b1 && this.z(p0, p1))) {
                      p1.jumpDrawablesToCurrentState();
                   }
                }
             }else if((i & 0x02) && (- p2) >= ((view.getBottom() - i1) - p1.getTopInset())){
             }
             b = true;
             goto label_003f ;
          }else {
             goto label_003f ;
          }
       }
    label_0050 :
       return;
    }
    public final void D(CoordinatorLayout p0,AppBarLayout p1,View p2,int p3,int p4,int[] p5,int p6){
       int i = 1;
       if (p6 == i && (!p5[i] && (p4 < 0 && !p1.getTop()))) {
          long l = SystemClock.uptimeMillis();
          MotionEvent motionEvent = MotionEvent.obtain(l, l, 3, 0, 0, 0);
          p2.onTouchEvent(motionEvent);
          motionEvent.recycle();
       }
    label_0022 :
       return;
    }
    public int E(AppBarLayout p0){
       return (p0.getTotalScrollRange() - this.n);
    }
    public int F(){
       return this.o;
    }
    public boolean G(CoordinatorLayout p0,AppBarLayout p1,MotionEvent p2){
       CustomAppBarLayoutBehavior tm = this.m;
       if (tm == null) {
          return super.onInterceptTouchEvent(p0, p1, p2);
       }
       return tm.d(p0, p1, p2);
    }
    public boolean H(CoordinatorLayout p0,AppBarLayout p1,MotionEvent p2){
       CustomAppBarLayoutBehavior tm = this.m;
       if (tm == null) {
          return super.onTouchEvent(p0, p1, p2);
       }
       return tm.e(p0, p1, p2);
    }
    public void I(int p0){
       this.n = p0;
       CustomAppBarLayoutBehavior tm = this.m;
       if (tm != null) {
          tm.g(p0);
       }
       return;
    }
    public int J(CoordinatorLayout p0,AppBarLayout p1,int p2){
       return this.y(p0, p1, p2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public int K(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3,int p4,int p5){
       int i;
       p5 = this.getTopBottomOffsetForScrollingSibling();
       if (this.p != null) {
          i = this.F();
          int i1 = p2 - p5;
          if (i1 <= 0) {
             if (i <= 0) {
                return (- i1);
             }else {
                i1 = i + p2;
                if (i1 <= 0) {
                   this.setTopAndBottomOffset((- i));
                   return i1;
                }
             }
          }
       }
       i = 0;
       if (p3 && (p5 >= p3 && p5 <= p4)) {
          int i2 = a.b(p2, p3, p4);
          if (p5 != i2) {
             p2 = (p1.h())? this.n(p1, i2): i2;
             i = p5 - i2;
             this.j = i2 - p2;
             if (!this.setTopAndBottomOffset(p2) && p1.h()) {
                p0.l(p1);
             }
             p1.d(this.getTopAndBottomOffset());
             int i3 = (i2 < p5)? -1: 1;
             this.C(p0, p1, i2, i3, false);
          }
       }else {
          this.j = i;
       }
       return i;
    }
    public void L(int p0){
       this.o = p0;
    }
    public void M(){
       CustomAppBarLayoutBehavior tm = this.m;
       if (tm != null) {
          tm.h();
       }
       return;
    }
    public void a(){
       CustomAppBarLayoutBehavior tl = this.l;
       if (tl != null) {
          tl.a();
       }
       return;
    }
    public int b(){
       return this.n;
    }
    public void f(int p0,int p1){
       CustomAppBarLayoutBehavior tl = this.l;
       if (tl != null) {
          tl.f(p0, p1);
       }
       return;
    }
    public int getTopBottomOffsetForScrollingSibling(){
       return (this.getTopAndBottomOffset() + this.j);
    }
    public int n(AppBarLayout p0,int p1){
       int i = Math.abs(p1);
       int childCount = p0.getChildCount();
       int i1 = 0;
       int i2 = 0;
       while (i2 < childCount) {
          View childAt = p0.getChildAt(i2);
          AppBarLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          Interpolator interpolator = layoutParams.b();
          if (i >= childAt.getTop() && i <= childAt.getBottom()) {
             if (interpolator != null) {
                childCount = layoutParams.a();
                if (childCount & 0x01) {
                   i1 = i1 + ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin);
                   if (childCount & 0x02) {
                      i1 = i1 - i0.C(childAt);
                   }
                }
                if (i0.y(childAt)) {
                   i1 = i1 - p0.getTopInset();
                }
                if (i1 > 0) {
                   float f = (float)i1;
                   return (Integer.signum(p1) * (childAt.getTop() + Math.round((f * interpolator.getInterpolation(((float)(i - childAt.getTop()) / f))))));
                }else {
                   break ;
                }
             }else {
                break ;
             }
          }else {
             i2 = i2 + 1;
          }
       }
       return p1;
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       return this.G(p0, p1, p2);
    }
    public boolean onMeasureChild(CoordinatorLayout p0,View p1,int p2,int p3,int p4,int p5){
       return this.q(p0, p1, p2, p3, p4, p5);
    }
    public void onNestedPreScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int[] p5,int p6){
       this.r(p0, p1, p2, p3, p4, p5, p6);
    }
    public void onNestedScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int p5,int p6,int p7){
       this.s(p0, p1, p2, p3, p4, p5, p6, p7);
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       return this.H(p0, p1, p2);
    }
    public boolean q(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3,int p4,int p5){
       boolean b = super.q(p0, p1, p2, p3, p4, p5);
       if (this.l == null) {
          View view = p0.findViewById(this.k);
          if (view instanceof d) {
             this.l = view;
          }else {
             Object[] objArray = new Object[]{Integer.valueOf(this.k)};
             throw new IllegalArgumentException(String.format("find fling consume view with id %d is not instanceof HeaderFlingConsumer", objArray));
          }
       }
       return b;
    }
    public void r(CoordinatorLayout p0,AppBarLayout p1,View p2,int p3,int p4,int[] p5,int p6){
       int i1;
       int i2;
       this.D(p0, p1, p2, p3, p4, p5, p6);
       if (p4) {
          if (p4 < 0) {
             int i = - this.E(p1);
             i1 = i;
             i2 = p1.getDownNestedPreScrollRange() + i;
          }else {
             i1 = - this.E(p1);
             i2 = 0;
          }
          if (i1 != i2) {
             p5[1] = this.scroll(p0, p1, p4, i1, i2);
          }
       }
       return;
    }
    public void s(CoordinatorLayout p0,AppBarLayout p1,View p2,int p3,int p4,int p5,int p6,int p7){
       if (p6 < 0) {
          if (p7 == 1) {
             super.y(p0, p1, (this.getTopBottomOffsetForScrollingSibling() - p6), (- p1.getDownNestedScrollRange()), 0);
          }else {
             this.K(p0, p1, (this.getTopBottomOffsetForScrollingSibling() - p6), (- p1.getDownNestedScrollRange()), 0, p7);
          }
       }
       return;
    }
    public int setHeaderTopBottomOffset(CoordinatorLayout p0,View p1,int p2){
       return this.J(p0, p1, p2);
    }
    public int setHeaderTopBottomOffset(CoordinatorLayout p0,View p1,int p2,int p3,int p4){
       return this.y(p0, p1, p2, p3, p4);
    }
    public int y(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3,int p4){
       return this.K(p0, p1, p2, p3, p4, -1);
    }
}
