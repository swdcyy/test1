package com.google.android.material.appbar.KdsReboundBehavior;
import com.google.android.material.appbar.KdsCustomAppBarLayoutBehavior;
import java.lang.String;
import java.lang.Class;
import sj.f;
import android.content.Context;
import java.lang.Object;
import android.view.WindowManager;
import android.view.Display;
import android.util.DisplayMetrics;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.KdsReboundBehavior$b;
import android.widget.LinearLayout;
import com.google.android.material.appbar.ViewOffsetBehavior;
import u1.a;
import android.view.View;
import sj.j;
import java.util.ArrayList;
import java.util.List;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;
import com.google.android.material.appbar.KdsReboundBehavior$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.appbar.AppBarLayout$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import java.lang.Math;
import sj.e;
import a2.i0;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import java.lang.ref.WeakReference;

public class KdsReboundBehavior extends KdsCustomAppBarLayoutBehavior	// class@00162a
{
    public int A;
    public final int B;
    public int C;
    public boolean D;
    public WeakReference E;
    public WeakReference F;
    public KdsReboundBehavior$b G;
    public int r;
    public int s;
    public int t;
    public List u;
    public ValueAnimator v;
    public final int w;
    public final String x;
    public View y;
    public int z;
    public static final String H;

    static {
       KdsReboundBehavior.H = KdsReboundBehavior.class.toString();
    }
    public void KdsReboundBehavior(f p0){
       super(p0);
       this.B = p0.e;
       this.D = p0.h;
       this.w = p0.f;
       this.x = p0.b;
    }
    public static int S(Context p0){
       DisplayMetrics uDisplayMetr = new DisplayMetrics();
       p0.getSystemService("window").getDefaultDisplay().getMetrics(uDisplayMetr);
       return uDisplayMetr.widthPixels;
    }
    public int K(CoordinatorLayout p0,AppBarLayout p1,int p2){
       return this.y(p0, p1, p2, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public int L(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3,int p4,int p5){
       KdsReboundBehavior tG = this.G;
       if (tG != null) {
          tG.a(p2, p3);
       }
       if (this.D == null) {
          return super.L(p0, p1, p2, p3, p4, p5);
       }else {
          int topBottomOff = this.getTopBottomOffsetForScrollingSibling();
          if (this.s > null && p1.getHeight() >= this.t) {
             return this.X(p0, p1, p5, p2);
          }else {
             int i = this.G();
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
                   int i3 = (i2 < topBottomOff)? -1: 1;
                   this.C(p0, p1, i2, i3, false);
                   i = p2;
                }else if(topBottomOff != p3){
                   i = this.X(p0, p1, p5, p2);
                }
             }else {
                this.r = i;
             }
             return i;
          }
       }
    }
    public void N(j p0){
       if (this.u == null) {
          this.u = new ArrayList();
       }
       this.u.add(p0);
       return;
    }
    public final void O(CoordinatorLayout p0,AppBarLayout p1){
       KdsReboundBehavior tv = this.v;
       if (tv == null) {
          ValueAnimator valueAnimato = new ValueAnimator();
          this.v = valueAnimato;
          valueAnimato.setDuration(200);
          this.v.setInterpolator(new DecelerateInterpolator());
          this.v.addUpdateListener(new KdsReboundBehavior$a(this, p0, p1));
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
    public View R(){
       return this.y;
    }
    public boolean T(CoordinatorLayout p0,AppBarLayout p1,View p2){
       return p2 instanceof e;
    }
    public boolean U(CoordinatorLayout p0,AppBarLayout p1,View p2){
       ViewGroup$LayoutParams height = p2.getLayoutParams().height;
       int top = p1.getTop();
       int i = (height == null && (this.C == null && top))? p2.getBottom() - top: height - top;
       i0.e0(p1, i);
       this.C = height;
       return true;
    }
    public void V(KdsReboundBehavior$b p0){
       this.G = p0;
    }
    public void W(View p0){
       this.y = p0;
       this.z = p0.getMeasuredHeight();
       this.A = KdsReboundBehavior.S(p0.getContext());
    }
    public final int X(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3){
       if (p1.getHeight() >= this.t && p2 == 1) {
          return p3;
       }
       p2 = this.s + (p3 / 3);
       if (p2 < 0) {
          p2 = 0;
       }
       this.Z(p0, p1, p2);
       return (this.getTopBottomOffsetForScrollingSibling() - p3);
    }
    public void Y(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3){
       if (p1.getHeight() >= this.t && p2 >= 0) {
          KdsReboundBehavior tB = this.B;
          if (p2 <= tB) {
             this.s = p2;
             KdsReboundBehavior tu = this.u;
             if (tu != null && this.D != null) {
                float f = ((float)p2 * 0x3f800000) / (float)tB;
                for (int i = tu.size() - 1; i >= 0; i--) {
                   this.u.get(i).a(p3, f, this.s);
                }
             }
             tB = this.y;
             if (tB != null) {
                ViewGroup$LayoutParams layoutParams = tB.getLayoutParams();
                KdsReboundBehavior tz = this.z;
                layoutParams.height = tz + p2;
                KdsReboundBehavior tA = this.A;
                if (layoutParams.width != tA) {
                   layoutParams.width = tA;
                }
                tz = tz + p2;
                tB = this.y;
                if (tB instanceof e && tB.a(tz)) {
                   p0.l(this.y);
                }
             }
          }
       }
    label_0061 :
       return;
    }
    public final void Z(CoordinatorLayout p0,AppBarLayout p1,int p2){
       KdsReboundBehavior tv = this.v;
       if (tv != null && tv.isRunning()) {
          this.v.cancel();
       }
       this.Y(p0, p1, p2, 1);
       return;
    }
    public int getTopBottomOffsetForScrollingSibling(){
       return (this.getTopAndBottomOffset() + this.r);
    }
    public boolean layoutDependsOn(CoordinatorLayout p0,View p1,View p2){
       return this.T(p0, p1, p2);
    }
    public void o(CoordinatorLayout p0,AppBarLayout p1){
       super.o(p0, p1);
       this.P(p0, p1);
    }
    public boolean onDependentViewChanged(CoordinatorLayout p0,View p1,View p2){
       this.U(p0, p1, p2);
       return true;
    }
    public boolean onMeasureChild(CoordinatorLayout p0,View p1,int p2,int p3,int p4,int p5){
       return this.q(p0, p1, p2, p3, p4, p5);
    }
    public void onNestedScroll(CoordinatorLayout p0,View p1,View p2,int p3,int p4,int p5,int p6,int p7){
       this.s(p0, p1, p2, p3, p4, p5, p6, p7);
    }
    public boolean q(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3,int p4,int p5){
       boolean b = super.q(p0, p1, p2, p3, p4, p5);
       if (this.t != p1.getMeasuredHeight() && p1.getMeasuredHeight()) {
          this.t = this.Q(p1);
       }
       if (this.E == null) {
          this.E = new WeakReference(p0);
       }
       if (this.F == null) {
          this.F = new WeakReference(p1);
       }
       return b;
    }
    public void s(CoordinatorLayout p0,AppBarLayout p1,View p2,int p3,int p4,int p5,int p6,int p7){
       if (p6 < 0 && (p7 == 1 && this.G != null)) {
          int i = this.getTopBottomOffsetForScrollingSibling() - p6;
          if (i >= 0) {
             i = 0;
          }
          this.G.a(i, (- p1.getDownNestedScrollRange()));
       }
    label_001b :
       super.s(p0, p1, p2, p3, p4, p5, p6, p7);
       return;
    }
    public int setHeaderTopBottomOffset(CoordinatorLayout p0,View p1,int p2){
       return this.K(p0, p1, p2);
    }
    public int setHeaderTopBottomOffset(CoordinatorLayout p0,View p1,int p2,int p3,int p4){
       return this.y(p0, p1, p2, p3, p4);
    }
    public boolean v(CoordinatorLayout p0,AppBarLayout p1,View p2,View p3,int p4,int p5){
       boolean b = super.v(p0, p1, p2, p3, p4, p5);
       if (b) {
          KdsReboundBehavior tv = this.v;
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
       return this.L(p0, p1, p2, p3, p4, -1);
    }
}
