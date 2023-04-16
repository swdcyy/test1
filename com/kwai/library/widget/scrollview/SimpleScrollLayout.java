package com.kwai.library.widget.scrollview.SimpleScrollLayout;
import com.kwai.library.widget.scrollview.ScrollViewEx;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.OverScroller;
import android.view.ViewConfiguration;
import android.widget.ScrollView;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import cw9.c;
import android.view.VelocityTracker;
import com.kwai.library.widget.scrollview.SimpleScrollLayout$a;
import android.view.ViewParent;
import android.view.View;
import java.lang.Math;
import android.view.MotionEvent;

public class SimpleScrollLayout extends ScrollViewEx	// class@0009ee
{
    public OverScroller g;
    public VelocityTracker h;
    public int i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public SimpleScrollLayout$a u;

    public void SimpleScrollLayout(Context p0,AttributeSet p1){
       super(p0, p1);
       this.s = true;
       this.t = false;
       this.g = new OverScroller(p0);
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0);
       this.i = viewConfigur.getScaledTouchSlop();
       this.k = viewConfigur.getScaledMinimumFlingVelocity();
       this.l = viewConfigur.getScaledMaximumFlingVelocity();
       this.o = SimpleScrollLayout.c(this.getContext(), 16.00f);
       this.p = SimpleScrollLayout.c(this.getContext(), 16.00f);
       this.setOverScrollMode(2);
    }
    public static int c(Context p0,float p1){
       return (int)((p1 * c.c(p0.getResources()).density) + 0x3f000000);
    }
    public void computeScroll(){
       if (this.t == null) {
          super.computeScroll();
          return;
       }else if(this.g.computeScrollOffset()){
          int currY = this.g.getCurrY();
          if (currY != this.getScrollY()) {
             boolean b = (currY < this.getScrollY())? true: false;
             this.e(b);
          }
          this.scrollTo(0, currY);
          this.awakenScrollBars();
          this.postInvalidate();
       }else if(this.j == null){
          this.f(0);
       }
       return;
    }
    public final void d(){
       SimpleScrollLayout th = this.h;
       if (th != null) {
          th.recycle();
          this.h = null;
       }
       this.j = false;
       return;
    }
    public final void e(boolean p0){
       SimpleScrollLayout tu = this.u;
       if (tu != null) {
          int i = (p0)? 1: 2;
          tu.onScroll(i, this.getScrollY());
       }
       return;
    }
    public final void f(int p0){
       SimpleScrollLayout tr = this.r;
       if (tr == p0) {
          return;
       }
       SimpleScrollLayout tu = this.u;
       if (tu != null) {
          tu.h(tr, p0);
          this.r = p0;
       }
       return;
    }
    public final void g(boolean p0){
       if (this.getParent() != null) {
          this.getParent().requestDisallowInterceptTouchEvent(p0);
       }
       return;
    }
    public final int getScrollRange(){
       int i = 0;
       if (this.getChildCount() > 0) {
          i = Math.max(i, (this.getChildAt(i).getHeight() - ((this.getHeight() - this.getPaddingBottom()) - this.getPaddingTop())));
       }
       return i;
    }
    public boolean onInterceptTouchEvent(MotionEvent p0){
       boolean b = false;
       if (this.s == null) {
          return b;
       }
       if (this.t == null) {
          return super.onInterceptTouchEvent(p0);
       }
       if (this.getVisibility()) {
          return b;
       }
       int i = p0.getAction() & 0x00ff;
       if (i) {
          if (i != 2) {
             if (i == 3) {
                this.j = b;
                this.f(b);
             }
          }else if((int)Math.abs((p0.getY() - (float)this.m)) > this.i){
             this.j = true;
             this.f(true);
             this.m = (int)p0.getY();
             this.g(true);
          }
       }else {
          int i1 = (int)p0.getY();
          this.m = i1;
          this.n = i1;
          if (this.g.isFinished()) {
             this.j = b;
             this.f(b);
          }else {
             this.g.abortAnimation();
             this.j = true;
             this.f(true);
             this.g(true);
          }
       }
       return this.j;
    }
    public void onOverScrolled(int p0,int p1,boolean p2,boolean p3){
       if (this.t == null) {
          super.onOverScrolled(p0, p1, p2, p3);
          return;
       }else if(!this.g.isFinished()){
          this.scrollTo(p0, p1);
          if (p3) {
             this.g.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange());
          }
       }else {
          this.scrollTo(p0, p1);
       }
       this.awakenScrollBars();
       return;
    }
    public boolean onTouchEvent(MotionEvent p0){
       int scrollY;
       SimpleScrollLayout simpleScroll = this;
       boolean b = false;
       if (simpleScroll.s == null) {
          return b;
       }
       if (simpleScroll.t == null) {
          return super.onTouchEvent(p0);
       }
       if (this.getVisibility()) {
          return b;
       }
       if (simpleScroll.h == null) {
          simpleScroll.h = VelocityTracker.obtain();
       }
       simpleScroll.h.addMovement(p0);
       int i = p0.getAction() & 0x00ff;
       if (i) {
          int i1 = 2;
          if (i != 1) {
             if (i != i1) {
                if (i == 3) {
                   if (simpleScroll.j != null) {
                      if (simpleScroll.g.springBack(0, this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                         this.invalidate();
                      }
                      simpleScroll.f(b);
                   }
                   this.d();
                }
             }else {
                int i2 = (int)p0.getY();
                if (simpleScroll.j == null && Math.abs((i2 - simpleScroll.m)) > simpleScroll.i) {
                   simpleScroll.j = true;
                   simpleScroll.f(true);
                   simpleScroll.m = i2;
                   simpleScroll.g(true);
                }
                if (simpleScroll.j != null) {
                   i = i2 - simpleScroll.m;
                   scrollY = this.getScrollY();
                   if (i > 0) {
                      simpleScroll.e(true);
                      i1 = 0;
                      int i3 = - i;
                      int i4 = 0;
                      int scrollY1 = this.getScrollY();
                      int i5 = 0;
                      int scrollRange = this.getScrollRange();
                      int i6 = 0;
                      int i7 = (scrollY > i)? 0: simpleScroll.o;
                      if (this.overScrollBy(i1, i3, i4, scrollY1, i5, scrollRange, i6, i7, 1)) {
                         simpleScroll.h.clear();
                      }
                   }else if(i < 0){
                      simpleScroll.e(b);
                      if (this.overScrollBy(0, (- i), 0, this.getScrollY(), 0, this.getScrollRange(), 0, 0, true)) {
                         simpleScroll.h.clear();
                      }
                   }
                   simpleScroll.m = i2;
                }
             }
          }else if(simpleScroll.j != null){
             SimpleScrollLayout h = simpleScroll.h;
             h.computeCurrentVelocity(1000, (float)simpleScroll.l);
             float yVelocity = h.getYVelocity();
             scrollY = (simpleScroll.q > null)? Math.max(b, Math.min(this.getScrollRange(), simpleScroll.q)): this.getScrollRange();
             if (Math.abs(yVelocity) - (float)simpleScroll.k > 0) {
                simpleScroll.g.fling(0, this.getScrollY(), 0, (int)(- yVelocity), 0, 0, 0, scrollY, 0, simpleScroll.p);
                simpleScroll.f(i1);
                this.invalidate();
             }else if(simpleScroll.g.springBack(0, this.getScrollY(), 0, 0, 0, scrollY)){
                this.invalidate();
             }
             simpleScroll.f(b);
          }
          this.d();
       }else {
          i = (int)p0.getY();
          simpleScroll.m = i;
          simpleScroll.n = i;
          if (!simpleScroll.g.isFinished()) {
             simpleScroll.g.abortAnimation();
          }
       }
       return true;
    }
    public void setEnableCustomScroll(boolean p0){
       this.t = p0;
    }
    public void setMaxFlingDistance(int p0){
       this.q = p0;
    }
    public void setOnScrollListener(SimpleScrollLayout$a p0){
       this.u = p0;
    }
    public void setScrollEnabled(boolean p0){
       this.s = p0;
    }
}
