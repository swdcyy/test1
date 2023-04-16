package com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import com.google.android.material.appbar.HeaderBehavior;
import android.content.Context;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.appbar.AppBarLayout$LayoutParams;
import a2.i0;
import android.widget.LinearLayout;
import java.lang.Math;
import android.view.animation.Interpolator;
import android.widget.LinearLayout$LayoutParams;
import java.lang.Integer;
import u1.a;
import android.animation.ValueAnimator;
import rj.a;
import android.animation.TimeInterpolator;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior$a;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior$b;
import java.lang.Object;
import java.lang.ref.WeakReference;
import android.view.ViewGroup;
import com.google.android.material.appbar.ViewOffsetBehavior;
import a2.t;
import android.os.Parcelable;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState;
import androidx.customview.view.AbsSavedState;
import java.util.List;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.google.android.material.appbar.HeaderScrollingViewBehavior;

public class AppBarLayout$BaseBehavior extends HeaderBehavior	// class@00160f
{
    public int b;
    public int c;
    public ValueAnimator d;
    public int e;
    public boolean f;
    public float g;
    public WeakReference h;
    public AppBarLayout$BaseBehavior$b i;

    public void AppBarLayout$BaseBehavior(){
       super();
       this.e = -1;
    }
    public void AppBarLayout$BaseBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       this.e = -1;
    }
    private void C(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3,boolean p4){
       boolean b;
       View view = AppBarLayout$BaseBehavior.j(p1, p2);
       if (view != null) {
          int i = view.getLayoutParams().a();
          int i1 = 0;
          if (i & 0x01) {
             int i2 = i0.C(view);
             if (p3 > 0 && (i & 0x0c)) {
                if ((- p2) < ((view.getBottom() - i2) - p1.getTopInset())) {
                label_0041 :
                   p2 = 0;
                label_0042 :
                   if (p1.l()) {
                      View view1 = this.i(p0);
                      if (view1 != null) {
                         if (view1.getScrollY() > 0) {
                            i1 = 1;
                         }
                         b = i1;
                      }
                   }
                   b = p1.s(b);
                   if (p4 || (b && this.z(p0, p1))) {
                      p1.jumpDrawablesToCurrentState();
                   }
                }
             }else if((i & 0x02) && (- p2) >= ((view.getBottom() - i2) - p1.getTopInset())){
             }
             p2 = 1;
             goto label_0042 ;
          }else {
             goto label_0041 ;
          }
       }
    label_0067 :
       return;
    }
    public static boolean h(int p0,int p1){
       boolean b = ((p0 & p1) == p1)? true: false;
       return b;
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
    private int n(AppBarLayout p0,int p1){
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
    public final void A(CoordinatorLayout p0,AppBarLayout p1){
       int topBottomOff = this.getTopBottomOffsetForScrollingSibling();
       int i = this.k(p1, topBottomOff);
       if (i >= 0) {
          View childAt = p1.getChildAt(i);
          AppBarLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          int i1 = layoutParams.a();
          if ((i1 & 0x11) == 17) {
             int i2 = - childAt.getTop();
             int i3 = - childAt.getBottom();
             if (i == (p1.getChildCount() - 1)) {
                i3 = i3 + p1.getTopInset();
             }
             i = 2;
             if (AppBarLayout$BaseBehavior.h(i1, i)) {
                i3 = i3 + i0.C(childAt);
             }else if(AppBarLayout$BaseBehavior.h(i1, 5)){
                int i4 = i0.C(childAt) + i3;
                if (topBottomOff < i4) {
                   i2 = i4;
                }else {
                   i3 = i4;
                }
             }
             if (AppBarLayout$BaseBehavior.h(i1, 32)) {
                i2 = i2 + layoutParams.topMargin;
                i3 = i3 - layoutParams.bottomMargin;
             }
             if (topBottomOff < ((i3 + i2) / i)) {
                i2 = i3;
             }
             this.c(p0, p1, a.b(i2, (- p1.getTotalScrollRange()), 0), 0);
          }
       }
       return;
    }
    public final void B(int p0,AppBarLayout p1,View p2,int p3){
       if (p3 == 1) {
          p3 = this.getTopBottomOffsetForScrollingSibling();
          if (p0 >= 0 || (!p3 || (p0 > 0 && p3 == (- p1.getDownNestedScrollRange())))) {
             i0.V0(p2, 1);
          }
       }
       return;
    }
    public final void c(CoordinatorLayout p0,AppBarLayout p1,int p2,float p3){
       int i = Math.abs((this.getTopBottomOffsetForScrollingSibling() - p2));
       p3 = Math.abs(p3);
       int i1 = (p3 > 0)? Math.round((((float)i / p3) * 1000.00f)) * 3: (int)((((float)i / (float)p1.getHeight()) + 0x3f800000) * 150.00f);
       this.d(p0, p1, p2, i1);
       return;
    }
    public boolean canDragView(View p0){
       return this.e(p0);
    }
    public final void d(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3){
       int topBottomOff = this.getTopBottomOffsetForScrollingSibling();
       if (topBottomOff == p2) {
          AppBarLayout$BaseBehavior td = this.d;
          if (td != null && td.isRunning()) {
             this.d.cancel();
          }
          return;
       }else {
          AppBarLayout$BaseBehavior td1 = this.d;
          if (td1 == null) {
             ValueAnimator valueAnimato = new ValueAnimator();
             this.d = valueAnimato;
             valueAnimato.setInterpolator(a.e);
             this.d.addUpdateListener(new AppBarLayout$BaseBehavior$a(this, p0, p1));
          }else {
             td1.cancel();
          }
          this.d.setDuration((long)Math.min(p3, 600));
          int[] ointArray = new int[]{topBottomOff,p2};
          this.d.setIntValues(ointArray);
          this.d.start();
          return;
       }
    }
    public boolean e(AppBarLayout p0){
       AppBarLayout$BaseBehavior ti = this.i;
       if (ti != null) {
          return ti.a(p0);
       }
       AppBarLayout$BaseBehavior th = this.h;
       boolean b = true;
       if (th != null) {
          View view = th.get();
          if (view == null || (!view.isShown() || view.canScrollVertically(-1))) {
             b = false;
          }
       }
       return b;
    }
    public final boolean g(CoordinatorLayout p0,AppBarLayout p1,View p2){
       boolean b = (p1.j() && (p0.getHeight() - p2.getHeight()) <= p1.getHeight())? true: false;
       return b;
    }
    public int getMaxDragOffset(View p0){
       return this.l(p0);
    }
    public int getScrollRangeForDragFling(View p0){
       return this.m(p0);
    }
    public int getTopBottomOffsetForScrollingSibling(){
       return (this.getTopAndBottomOffset() + this.b);
    }
    public final View i(CoordinatorLayout p0){
       View childAt;
       int childCount = p0.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return null;
          }
          childAt = p0.getChildAt(i);
          if (childAt instanceof t) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return childAt;
    }
    public final int k(AppBarLayout p0,int p1){
       int childCount = p0.getChildCount();
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return -1;
          }
          View childAt = p0.getChildAt(i);
          int top = childAt.getTop();
          int bottom = childAt.getBottom();
          AppBarLayout$LayoutParams layoutParams = childAt.getLayoutParams();
          if (AppBarLayout$BaseBehavior.h(layoutParams.a(), 32)) {
             top = top - layoutParams.topMargin;
             bottom = bottom + layoutParams.bottomMargin;
          }
          int i1 = - p1;
          if (top <= i1 && bottom >= i1) {
             break ;
          }else {
             i = i + 1;
          }
       }
       return i;
    }
    public int l(AppBarLayout p0){
       return (- p0.getDownNestedScrollRange());
    }
    public int m(AppBarLayout p0){
       return p0.getTotalScrollRange();
    }
    public void o(CoordinatorLayout p0,AppBarLayout p1){
       this.A(p0, p1);
    }
    public void onFlingFinished(CoordinatorLayout p0,View p1){
       this.o(p0, p1);
    }
    public boolean onLayoutChild(CoordinatorLayout p0,View p1,int p2){
       return this.p(p0, p1, p2);
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
    public void onRestoreInstanceState(CoordinatorLayout p0,View p1,Parcelable p2){
       this.t(p0, p1, p2);
    }
    public Parcelable onSaveInstanceState(CoordinatorLayout p0,View p1){
       return this.u(p0, p1);
    }
    public boolean onStartNestedScroll(CoordinatorLayout p0,View p1,View p2,View p3,int p4,int p5){
       return this.v(p0, p1, p2, p3, p4, p5);
    }
    public void onStopNestedScroll(CoordinatorLayout p0,View p1,View p2,int p3){
       this.w(p0, p1, p2, p3);
    }
    public boolean p(CoordinatorLayout p0,AppBarLayout p1,int p2){
       int i1;
       boolean b = super.onLayoutChild(p0, p1, p2);
       int pendingActio = p1.getPendingAction();
       AppBarLayout$BaseBehavior te = this.e;
       int i = 0;
       if (te >= null && !(pendingActio & 0x08)) {
          View childAt = p1.getChildAt(te);
          i1 = - childAt.getBottom();
          pendingActio = (this.f != null)? i0.C(childAt) + p1.getTopInset(): Math.round(((float)childAt.getHeight() * this.g));
          this.setHeaderTopBottomOffset(p0, p1, (i1 + pendingActio));
       }else if(pendingActio){
          int i2 = 1;
          i1 = (pendingActio & 0x04)? 1: 0;
          float f = 0;
          if (pendingActio & 0x02) {
             pendingActio = - p1.getUpNestedPreScrollRange();
             if (i1) {
                this.c(p0, p1, pendingActio, f);
             }else {
                this.setHeaderTopBottomOffset(p0, p1, pendingActio);
             }
          }else if(pendingActio & i2){
             if (i1) {
                this.c(p0, p1, i, f);
             }else {
                this.setHeaderTopBottomOffset(p0, p1, i);
             }
          }
       }
       p1.resetPendingAction();
       this.e = -1;
       this.setTopAndBottomOffset(a.b(this.getTopAndBottomOffset(), (- p1.getTotalScrollRange()), i));
       this.C(p0, p1, this.getTopAndBottomOffset(), 0, true);
       p1.d(this.getTopAndBottomOffset());
       return b;
    }
    public boolean q(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3,int p4,int p5){
       if (p1.getLayoutParams().height != -2) {
          return super.onMeasureChild(p0, p1, p2, p3, p4, p5);
       }
       p0.K(p1, p2, p3, View$MeasureSpec.makeMeasureSpec(0, 0), p5);
       return true;
    }
    public void r(CoordinatorLayout p0,AppBarLayout p1,View p2,int p3,int p4,int[] p5,int p6){
       int i;
       int i1;
       if (p4) {
          if (p4 < 0) {
             p3 = - p1.getTotalScrollRange();
             i = p3;
             i1 = p1.getDownNestedPreScrollRange() + p3;
          }else {
             i = - p1.getUpNestedPreScrollRange();
             i1 = 0;
          }
          if (i != i1) {
             p5[1] = this.scroll(p0, p1, p4, i, i1);
             this.B(p4, p1, p2, p6);
          }
       }
       return;
    }
    public void s(CoordinatorLayout p0,AppBarLayout p1,View p2,int p3,int p4,int p5,int p6,int p7){
       if (p6 < 0) {
          this.scroll(p0, p1, p6, (- p1.getDownNestedScrollRange()), 0);
          this.B(p6, p1, p2, p7);
       }
       if (p1.l()) {
          boolean b = (p2.getScrollY() > 0)? true: false;
          p1.s(b);
       }
       return;
    }
    public int setHeaderTopBottomOffset(CoordinatorLayout p0,View p1,int p2,int p3,int p4){
       return this.y(p0, p1, p2, p3, p4);
    }
    public void t(CoordinatorLayout p0,AppBarLayout p1,Parcelable p2){
       if (p2 instanceof AppBarLayout$BaseBehavior$SavedState) {
          super.onRestoreInstanceState(p0, p1, p2.a());
          this.e = p2.d;
          this.g = p2.e;
          this.f = p2.f;
       }else {
          super.onRestoreInstanceState(p0, p1, p2);
          this.e = -1;
       }
       return;
    }
    public Parcelable u(CoordinatorLayout p0,AppBarLayout p1){
       View childAt;
       int i1;
       AppBarLayout$BaseBehavior$SavedState uBaseBehavio;
       Parcelable parcelable = super.onSaveInstanceState(p0, p1);
       int topAndBottom = this.getTopAndBottomOffset();
       int childCount = p1.getChildCount();
       boolean b = false;
       int i = 0;
       while (true) {
          if (i >= childCount) {
             return parcelable;
          }
          childAt = p1.getChildAt(i);
          i1 = childAt.getBottom() + topAndBottom;
          int i2 = childAt.getTop() + topAndBottom;
          if (i2 <= 0 && i1 >= 0) {
             uBaseBehavio = new AppBarLayout$BaseBehavior$SavedState(parcelable);
             uBaseBehavio.d = i;
             if (i1 == (i0.C(childAt) + p1.getTopInset())) {
                b = true;
                break ;
             }
             break ;
          }else {
             i = i + 1;
          }
       }
       uBaseBehavio.f = b;
       uBaseBehavio.e = (float)i1 / (float)childAt.getHeight();
       return uBaseBehavio;
    }
    public boolean v(CoordinatorLayout p0,AppBarLayout p1,View p2,View p3,int p4,int p5){
       boolean b = ((p4 & 0x02) && (p1.l() || this.g(p0, p1, p2)))? true: false;
       if (b) {
          AppBarLayout$BaseBehavior td = this.d;
          if (td != null) {
             td.cancel();
          }
       }
       this.h = null;
       this.c = p5;
       return b;
    }
    public void w(CoordinatorLayout p0,AppBarLayout p1,View p2,int p3){
       if (this.c == null || p3 == 1) {
          this.A(p0, p1);
       }
       this.h = new WeakReference(p2);
       return;
    }
    public void x(AppBarLayout$BaseBehavior$b p0){
       this.i = p0;
    }
    public int y(CoordinatorLayout p0,AppBarLayout p1,int p2,int p3,int p4){
       int topBottomOff = this.getTopBottomOffsetForScrollingSibling();
       int i = 0;
       if (p3 && (topBottomOff >= p3 && topBottomOff <= p4)) {
          int i1 = a.b(p2, p3, p4);
          if (topBottomOff != i1) {
             p2 = (p1.h())? this.n(p1, i1): i1;
             i = topBottomOff - i1;
             this.b = i1 - p2;
             if (!this.setTopAndBottomOffset(p2) && p1.h()) {
                p0.l(p1);
             }
             p1.d(this.getTopAndBottomOffset());
             int i2 = (i1 < topBottomOff)? -1: 1;
             this.C(p0, p1, i1, i2, false);
          }
       }else {
          this.b = i;
       }
       return i;
    }
    public final boolean z(CoordinatorLayout p0,AppBarLayout p1){
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
}
