package com.google.android.material.appbar.ReboundBehavior;
import com.google.android.material.appbar.CustomAppBarLayoutBehavior;
import java.lang.String;
import java.lang.Class;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import ll8.c$b;
import android.content.res.TypedArray;
import java.lang.IllegalArgumentException;
import sj.a;
import java.lang.Object;
import android.view.WindowManager;
import android.view.Display;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.ReboundBehavior$b;
import android.widget.LinearLayout;
import com.google.android.material.appbar.ViewOffsetBehavior;
import u1.a;
import android.view.View;
import sj.k;
import java.util.ArrayList;
import java.util.List;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.google.android.material.appbar.ReboundBehavior$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.appbar.AppBarLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import java.lang.Math;
import java.lang.ref.WeakReference;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import java.lang.NullPointerException;
import java.lang.Integer;

public class ReboundBehavior extends CustomAppBarLayoutBehavior	// class@001632
{
    public final int A;
    public boolean B;
    public WeakReference C;
    public WeakReference D;
    public ReboundBehavior$b E;
    public int r;
    public int s;
    public int t;
    public List u;
    public ValueAnimator v;
    public final int w;
    public View x;
    public int y;
    public int z;
    public static final String F;

    static {
       ReboundBehavior.F = ReboundBehavior.class.toString();
    }
    public void ReboundBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.x4);
       this.A = typedArray.getDimensionPixelSize(1, (int)((c.c(p0.getResources()).density * 150.00f) + 0x3f000000));
       int resourceId = typedArray.getResourceId(2, 0);
       this.B = typedArray.getBoolean(0, 1);
       typedArray.recycle();
       if (!resourceId) {
          throw new IllegalArgumentException("should set rebound view id , with \'reboundViewId\'");
       }
       this.w = resourceId;
       return;
    }
    public void ReboundBehavior(a p0){
       super(p0);
       this.A = p0.d;
       this.B = p0.f;
       p0 = p0.e;
       this.w = p0;
       if (p0 != null) {
          return;
       }
       throw new IllegalArgumentException("should set rebound view id , with \'reboundViewId\'");
    }
    public static int R(Context p0){
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       p0.getSystemService("window").getDefaultDisplay().getMetrics(uDisplayMetr);
       return uDisplayMetr.widthPixels;
    }
    public int J(CoordinatorLayout p0,AppBarLayout p1,int p2){
       return this.y(p0, p1, p2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public int K(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3,int p4,int p5){
       ReboundBehavior tE = this.E;
       if (tE != null) {
          tE.a(p2, p3);
       }
       if (this.B == null) {
          return super.K(p0, p1, p2, p3, p4, p5);
       }else {
          int topBottomOff = this.getTopBottomOffsetForScrollingSibling();
          if (this.s > null && p1.getHeight() >= this.t) {
             return this.V(p0, p1, p5, p2);
          }else {
             int i = this.F();
             int i1 = p2 - topBottomOff;
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
             i = 0;
             if (p3 && (topBottomOff >= p3 && topBottomOff <= p4)) {
                int i2 = a.b(p2, p3, p4);
                if (topBottomOff != i2) {
                   p2 = (p1.h())? this.n(p1, i2): i2;
                   this.r = i2 - p2;
                   p2 = topBottomOff - i2;
                   if (!this.setTopAndBottomOffset(p2) && p1.h()) {
                      p0.l(p1);
                   }
                   p1.d(this.getTopAndBottomOffset());
                   int i3 = (i2 < topBottomOff)? -1: 1;
                   this.C(p0, p1, i2, i3, false);
                   i = p2;
                }else if(topBottomOff != p3){
                   i = this.V(p0, p1, p5, p2);
                }
             }else {
                this.r = i;
             }
             return i;
          }
       }
    }
    public void N(k p0){
       if (this.u == null) {
          this.u = new ArrayList();
       }
       this.u.add(p0);
       return;
    }
    public final void O(CoordinatorLayout p0,AppBarLayout p1){
       ReboundBehavior tv = this.v;
       if (tv == null) {
          ValueAnimator valueAnimato = new ValueAnimator();
          this.v = valueAnimato;
          valueAnimato.setDuration(200);
          this.v.setInterpolator(new DecelerateInterpolator());
          this.v.addUpdateListener(new ReboundBehavior$a(this, p0, p1));
       }else if(tv.isRunning()){
          this.v.cancel();
       }
       int[] ointArray = new int[]{this.s,0};
       this.v.setIntValues(ointArray);
       this.v.start();
       return;
    }
    public final void P(CoordinatorLayout p0,AppBarLayout p1){
       if (this.s > null) {
          this.O(p0, p1);
       }
       return;
    }
    public final int Q(AppBarLayout p0){
       int childCount = p0.getChildCount();
       int i1 = 0;
       for (int i = 0; i < childCount; i = i + 1) {
          View childAt = p0.getChildAt(i);
          AppBarLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          int i2 = layoutParams.bottomMargin + layoutParams.topMargin;
          i2 = i2 + childAt.getMeasuredHeight();
          i1 = i1 + i2;
       }
       return Math.max(0, i1);
    }
    public void S(k p0){
       ReboundBehavior tu = this.u;
       if (tu != null) {
          tu.remove(p0);
       }
       return;
    }
    public void T(boolean p0){
       this.B = p0;
       ReboundBehavior tC = this.C;
       if (tC != null && tC.get() != null) {
          tC = this.D;
          if (tC != null && tC.get() != null) {
             this.O(this.C.get(), this.D.get());
          }
       }
       return;
    }
    public void U(ReboundBehavior$b p0){
       this.E = p0;
    }
    public final int V(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3){
       if (p1.getHeight() >= this.t && p2 == 1) {
          return p3;
       }
       this.X(p0, p1, (this.s + (p3 / 3)));
       return (this.getTopBottomOffsetForScrollingSibling() - p3);
    }
    public void W(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3){
       if (p1.getHeight() >= this.t && p2 >= 0) {
          ReboundBehavior tA = this.A;
          if (p2 <= tA) {
             this.s = p2;
             ReboundBehavior tu = this.u;
             if (tu != null && this.B != null) {
                float f = ((float)p2 * 0x3f800000) / (float)tA;
                for (int i = tu.size() - 1; i >= 0; i = i - 1) {
                   this.u.get(i).a(p3, f, this.s);
                }
             }
             ReboundBehavior tx = this.x;
             if (tx != null) {
                ViewGroup$LayoutParams layoutParams = tx.getLayoutParams();
                layoutParams.height = this.y + p2;
                tA = this.z;
                if (layoutParams.width != tA) {
                   layoutParams.width = tA;
                }
                this.x.setLayoutParams(layoutParams);
             }
             p0.l(p1);
          }
       }
       return;
    }
    public final void X(CoordinatorLayout p0,AppBarLayout p1,int p2){
       ReboundBehavior tv = this.v;
       if (tv != null && tv.isRunning()) {
          this.v.cancel();
       }
       this.W(p0, p1, p2, 1);
       return;
    }
    public int getTopBottomOffsetForScrollingSibling(){
       return (this.getTopAndBottomOffset() + this.r);
    }
    public void o(CoordinatorLayout p0,AppBarLayout p1){
       super.o(p0, p1);
       this.P(p0, p1);
    }
    public void onFlingFinished(CoordinatorLayout p0,View p1){
       this.o(p0, p1);
    }
    public boolean onMeasureChild(CoordinatorLayout p0,View p1,int p2,int p3,int p4,int p5){
       return this.q(p0, p1, p2, p3, p4, p5);
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
    public boolean q(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3,int p4,int p5){
       boolean b = super.q(p0, p1, p2, p3, p4, p5);
       if (this.t != p1.getMeasuredHeight() && p1.getMeasuredHeight()) {
          this.t = this.Q(p1);
       }
       if (this.x == null) {
          View view = p1.findViewById(this.w);
          if (view != null) {
             this.y = view.getMeasuredHeight();
             this.z = ReboundBehavior.R(view.getContext());
             this.x = view;
          }else {
             Object[] objArray = new Object[]{Integer.valueOf(this.w)};
             throw new NullPointerException(String.format("find rebound view with id %d is null", objArray));
          }
       }
       if (this.C == null) {
          this.C = new WeakReference(p0);
       }
       if (this.D == null) {
          this.D = new WeakReference(p1);
       }
       return b;
    }
    public void s(CoordinatorLayout p0,AppBarLayout p1,View p2,int p3,int p4,int p5,int p6,int p7){
       if (p6 < 0 && p7 == 1) {
          ReboundBehavior tE = this.E;
          if (tE != null) {
             tE.a((this.getTopBottomOffsetForScrollingSibling() - p6), (- p1.getDownNestedScrollRange()));
          }
       }
       super.s(p0, p1, p2, p3, p4, p5, p6, p7);
       return;
    }
    public int setHeaderTopBottomOffset(CoordinatorLayout p0,View p1,int p2){
       return this.J(p0, p1, p2);
    }
    public int setHeaderTopBottomOffset(CoordinatorLayout p0,View p1,int p2,int p3,int p4){
       return this.y(p0, p1, p2, p3, p4);
    }
    public boolean v(CoordinatorLayout p0,AppBarLayout p1,View p2,View p3,int p4,int p5){
       boolean b = super.v(p0, p1, p2, p3, p4, p5);
       if (b) {
          ReboundBehavior tv = this.v;
          if (tv != null && tv.isRunning()) {
             this.v.cancel();
          }
       }
       return b;
    }
    public void w(CoordinatorLayout p0,AppBarLayout p1,View p2,int p3){
       super.w(p0, p1, p2, p3);
       this.P(p0, p1);
    }
    public int y(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3,int p4){
       return this.K(p0, p1, p2, p3, p4, -1);
    }
}