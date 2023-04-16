package com.reactnativepagerview.NestedScrollableHost;
import android.widget.FrameLayout;
import android.content.Context;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import java.lang.Math;
import android.view.View;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import androidx.viewpager2.widget.ViewPager2;
import android.view.ViewParent;
import android.view.MotionEvent;
import android.view.ViewGroup;

public final class NestedScrollableHost extends FrameLayout	// class@000b6c
{
    public Integer b;
    public int c;
    public float d;
    public float e;

    public void NestedScrollableHost(Context p0){
       a.q(p0, "context");
       super(p0);
       ViewConfiguration viewConfigur = ViewConfiguration.get(this.getContext());
       a.h(viewConfigur, "ViewConfiguration.get\(context\)");
       this.c = viewConfigur.getScaledTouchSlop();
    }
    public void NestedScrollableHost(Context p0,AttributeSet p1){
       a.q(p0, "context");
       super(p0, p1);
       ViewConfiguration viewConfigur = ViewConfiguration.get(this.getContext());
       a.h(viewConfigur, "ViewConfiguration.get\(context\)");
       this.c = viewConfigur.getScaledTouchSlop();
    }
    public final boolean a(int p0,float p1){
       View child;
       int i = - (int)Math.signum(p1);
       boolean b = false;
       if (p0) {
          if (p0 == 1) {
             child = this.getChild();
             if (child != null) {
                b = child.canScrollVertically(i);
             }
          }else {
             throw new IllegalArgumentException();
          }
       }else {
          child = this.getChild();
          if (child != null) {
             b = child.canScrollHorizontally(i);
          }
       }
       return b;
    }
    public final View getChild(){
       View childAt = (this.getChildCount() > 0)? this.getChildAt(0): null;
       return childAt;
    }
    public final Integer getInitialIndex(){
       return this.b;
    }
    public final ViewPager2 getParentViewPager(){
       ViewParent parent = this.getParent();
       ViewPager2 viewPager2 = null;
       if (!parent instanceof View) {
          parent = viewPager2;
       }
       while (parent != null && !parent instanceof ViewPager2) {
          parent = parent.getParent();
          if (!parent instanceof View) {
             parent = viewPager2;
          }
       }
       if (parent instanceof ViewPager2) {
          viewPager2 = parent;
       }
       return viewPager2;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       a.q(p0, "e");
       ViewPager2 parentViewPa = this.getParentViewPager();
       if (parentViewPa != null) {
          int orientation = parentViewPa.getOrientation();
          float f = 0x3f800000;
          if (this.a(orientation, 0xbf800000) || this.a(orientation, f)) {
             if (!p0.getAction()) {
                this.d = p0.getX();
                this.e = p0.getY();
                this.getParent().requestDisallowInterceptTouchEvent(true);
             }else if(p0.getAction() == 2){
                float f1 = p0.getX() - this.d;
                float f2 = p0.getY() - this.e;
                int i = (!orientation)? 1: 0;
                float f3 = Math.abs(f1);
                float f4 = (i)? 0x3f000000: 0x3f800000;
                f3 = f3 * f4;
                f4 = Math.abs(f2);
                if (!i) {
                   f = 0x3f000000;
                }
                f4 = f4 * f;
                f = (float)this.c;
                if (f3 - f > 0 || f4 - f > 0) {
                   f = (f4 - f3 > 0)? 1: 0;
                   if (i == f) {
                      this.getParent().requestDisallowInterceptTouchEvent(false);
                   }else if(i){
                      f1 = f2;
                   }
                   if (this.a(orientation, f1)) {
                      this.getParent().requestDisallowInterceptTouchEvent(true);
                   }else {
                      this.getParent().requestDisallowInterceptTouchEvent(false);
                   }
                }
             }
          }
       }
       return super.onInterceptTouchEvent(p0);
    }
    public final void setInitialIndex(Integer p0){
       this.b = p0;
    }
}
