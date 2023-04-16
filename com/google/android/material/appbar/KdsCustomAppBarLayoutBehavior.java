package com.google.android.material.appbar.KdsCustomAppBarLayoutBehavior;
import sj.i;
import sj.g;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import java.lang.String;
import java.lang.Class;
import sj.f;
import com.google.android.material.appbar.KdsHeaderBehaviorEx;
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
import android.view.ViewGroup;
import com.google.android.material.appbar.HeaderBehavior;
import com.google.android.material.appbar.ViewOffsetBehavior;
import u1.a;
import android.view.animation.Interpolator;
import android.widget.LinearLayout$LayoutParams;
import java.lang.Integer;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import java.lang.StringBuilder;
import cb.a;
import java.lang.IllegalArgumentException;

public class KdsCustomAppBarLayoutBehavior extends AppBarLayout$Behavior implements i, g	// class@001624
{
    public int j;
    public int k;
    public i l;
    public KdsHeaderBehaviorEx m;
    public int n;
    public int o;
    public boolean p;
    public static final String q;

    static {
       KdsCustomAppBarLayoutBehavior.q = KdsCustomAppBarLayoutBehavior.class.toString();
    }
    public void KdsCustomAppBarLayoutBehavior(f p0){
       super();
       this.p = true;
       this.n = p0.c;
       this.k = p0.a;
       if (p0.d != null) {
          KdsHeaderBehaviorEx kdsHeaderBeh = new KdsHeaderBehaviorEx(this);
          this.m = kdsHeaderBeh;
          kdsHeaderBeh.g(this.n);
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
       View view = KdsCustomAppBarLayoutBehavior.j(p1, p2);
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
    public final View E(CoordinatorLayout p0){
       View childAt;
       int i = 0;
       while (true) {
          if (i >= p0.getChildCount()) {
             return null;
          }
          childAt = p0.getChildAt(i);
          if (childAt instanceof i) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return childAt;
    }
    public int F(AppBarLayout p0){
       return (p0.getTotalScrollRange() - this.n);
    }
    public int G(){
       return this.o;
    }
    public boolean H(CoordinatorLayout p0,AppBarLayout p1,MotionEvent p2){
       KdsCustomAppBarLayoutBehavior tm = this.m;
       if (tm == null) {
          return super.onInterceptTouchEvent(p0, p1, p2);
       }
       return tm.d(p0, p1, p2);
    }
    public boolean I(CoordinatorLayout p0,AppBarLayout p1,MotionEvent p2){
       KdsCustomAppBarLayoutBehavior tm = this.m;
       if (tm == null) {
          return super.onTouchEvent(p0, p1, p2);
       }
       return tm.e(p0, p1, p2);
    }
    public void J(int p0){
       this.k = p0;
    }
    public int K(CoordinatorLayout p0,AppBarLayout p1,int p2){
       return this.y(p0, p1, p2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public int L(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3,int p4,int p5){
       int i;
       p5 = this.getTopBottomOffsetForScrollingSibling();
       if (this.p != null) {
          i = this.G();
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
             int i3 = (i2 < p5)? -1: 1;
             this.C(p0, p1, i2, i3, false);
          }
       }else {
          this.j = i;
       }
       return i;
    }
    public void M(int p0){
       this.o = p0;
    }
    public void a(){
       KdsCustomAppBarLayoutBehavior tl = this.l;
       if (tl != null) {
          tl.a();
       }
       return;
    }
    public int b(){
       return this.n;
    }
    public void f(int p0,int p1){
       KdsCustomAppBarLayoutBehavior tl = this.l;
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
    public void onFlingFinished(CoordinatorLayout p0,View p1){
       this.o(p0, p1);
    }
    public boolean onInterceptTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       return this.H(p0, p1, p2);
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
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       return this.v(p0, p1, p2, p3, p4, p5);
    }
    public void onStopNestedScroll(CoordinatorLayout p0,View p1,View p2,int p3){
       this.w(p0, p1, p2, p3);
    }
    public boolean onTouchEvent(CoordinatorLayout p0,View p1,MotionEvent p2){
       return this.I(p0, p1, p2);
    }
    public boolean q(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3,int p4,int p5){
       boolean b = super.q(p0, p1, p2, p3, p4, p5);
       if (this.l == null) {
          View view = p0.findViewById(this.k);
          if (!view instanceof i) {
             String q = KdsCustomAppBarLayoutBehavior.q;
             StringBuilder str = "the view is ";
             if (view == null) {
                view = "null";
             }
             a.x(q, str+view);
             view = this.E(p0);
             if (view == null) {
                Object[] objArray = new Object[]{Integer.valueOf(this.k)};
                throw new IllegalArgumentException(String.format("find fling consume view with id %d is not instanceof HeaderFlingConsumer", objArray));
             }
          }
          this.l = view;
       }
       return b;
    }
    public void r(CoordinatorLayout p0,AppBarLayout p1,View p2,int p3,int p4,int[] p5,int p6){
       int i1;
       int i2;
       this.D(p0, p1, p2, p3, p4, p5, p6);
       if (p4) {
          if (p4 < 0) {
             int i = - this.F(p1);
             i1 = i;
             i2 = p1.getDownNestedPreScrollRange() + i;
          }else {
             i1 = - this.F(p1);
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
             this.L(p0, p1, (this.getTopBottomOffsetForScrollingSibling() - p6), (- p1.getDownNestedScrollRange()), 0, p7);
          }
       }
       return;
    }
    public int setHeaderTopBottomOffset(CoordinatorLayout p0,View p1,int p2){
       return this.K(p0, p1, p2);
    }
    public int setHeaderTopBottomOffset(CoordinatorLayout p0,View p1,int p2,int p3,int p4){
       return this.y(p0, p1, p2, p3, p4);
    }
    public int y(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3,int p4){
       return this.L(p0, p1, p2, p3, p4, -1);
    }
}
