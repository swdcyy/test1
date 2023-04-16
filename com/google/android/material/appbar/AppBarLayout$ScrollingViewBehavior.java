package com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import com.google.android.material.appbar.HeaderScrollingViewBehavior;
import android.content.Context;
import android.util.AttributeSet;
import ll8.c$b;
import android.content.res.TypedArray;
import com.google.android.material.appbar.AppBarLayout;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import java.util.List;
import android.view.View;
import java.lang.Object;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import a2.i0;
import android.graphics.Rect;
import android.view.ViewGroup;

public class AppBarLayout$ScrollingViewBehavior extends HeaderScrollingViewBehavior	// class@001613
{

    public void AppBarLayout$ScrollingViewBehavior(){
       super();
    }
    public void AppBarLayout$ScrollingViewBehavior(Context p0,AttributeSet p1){
       super(p0, p1);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, c$b.P4);
       this.k(typedArray.getDimensionPixelSize(0, 0));
       typedArray.recycle();
    }
    public static int m(AppBarLayout p0){
       CoordinatorLayout$Behavior uBehavior = p0.getLayoutParams().f();
       if (uBehavior instanceof AppBarLayout$BaseBehavior) {
          return uBehavior.getTopBottomOffsetForScrollingSibling();
       }
       return 0;
    }
    public View c(List p0){
       return this.l(p0);
    }
    public float e(View p0){
       float f = 0;
       if (p0 instanceof AppBarLayout) {
          int totalScrollR = p0.getTotalScrollRange();
          int downNestedPr = p0.getDownNestedPreScrollRange();
          int i = AppBarLayout$ScrollingViewBehavior.m(p0);
          if (downNestedPr && (totalScrollR + i) <= downNestedPr) {
             return f;
          }else {
             totalScrollR = totalScrollR - downNestedPr;
             if (totalScrollR) {
                return (((float)i / (float)totalScrollR) + 0x3f800000);
             }
          }
       }
       return f;
    }
    public int h(View p0){
       if (p0 instanceof AppBarLayout) {
          return p0.getTotalScrollRange();
       }
       return super.h(p0);
    }
    public AppBarLayout l(List p0){
       View view;
       int i = p0.size();
       int i1 = 0;
       while (true) {
          if (i1 >= i) {
             return null;
          }
          view = p0.get(i1);
          if (view instanceof AppBarLayout) {
             break ;
          }else {
             i1 = i1 + 1;
          }
       }
       return view;
    }
    public boolean layoutDependsOn(CoordinatorLayout p0,View p1,View p2){
       return p2 instanceof AppBarLayout;
    }
    public final void n(View p0,View p1){
       CoordinatorLayout$Behavior uBehavior = p1.getLayoutParams().f();
       if (uBehavior instanceof AppBarLayout$BaseBehavior) {
          i0.e0(p0, ((((p1.getBottom() - p0.getTop()) + uBehavior.b) + this.i()) - this.d(p1)));
       }
       return;
    }
    public final void o(View p0,View p1){
       if (p1 instanceof AppBarLayout && p1.l()) {
          boolean b = (p0.getScrollY() > 0)? true: false;
          p1.s(b);
       }
       return;
    }
    public boolean onDependentViewChanged(CoordinatorLayout p0,View p1,View p2){
       this.n(p1, p2);
       this.o(p1, p2);
       return false;
    }
    public boolean onRequestChildRectangleOnScreen(CoordinatorLayout p0,View p1,Rect p2,boolean p3){
       AppBarLayout uAppBarLayou = this.l(p0.s(p1));
       if (uAppBarLayou != null) {
          p2.offset(p1.getLeft(), p1.getTop());
          HeaderScrollingViewBehavior ta = this.a;
          ta.set(0, 0, p0.getWidth(), p0.getHeight());
          if (!ta.contains(p2)) {
             uAppBarLayou.p(0, (p3 ^ 0x01));
             return true;
          }
       }
       return 0;
    }
}
